package part21_com.java.protectedaccessmodifiers2;
import part20_com.java.protectedaccessmodifiers1.SampleTest_protected;

public class SampleTestProtected extends SampleTest_protected{

	public static void main(String[] args) {
		SampleTestProtected sample = new SampleTestProtected();
		sample.data=20;  
		sample.m1();         
	}
}
