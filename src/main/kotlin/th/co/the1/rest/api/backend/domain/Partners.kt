package th.co.the1.rest.api.backend.domain

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "partners")
data class Partners(
    @Id val id: String,
    val code: String,
    val nameTh: String,
    val nameEn: String,
    val descTh: String,
    val descEn: String,
    @LastModifiedDate val lastModifiedDate: LocalDateTime
)