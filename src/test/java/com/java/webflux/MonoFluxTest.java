package com.java.webflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

  @Test
  public void testMono() {
    Mono<?> monoString = Mono.just("java learn")
            .then(Mono.error(new RuntimeException("Ocurre una excepcion")))
            .log();
    monoString.subscribe(System.out::println, (e) -> System.out.println(e.getMessage()));
  }
  public  void  testFlux(){

  }
}
