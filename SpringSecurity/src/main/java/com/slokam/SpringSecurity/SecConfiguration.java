package com.slokam.SpringSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecConfiguration extends WebSecurityConfigurerAdapter{
    
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable().authorizeRequests().anyRequest().authenticated()
		.and().formLogin().loginPage("/loginPage").
		loginProcessingUrl("/loginProcess").
		usernameParameter("userName").
		passwordParameter("password").
		permitAll().
		and().
		logout().permitAll();
		
		
	}
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails ud = User.withDefaultPasswordEncoder().
				username("ar").password("1216").roles("USER").build();
		return new InMemoryUserDetailsManager(ud);
	}
}
