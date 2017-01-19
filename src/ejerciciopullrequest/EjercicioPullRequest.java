/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopullrequest;

/**
 *
 * @author damian
 */
public class EjercicioPullRequest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Properties props = new Properties();
     
    props.put("mail.smtp.host","mail.lineadecodigo.com");
    props.put("mail.transport.protocol","smtp");
    props.put("mail.smtp.auth", "true");
    props.setProperty("mail.user", "myuser");
    props.setProperty("mail.password", "mypwd");
    }
    
}
