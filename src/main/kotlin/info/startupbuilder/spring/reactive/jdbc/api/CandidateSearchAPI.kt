package info.startupbuilder.spring.reactive.jdbc.api

import info.startupbuilder.spring.reactive.jdbc.entity.CandidateSearch
import info.startupbuilder.spring.reactive.jdbc.repository.CandidateSearchRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/candidate-search")
class CandidateSearchAPI(private val repository: CandidateSearchRepository) {

    @PostMapping
    fun save(search: CandidateSearch): Mono<CandidateSearch> {
        return repository.save(search)
    }

    @GetMapping
    fun findAll(): Flux<CandidateSearch> {
        return repository.findAll()
    }
}