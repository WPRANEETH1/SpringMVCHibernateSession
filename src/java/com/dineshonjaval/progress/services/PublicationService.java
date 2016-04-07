package com.dineshonjaval.progress.services;

import com.dineshonjaval.progress.model.Publication;
import java.util.List;



public interface PublicationService {
	
	public void addPublication(Publication publicationBean);
	
	public List<Publication> getPublications();
	
	public Publication getPublication(int pubId);
	
	public void deletePublication(int pubId);
}
