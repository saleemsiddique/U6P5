import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TDDSongTest {

    @Test
    public void test1(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList("fly"));
        String resultadoEsperado = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        String resultadoReal = song.compruebaliricas(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList("spider"));
        String resultadoEsperado = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" ;
        String resultadoReal = song.compruebaliricas(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList("fly", "spider"));
        String resultadoEsperado =  "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        String resultadoReal = song.compruebaliricas(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test4(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList("spider", "fly"));
        String resultadoEsperado =  "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider;\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n";
        String resultadoReal = song.compruebaliricas(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test5(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList("fly", "spider", "bird"));
        String resultadoEsperado =  "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the spider,\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        String resultadoReal = song.compruebaliricas(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test6(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList("bird", "fly", "spider"));
        String resultadoEsperado =   "There was an old lady who swallowed a bird.\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "There was an old lady who swallowed a spider;\n" +
                "How absurd to swallow a spider.\n" +
                "She swallowed the spider to catch the fly,\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n";
        String resultadoReal = song.compruebaliricas(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}
