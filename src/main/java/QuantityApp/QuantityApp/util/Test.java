package QuantityApp.QuantityApp.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String raw = "1357";
        String encoded = "$2a$10$8COI5SeKWGyoPw9qT6fqIOsaYCBzro2LH8vNahf4U5gKWZbhJgcIq";
        System.out.println(encoder.matches(raw, encoded));

//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        String encoded = encoder.encode("1357");
//        System.out.println(encoded);
    }
}