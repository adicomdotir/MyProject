package ir.javacup.paint;

import java.text.DecimalFormat;

public class Circle extends Shape {
	Double redius;

	public Circle(Color c, Pattern p, double r) {
		super(c, p);
		this.redius = r;
	}
	
	@Override
	public String toString() {
		return 	"Circle" + "[color:" + this.color + ", pattern:" + this.pattern + ", redius:" 
			+ new DecimalFormat("#").format(this.redius) + "]";
	}
	
	public boolean equals(Circle obj) {
		if(obj == null) return false;
		if(Double.doubleToLongBits(this.redius) == Double.doubleToLongBits(obj.redius) 
			&& this.color == obj.color && this.pattern == obj.pattern) return true;
		return false;
	}
}
