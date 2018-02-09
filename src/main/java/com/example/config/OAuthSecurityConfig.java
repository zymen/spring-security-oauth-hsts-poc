package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerEndpointsConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerSecurityConfiguration;

/**
 * @author Rob Winch
 */
@Configuration
@Import(AuthorizationServerEndpointsConfiguration.class)
public class OAuthSecurityConfig extends AuthorizationServerSecurityConfiguration {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		http.headers().httpStrictTransportSecurity().disable();
	}
}
