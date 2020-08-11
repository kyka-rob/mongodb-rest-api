package th.co.the1.rest.api.backend.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.reactive.CorsWebFilter
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource


@Configuration
class WebConfiguration {

    @Bean
    fun corsFilter(): CorsWebFilter {
        val config = CorsConfiguration()
        config.allowCredentials = true
        config.addAllowedHeader("*")
        config.addAllowedMethod("*")
        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", config)
        return CorsWebFilter(source)
    }

}