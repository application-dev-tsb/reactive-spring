package info.startupbuilder.spring.reactive.jdbc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveJdbcApplication

fun main(args: Array<String>) {
	runApplication<ReactiveJdbcApplication>(*args)
}
