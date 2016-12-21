package com.flytxt.stram.transform;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;

import lombok.extern.slf4j.Slf4j;

@EnableBinding(Processor.class)
@ConfigurationProperties
@Slf4j
public class Transform {



	@ServiceActivator(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
	public Object transform(final Object payload) {
		log.info("Transformed by {}" ,"checking");
		return payload;
	}


}
