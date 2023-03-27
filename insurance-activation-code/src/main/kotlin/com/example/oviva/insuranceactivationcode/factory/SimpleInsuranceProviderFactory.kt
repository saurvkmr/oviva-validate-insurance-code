package com.example.oviva.insuranceactivationcode.factory

import com.example.oviva.insuranceactivationcode.service.impl.AOGInsuranceProvider
import com.example.oviva.insuranceactivationcode.service.impl.TKInsuranceProvider
import com.example.oviva.insuranceactivationcode.service.interfaces.IInsuranceProvider
import com.example.oviva.insuranceactivationcode.util.InsuranceProvider
import com.example.oviva.insuranceactivationcode.util.InsuranceProvider.AOG
import com.example.oviva.insuranceactivationcode.util.InsuranceProvider.TK

class SimpleInsuranceProviderFactory {
  companion object Factory {
    private val providersMap = mutableMapOf<InsuranceProvider, IInsuranceProvider>()

    fun createInsuranceProviders(type: InsuranceProvider): IInsuranceProvider =
      when (type) {
        TK -> providersMap.computeIfAbsent(TK) { TKInsuranceProvider() }
        AOG -> providersMap.computeIfAbsent(AOG) { AOGInsuranceProvider() }
      }
  }
}