import java.lang.*;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone
{
	String os() default "symbian";
	int version() default 4;
}
@Smartphone(os="android",version=6)
class SamsungZseries
{
	String model;
	int size;
	SamsungZseries(String model,int size)
	{
		this.model=model;
		this.size=size;
	}
}
public class Annotationdemo
{
	public static void main(String[] args) {
		
		SamsungZseries s=new SamsungZseries("fire",7);

		Class c=s.getClass(); //Reflection API
		Annotation a=c.getAnnotation(Smartphone.class);
		Smartphone s1=(Smartphone)a;
		System.out.println(s1.os());
        System.out.println(s1.version());
	}
}