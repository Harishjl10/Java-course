package com.xworkz.inheretance.example.boot;

import com.xworkz.inheretance.example.app.whatapp.Github;

public class Githubrunner {

	public static void main(String[] args) {
		Github github = new Github();
		
		github.setUsername("santosh c");
		System.out.println(github.getUsername());
		
		github.setFastname("santosh c");
		System.out.println(github.getFastname());

		github.setAge(23);
		System.out.println(github.getAge());

		github.setEmail("santosh@gmail.com");
		System.out.println(github.getEmail());

		github.setVersion("ship software ");
		System.out.println(github.getVersion());

		github.setForks("Forks ");
		System.out.println(github.getForks());

		github.setBranches("sefely experiment ");
		System.out.println(github.getBranches());

		github.setWorkflow("Workflow ");
		System.out.println(github.getWorkflow());

		github.setGithubpage("Githubpage ");
		System.out.println(github.getGithubpage());

		github.setSecurity("Security ");
		System.out.println(github.getSecurity());

		github.setNavigate("Navigate c");
		System.out.println(github.getNavigate());

		github.setAccount("amruth");
		System.out.println(github.getAccount());

		github.setCodereview("Codereview ");
		System.out.println(github.getCodereview());

		github.setSocial("Social c");
		System.out.println(github.getSocial());
	}

}
