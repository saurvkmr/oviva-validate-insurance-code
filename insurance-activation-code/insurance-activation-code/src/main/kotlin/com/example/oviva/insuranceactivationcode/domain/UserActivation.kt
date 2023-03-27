package com.example.oviva.insuranceactivationcode.domain

import com.example.oviva.insuranceactivationcode.util.InsuranceProvider
import java.util.UUID

data class UserActivation(
  val userId: UUID,
  val activationCode: String,
  val insuranceProviderName: InsuranceProvider // dependency UI has to send the same name
)