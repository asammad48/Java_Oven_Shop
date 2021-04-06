/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oven_shop;

/**
 *
 * @author Abdul Sammad
 */
public class Address {
 private int houseNo;
 private int zone;
 private String streetName;
 Address(int houseNo,int zone, String streetName)
 {
     this.houseNo=houseNo;
     this.zone=zone;
     this.streetName=streetName;
 }
 public int getHouseNo()
{
return houseNo;
}
void setHouseNo(int houseNo)
{
    this.houseNo=houseNo;
}
int getZone()
{
    return zone;
}
void setZone(int zone)
{
    this.zone=zone;
}
String getStreetName()
{
    return streetName;
}
void setStreetName(String stName)
{
    this.streetName=stName;
}
public String toString()
{
    return this.getClass().getSimpleName()+ ":  "+getHouseNo()+", "+getStreetName()+", ZONE : "+getZone();
}
}

