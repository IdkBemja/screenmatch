import java.util.ArrayList;

import com.idkbemja.screenmatch.calculate.TimeCalculator;
import com.idkbemja.screenmatch.models.Film;
import com.idkbemja.screenmatch.models.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Film myfilm = new Film("Star Wars I", 1977, 121, false, "George Lucas");
        myfilm.setTitle("Star Wars I");
        myfilm.setYear(1977);
        myfilm.setDuration(121);
        myfilm.setInplan(false);
        // myfilm.setDirector("George Lucas");

        myfilm.showTecnicalData();
        myfilm.calification(8.5);
        myfilm.calification(9.0);
        myfilm.calification(7.5);

        System.out.println(myfilm.getCount() + " notes.");
        System.out.println(myfilm.getResultCalc());
        System.out.println("===================================");

        TimeCalculator timecalc = new TimeCalculator();
        timecalc.include(myfilm);

        Serie myserie = new Serie("The Mandalorian", 2020, 30, false, 2, 8, 30);

        ArrayList<Film> myfilms = new ArrayList<>();
        myfilms.add(myfilm);

        System.out.println("Tamaño de la lista: " + myfilms.size());
        System.out.println("Mi primera película: " + myfilms.get(0).getTitle());

        ArrayList<Serie> myseries = new ArrayList<>();
        myseries.add(myserie);

    }
}
