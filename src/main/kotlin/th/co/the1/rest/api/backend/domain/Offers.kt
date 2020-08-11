package th.co.the1.rest.api.backend.domain

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.time.LocalDateTime

@Document(collection = "offers")
data class Offers(
    @Id val id: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val shortDescriptionTh: String,
    val shortDescriptionEn: String,
    val partnerId: String,
    @LastModifiedDate val lastModifiedDate: LocalDateTime
)