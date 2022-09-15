package com.cg.dao;

import com.cg.entities.Certificate;

public interface CertificateDao {
	//by default all the method are abstract in the Interface
	 Certificate  addCertificate(Certificate certificate) ; //Creation
	 Certificate  updateCertificate(Certificate certificate) ;
    Certificate  searchCertificate (long id); // Retrieve
    Certificate deleteCertificate(long id);//delete
    
    public void beginTransaction();//begin the operation of Entity Manager
	 public void commitTransaction();// close an entity manager

}