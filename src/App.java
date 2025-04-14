import com.idkbemja.screenmatch.calculate.TimeCalculator;
import com.idkbemja.screenmatch.models.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Serie myfilm = new Serie();
        myfilm.setTitle("Star Wars I");
        myfilm.setYear(1977);
        myfilm.setDuration(121);
        myfilm.setInplan(false);
        // myfilm.setDirector("George Lucas");
        myfilm.setSeasons(1);
        myfilm.setEpisodesperseason(1);
        myfilm.setMinutesperepisode(121);

        myfilm.showTecnicalData();
        myfilm.calification(8.5);
        myfilm.calification(9.0);
        myfilm.calification(7.5);

        System.out.println(myfilm.getCount() + " notes.");
        System.out.println(myfilm.getResultCalc());
        System.out.println("===================================");

        TimeCalculator timecalc = new TimeCalculator();
        timecalc.include(myfilm);

    }
}
