package models;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class HeroTest {
    @After
    public void clearInstances(){
        Hero.clearAllHeroes();
    }

    @Test
    public void Hero_InstantiatesCorrectly_true() throws Exception {
        Hero myHero = new Hero("Me", 25, "Wits", "LWK", 1);
        assertTrue(myHero instanceof Hero);
    }

    public Hero setUpNewHero() {

        return new Hero("Batman", 32, "Sulking", "Robin", 1);
    }
}