
public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		/*Burada SingleObject nesnesinden direkt olarak
		new operatörüyle nesne oluþturmayý deniyoruz.
		SingleObject a = new SingleObject();
		fakat syntax hatasý alýyoruz çünkü dediðimiz gibi
		Signleton Tasarým deseni bize sadece kendi instance metodu ile tek bir nesne
		yaratmamýza izin veriyor.
		*/
		
		SingleObject single_object = SingleObject.getInstance();
		single_object.showMessage("I love Design Pattern in Java");
	}

}
