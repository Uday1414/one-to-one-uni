package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.BankAddress;
import com.ty.onetoone.dto.BankBranch;

public class TestDeleteBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		BankBranch bankBranch=entityManager.find(BankBranch.class,2);
		BankAddress bankAddress=bankBranch.getBankAddress();
		
		entityTransaction.begin();
		entityManager.remove(bankAddress);
		entityManager.remove(bankBranch);
		entityTransaction.commit();
	}
}
