package br.com.hoiama.curriculos.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.hoiama.curriculos.model.entity.Formacao;

@EntityScan(basePackageClasses = {Formacao.class})
@EnableJpaRepositories("br.com.hoiama.curriculos.model.repository")
@ComponentScan(basePackages= {"br.com.hoiama.curriculos"})
@EnableCachingDeliveryConfigServerApplication
@EnableConfigServer
@SpringBootApplication
public class DeliveryConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryConfigServerApplication.class, args);
	}
	
	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager();
	}
}
