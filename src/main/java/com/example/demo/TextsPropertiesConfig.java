package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySources({
  @PropertySource("classpath:texts.properties")
})
public class TextsPropertiesConfig {
  
}
