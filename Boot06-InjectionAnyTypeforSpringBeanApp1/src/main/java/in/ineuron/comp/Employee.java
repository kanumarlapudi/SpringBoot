package in.ineuron.comp;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

	private String name;
	private long id;
	private String[] skills;
	private java.util.List<String> teamMembers;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;
	private Company company;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", skills=" + Arrays.toString(skills) + ", teamMembers="
				+ teamMembers + ", phoneNumbers=" + phoneNumbers + ", idDetails=" + idDetails + ", company=" + company
				+ "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public java.util.List<String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(java.util.List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Map<String, Object> getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
