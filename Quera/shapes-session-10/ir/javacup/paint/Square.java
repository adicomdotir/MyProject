package ir.javacup.paint;


public class Square extends Shape {

	Integer length;

	public Square(Color c, Pattern p, int length) {
		super(c, p);
		this.length = length; // autoboxing
	}
		
	@Override
	public String toString() {
		return 	"Square" + "[color:" + this.color + ", pattern:" + this.pattern + ", length:" + this.length + "]";
	}
	
	public boolean equals(Square obj) {
		if(obj == null) return false;
		if(this.length == obj.length && this.color == obj.color && this.pattern == obj.pattern) return true;
		return false;
	}
}
