package com.bridgelabz.oops.StockManagement.Model;

public class StockDetails {
	//returns the data what we given  as input
	public class InventaryDetails {
		private String name;
		private long share;
		private long price;
      //get company name
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		//getting company shares
		public long getShare() {
			return share;
		}
		public void setShare(long weight) {
			this.share = weight;
		}
		//getting  shareprice
		public long getPrice() {
			return price;
		}
		public void setPrice(long price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "StockDetails [companyname=" + name + ", share=" + share + ", price=" + price + "]";
		}
	}


}
