package com.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asset {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

private String assetCode;
private String deviceType;
private String brand;
private String model;
private String serialNumber;
private String department;
private String assignedTo;
private String status;
private String conditionStatus;

public Asset(){}


public Long getId() {
return id;
}

public void setId(Long id) {
this.id=id;
}

public String getAssetCode() {
return assetCode;
}

public void setAssetCode(String assetCode){
this.assetCode=assetCode;
}

public String getDeviceType() {
return deviceType;
}

public void setDeviceType(String deviceType){
this.deviceType=deviceType;
}

public String getBrand(){
return brand;
}

public void setBrand(String brand){
this.brand=brand;
}

public String getModel(){
return model;
}

public void setModel(String model){
this.model=model;
}

public String getSerialNumber(){
return serialNumber;
}

public void setSerialNumber(String serialNumber){
this.serialNumber=serialNumber;
}

public String getDepartment(){
return department;
}

public void setDepartment(String department){
this.department=department;
}

public String getAssignedTo(){
return assignedTo;
}

public void setAssignedTo(String assignedTo){
this.assignedTo=assignedTo;
}

public String getStatus(){
return status;
}

public void setStatus(String status){
this.status=status;
}

public String getConditionStatus(){
return conditionStatus;
}

public void setConditionStatus(String conditionStatus){
this.conditionStatus=conditionStatus;
}

}