package com.example.oviva.insuranceactivationcode

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.oviva.insuranceactivationcode.config")
class InsuranceActivationCodeApplication

fun main(args: Array<String>) {
	runApplication<InsuranceActivationCodeApplication>(*args)
}
