package sf.crom.service;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="person.service", ignoreUnknownFields=false)
public class ServiceProperties {
	
	@NotNull
	String name;
	@NotNull
	String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ServiceProperties [name=" + name + ", description=" + description + "]";
	}
	
	

}
