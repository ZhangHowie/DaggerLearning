package bastardScenario;

public class Boltons implements House{
    @Override
    public void prepareWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}
