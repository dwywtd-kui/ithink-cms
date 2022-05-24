package com.ithink.cms.core;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author : hanliukui
 * @datetime : 2022-05-23 21:56
 * @description : description of this file
 */
@Configuration(proxyBeanMethods = false)
@EntityScan
@EnableJpaRepositories
public class IthinkCoreConfiguration {



}
