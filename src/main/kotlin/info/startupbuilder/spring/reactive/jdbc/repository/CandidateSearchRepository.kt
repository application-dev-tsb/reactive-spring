package info.startupbuilder.spring.reactive.jdbc.repository

import info.startupbuilder.spring.reactive.jdbc.entity.CandidateSearch
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface CandidateSearchRepository : ReactiveCrudRepository<CandidateSearch,Long> {
}