package in.ashokit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee_Entity
{
	@Override
	public String toString() {
		return "Employee_Entity [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	@Id
	@Column(name="EMP_ID")
	private Integer eid;
	@Column(name="EMP_NAME")
	private String ename;
	@Column(name="EMP_SAL")
	private Double esal;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
}
