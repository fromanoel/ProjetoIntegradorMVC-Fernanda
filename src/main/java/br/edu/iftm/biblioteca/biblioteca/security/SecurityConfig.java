package br.edu.iftm.biblioteca.biblioteca.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
@Bean

public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

http.authorizeHttpRequests(

auth -> auth
.requestMatchers("/menu").hasAnyRole("ADMIN", "USER")
.requestMatchers( "/**","/js/**","/","/css/**", "/cadastro", "/cadastroUs" , "/login/**").permitAll()
.anyRequest().authenticated()

)

.formLogin((form) -> form

.loginPage("/").permitAll()

)

.csrf(AbstractHttpConfigurer::disable);

return http.build();

}

@Bean

public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {

return authenticationConfiguration.getAuthenticationManager();

}
}