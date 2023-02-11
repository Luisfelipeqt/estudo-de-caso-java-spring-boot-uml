package com.feliperodrigues.estudodecasouml.estudocasouml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Profile(value = "security")
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
        ).oauth2Login(Customizer.withDefaults())
        .build();
    }

}
