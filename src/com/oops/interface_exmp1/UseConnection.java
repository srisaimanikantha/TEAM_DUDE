package com.oops.interface_exmp1;

interface Connection{
	void getCommand(String command);
	
}
class Manager{
	private static class Statement implements Connection{
		
		@Override
		public void getCommand(String command) {
			
			System.out.println("Statement permits only static command");
			System.out.println(command);
			
		}
	}
	private static class PreparedStatement implements Connection{
		@Override
		public void getCommand(String command) {
			System.out.println("PreparedStatements Permits Both static , dynamic Commands");
			System.out.println(command);
			
		}
	}
	private static class CallStatement implements Connection{
		@Override
		public void getCommand(String command) {
			System.out.println("CallStatement Permits static, dynamic and procedure command ");
			System.out.println(command);
			
		}
	}
	static Connection getConnection(String statement) {
		
		if(statement.equals("statement")) {
			return new Statement();
			
		}else if(statement.equals("prepared")) {
			return new PreparedStatement();
			
		}else if(statement.equals("callable")) {
			return new CallStatement();	
			
		}
		return null;
	}
}

public class UseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection c=Manager.getConnection("statement");
		execute(c,"Get siva with id: 5");  ///static
		
		c=Manager.getConnection("prepared");
		
		execute(c,"Get name: ? with id: ?"); /// place holders
		
		c=Manager.getConnection("callable");
		
		execute(c,"Get procedure (UserDetails)"); //calling Procedure
		
	}

	private static void execute(Connection c,String command) {
		// TODO Auto-generated method stub
		c.getCommand(command);
		
	}

}
