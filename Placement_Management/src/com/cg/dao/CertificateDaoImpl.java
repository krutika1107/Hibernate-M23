package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Certificate;

public class CertificateDaoImpl implements CertificateDao{

	private EntityManager em;
	
	

	public CertificateDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}
	
	@Override
	public Certificate addCertificate(Certificate certificate) {
		em.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		em.merge(certificate);
		return certificate;
	}

	public Certificate searchCertificate(int cert_id) {
		Certificate certificate=em.find(Certificate.class,cert_id);
		return certificate;
	}

	public Certificate deleteCertificate(int cert_id) {
		em.remove(cert_id);
		return null;
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public Certificate searchCertificate(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Certificate deleteCertificate(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}