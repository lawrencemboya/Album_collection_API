package wcci.Album_collection_API;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //1st -> Declare class as Entity for JPA-Data base. 
public class Album {
	
	//3rd -> Declare notation to auto generate ID
	@Id
	@GeneratedValue
	private Long id;
	
	// 2nd -> Declare local variables for constructor
	private String albumTitle;
	private String albumImageUrl;
	private String recordLabel;
	
	
	
	
	

}
