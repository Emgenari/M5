package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {
	
	//empleado -15%
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85; 
			}
		};
	}
	
	//boss +50%
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
		
	//manager +10%
		public static IPaymentRate createPaymentRateManager(){
			return new IPaymentRate() {
				@Override
				public double pay(double salaryPerMonth) {
					return salaryPerMonth*1.1; 
				}
			};
		}
}