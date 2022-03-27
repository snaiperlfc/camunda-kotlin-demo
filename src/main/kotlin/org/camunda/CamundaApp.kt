package org.camunda
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableProcessApplication
open class CamundaApp

fun main(args: Array<String>) {
    SpringApplication(CamundaApp::class.java)
        .run(*args)
}