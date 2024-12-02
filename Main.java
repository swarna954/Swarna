package multipleBrowsers;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Elements50[] applications = new Elements50[3]; 
		
		applications[0] = new Elements50("https://github.com/login", "swarnamodepalli954@gmail.com", 
				
				"Swarna@954", 
				"//input[@id='login_field']", 
				"//input[@id='password']", 
				"//input[@name='commit']", 
				"//span[@class='Button-label']/child::img[@src='https://avatars.githubusercontent.com/u/182793108?v=4']", 
																																																				// profile																										// button
				"/html/body", null);

		
		applications[1] = new Elements50(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0",
				"8985992265", 
				"Madhu@111", 
				"//input[@id='ap_email']", 
				"//input[@id='ap_password']", 
				"//span[@id='auth-signin-button']", 
				"//span[@id='nav-link-accountList-nav-line-1']", 
				"/html/body",
				"//input[@id='continue']");


		
		
		applications[2] = new Elements50("https://www.codechef.com/login?destination=/", "swarnamodepalli02@gmail.com", 
				"Madhu@111",
				"//input[@id='edit-name'][@class='form-text required ccl-f-placeholder ccl-f-input']",
				"//input[@class='form-text required ccl-f-placeholder ccl-f-input password-login']", 
				"//input[@id='edit-submit-button'][@class='ccl-f-input ccl-float-right cc-login-btn']", 
				"//img[@src='https://cdn.codechef.com/sites/all/themes/abessive/images/user_default_thumb.jpg']", 
				"//button[@class='_logoutButton_12x5r_1126']", null);
		
		
		for (Elements50 app : applications) {
			app.login();
			Thread.sleep(2000);
			app.logout();
			Thread.sleep(2000);
			app.close();
		}
	}
}
