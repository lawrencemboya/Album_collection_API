package wcci.Album_collection_API;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity //1st -> Declare class as Entity for JPA-Data base. 
public class Album {
	
	//3rd -> Declare notation to auto generate ID
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private Collection <Song> songs;
	
	// 2nd -> Declare local variables for constructor
	private String albumTitle;
	private String albumImageUrl;
	private String recordLabel;
	
	public Album(String albumTitle, String albumImageUrl, String recordLabel) {
		
		this.albumTitle = albumTitle;
		this.albumImageUrl = albumImageUrl;
		this.recordLabel = recordLabel;
	}
	
	private Album() {
		
	}

	public Long getId() {
		return id;
	}

	public Collection<Song> getSongs() {
		return songs;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getAlbumImageUrl() {
		return albumImageUrl;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
