//Kyle Lowtharp phine body for practicum


//Data sets
class Body {
	public int phoneAmt
	public String name
	public Body brand


//Constructors

	Body() {
	  phoneAmt = nextID++;


	Body(Body brandName, String phoneName) {
	  this();
	  name = brandName;
	  model = phoneName;
	}

	public String toString() {
	   String desc = phoneAmt + " (" + name + ")" + "(" + model + ")";
	   
	  
	   
