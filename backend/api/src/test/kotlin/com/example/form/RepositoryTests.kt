package com.example.form

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest
class RepositoryTests @Autowired constructor(
    val entityManager: TestEntityManager,
    val userRepository: Repository
    ) {

    //@Test
    //fun

}