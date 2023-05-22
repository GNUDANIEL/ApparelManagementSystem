package apparel;

public abstract class Cloth extends Apparel {
	
	public Cloth(ApparelKind kind) {
		super(kind);//this.kind와 동일?
	}
	public abstract void printInfo();
}
