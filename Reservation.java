package model;

public class Reservation {
	private String name, trainNo, trainName, classType, date, source, destination;

	public Reservation(String name, String trainNo, String trainName, String classType, String date, String source,String destination) {
		this.name = name;
		this.trainName = trainName;
		this.trainNo = trainNo;
		this.classType = classType;
		this.date = date;
		this.source = source;
		this.destination = destination;
	}
	
	public String getName() {return name;}
	public String getTrainNo() {return trainNo;}
	public String getTrainName() {return trainName;}
	public String getClassType() {return classType;}
	public String getDate() {return date;}
	public String getSource() {return source;}
	public String getDestination() {return destination;}
}
