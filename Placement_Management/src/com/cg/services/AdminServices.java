package com.cg.services;

import com.cg.entities.Admin;

public interface AdminServices {
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin login(Admin admin);
	boolean logout();


}