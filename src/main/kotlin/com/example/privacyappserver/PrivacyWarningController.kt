package com.example.privacyappserver

import org.springframework.web.bind.annotation.*


@RestController()
@RequestMapping("warning")
class PrivacyWarningController(val privacyWarningRepository: PrivacyWarningRepository) {

    @GetMapping
    fun get(): MutableIterable<PrivacyWarning> = privacyWarningRepository.findAll()

    @PostMapping
    fun post(@RequestBody privacyWarning: PrivacyWarning) {
        println(privacyWarning)
        privacyWarningRepository.save(privacyWarning)
    }
}