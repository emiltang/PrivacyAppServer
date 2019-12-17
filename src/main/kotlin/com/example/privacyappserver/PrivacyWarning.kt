package com.example.privacyappserver

import javax.persistence.*

@Entity
class PrivacyWarning(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val app: String = "",
        val permission: String = "",
        val description: String = ""
)
