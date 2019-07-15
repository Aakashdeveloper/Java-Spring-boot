//package com.shopping.api.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.authentication.UserCredentials;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
//
//import com.mongodb.client.MongoClient;
//
//
//public class mongoConfig {
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() throws Exception {
//        MongoClient mongoClient = new MongoClient("localhost", 27017);
//      
//        return new SimpleMongoDbFactory(mongoClient, "", );
//    }
// 
//    @Bean
//    public MongoTemplate mongoTemplate() throws Exception {
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
//        return mongoTemplate;
//    }
//}

//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
