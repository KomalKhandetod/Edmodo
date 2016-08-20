package Inportia.Cucumber.StepDefination;

import cucumber.api.java.en.Given;

public class login_step {
	@Given("^Open Login page$")
	public void open_Login_page() throws Throwable {
		System.out.println("open login");
	}

	@Given("^Enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
		System.out.println("Enter user ID and password");
	}

	@Given("^Verify if login is successful$")
	public void verify_if_login_is_successful() throws Throwable {
		System.out.println("Verify login");
	}
	
	@Given("^Compose a mail$")
	public void compose_a_mail() throws Throwable {
	    System.out.println("Compose mail");
	}

	@Given("^Type content in email$")
	public void type_content_in_email() throws Throwable {
		System.out.println("Type content");
	}

	@Given("^Add attachments to email$")
	public void add_attachments_to_email() throws Throwable {
		System.out.println("Attachments");
	}

	@Given("^Add email ID to send$")
	public void add_email_ID_to_send() throws Throwable {
		System.out.println("Add send to");
	}

	@Given("^Send the email$")
	public void send_the_email() throws Throwable {
		System.out.println("send email");
	}





	
}
