import items.Item;
import items.instruments.Drumkit;
import items.instruments.Guitar;
import items.instruments.instrumentType;
import items.music.GuitarTab;
import items.music.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    GuitarTab guitarTab;
    SheetMusic sheetMusic;
    Drumkit drumkit;
    Guitar guitar;
    Shop rays_music;

    @Before
    public void setUp(){
        guitarTab = new GuitarTab("sheet music for guitars", 5.50, 7.95);
        sheetMusic = new SheetMusic("music in standard notation", 4.85, 7.49);
        drumkit = new Drumkit("full-size drumkit for pro's", 110.99, 235.00, instrumentType.PERCUSSION, "silver", 4, 2, 6);
        guitar = new Guitar("electric guitar", 150.00, 450.99, instrumentType.STRING, "red", 4, 6, false);
        rays_music = new Shop();
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Sir, stairway to heaven is on our ban list.", guitar.playInstrument());
        assertEquals("ba dum dum, tiss", drumkit.playInstrument());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(300.99, guitar.calculateMarkup(), 0.01);
        assertEquals(124.01, drumkit.calculateMarkup(), 0.01);
        assertEquals(2.64, sheetMusic.calculateMarkup(),0.01);
    }

    @Test
    public void itemHasReqAttributes(){
        //description
        assertEquals("electric guitar", guitar.getItemDescription());
        assertEquals("music in standard notation", sheetMusic.getItemDescription());

        //price bought at
        assertEquals(5.50, guitarTab.getBuyPrice(),0.0);
        assertEquals(110.99, drumkit.getBuyPrice(),0.0);

        //price sold at
        assertEquals(450.99, guitar.getSellPrice(),0.0);
        assertEquals(7.49, sheetMusic.getSellPrice(),0.0);
    }

    @Test
    public void canAddandRemoveItemFromShop(){
        assertEquals(0, rays_music.getStock().size());
        rays_music.addStock(guitar);
        rays_music.addStock(sheetMusic);
        rays_music.addStock(guitarTab);
        rays_music.addStock(drumkit);
        assertEquals(4, rays_music.getStock().size());
        rays_music.removeStock(guitar);
        rays_music.removeStock(guitarTab);
        rays_music.removeStock(sheetMusic);
        rays_music.removeStock(drumkit);
        assertEquals(0, rays_music.getStock().size());
    }

    @Test
    public void canRemoveSpecificItem(){
        rays_music.addStock(guitar);
        rays_music.addStock(sheetMusic);
        Item item = rays_music.removeStock(guitar);
        assertEquals("electric guitar", item.getItemDescription());
    }

    @Test
    public void instrumentHasEnumType(){
        assertEquals("string instrument", guitar.getType().getValue());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        rays_music.addStock(guitar);
        rays_music.addStock(drumkit);
        rays_music.addStock(sheetMusic);
        rays_music.addStock(guitarTab);
        double potentialProfit = rays_music.potentialProfit();
        assertEquals(430.09, potentialProfit, 0.01);
    }



}
