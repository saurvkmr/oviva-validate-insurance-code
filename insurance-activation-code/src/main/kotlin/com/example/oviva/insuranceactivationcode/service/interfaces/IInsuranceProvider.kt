package com.example.oviva.insuranceactivationcode.service.interfaces

import com.example.oviva.insuranceactivationcode.config.InsuranceProviderConfig
import com.example.oviva.insuranceactivationcode.domain.UserActivation

abstract class IInsuranceProvider {
  private lateinit var insuranceProviderConfig: InsuranceProviderConfig

  fun validateActivationCode(userActivation: UserActivation): Boolean {
    val insuranceProviderDetail =
      insuranceProviderConfig.details.first { it.name == userActivation.insuranceProviderName.name }
    return userActivation.activationCode.length != insuranceProviderDetail.codeLen && userActivation.activationCode.startsWith(
      insuranceProviderDetail.activationCodeStarting
    )
  }
}

