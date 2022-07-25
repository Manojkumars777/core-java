package com.xworkz.bmwmotors;

public class BMWMotors {
	
	
	
	public BMWMotors() {
		super();
    System.out.println("inside default constructor");
	}
	
	
	public BMWMotors(int id, String founderName, int foundedIn, int recentModel, String horePower, String oilType,
			String mailage, String features, int cost, long manegerNum) {
		super();
		this.id = id;
		this.founderName = founderName;
		this.foundedIn = foundedIn;
		this.recentModel = recentModel;
		this.horePower = horePower;
		this.oilType = oilType;
		this.mailage = mailage;
		this.features = features;
		this.cost = cost;
		this.manegerNum = manegerNum;
	}


	private int id;
	private String founderName;
	private int foundedIn;
	private int recentModel;
	private String horePower;
	private String oilType;
	private String mailage;
	private String features;
	private int cost;
	private long manegerNum;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFounderName() {
		return founderName;
	}
	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}
	public int getFoundedIn() {
		return foundedIn;
	}
	public void setFoundedIn(int foundedIn) {
		this.foundedIn = foundedIn;
	}
	public int getRecentModel() {
		return recentModel;
	}
	public void setRecentModel(int recentModel) {
		this.recentModel = recentModel;
	}
	public String getHorePower() {
		return horePower;
	}
	public void setHorePower(String horePower) {
		this.horePower = horePower;
	}
	public String getOilType() {
		return oilType;
	}
	public void setOilType(String oilType) {
		this.oilType = oilType;
	}
	public String getMailage() {
		return mailage;
	}
	public void setMailage(String mailage) {
		this.mailage = mailage;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public long getManegerNum() {
		return manegerNum;
	}
	public void setManegerNum(long manegerNum) {
		this.manegerNum = manegerNum;
	}


	@Override
	public String toString() {
		return "BMWMotors [id=" + id + ", founderName=" + founderName + ", foundedIn=" + foundedIn + ", recentModel="
				+ recentModel + ", horePower=" + horePower + ", oilType=" + oilType + ", mailage=" + mailage
				+ ", features=" + features + ", cost=" + cost + ", manegerNum=" + manegerNum + "]";
	}
	
	
	
	
	

}
