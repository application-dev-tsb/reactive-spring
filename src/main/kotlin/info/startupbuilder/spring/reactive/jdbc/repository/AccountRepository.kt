package info.startupbuilder.spring.reactive.jdbc.repository

import info.startupbuilder.spring.reactive.jdbc.entity.Account
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono

interface AccountRepository : ReactiveCrudRepository<Account, Long> {

    @Query("SELECT a FROM Account a WHERE username = :username")
    fun findByUsername(username: String): Mono<Account>
}