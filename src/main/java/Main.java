import gui.Menu;
import utils.JsonParser;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();

        menu.startMenu(JsonParser.getAllStarWarsCharacters());
    }
}
