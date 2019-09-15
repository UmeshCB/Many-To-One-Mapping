package p1;

public class BookApp 
{

	public static void main(String[] args) 
	{
		Publisher p=new Publisher();
		p.setPname("Pearson");
		
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		
		b1.setBname("Java");
		b1.setPublish(p);
		
		b2.setBname("C");
		b2.setPublish(p);
		
		b3.setBname("C++");
		b3.setPublish(p);
		
		HibernateManager hm=new HibernateManager();
		hm.connect();
		
		hm.insert(b1);
		hm.insert(b2);
		hm.insert(b3);

	}

}
