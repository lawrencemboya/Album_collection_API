package wcci.Album_collection_API;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
	Album findByAlbumTitle (String albumTitle);
}
