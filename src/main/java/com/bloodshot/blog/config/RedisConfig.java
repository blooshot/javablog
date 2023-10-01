package com.bloodshot.blog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Value("${redis.hostname}")
    private String redisHostName;

    @Value("${redis.port}")
    private int redisPort;


    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){

//        System.out.println(redisHostName);
//        System.out.println(redisPort);
        RedisStandaloneConfiguration RedisStandAloneConfiguration = new RedisStandaloneConfiguration();
        RedisStandAloneConfiguration.setHostName(redisHostName);
        RedisStandAloneConfiguration.setPort(redisPort);
//        RedisStandAloneConfig.setPassword("password");

        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(RedisStandAloneConfiguration);
        return  jedisConnectionFactory;
    }


    @Bean
    public RedisTemplate<String, Object>redisTemplate(){
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.afterPropertiesSet();

        return redisTemplate;
    }

}
