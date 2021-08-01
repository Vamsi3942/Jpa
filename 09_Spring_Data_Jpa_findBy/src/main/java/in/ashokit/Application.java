package in.ashokit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import antlr.collections.List;
import in.ashokit.Entity.Employee_Entity;
import in.ashokit.Repository.Employee_Repo;

@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		Employee_Repo bean = ctxt.getBean(Employee_Repo.class);
		
		
		java.util.List<Employee_Entity> findByEname = bean.findByEname("vamsi");
		System.out.println(findByEname);
		System.out.println("**********Record Fetched Successfully***********");
		
		java.util.List<Employee_Entity> findByEsal = bean.findByEsal(16500.00);
		System.out.println(findByEsal);
		System.out.println("**********Record Fetched Successfully***********");
		
		 java.util.List<Employee_Entity> findByEnameAndEid = bean.findByEnameAndEid("manoj",100);
		 findByEnameAndEid.forEach(emp->
		 {
			 System.out.println(emp);
		 });
		 System.out.println("**********Record Fetched Successfully***********");
		 
		 java.util.List<Employee_Entity> findByEsalGreaterThan = bean.findByEsalGreaterThan(16500.00);
		 findByEsalGreaterThan.forEach(emp->
		 {
			 System.out.println(emp);
		 });
		 System.out.println("---------------------------------");
		 java.util.List<Employee_Entity> findByEnameIn = bean.findByEnameIn(Arrays.asList("vamsi","manoj","Ramu"));
		 findByEnameIn.forEach(emp->
		 {
			 System.out.println(emp);
		 }
		 );
		 System.out.println("-------saved successfully------");
		 
		Employee_Entity findByEid = bean.findByEid(101);
		System.out.println(findByEid);
	}
}
		
	


