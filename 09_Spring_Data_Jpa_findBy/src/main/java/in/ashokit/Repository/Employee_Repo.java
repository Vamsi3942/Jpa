package in.ashokit.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.Entity.Employee_Entity;

public interface Employee_Repo extends CrudRepository<Employee_Entity, Serializable> 
{
	public List<Employee_Entity> findByEname(String name);
	public List<Employee_Entity> findByEsal(Double sal);
	public List<Employee_Entity> findByEnameAndEid(String name,Integer id);
	public List<Employee_Entity> findByEsalGreaterThan(double esal);
	public List<Employee_Entity> findByEnameIn(List<String> names);
	
	@Query("from Employee where Emp_id=:eid")
	public Employee_Entity findByEid(Integer id);
	
}
