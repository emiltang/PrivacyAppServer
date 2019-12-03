package com.example.privacyappserver

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PrivacyWarningRepository : CrudRepository<PrivacyWarning, Long>