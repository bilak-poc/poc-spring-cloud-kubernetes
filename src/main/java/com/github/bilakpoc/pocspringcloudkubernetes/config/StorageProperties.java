package com.github.bilakpoc.pocspringcloudkubernetes.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("project.storages")
public class StorageProperties {

  private Map<String, Storage> longTerm;
}
