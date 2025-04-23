package guru.springframework.spring6restmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // set basic but ignore CSRF
        http.authorizeHttpRequests()
                .anyRequest().authenticated()
                .and().httpBasic(Customizer.withDefaults())
                .csrf(httpSecurityCsrfConfigurer -> {
            httpSecurityCsrfConfigurer.ignoringRequestMatchers("/api/**");
        });
        // old version: http.csrf().ignoringRequestMatchers("/api/**"); // ignore everything with /api in URL
        return http.build();
    }
}
