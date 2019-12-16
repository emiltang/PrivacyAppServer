package com.example.privacyappserver

import java.util.*
import javax.persistence.*

@Entity
class PrivacyWarning(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: UUID = UUID.randomUUID(),
        val app: String = "",
        val permission: String = "",
        val description: String = ""
)
