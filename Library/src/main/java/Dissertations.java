
public class Dissertations extends Items {

	private String supportingBody;

	public Dissertations(String itemTitle, String returnDate, String currentOwner, boolean available) {
		super(itemTitle, returnDate, currentOwner, available);
		this.supportingBody = supportingBody;
	}

	public String getSupportingBody() {
		return supportingBody;
	}

	public void setSupportingBody(String supportingBody) {
		this.supportingBody = supportingBody;
	}

}
