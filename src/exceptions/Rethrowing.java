package exceptions;

// : exceptions/Rethrowing.java
// Demonstrating fillInStackTrace()

public class Rethrowing
{
	public static void f() throws Exception
	{
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}

	public static void g() throws Exception
	{
		try
		{
			f();
		}
		catch (Exception e)
		{
			System.out.println("Inside g(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}

	public static void h() throws Exception
	{
		try
		{
			f();
		}
		catch (Exception e)
		{
			System.out.println("Inside h(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception) e.fillInStackTrace();
		}
	}

	public static void main(String[] args)
	{
		try
		{
			g();
		}
		catch (Exception e)
		{
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		System.out.println("--------------------------------");
		try
		{
			h();
		}
		catch (Exception e)
		{
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
} 
/**
originating the exception in f()
Inside g(),e.printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.f(Rethrowing.java:11)
	at exceptions.Rethrowing.g(Rethrowing.java:18)
	at exceptions.Rethrowing.main(Rethrowing.java:46)
main: printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.f(Rethrowing.java:11)
	at exceptions.Rethrowing.g(Rethrowing.java:18)
	at exceptions.Rethrowing.main(Rethrowing.java:46)
--------------------------------
originating the exception in f()
Inside h(),e.printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.f(Rethrowing.java:11)
	at exceptions.Rethrowing.h(Rethrowing.java:32)
	at exceptions.Rethrowing.main(Rethrowing.java:56)
main: printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.h(Rethrowing.java:38)
	at exceptions.Rethrowing.main(Rethrowing.java:56)
	
	
	
-----------------------------------
如果只是把

*/

