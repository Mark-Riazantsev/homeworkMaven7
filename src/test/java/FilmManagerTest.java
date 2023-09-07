import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void addedFilms0() {

        filmManager manager = new filmManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedFilms1() {


        filmManager manager = new filmManager();
        manager.addFilm("Movie 1");


        String[] actual = manager.findAll();
        String[] expected = {"Movie 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedFilms3() {

        filmManager manager = new filmManager();
        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFromEmptyManager() {

        filmManager manager = new filmManager();
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFromManager3() {

        filmManager manager = new filmManager();
        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFromManager5() {

        filmManager manager = new filmManager();
        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");
        manager.addFilm("Movie 4");
        manager.addFilm("Movie 5");
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFromManager8() {

        filmManager manager = new filmManager();
        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");
        manager.addFilm("Movie 4");
        manager.addFilm("Movie 5");
        manager.addFilm("Movie 6");
        manager.addFilm("Movie 7");
        manager.addFilm("Movie 8");
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {"Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4"};
        Assertions.assertArrayEquals(expected, actual);
    }
}