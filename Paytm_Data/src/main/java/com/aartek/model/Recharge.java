package com.aartek.model;







import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="Recharge")
	public class Recharge {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="id")
		private int id; 
		
		@Column(name="date")
     	private String date;
		
		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		@Column(name="Mobile_No")
		private Long mobile_no;
		
		@Column(name="Amount")
		private Integer amount;
		
		@Column(name="Vender")
		private String vender;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		
		public Long getMobile_no() {
			return mobile_no;
		}

		public void setMobile_no(Long mobile_no) {
			this.mobile_no = mobile_no;
		}

		public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getVender() {
			return vender;
		}

		public void setVender(String vender) {
			this.vender = vender;
		}
		
		
	}
