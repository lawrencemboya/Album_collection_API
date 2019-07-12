package wcci.Album_collection_API;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Artist {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@OneToMany(mappedBy = "artist")
	private Collection <Album> albums;
	
	
	private String name;
	private String artistImageURL;
	private String artistAge;
	private String recordLabel;
	private String homeTown;
	
	
	public Artist(String name, String artistImageURL, String artistAge, String recordLabel, String homeTown) {
		this.name = name;
		this.artistImageURL = artistImageURL;
		this.artistAge = artistAge;
		this.recordLabel = recordLabel;
		this.homeTown = homeTown;
		this.albums = new ArrayList<>();
	}

	private Artist() {
		
	}
	
	
	public Long getId() {
		return Id;
	}


	public Collection<Album> getAlbums() {
		return albums;
	}


	public String getName() {
		return name;
	}


	public String getArtistImageURL() {
		return artistImageURL;
	}


	public String getArtistAge() {
		return artistAge;
	}


	public String getRecordLabel() {
		return recordLabel;
	}

	public String getHomeTown() {
		return homeTown;
	}
	
	// not sure how the bellow came to be
	
	public void addAlbum(Album album) {
		this.albums.add(album);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
		Artist other = (Artist) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
	
	




	
	
	
	
	
	
	
	
	
}
