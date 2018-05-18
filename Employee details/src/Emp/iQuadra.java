package Emp;

public class iQuadra {

String name;
int ID;
String Address;

String getname()
{ 
	return name;
		}
void SetName(String n)
{
	name=n;
}

int ID()
{ 
	return ID;
		}
void SetID(int i)
{
	ID=i;
}

int getID()
{
	return ID;
	
}
String getAddress()
{
	return Address;
}

void SetAddress (String a)
{
  Address=a;
  }



   public static void main(String[] args)
	
	{
		iQuadra obj= new iQuadra();
		obj.SetName ("Binoy");
		String n= obj.getname();	// TODO Auto-generated method stub
		System.out.println("Name:"+n);
		
		obj.SetID (8);
		int i= obj.getID();	// TODO Auto-generated method stub
		System.out.println("ID:"+i);
		
		obj.SetAddress ("Wateridge Society");
		String a= obj.getAddress();	// TODO Auto-generated method stub
		System.out.println("Address:"+a);
		
		
		}
		
		
	}


