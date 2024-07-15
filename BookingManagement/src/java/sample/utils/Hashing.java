/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ADMIN
 */
public class Hashing {
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
    public static boolean checkPassword(String passIn, String storedPassword) {
        return BCrypt.checkpw(passIn, storedPassword);
    }
    
//    public static void main(String[] args) {
//        System.out.println(Hashing.hashPassword("hsjhgsjdjhdhjsagdjheuiy32euiyeuhejkhqewiuey97749423h234gui4647729470923dhsgd76y7ey3249uweoidhast3293p093gjhrd").length());
//    }
//input: 12345
//output: $2a$10$gXzRbDVDARA4ERtjP/s9g.WrExj3RcNrwNGKjrqOamxvLdJa15AQm
}
