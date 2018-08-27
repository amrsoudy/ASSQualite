class ConverterClassTest {

	@Test
	void testConvert() {
		ConverterClass conv = new ConverterClass();
		int tool ;
		int sens;
		double val ;
		double res ;
		int count = 1 ;
		
		
		tool = 1 ;
		sens = 1;
		val = 400;
		res = 752;
		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),conv.Convert(tool, sens, val) == res );
		count ++;
		
		tool = 1 ;
		sens = 2;
		val = 400;
		res = 204;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 1 ;
		sens = 2;
		val = 400.99;
		res = 205;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 1 ;
		sens = 3;
		val = 400;
		res = 0;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 1 ;
		sens = 1;
		val = 600;
		res = 0;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 1 ;
		sens = -1;
		val = -99;
		res = 0;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 2 ;
		sens = 1;
		val = 100;
		res = 161;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		
		tool = 2 ;
		sens = 1;
		val = 200.9999;
		res = 323;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 2 ;
		sens = 2;
		val = 100;
		res = 62;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 2 ;
		sens = 2;
		val = -3;
		res = 0;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		
		
		tool = 2 ;
		sens = 3;
		val = -4;
		res = 0;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 3 ;
		sens = 1;
		val = 400;
		res = 0;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		tool = 4 ;
		sens = 1;
		val = -500;
		res = 0;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;

		tool = 2 ;
		sens = 3;
		val = 400;
		res = 0;

		
		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		
		tool = 2 ;
		sens = 3;
		val = 400;
		res = 5;

		assertTrue("cas de test No :  "+count+"Tool =  "+tool+"   sens = "+sens + " val =  "+ val +" result attendus = " +res +" Resulte obtenus = "+conv.Convert(tool, sens, val),Math.round(conv.Convert(tool, sens, val))== res );
		count ++;
		
		
		
		
	}
	
