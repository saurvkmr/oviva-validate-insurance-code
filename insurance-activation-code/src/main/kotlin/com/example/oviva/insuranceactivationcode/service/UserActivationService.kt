package com.example.oviva.insuranceactivationcode.service

import com.example.oviva.insuranceactivationcode.config.InsuranceProviderConfig
import com.example.oviva.insuranceactivationcode.domain.UserActivation
import org.springframework.stereotype.Service

@Service
class UserActivationService(
  insuranceProviderConfig: InsuranceProviderConfig
) {
  fun validateUserActivationCode(userActivation: UserActivation) {
    userActivation.activationCode

  }
}