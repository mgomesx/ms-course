package com.mgomes.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgomes.hrpayroll.enitities.Payment;
import com.mgomes.hrpayroll.enitities.Worker;
import com.mgomes.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeingClient;
	
	public Payment getPayment(long workerId, int days) {
	
		Worker worker = workerFeingClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
