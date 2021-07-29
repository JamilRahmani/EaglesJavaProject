package practiceSeasons;

public class RChild extends RParent{
	
private int nbr2;
	
	public RChild() {
		super();
		nbr2 = 0;
	}
	public RChild(int nbr1, int nbr2) {
		super(nbr1);
		this.nbr2 = nbr2;
	}
	
	public int getNbr2() {
		return nbr2;
	}
	public void setNbr2(int nbr2) {
		this.nbr2 = nbr2;
	}

}
