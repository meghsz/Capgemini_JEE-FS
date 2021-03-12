/*
 * Create a base class Fruit which has name ,taste as its attributes. A method called eat() is 
created which describes the name of the fruit and its taste. Inherit the same in 2 other class 
Apple and Orange and override the eat() method to represent each fruit taste
 * */
package Q1;
class Fruits
{
String name;
String taste;
 void eat()
{
	System.out.println("fruit:"+this.name);
	System.out.println("taste:"+this.taste);
	}
}

class Orange extends Fruits
{

	void eat() {
		System.out.println("fruit:Orange" +"\nTaste sweet");		
	}	
}
public class Fruit {

	public static void main(String[] args) {
		
		Orange o=new Orange();
		o.eat();
		
	}

}
