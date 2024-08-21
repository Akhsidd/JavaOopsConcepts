package inheritance;

public class USER {

	public static void main(String[] args) {
		AdminUser admin = new AdminUser();
		admin.write();
		admin.read();
		admin.Manage();
		
		DevloperUser dev = new DevloperUser();
		dev.write();
		dev.read();
		
		GuestUser guest = new GuestUser();
		guest.read();
		
	}

}
