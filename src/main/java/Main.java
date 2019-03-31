import pl.sda.zoo.model.Bear;
import pl.sda.zoo.model.BlackBear;
import pl.sda.zoo.model.BrownBear;
import pl.sda.zoo.model.PolarBear;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Main {

    public static boolean attackSuccess() {
        Random random = new Random();
        int result = random.nextInt(4);
        System.out.println("random = " + result);

        if (result == 1) {
            System.out.println("atak udany!");
            return true;
        } else {
            System.out.println("atak nieudany!");
            return false;
        }

    }

    public static void arena(LinkedList<Bear> fighters) {
        int numberOfRounds = 0;

        while (fighters.size() != 1) {

            for (Bear bear : fighters) {
                numberOfRounds += 1;

                System.out.println("Runda: " + numberOfRounds);
                if (attackSuccess()) {

                    if (bear.attack().equals("ten mis zabija")) {
                        Random random = new Random();
                        int attackedBearNumber = random.nextInt(fighters.size());
                        String attackedBearId = fighters.get(attackedBearNumber).getId();
                        if (attackedBearId.equals(bear.getId())) {
                            System.out.println(bear.getClass().getSimpleName() + " bije sam siebie!");
                        } else {
                            fighters.remove(attackedBearNumber);
                        }
                    }


                } else {
                    System.out.println();
                }

                System.out.println();
            }

        }

        System.out.println("osatni niedzwiedz to " + fighters.get(0).getId());
        System.out.println("zwyciezyl po " + numberOfRounds + " rundach");
    }

    public static void main(String[] args) {


        PolarBear bearPolar = new PolarBear(true, 10);
        BrownBear bearBrown = new BrownBear(true, 10);
        BlackBear blackBear = new BlackBear(true, 10);

        bearPolar.setId("polarowy");
        bearBrown.setId("brązowy");
        blackBear.setId("czarny");


        LinkedList<Bear> fighters = new LinkedList<>();
        fighters.add(bearBrown);
        fighters.add(bearPolar);
        fighters.add(blackBear);

        arena(fighters);

    }

}



//    stworzyć aplikacji, która będzie
//    modelowała zoo. Będziemy krok po kroku rozbudowywali
//    aplikację o kolejne elementy, pamiętając o technikach i dobrych
//    zasadach, których nauczyliśmy się do tej pory. Logikę aplikacji
//    będziemy tworzyli korzystając z TDD.
//

//    zadanie 4) Stworzyć odpowiednią hierarchię zwierząt. Będziemy sprawdzali czy każde zwierzę (pl.sda.zoo.model.Animal) żyje oraz ważyli
//    je od czasu do czasu w ramach rutynowych badań.
//            cd.) w zoo będą się znajdowały
//    tylko niedźwiedzie (pl.sda.zoo.model.Bear). Na początek będą się tam znajdowały
//    niedźwiedzie czarne (pl.sda.zoo.model.BlackBear), niedźwiedzie brunatne
//(pl.sda.zoo.model.BrownBear) i niedźwiedzie polarne (pl.sda.zoo.model.PolarBear).
//
//    niedźwiedzie to nietypowe zwierzęta i żeby sprawdzić czy
//    żyją (isAlive) należy przypomnieć sobie ostatnią datę ich posiłku.
//    Jeśli zwierzę jadło mniej niż 10 dni temu, to jest żywe.

//    10) Niedźwiedzie są niebezpiecznymi zwierzętami, które walczą o
//    swoje jedzenie i mogą atakować swoje ofiary (attack). Brunatne i
//    czarne niedźwiedzie tylko ranią swoje ofiary, a niedźwiedzie
//    polarne - zabijają.
//
//    Metody powinny zwracać odpowiedni tekst (String) jako wynik.
//
//    11) Dla każdej nowej funkcjonalności, którą dodamy w klasie
//    głównej Bear będziemy musieli nadpisywać metody w klasach,
//    które tej funkcjonalności nie obsługują, jak np. w pluszowym
//    misiu. Zamiast tego moglibyśmy stworzyć interfejs, który
//    dodajemy do odpowiednich klas i piszemy jego implementację.
//
//    12) Niedźwiedzie żyją w pętli. Każdy niedźwiedź ma 25% szans na atak (o ile żyje).
//    Stwórz metodę, która dostarczy określoną liczbę misiów do zoo, a następnie sprawdź ile powtórzeń
//    wykona pętla nim zostanie jeden niedźwiedź.

//    13) Możesz dodać pluszowemu misiowi metodę revive()

