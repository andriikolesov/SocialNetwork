package tranning.Task6.Beer;

import static tranning.Task6.Beer.BeerType.OBOLON;

/**
 * @author Igor Hnes on 22.12.17.
 */
public class Main {

    public static void main(String[] args) {
        Beer beer = select(OBOLON);
        beer.drink();
    }

    private static Beer select(BeerType beerType) {
        switch (beerType){
            case CHERNIGIVSKE:
                return new Chernigivske();
            case OBOLON:
                return new Obolon();
                default:
                    return null;
        }
    }
}
