/**
 * 
 */
package br.com.vvatte.vendas.onlineconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "br.com.vvatte.vendas.online.repository")
public class MongoConfig {

}
