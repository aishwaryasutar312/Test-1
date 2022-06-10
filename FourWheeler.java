package p1;
import java.util.*;
public class FourWheeler {
	String name;
	int cc;
	int safety;
	int price;
	FourWheeler(String n, int c,int sft, int p){
	this.name=n;	
	this.safety=sft;
	this.price=p;
}
void VehicleException() {
	System.out.println("Enter Available cc: ");
	Scanner s=new Scanner(System.in);
	int cc=s.nextInt();
	if(cc<1000||cc>4000) {
		System.out.println("It is a two wheller,not four wheller");
	}
}
void display()  {
	System.out.println(name+" "+cc+" "+safety+" "+price);
}
void UnsafetyException() {
	System.out.println("Enter safety value: ");
	Scanner s=new Scanner(System.in);
	int sftvvl=s.nextInt();
	if(sftvvl!=5) {
		System.out.println("Sorry,Invalid safety features");
	}
	
}
}


