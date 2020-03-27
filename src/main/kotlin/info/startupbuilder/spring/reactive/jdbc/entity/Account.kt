package info.startupbuilder.spring.reactive.jdbc.entity

import org.springframework.data.relational.core.mapping.Table

@Table("srj_account")
class Account(var id: Long? = null,
              var username: String,
              var password: String,
              var accountAuthority: Set<AccountAuthority> = HashSet())

data class AccountAuthority(var role: String)