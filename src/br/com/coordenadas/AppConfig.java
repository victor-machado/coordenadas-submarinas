package br.com.coordenadas;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan(basePackages="br.com.coordenadas")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig extends WebMvcConfigurerAdapter {

}
