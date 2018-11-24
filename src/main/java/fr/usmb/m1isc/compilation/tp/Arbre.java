package fr.usmb.m1isc.compilation.tp;

public class Arbre {
	private String value;
	private Arbre left;
	private Arbre right;

	public Arbre(String value, Arbre left, Arbre right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public String toString(){ 
		return "(" + aux(this) + ")";
	}
	
	private String aux(Arbre arbre) {
		if (arbre==null) return "";
		else if(arbre.left == null || arbre.right == null) return arbre.value.toString();
		else return arbre.value.toString() + "(" + aux(arbre.left) + " " + aux(arbre.right) + ")";
	}
	
	public int nbElement(Arbre  arbre){  
	    if (arbre==null)return 0;
	    else return nbElement(arbre.left) + 1 + nbElement(arbre.right);
	}
}
