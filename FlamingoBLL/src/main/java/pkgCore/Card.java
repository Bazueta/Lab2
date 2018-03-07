package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private eRank eRank;
	private eSuit eSuit;
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card(eSuit eSuit, eRank eRank) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	public eRank geteRank() {
		return this.eRank;
	}
	
	public eSuit geteSuit() {
		return this.eSuit;
	}

	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}
	
	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
	public int getiRankNbr( ) {
		return this.geteRank().getiRankNbr();
	}

	@Override
	public int compareTo(Object arg0) {
		Card c1 = (Card)arg0;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());

}
	
}
