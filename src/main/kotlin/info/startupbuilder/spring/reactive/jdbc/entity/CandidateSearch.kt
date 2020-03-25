package info.startupbuilder.spring.reactive.jdbc.entity

import org.springframework.data.relational.core.mapping.Table

@Table("search_list")
class CandidateSearch(var id: Long? = null, var name: String)