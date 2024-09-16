package com.example.maternitycare.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // This matches all /api endpoints
                .allowedOrigins("http://localhost:3000")  // Allow requests from the React app
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // HTTP methods to allow
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true);  // Allows cookies and credentials
    }
}
