package com.bolsadeideas.springboot.reactor.client.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import com.bolsadeideas.springboot.reactor.client.app.handler.ProductoHandler;

@Configuration
public class RouterConfig {
	
	@Bean
	public RouterFunction<ServerResponse> rutas(ProductoHandler handler){
		return route(GET("/api/client"), handler::listar)
				.andRoute(GET("/api/client/{id}"), handler::ver)
				.andRoute(POST("/api/client"), handler::crear)
				.andRoute(PUT("/api/client/{id}"), handler::editar)
				.andRoute(DELETE("/api/client/{id}"), handler::eliminar)
				.andRoute(POST("/api/client/upload/{id}"), handler::upload);
	}

}
