package com.example.oviva.insuranceactivationcode.domain

data class InsuranceProvider(
  //var details: MutableList<MutableMap<String, String>>,
  val name: String,
  val url: String,
  val activationCodeStarting: String
)