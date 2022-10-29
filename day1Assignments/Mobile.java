package week1.day1Assignments;

public class Mobile {
private void makeCall() {

String mobileModel="VIVO S20";
float mobileWeight=154.55f;
System.out.println("This is a MakeCall method");
}
private void sendMsg() {
boolean isFullCharged=true;
int mobileCost=20020;
System.out.println("This is a SendMsg method");
}

public static void main(String[] args) {
	Mobile objmobile=new Mobile();
	objmobile.makeCall();
	objmobile.sendMsg();
	System.out.println("This is my mobile");

}
}
