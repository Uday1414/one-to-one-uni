package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.BankAddress;
import com.ty.onetoone.dto.BankBranch;

public class TestGetBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		BankBranch bankBranch=entityManager.find(BankBranch.class,1);
		System.out.println("---------------------");
		System.out.println("Branch name : "+bankBranch.getName());
		System.out.println("Branch Ifsccode : "+bankBranch.getIfscCode());
		System.out.println("Branch phone : "+bankBranch.getPhone());
		
		BankAddress bankAddress=bankBranch.getBankAddress();
		System.out.println("-----------------------------------");
		System.out.println("Address area : "+bankAddress.getArea());
		System.out.println("Address state : "+bankAddress.getState());
		System.out.println("Address country : "+bankAddress.getCountry());
	}
}
