package com.example.oviva.insuranceactivationcode.config

import com.example.oviva.insuranceactivationcode.domain.InsuranceProvider
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "insurance-provider")
@ConfigurationPropertiesScan
data class InsuranceProviderConfig(
  val insuranceProvider: MutableList<InsuranceProvider>
)