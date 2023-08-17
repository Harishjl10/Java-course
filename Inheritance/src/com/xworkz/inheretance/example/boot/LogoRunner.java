package com.xworkz.inheretance.example.boot;

import com.xworkz.inheretance.example.app.whatapp.Logo;

public class LogoRunner {

	public static void main(String[] args) {
		Logo logo1 = new Logo();
        Logo logo = new Logo("MyLogo", "Circle", "Blue", 100, 100);
        System.out.println(logo1);
        System.out.println(logo);
    }

}
