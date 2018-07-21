package base;

public abstract class Persona {

	private String name;
	private String description;
	private Attributes attributes;
	private int experience;
	private int experienceToUp = 20;
	
	public int getExperienceToUp() {
		return experienceToUp;
	}

	public void setExperienceToUp() {
		this.experienceToUp = 2*experienceToUp;
	}

	public Persona(String name, String description, Attributes attributes, int experience) {
		this.name = name;
		this.description = description;
		this.attributes = attributes;
		this.experience = experience;
	}

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

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
