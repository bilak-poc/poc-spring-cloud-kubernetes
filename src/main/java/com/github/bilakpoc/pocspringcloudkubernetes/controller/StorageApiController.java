package com.github.bilakpoc.pocspringcloudkubernetes.controller;

import java.util.Map;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.bilakpoc.pocspringcloudkubernetes.config.Storage;
import com.github.bilakpoc.pocspringcloudkubernetes.config.StorageProperties;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StorageApiController {

  private final StorageProperties storageProperties;
  private final Environment environment;

  @GetMapping
  ResponseEntity<Map<String, Storage>> getStorages() {
    return ResponseEntity.ok(storageProperties.getLongTerm());
  }

  @GetMapping("/{propertyName}")
  ResponseEntity<String> getProperty(@PathVariable String propertyName) {
    return ResponseEntity.ok(propertyName + "=" + environment.getProperty(propertyName));
  }

}
