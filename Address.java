
package java_oven_shop;


public class Address {
 private int houseNo;
 private int zone;
 private String streetName;
 Address(int houseNo,int zone, String streetName)
 {
     setHouseNo(houseNo);
     setZone(zone);
     setStreetName(streetName);
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

