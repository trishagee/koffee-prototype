package com.mechanitis.kafelito.koffeeserver

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KoffeeControllerIntegrationTest(@Autowired val restTemplate: TestRestTemplate) {

  @Test
  fun `Assert coffee shop landing page works`() {
    val entity = restTemplate.getForEntity<String>("/coffeeshop")
    assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
    assertThat(entity.body).contains("[\"Coffee!\"]")
  }

}