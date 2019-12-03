package com.example.privacyappserver

import org.springframework.data.redis.core.RedisHash
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@RedisHash("PrivacyWarning")
class PrivacyWarning(
        @Id var id: UUID = UUID.randomUUID(),
        val app: String = "",
        val permission: String = "",
        val description: String = ""
)


