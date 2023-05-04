package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.info")
public class Company2 {

	@Value("${user.info.name}")
	private String name;
	@Value("${user.info.location}")
	private String Location;
	@Value("${user.info.size}")
	private Integer size;
	
	static {
		System.out.println("Conmpany1.class file is loading");
	}
	
	public Company2() {
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
