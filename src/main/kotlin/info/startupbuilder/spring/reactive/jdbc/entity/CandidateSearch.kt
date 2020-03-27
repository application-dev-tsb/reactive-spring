package info.startupbuilder.spring.reactive.jdbc.entity

import org.springframework.data.relational.core.mapping.Table

@Table("srj_candidate_search")
class CandidateSearch(var id: Long? = null, var name: String)