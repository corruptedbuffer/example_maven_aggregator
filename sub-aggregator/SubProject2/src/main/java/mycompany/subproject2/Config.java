/*
 * Config.java 
 *
 * Created on February 24, 2004, 8:08 PM test
 *
 */

package mycompany.subproject2;


public class Config {
    
    /**
     * The version string, for releases it should be the release name
     * 
     */    
    
    static final String version = "ATMM_R22 " ;
    //public static final String version = "micao" ;
  
    public static final String JAVA_VERSION = "1.6.0" ;

    /** Creates a new instance of Config */
    public Config() {
    }
    
    public static String getVersion() {
        return version ;
    }
    
    /**
     * Print out the version info.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println ("Hi there!") ;
    }
    
}
