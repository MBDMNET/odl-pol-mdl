package com.santalucia.cdc.core.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Task Executor - Config
 *
 */
@Slf4j
@Configuration(proxyBeanMethods = false)
@EnableAsync(proxyTargetClass=true)
public class TaskExecutorConfig {

  /**
   * constructor de clase
   *
   */
  public TaskExecutorConfig() {
    log.debug("TaskExecutorConfig loaded");
  }
}
