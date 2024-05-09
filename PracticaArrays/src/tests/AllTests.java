package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ test_Mediana.class, test_mediaNotas.class, test_notaMaxima.class, test_notaMinima.class })
public class AllTests {

}
