package com.example.oviva.insuranceactivationcode.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "activation-code")
@ConfigurationPropertiesScan
data class ActivationCodeConfig(
  val len: Int,
  val startsWith: List<String>
)
