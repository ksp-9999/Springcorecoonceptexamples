package com.durgasoft.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.durgasoft.event.AccountEvent;

public class AccountEventPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
	public void publish(String msg) {
		AccountEvent ae= new AccountEvent(this, msg);
		publisher.publishEvent(ae);
	}

}
