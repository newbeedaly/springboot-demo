package cn.newbeedaly.url.controller;

import cn.newbeedaly.url.util.ShortUrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ShortUrlController {

  /*@Autowired
  RedisTemplate redisTemplate;*/

  @Autowired
  StringRedisTemplate stringRedisTemplate;

  @RequestMapping("/init")
  public ModelAndView init(){
    return new ModelAndView("url");
  }

  @RequestMapping("/getUrl")
  public String getUrl(@RequestParam("url") String url){
    String shortUrl = ShortUrlUtil.getShortUrl(url);
    stringRedisTemplate.opsForValue().set(shortUrl,url);
    //Object s = stringRedisTemplate.opsForValue().get("newbee");
    //System.out.println(shortUrl);
    //System.out.println(url);
    return "url.newbeedaly.cn/"+shortUrl;
    // 先存redis，创建线程存到数据库中，不要忘了关闭线程
  }

  @RequestMapping("/{code}")
  public ModelAndView redirect(@PathVariable("code") String code) {
    //System.out.println("传值为："+code);
    String url = stringRedisTemplate.opsForValue().get(code);
    //System.out.println(url);
    //return new RedirectView(url);
    return new ModelAndView(new RedirectView(url));
    // 先从redis中获取，再从数据库中获取。
  }

}
