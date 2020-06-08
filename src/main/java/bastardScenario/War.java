package bastardScenario;

public class War {

    private Starks starks;

    private Boltons boltons;

    public War() {

        starks = new Starks();
        boltons = new Boltons();

        starks.prepareWar();
        boltons.prepareWar();
        starks.reportWar();
        boltons.reportWar();
    }
}
