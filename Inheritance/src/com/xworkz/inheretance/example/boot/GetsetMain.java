package com.xworkz.inheretance.example.boot;

import com.xworkz.inheretance.example.app.whatapp.Amazon;
import com.xworkz.inheretance.example.app.whatapp.Phonepe;
import com.xworkz.inheretance.example.app.whatapp.Youtube;

public class GetsetMain {
		public static void main(String[] args) {
			Phonepe pay = new Phonepe();
			System.out.println(pay.getSize());
			System.out.println(pay.getUserName());
			System.out.println(pay.getUpi());
			System.out.println(pay.getTax());
			System.out.println(pay.isSafe());
			System.out.println(pay.getTxnId());
			System.out.println(pay.getSenderName());
			System.out.println(pay.getReceiverName());
			System.out.println(pay.getTime());
			System.out.println(pay.isFast());
			System.out.println(pay.isCreditCard());
			System.out.println(pay.getAmount());
			System.out.println(pay.getBank());
			System.out.println(pay.getLocation());

			System.out.println("=================================");
			pay.setSize(100);
			pay.setUserName("gagan");
			pay.setUpi("4545454545@ybl");
			pay.setTax(25.5f);
			pay.setSenderName("gagan");
			pay.setReceiverName("amruth");
			pay.setTxnId(54547899);
			pay.setTime(0.5f);
			pay.setAmount(456000);
			pay.setBank("sbi");
			pay.setLocation("davangere");

			System.out.println(pay.getSize());
			System.out.println(pay.getUserName());
			System.out.println(pay.getUpi());
			System.out.println(pay.getTax());
			System.out.println(pay.isSafe());
			System.out.println(pay.getTxnId());
			System.out.println(pay.getSenderName());
			System.out.println(pay.getReceiverName());
			System.out.println(pay.getTime());
			System.out.println(pay.isFast());
			System.out.println(pay.isCreditCard());
			System.out.println(pay.getAmount());
			System.out.println(pay.getBank());
			System.out.println(pay.getLocation());

			System.out.println("=========================");
			Youtube you = new Youtube();
			System.out.println(you.getSubscriber());
			System.out.println(you.isSubscription());
			System.out.println(you.getViews());
			System.out.println(you.getLikes());
			System.out.println(you.getDislike());
			System.out.println(you.getChannelName());
			System.out.println(you.getOwner());
			System.out.println(you.getGood());
			System.out.println(you.getAppSize());
			System.out.println(you.getName());
			System.out.println(you.getApiKey());
			System.out.println(you.getWatchHour());
			System.out.println(you.getDownloads());
			System.out.println(you.getComments());

			System.out.println("+++++++++++++++++++++++");
			you.setSubscriber(12350000);
			you.isSubscription();
			you.setViews(1554546);
			you.setLikes(45454);
			you.setDislike(45454);
			you.setChannelName("hjgH");
			you.setOwner("bbk vines");
			you.setGood(false);
			you.setAppSize(455);
			you.setName("bbvinesss");
			you.setApiKey(5454464644.04f);
			System.out.println("=========================");
			Youtube you1 = new Youtube();
			System.out.println(you1.getSubscriber());
			System.out.println(you1.isSubscription());
			System.out.println(you1.getViews());
			System.out.println(you1.getLikes());
			System.out.println(you1.getDislike());
			System.out.println(you1.getChannelName());
			System.out.println(you1.getOwner());
			System.out.println(you1.getGood());
			System.out.println(you1.getAppSize());
			System.out.println(you1.getName());
			System.out.println(you1.getApiKey());
			System.out.println(you1.getWatchHour());
			System.out.println(you1.getDownloads());
			System.out.println(you.getComments());
			System.out.println("====================");

			Amazon product = new Amazon();

			product.setProductName("Example Product");
			product.setProductId("ABC123");
			product.setPrice(99.99);
			product.setRatings(4);
			product.setCategory("Electronics");
			product.setSeller("Amazon Store");
			product.setAvailable(true);
			product.setNumberOfReviews(500);
			product.setDescription("This is an example product description.");
			product.setImageUrl("https://example.com/product-image.jpg");
			product.setShippingInfo("Ships within 2 business days.");
			product.setPrimeEligible(true);
			product.setBrand("Example Brand");
			product.setColor("Black");

			System.out.println("Product Name: " + product.getProductName());
			System.out.println("Product ID: " + product.getProductId());
			System.out.println("Price: $" + product.getPrice());
			System.out.println("Ratings: " + product.getRatings() + " stars");
			System.out.println("Category: " + product.getCategory());
			System.out.println("Seller: " + product.getSeller());
			System.out.println("Available: " + product.isAvailable());
			System.out.println("Number of Reviews: " + product.getNumberOfReviews());
			System.out.println("Description: " + product.getDescription());
			System.out.println("Image URL: " + product.getImageUrl());
			System.out.println("Shipping Info: " + product.getShippingInfo());
			System.out.println("Prime Eligible: " + product.isPrimeEligible());
			System.out.println("Brand: " + product.getBrand());
			System.out.println("Color: " + product.getColor());

			System.out.println("--------------------------------------");

			Facebook user = new Facebook();

			user.setUsername("john_doe");
			user.setFullName("John Doe");
			user.setAge(28);
			user.setGender("Male");
			user.setStatus("Feeling adventurous!");
			user.setFriendCount(500);
			user.setOnlineStatus(true);
			user.setProfilePictureUrl("https://example.com/john_profile.jpg");
			user.setCurrentCity("New York");
			user.setHometown("Los Angeles");
			user.setRelationshipStatus("Single");
			user.setPhotosCount(150);
			user.setPostCount(300);
			user.setLikesCount(1200);

			System.out.println("Username: " + user.getUsername());
			System.out.println("Full Name: " + user.getFullName());
			System.out.println("Age: " + user.getAge());
			System.out.println("Gender: " + user.getGender());
			System.out.println("Status: " + user.getStatus());
			System.out.println("Friend Count: " + user.getFriendCount());
			System.out.println("Online Status: " + user.isOnlineStatus());
			System.out.println("Profile Picture URL: " + user.getProfilePictureUrl());
			System.out.println("Current City: " + user.getCurrentCity());
			System.out.println("Hometown: " + user.getHometown());
			System.out.println("Relationship Status: " + user.getRelationshipStatus());
			System.out.println("Photos Count: " + user.getPhotosCount());
			System.out.println("Post Count: " + user.getPostCount());
			System.out.println("Likes Count: " + user.getLikesCount());
		}

	}


}
