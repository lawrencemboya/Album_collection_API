package wcci.Album_collection_API;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Album album;
	
	private String songTitle;
	private String songImageUrl;
	private String duration;
	
	public Song(String songTitle, String songImageUrl, String duration) {
		
		this.songTitle = songTitle;
		this.songImageUrl = songImageUrl;
		this.duration = duration;
	}
	
	//General constructor
	private Song() {
		
	}

	public Long getId() {
		return id;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public String getSongImageUrl() {
		return songImageUrl;
	}

	public String getDuration() {
		return duration;
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
		Song other = (Song) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
