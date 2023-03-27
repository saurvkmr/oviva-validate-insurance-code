package com.example.oviva.insuranceactivationcode.controller

import com.example.oviva.insuranceactivationcode.domain.UserActivation
import com.example.oviva.insuranceactivationcode.service.UserActivationService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/user-activation")
class ActivationCode(
  val userActivationService: UserActivationService
) {

  @PostMapping
  fun userActivation(@RequestBody userActivation: UserActivation) {
    userActivationService.validateUserActivationCode(userActivation)
  }
}