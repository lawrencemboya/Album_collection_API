package wcci.Album_collection_API;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@DataJpaTest
public class JPAMappingTest {
	
	@Autowired
	private SongRepository songRepo;
	
	@Autowired
	private ArtistRepository artistRepo;
	
	@Autowired
	private AlbumRepository albumRepo;

	@Autowired
	TestEntityManager entityManager;

	@Test
	public void shouldStartJpaTestFrameWork() {
		
	}
	
	@Test
	public void albumShouldHaveOneArtistAndACollectionOfSongs() {
		Song testSong = new Song("title", "duration", "url");
		testSong = songRepo.save(testSong);
		Artist testArtist = new Artist("name", "image", "age", "label", "home town");
		testArtist = artistRepo.save(testArtist);
		Album testAlbum = new Album("title", "imageUrl", "label");
		testAlbum = albumRepo.save(testAlbum);
		testAlbum.addArtist(testArtist);
		testAlbum.addSong(testSong);
		
		
		entityManager.flush();
		entityManager.clear();

		Album retrievedAlbum = albumRepo.findById(testAlbum.getId()).get();
		assertThat(retrievedAlbum.getArtist(), is(testArtist));	
	}
	
	
	
	
}
