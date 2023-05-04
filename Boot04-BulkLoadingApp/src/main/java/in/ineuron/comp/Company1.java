package in.ineuron.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
public class Company1 {

	private String name;
	private String Location;
	private Integer size;
	
	static {
		System.out.println("Conmpany1.class file is loading");
	}
	
	public Company1() {
		System.out.println("Company1:: Zero param constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Company1.setName()");
		this.name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		System.out.println("Company1.setLocation()");
		Location = location;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		System.out.println("Company1.setSize()");
		this.size = size;
	}

	@Override
	public String toString() {
		return "Company1 [name=" + name + ", Location=" + Location + ", size=" + size + "]";
	}
	
	
}
