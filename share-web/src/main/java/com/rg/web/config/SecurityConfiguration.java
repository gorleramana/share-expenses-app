/**
 * 
 */
package com.rg.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author gorle
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

//	@Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		 http
//         .authorizeHttpRequests(auth -> auth
//             .requestMatchers("/", "/**").permitAll()
//             .anyRequest().authenticated()
//         )
//         .oauth2Login(); // Enables OAuth2 login
//     return http.build();
//    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
            .username("admin")
            .password("admin123")
            .roles("USER")
            .build();
        return new InMemoryUserDetailsManager(user);
    }
}
