package WigellsBageri.src;

public class PrinsessT√•rtaSkapande implements Command{
    Skapande skapande ;

    public PrinsessT√•rtaSkapande(Skapande skapande) {
        this.skapande = skapande;
    }

    @Override
    public void execute() {
        skapande.Prinsesst√•rtaSkapande();
    }
}
