package io.apirest.estacionamento.java;

import io.apirest.estacionamento.java.security.dto.UsuarioLoginDto;
import io.apirest.estacionamento.java.security.jwt.JwtToken;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.reactive.server.WebTestClient;
import java.util.function.Consumer;

public class JwtAuthentication {

    public static Consumer<HttpHeaders> getHeaderAuthorization(WebTestClient client, String username, String password) {

        var token = client
            .post()
            .uri("/api/v1/auth")
            .bodyValue(new UsuarioLoginDto(username, password))
            .exchange()
            .expectStatus().isOk()
            .expectBody(JwtToken.class)
            .returnResult().getResponseBody().getToken();

        return headers -> headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + token);
    }
}

