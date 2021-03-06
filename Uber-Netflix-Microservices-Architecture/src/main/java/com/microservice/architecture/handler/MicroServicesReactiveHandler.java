package com.microservice.architecture.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class MicroServicesReactiveHandler {

	public Mono<ServerResponse> flux(ServerRequest serverRequest){
		
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(
				Flux.just("Uber","Netflix").log(), String.class);
				
	}
	
	public Mono<ServerResponse> mono(ServerRequest serverRequest){
		
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(
				Mono.just("GA4GH").log(), String.class);
				
	}
	
}
