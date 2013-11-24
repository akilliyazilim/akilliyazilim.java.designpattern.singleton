
public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		/*Burada SingleObject nesnesinden direkt olarak
		new operat�r�yle nesne olu�turmay� deniyoruz.
		SingleObject a = new SingleObject();
		fakat syntax hatas� al�yoruz ��nk� dedi�imiz gibi
		Signleton Tasar�m deseni bize sadece kendi instance metodu ile tek bir nesne
		yaratmam�za izin veriyor.
		*/
		
		SingleObject single_object = SingleObject.getInstance();
		single_object.showMessage("I love Design Pattern in Java");
	}

}
