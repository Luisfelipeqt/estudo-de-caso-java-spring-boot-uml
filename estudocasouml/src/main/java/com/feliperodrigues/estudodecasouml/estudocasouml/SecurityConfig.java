package com.feliperodrigues.estudodecasouml.estudocasouml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(
                authorizeConfig -> {
                    authorizeConfig.requestMatchers("/pedidos").permitAll();
                    authorizeConfig.requestMatchers("/produtos").permitAll();
                    authorizeConfig.requestMatchers("/pedidos/{id}").permitAll();
                    authorizeConfig.requestMatchers("/produtos/{id}").permitAll();

                    authorizeConfig.anyRequest().authenticated();
                }
        ).formLogin(Customizer.withDefaults())
        .build();
    }

}
