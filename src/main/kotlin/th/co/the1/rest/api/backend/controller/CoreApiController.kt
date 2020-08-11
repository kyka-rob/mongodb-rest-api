package th.co.the1.rest.api.backend.controller

import org.springframework.data.domain.Sort
import org.springframework.data.mongodb.core.aggregation.SortOperation
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import th.co.the1.rest.api.backend.domain.Partners
import th.co.the1.rest.api.backend.repository.PartnerRepository
import java.time.LocalDateTime
import java.util.*


@RestController
@RequestMapping("/core")
class CoreApiController(val partnerRepository: PartnerRepository) {

    @GetMapping(value = ["/save"])
    fun saveAndSend(@RequestParam("eventName") eventName:String) =
            partnerRepository.save(Partners(UUID.randomUUID().toString(),eventName, "เซนทรัล", "Central", LocalDateTime.now())).flux()
}