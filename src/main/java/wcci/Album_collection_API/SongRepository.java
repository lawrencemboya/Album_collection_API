package wcci.Album_collection_API;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
	Song findBySongTitle(String songTitle);

}
