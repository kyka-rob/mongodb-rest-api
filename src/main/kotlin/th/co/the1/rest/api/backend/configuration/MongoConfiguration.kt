//package th.co.the1.rest.api.backend.configuration
//
//import com.mongodb.reactivestreams.client.MongoClient
//import com.mongodb.reactivestreams.client.MongoClients
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory
//import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
//import org.springframework.data.mongodb.core.ReactiveMongoTemplate
//import org.springframework.data.mongodb.core.convert.MappingMongoConverter
//import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories
//import th.co.the1.rest.api.backend.repository.PartnerRepository
//
//@Configuration
//@EnableReactiveMongoRepositories(basePackageClasses = arrayOf(PartnerRepository::class ))
//class MongoConfiguration: AbstractReactiveMongoConfiguration() {
//
//    override fun reactiveMongoClient(): MongoClient = mongoClient()
//
//    @Bean
//    fun mongoClient(): MongoClient = MongoClients.create("mongodb://admin:admin@localhost")
//
//    override fun getDatabaseName(): String = "the1"
//
//    @Bean
//    override fun reactiveMongoTemplate(databaseFactory: ReactiveMongoDatabaseFactory, mongoConverter: MappingMongoConverter): ReactiveMongoTemplate = ReactiveMongoTemplate(mongoClient(), databaseName)
//
//}