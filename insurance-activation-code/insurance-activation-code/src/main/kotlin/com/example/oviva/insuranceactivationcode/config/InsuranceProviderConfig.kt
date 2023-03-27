package com.example.oviva.insuranceactivationcode.config

import com.example.oviva.insuranceactivationcode.domain.Details
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "insurance-provider")
data class InsuranceProviderConfig(
  var details: MutableList<Details>
)