package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.BankAddress;
import com.ty.onetoone.dto.BankBranch;

public class TestSaveBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		BankBranch bankBranch = new BankBranch();
		bankBranch.setName("HBSC");
		bankBranch.setIfscCode("HBSC123");
		bankBranch.setPhone(77995611);

		BankAddress bankAddress = new BankAddress();
		bankAddress.setArea("Gandhi Bazzar");
		bankAddress.setState("karnataka");
		bankAddress.setCountry("India");

		bankBranch.setBankAddress(bankAddress);

		entityTransaction.begin();
		entityManager.persist(bankAddress);
		entityManager.persist(bankBranch);
		entityTransaction.commit();
	}
}
