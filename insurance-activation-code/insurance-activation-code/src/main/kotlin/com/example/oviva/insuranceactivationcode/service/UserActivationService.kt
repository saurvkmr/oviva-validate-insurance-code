package com.example.oviva.insuranceactivationcode.service

import com.example.oviva.insuranceactivationcode.domain.UserActivation
import com.example.oviva.insuranceactivationcode.factory.SimpleInsuranceProviderFactory
import org.springframework.stereotype.Service

@Service
class UserActivationService {
  fun validateUserActivationCode(userActivation: UserActivation) {
    userActivation.activationCode
    val insuranceProvider = SimpleInsuranceProviderFactory.createInsuranceProviders(userActivation.insuranceProviderName)
    insuranceProvider.validateActivationCode(userActivation)
  }
}