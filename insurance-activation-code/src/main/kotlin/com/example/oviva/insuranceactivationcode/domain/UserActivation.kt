package com.example.oviva.insuranceactivationcode.domain

import java.util.UUID

data class UserActivation(
  val userId: UUID,
  val activationCode: String
)