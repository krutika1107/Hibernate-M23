package com.cg.services;

import com.cg.entities.College;


public interface CollegeServices {
	College addCollege(College college);
	College updateCollege(College college);
	boolean deleteCollege(long id);
	College searchCollege(long id);

}