package EXCEP;
class Amaz
{
	private String emailid="contact";//null if not mentioned

public String getEmailid()
{
	return emailid;
}
public void setEmailid(String emailid)
{
	this.emailid=emailid;
}
private String password="pwd";
public String setPassword;

//public String getPassword;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
	
}


}
public class encapthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Amaz a1 =new Amaz();

a1.setEmailid("test");
System.out.println(a1.getEmailid());
Amaz a2=new Amaz();
a2.setPassword="rest";

System.out.println(a2.getPassword());
	}
//find broken link in the web page
}
