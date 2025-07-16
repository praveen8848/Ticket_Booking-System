package org.booking.utill;


import org.springframework.security.crypto.bcrypt.BCrypt;

public class UserServiceUtill {
    public static String hashPassword(String plainPassWord){
        return BCrypt.hashpw(plainPassWord,BCrypt.gensalt());
    }

    public static boolean checkPassword(String plainPassword, String hashedPassWord){
        return BCrypt.checkpw(plainPassword, hashedPassWord);
    }
}
