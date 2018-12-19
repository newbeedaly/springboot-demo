package cn.newbeedaly.log4j.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class LogUtil {

  private LogUtil() {
  }

  /**
   * 默认日志文件输出位置
   */
  private static final Logger DEFAULT_LOGGER = LogManager.getLogger("default_logger");

  /**
   * 异常日志文件输出位置
   */
  private static final Logger EXCEPTION_LOGGER = LogManager.getLogger("exception_logger");

  /**
   * 错误日志文件输出位置
   */
  private static final Logger ERROR_LOGGER = LogManager.getLogger("error_logger");

  /**
   * 一般日志文件输出位置
   */
  private static final Logger INFO_LOGGER = LogManager.getLogger("info_logger");

  /**
   * 测试日志文件输出位置
   */
  private static final Logger TEST_LOGGER = LogManager.getLogger("test_logger");

  /**
   * 警告日志文件输出位置
   */
  private static final Logger WARN_LOGGER = LogManager.getLogger("warn_logger");

  public static Logger getDefault()
  {
    return DEFAULT_LOGGER;
  }

  public static Logger getException()
  {
    return EXCEPTION_LOGGER;
  }

  public static Logger getError()
  {
    return ERROR_LOGGER;
  }

  public static Logger getInfo()
  {
    return INFO_LOGGER;
  }

  public static Logger getTest()
  {
    return TEST_LOGGER;
  }

  public static Logger getWarn()
  {
    return WARN_LOGGER;
  }

  /**
   * 自定义文件输出位置
   * @param loggerFile
   * @return
   */
  public static Logger getLogger(String loggerFile)
  {
    return LogManager.getLogger(loggerFile);
  }
}

