package javaTest;

public class Variables {
	
	static final String name = "Tarento";
	static int Tbudget = 500;
	static int Tprd = 5;
	int prd2 =2;
	int exp2 = 100;
	int prd1 = 3;
	int exp1 = 200;
	
	//A & B buys 3 products with rs 200 & 2 prds with rs 100
	static void dispDetails() {
		System.out.println("Family name = "+name);
		System.out.println("Total Budget in family ="+Tbudget);
		System.out.println("Total products in family = "+Tprd );	
		System.out.println("**************************************");
	}
	
	//A & B buy 3 for 200
	void state1() {
		System.out.println("A & B buys 3 prducts for rs 200");
		System.out.println("Products with family = "+prd1);
		System.out.println("Budget with family = "+Cbudget(exp1));
		System.out.println("A & B buys 2 products for rs 100");
		int res = prd1+prd2;
		System.out.println("Products with family = "+res);
		System.out.println("Budget with family = "+Cbudget(exp2));
		System.out.println("**************************************");
		
	}
	
	//find current budget
	int Cbudget(int exp) {
		
		int cb = Tbudget - exp;
		Tbudget = cb;
		return cb;	
		
	}
	
	//find product count
	int Cprd(int prd) {
		int cp = Tprd -prd;
		Tprd = cp;
		return cp;
	}
	
	//C returns 2 prd and gets back rs 100
	void state2() {
		System.out.println("C returns 2 prds and gets back rs 100");
		System.out.println("Products with family = "+ Cprd(prd2));
		int sum = (Tbudget+exp1)-exp2;
		System.out.println("Budget with family = "+ sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variables v = new Variables();
		v.dispDetails();
		v.state1();
		v.state2();
	}

}
