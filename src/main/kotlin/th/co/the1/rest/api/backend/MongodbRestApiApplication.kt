package th.co.the1.rest.api.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongodbRestApiApplication

fun main(args: Array<String>) {
	runApplication<MongodbRestApiApplication>(*args)
}
