package com.dineshonjaval.progress.dao.Impl;

import com.dineshonjaval.progress.model.Publication;
import com.dineshonjaval.progress.dao.PublicationDao;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 * @author Dinesh Rajput
 *
 */

@Repository("publicationDao")
public class PublicationDaoImpl implements PublicationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addPublication(Publication publicationBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(publicationBean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Publication> getPublications() {
		return (List<Publication>) sessionFactory.getCurrentSession().createCriteria(Publication.class).list();
	}

	@Override
	public Publication getPublication(int pubId) {
		return (Publication) sessionFactory.getCurrentSession().get(Publication.class, pubId);
	}

	@Override
	public void deletePublication(int pubId) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Publication WHERE pubId = "+pubId).executeUpdate();
	}

}
