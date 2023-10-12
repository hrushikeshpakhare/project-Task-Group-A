package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rechargeDetails")
public class RechargePlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planId;
	private String planAmount;
	private String validity;
	private String dailySMS;
	private String dataInGB;
	private String subscription1;
	private String subscription2;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(String planAmount) {
		this.planAmount = planAmount;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getDailySMS() {
		return dailySMS;
	}
	public void setDailySMS(String dailySMS) {
		this.dailySMS = dailySMS;
	}
	public String getDataInGB() {
		return dataInGB;
	}
	public void setDataInGB(String dataInGB) {
		this.dataInGB = dataInGB;
	}
	public String getSubscription1() {
		return subscription1;
	}
	public void setSubscription1(String subscription1) {
		this.subscription1 = subscription1;
	}
	public String getSubscription2() {
		return subscription2;
	}
	public void setSubscription2(String subscription2) {
		this.subscription2 = subscription2;
	}
	@Override
	public String toString() {
		return "RechargePlan [planId=" + planId + ", planAmount=" + planAmount + ", validity=" + validity
				+ ", dailySMS=" + dailySMS + ", dataInGB=" + dataInGB + ", subscription1=" + subscription1
				+ ", subscription2=" + subscription2 + "]";
	}
	
	
}
