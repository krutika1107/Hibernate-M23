package com.cg.services;

import com.cg.dao.CertificateDao;
import com.cg.dao.CertificateDaoImpl;
import com.cg.entities.Certificate;

public class CertificateServicesImpl implements CertificateService
{
	//Establishing connection
		private CertificateDao ce;
		//default constructor
			public CertificateServicesImpl()
			{
				super();
				ce =new CertificateDaoImpl();
				
			}
	//2:we are going to use EntityManager method-CRUD
		public Certificate addCertificate(Certificate certificate) {
			ce.beginTransaction();
			ce.addCertificate(certificate);
			ce.commitTransaction();
			return certificate;
		}
		public Certificate updateCertificate(Certificate certificate) {
			ce.beginTransaction();
			ce.updateCertificate(certificate);
			ce.commitTransaction();
			return certificate;
		}
		public Certificate searchCertificate(long id) {
			ce.beginTransaction();
			Certificate certificate = ce.searchCertificate(id);
			ce.commitTransaction();
			return certificate;
		}
		public Certificate deleteCertificate(long id) {
			ce.beginTransaction();
			Certificate certificate = ce.deleteCertificate(id);
			ce.commitTransaction();
			return certificate;
		}
	

}