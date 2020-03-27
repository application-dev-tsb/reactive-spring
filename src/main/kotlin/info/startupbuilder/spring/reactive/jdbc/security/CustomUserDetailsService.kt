package info.startupbuilder.spring.reactive.jdbc.security

import info.startupbuilder.spring.reactive.jdbc.repository.AccountRepository
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.ReactiveUserDetailsService
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class CustomUserDetailsService(private val accountRepository: AccountRepository) : ReactiveUserDetailsService {

    override fun findByUsername(username: String?): Mono<UserDetails>? {
        return username?.let { accountRepository.findByUsername(it)
                .map { account -> User.withUsername(account.username)
                        .password(account.password)
                        .authorities(account.accountAuthority.map { auth -> GrantedAuthority { auth.role } })
                        .build()
                }
        }
    }
}