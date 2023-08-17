package com.xworkz.inheretance.example.boot;

import com.xworkz.inheretance.example.app.whatapp.Linked;

public class LinkedRunner {
		
		public static void main(String[] args) {
			System.out.println("Invoking main in Linkedin");
			
			Linked link = new Linked();
			
			link.setCompanyName("LinkedIn");
			System.out.println(link.getCompanyName());
			
			link.setHeadquarters("California");
			System.out.println(link.getHeadquarters());
			
			link.setLanguagesSupported(10);
			System.out.println(link.getLanguagesSupported());
			
			link.setNumberofIndustries(100);
			System.out.println(link.getNumberofIndustries());
			
			link.setRegisteredUsers(200000);
			System.out.println(link.getRegisteredUsers());
			
			link.setHasMobileApp(true);
			System.out.println(link.isHasMobileApp());
			
			link.setHasResumeBuilder(true);
			System.out.println(link.isHasResumeBuilder());
			
			link.setJobSearching(false);
			System.out.println(link.isJobSearching());
			
			link.setOffersNetworking(true);
			System.out.println(link.isOffersNetworking());
			
			link.setOffersPremium(false);
			System.out.println(link.isOffersPremium());
			
			link.setProfileCreation(true);
			System.out.println(link.isProfileCreation());
			
			link.setProvidesCompany(true);
			System.out.println(link.isProvidesCompany());
			
			link.setProvidesLearning(true);
			System.out.println(link.isProvidesLearning());
			
			link.setSupportsSharing(true);
			System.out.println(link.isSupportsSharing());
		}


	}

