package com.java.webflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

  @Test
  public void testMono() {
    Mono<?> monoString = Mono.just("java learn")
            .then(Mono.error(new RuntimeException("Ocurre una excepcion")))
            .log();
    monoString.subscribe(System.out::println, (e) -> System.out.println(e.getMessage()));
  }

  @Test
  public void testFlux() {
    Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Spring Reactive")
            .concatWithValues("AWS")
            .concatWith(Flux.error(new RuntimeException("Excepcion ocurrido en Flux")))
            .concatWithValues("Cloud")
            .log();
    fluxString.subscribe(System.out::println, (e) -> System.out.println(e.getMessage()));
  }
}
