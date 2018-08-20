package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import main.mainclass;
import junit.framework.TestCase;

public class testmain extends TestCase {

	public testmain(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetElementWeight() {
	}

	public void testTritype() throws IOException {
		mainclass tri = new mainclass();
		
		File file = new File("C:\\Users\\1795162\\Documents\\GitHub\\ASSQualite\\Classeur1.txt");
		 
		  BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st;
		  int compteur = 0 ;
		  
		  while ((st = br.readLine()) != null){
			  
			  String[] stFin = st.split(";");
				double a= Double.parseDouble((stFin[0])); ;
				double b = Double.parseDouble((stFin[1]));;
				double c = Double.parseDouble((stFin[2]));;
				double res1 = Double.parseDouble((stFin[3])) ;
				assertTrue("a: " +a+ "   b:  "+b+ "     c:   "+c +"\nCas de test N : " + compteur+ "resultat trouver  est   :   "+ res1 +"Resultat trouver   est : "+tri.Tritype(a, b, c),tri.Tritype(a, b, c) == res1);
				compteur++;
			  
		  }
		  
		  br.close();
		    
		  
		
	}

}
