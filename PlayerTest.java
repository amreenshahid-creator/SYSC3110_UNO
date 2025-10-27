/*** @author Iman Elabd
* @verion 1.2 October 25, 2025
*/

import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;

/***
*This test class checks Player class.
*/
public class PlayerTest{

/***
*This test checks new player is correctly created.
*/
  @Test
  public void testPlayerCreation(){
    Player player = new Player("Iman");
    assertEquals("Iman", player.getName());
    assertEquals("Iman", player.toString());} 
/***
* This tests player deck empty
*/
  @Test
  public void testAddCardToDeckPlayer(){
    Player player = new Player("Amreen");
    assertTrue(player.getPersonalDeck().isEmpty());
  }
 /***
 *This test assure deck has cards added and is not empty anymore.
 */
  @Test
  public void testNotEmptyDeck(){
    Player player = new Player("Marc");
    Card card = new Card(Card.Colours.RED, Card.Values.THREE);
    player.addCard(card);
    assertFalse(player.getPersonalDeck().isEmpty()); 
    List<Card> deck = player.getPersonalDeck();
    assertEquals(1, deck.size());}
}
