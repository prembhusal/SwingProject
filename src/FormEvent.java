import java.util.EventObject;

public class FormEvent extends EventObject {
	private String name;
	private String work;
	
	public FormEvent(Object source) {
		super(source);
	}
	public FormEvent(Object source, String name, String work) {
		super(source);
		this.name = name;
		this.work = work;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String occupation) {
		this.work = occupation;
	}
	
}
