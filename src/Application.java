
public class Application  {

	public static void main(String[] args) {
		
		IntSet set1=new ArrayBasedSet();
		set1.add(33);
		set1.add(23);
		set1.add(14);
		set1.add(1);
		set1.add(2);
		set1.add(23);
		set1.add(18);
		set1.add(33);
		set1.add(33);
		set1.add(33);

		System.out.println("set1=	"+set1);		
		
		
		
		if(set1.contains(44)) {
			System.out.println("Set1 contains 44");		
		}
		
		else {
			System.out.println("Set1 doesn't contain 44");	
		}
		
		set1.remove(1);
		set1.remove(33);
		System.out.println("set1=	"+ set1);
		
		IntSet set2=new ArrayBasedSet();
		set2.add(221);
		set2.add(23);
		set2.add(104);
		set2.add(1);
		
		System.out.println("set2="+ set2);
		
		
		IntSet set3=set2.intersection(set1);
		System.out.println("intersection="+set3);		
		
		IntSet set4=set2.union(set1);
		System.out.println("union="+set4);
		
		 int []items =set1.toArray();
			for(int a:items)
			System.out.print(a+",");
		
			System.out.println("");
		IntSet set5=set2.difference(set1);
		System.out.println("difference="+set5);

		
		
		
			
		
		
	
		

			
				

	}

}
