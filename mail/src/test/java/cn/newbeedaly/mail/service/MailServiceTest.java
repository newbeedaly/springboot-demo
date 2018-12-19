package cn.newbeedaly.mail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

  @Resource
  MailService mailService;

  @Resource
  private TemplateEngine templateEngine;

  @Test
  public void helloTest() {
    mailService.sayHello();
  }

  @Test
  public void sendSimpleMail(){
    mailService.sendSimpleMail("1065765857@qq.com","邮件","您好，邮件测试，不用管！");
  }

  @Test
  public void testHtmlMail() throws Exception {
    String content="<html>\n" +
        "<body>\n" +
        "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
        "</body>\n" +
        "</html>";
    mailService.sendHtmlMail("ityouknow@126.com","test simple mail",content);
  }

  @Test
  public void sendAttachmentsMail() {
    String filePath="e:\\tmp\\application.log";
    mailService.sendAttachmentsMail("ityouknow@126.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
  }


  @Test
  public void sendInlineResourceMail() {
    String rscId = "neo006";
    String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
    String imgPath = "C:\\Users\\summer\\Pictures\\favicon.png";

    mailService.sendInlineResourceMail("ityouknow@126.com", "主题：这是有图片的邮件", content, imgPath, rscId);
  }


  @Test
  public void sendTemplateMail() {
    //创建邮件正文
    Context context = new Context();
    context.setVariable("id", "006");
    String emailContent = templateEngine.process("emailTemplate", context);

    mailService.sendHtmlMail("ityouknow@126.com","主题：这是模板邮件",emailContent);
  }
}
