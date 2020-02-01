package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Adaptor;

public class BankDetails {
	 private String bankName;  
	    private String accHolderName;  
	    private String acNumber;
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getAccHolderName() {
			return accHolderName;
		}
		public void setAccHolderName(String accHolderName) {
			this.accHolderName = accHolderName;
		}
		public String getAcNumber() {
			return acNumber;
		}
		public void setAcNumber(String acNumber) {
			this.acNumber = acNumber;
		}  
}
