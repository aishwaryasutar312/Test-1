package p1;

public class Factory {

	public static void main(String[] args) {
				FourWheeler c1=new FourWheeler("Honda City",1200,5,1500000);
				c1.display();
				c1.VehicleException();
				c1.UnsafetyException();
				FourWheeler c2=new FourWheeler("Maruti",1500,5,120000);
				c2.display();
				c2.VehicleException();
				c2.UnsafetyException();
				FourWheeler c3=new FourWheeler("Suzuki",900,4,5000);
				c3.display();
				c3.VehicleException();
				c3.UnsafetyException();
				FourWheeler c4=new FourWheeler("Maruti Ciaz",1300,6,1000000);
				c4.display();
				c4.VehicleException();
				c4.UnsafetyException();

			}

		}

	


