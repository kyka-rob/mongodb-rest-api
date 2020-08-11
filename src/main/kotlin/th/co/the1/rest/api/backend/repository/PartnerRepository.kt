package th.co.the1.rest.api.backend.repository

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import th.co.the1.rest.api.backend.domain.Partners

interface PartnerRepository: ReactiveMongoRepository<Partners, String>