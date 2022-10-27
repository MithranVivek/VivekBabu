package org.familymembers;

public class MembersDetails extends MembersAge implements RelationDetails {
	
	public void hemaLatha() {
		System.out.print("Hemalatha: ");
		System.out.println("WIFE");
	}
	public void yutikshaa() {
		System.out.print("Yutikshaa: ");
		System.out.println("Doughter");
	}
	public void perumalSamy() {
		System.out.print("Perumalsamy: ");
		System.out.println("FATHER");
	}
	public void prabha() {
		System.out.print("Prabha: ");
		System.out.println("MOTHER");
	}
	
	@Override
	public void Father() {
		System.out.println("Name : Perumalsamy");
		System.out.println("       FATHER");
		System.out.println("       56 years");

	}
	@Override
	public void Mother() {
		System.out.println("Name : Prabha");
		System.out.println("       Mother");
		System.out.println("       55 years");

	}
	@Override
	public void Wife() {
		System.out.println("Name : Hemalatha");
		System.out.println("       WIFE");
		System.out.println("       26 years");
	}
	@Override
	public void Doughter() {
		System.out.println("Name : Yutikshaa");
		System.out.println("       Doughter");
		System.out.println("       2 years");
	}
	public static void main(String[]args) {
		MembersDetails r = new MembersDetails();
		MembersAge a = new MembersAge();
		System.out.println("~VIVEKBABU's Family Details~ ");
		r.Father();
		r.Mother();
		r.Wife();
		r.Doughter();
	}

}
