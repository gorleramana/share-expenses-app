/**
 * 
 */
package com.rg.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * @author gorle
 */
@Configuration
@EnableWebSecurity
//@EnableWebFluxSecurity
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
    
//    @Bean
//    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//        http
//            .oauth2Login()    // Enables OAuth2 login flow (SSO)
//            .and()
//            .authorizeExchange(exchange -> exchange
//                .pathMatchers("/login", "/public/**").permitAll()
//                .anyExchange().authenticated()
//            );
//        return http.build();
//    }
}
