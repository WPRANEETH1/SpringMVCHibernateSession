package com.dineshonjaval.progress.services.Impl;

import com.dineshonjaval.progress.model.Publication;
import com.dineshonjaval.progress.dao.PublicationDao;
import com.dineshonjaval.progress.services.PublicationService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * @author Dinesh Rajput
 *
 */
@Service("publicationService")
//@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PublicationServiceImpl implements PublicationService {

	@Autowired
	private PublicationDao publicationDao;
	
	@Transactional//(propagation = Propagation.REQUIRED, readOnly = false)
	public void addPublication(Publication publicationBean) {
		publicationDao.addPublication(publicationBean);
	}
        @Transactional
	public List<Publication> getPublications() {
		return publicationDao.getPublications();
	}
        
        @Transactional
	@Override
	public Publication getPublication(int pubId) {
		return publicationDao.getPublication(pubId);
	}

        @Transactional
	@Override
	public void deletePublication(int pubId) {
		publicationDao.deletePublication(pubId);
	}

}
