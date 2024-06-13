import java.util.Scanner;

class Details {
	// States
	private String Name;
	private String Email;
	private int Number;
	private String UPI;
	private String Card;
	private String Cvv;
	private String Expiry;

	// Behaviour
	public String geName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String gEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int Number) {
		this.Number = Number;
	}

	public String geUPI() {
		return UPI;
	}

	public void setUPI(String UPI) {
		this.UPI = UPI;
	}

	public String getCar() {
		return Card;
	}

	public void setCard(String Card) {
		this.Card = Card;
	}

	public String geCvv() {
		return Cvv;
	}

	public void setCvv(String Cvv) {
		this.Cvv = Cvv;
	}

	public String getExpiry() {
		return Expiry;
	}

	public void setExpiry(String Expiry) {
		this.Expiry = Expiry;
	}
}

public class Center {

	public static void Heels() {
		System.out.println("=====================");
		System.out.println("Press 1 For Stiletto Heel");
		System.out.println("Press 2 For Kitten Heel");
		System.out.println("Press 3 For Papered Heel");
		System.out.println("Press 4 For Platform Heel");
		System.out.println("===============================");
		Scanner d006 = new Scanner(System.in);
		System.out.println("Please Choose Your Style");
		int o006 = d006.nextInt();
		switch (o006) {
			case 1:
				System.out.println("Stiletto");
				Cheels();
				break;
			case 2:
				System.out.println("Kitten Heel");
				Cheels();
				break;
			case 3:
				System.out.println("Papered Heel");
				Cheels();
				break;
			case 4:
				System.out.println("Platform Heel");
				Cheels();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Cheels() {
		System.out.println("=====================");
		System.out.println("Press 1 For Emerald Green ");
		System.out.println("Press 2 For Black");
		System.out.println("Press 3 For White");
		System.out.println("Press 4 For Metallic");
		System.out.println("===============================");
		Scanner d007 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o007 = d007.nextInt();
		switch (o007) {
			case 1:
				System.out.println("Pink");
				break;
			case 2:
				System.out.println("Red");
				break;
			case 3:
				System.out.println("Orange");
				break;
			case 4:
				System.out.println("Purple");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Converse() {
		System.out.println("=====================");
		System.out.println("Press 1 For Converse Run Star Hike");
		System.out.println("Press 2 For Converse Run Star Motion");
		System.out.println("Press 3 For Converse Chuck Taylor");
		System.out.println("Press 4 For Converse Weapon CX");
		System.out.println("===============================");
		Scanner d005 = new Scanner(System.in);
		System.out.println("Please Choose Your Style");
		int o005 = d005.nextInt();
		switch (o005) {
			case 1:
				System.out.println("Converse Run Star Hike");
				Cconverse();
				break;
			case 2:
				System.out.println("Converse Run Star Motion");
				Cconverse();
				break;
			case 3:
				System.out.println("Converse Chuck Taylor");
				Cconverse();
				break;
			case 4:
				System.out.println("Converse Weapon CX");
				Cconverse();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Cconverse() {
		System.out.println("=====================");
		System.out.println("Press 1 For Pink ");
		System.out.println("Press 2 For Red");
		System.out.println("Press 3 For Orange");
		System.out.println("Press 4 For Purple");
		System.out.println("===============================");
		Scanner d005 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o005 = d005.nextInt();
		switch (o005) {
			case 1:
				System.out.println("Pink");
				break;
			case 2:
				System.out.println("Red");
				break;
			case 3:
				System.out.println("Orange");
				break;
			case 4:
				System.out.println("Purple");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Flip() {
		Fbrand();
		System.out.println("=====================");
		System.out.println("Press 1 For S-R Flop");
		System.out.println("Press 2 For J-K Flop");
		System.out.println("Press 3 For T Flip Flop");
		System.out.println("Press 4 For D Flip Flop");
		System.out.println("===============================");
		Scanner d004 = new Scanner(System.in);
		System.out.println("Please Choose Your Style");
		int o004 = d004.nextInt();
		switch (o004) {
			case 1:
				System.out.println("S-R Flop");
				Cflip();
				break;
			case 2:
				System.out.println("J-K Flop");
				Cflip();
				break;
			case 3:
				System.out.println("T Flip Flop");
				Cflip();
				break;
			case 4:
				System.out.println("D Flip Flot");
				Cflip();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Cflip() {
		System.out.println("=====================");
		System.out.println("Press 1 For Bora Purple");
		System.out.println("Press 2 For Blue");
		System.out.println("Press 3 For Pink Gold");
		System.out.println("Press 4 For Graphite");
		System.out.println("===============================");
		Scanner d005 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o005 = d005.nextInt();
		switch (o005) {
			case 1:
				System.out.println("Bora Purple");
				break;
			case 2:
				System.out.println("Blue");
				break;
			case 3:
				System.out.println("Pink Gold");
				break;
			case 4:
				System.out.println("Graphite");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Boot() {
		Fbrand();
		System.out.println("=====================");
		System.out.println("Press 1 For Dress Boat");
		System.out.println("Press 2 For Snow Boat");
		System.out.println("Press 3 For Chelsea Boot");
		System.out.println("Press 4 For Hiking Boot");
		System.out.println("===============================");
		Scanner d00 = new Scanner(System.in);
		System.out.println("Please Choose Your Style");
		int o008 = d00.nextInt();
		switch (o008) {
			case 1:
				System.out.println("Dress Boot");
				Cboot();
				break;
			case 2:
				System.out.println("Snow Boot");
				Cboot();
				break;
			case 3:
				System.out.println("Chelsa Boot");
				Cboot();
				break;
			case 4:
				System.out.println("Hiking Boot");
				Cboot();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Cboot() {
		System.out.println("=====================");
		System.out.println("Press 1 For Black");
		System.out.println("Press 2 For Tan");
		System.out.println("Press 3 For Dark Green");
		System.out.println("Press 4 For White");
		System.out.println("===============================");
		Scanner d90 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o09 = d90.nextInt();
		switch (o09) {
			case 1:
				System.out.println("Black");
				break;
			case 2:
				System.out.println("Tan");
				break;
			case 3:
				System.out.println("Dark Green");
				break;
			case 4:
				System.out.println("White");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Sneaker() {
		Fbrand();
		System.out.println("=====================");
		System.out.println("Press 1 For Air Max 97");
		System.out.println("Press 2 For Velcro Sneaker");
		System.out.println("Press 3 For Blazer");
		System.out.println("Press 4 For Jodan");
		System.out.println("===============================");
		Scanner d009 = new Scanner(System.in);
		System.out.println("Please Choose Your Style");
		int o09 = d009.nextInt();
		switch (o09) {
			case 1:
				System.out.println("Air Max 97 ");
				Csneaker();
				break;
			case 2:
				System.out.println("Velcro Sneaker");
				Csneaker();
				break;
			case 3:
				System.out.println("Blazer");
				Csneaker();
				break;
			case 4:
				System.out.println("Jodan");
				Csneaker();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Csneaker() {
		System.out.println("=====================");
		System.out.println("Press 1 For White");
		System.out.println("Press 2 For Black");
		System.out.println("Press 3 For Red");
		System.out.println("Press 4 For White");
		System.out.println("===============================");
		Scanner d90 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o09 = d90.nextInt();
		switch (o09) {
			case 1:
				System.out.println("White");
				break;
			case 2:
				System.out.println("Black");
				break;
			case 3:
				System.out.println("Red");
				break;
			case 4:
				System.out.println("White");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Fbrand() {

		System.out.println("=====================");
		System.out.println("Press 1 For Clarks");
		System.out.println("Press 2 For Adidas");
		System.out.println("Press 3 For Wolverine Worldwide");
		System.out.println("Press 4 For Reebok");
		System.out.println("===============================");
		Scanner d09 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o09 = d09.nextInt();
		switch (o09) {
			case 1:
				System.out.println("Clarks");
				break;
			case 2:
				System.out.println("Adidas");
				break;
			case 3:
				System.out.println("Wolverine Worldwide");
				break;
			case 4:
				System.out.println("Reebok");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Calvin() {

		System.out.println("=====================");
		System.out.println("Press 1 For Calvin Klein Sheer Beauty");
		System.out.println("Press 2 For Calvin Klein Euphoria");
		System.out.println("Press 3 For Buy Calvin Kelin ");
		System.out.println("Press 4 For Calvin Klein Beauty");
		System.out.println("===============================");
		Scanner d08 = new Scanner(System.in);
		System.out.println("Please Choose Your Fragrance");
		int o08 = d08.nextInt();
		switch (o08) {
			case 1:
				System.out.println("Chanel");
				break;
			case 2:
				System.out.println("Lancome Tresor");
				break;
			case 3:
				System.out.println("Coco Mademolisella");
				break;
			case 4:
				System.out.println("Paris Roma");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Channel() {

		System.out.println("=====================");
		System.out.println("Press 1 For Chanel Chance");
		System.out.println("Press 2 For Lancome Tresor");
		System.out.println("Press 3 For Coco Mademoiselle");
		System.out.println("Press 4 For Paris Roma");
		System.out.println("===============================");
		Scanner d07 = new Scanner(System.in);
		System.out.println("Please Choose Your Fragrance");
		int o07 = d07.nextInt();
		switch (o07) {
			case 1:
				System.out.println("Chanel");
				break;
			case 2:
				System.out.println("Lancome Tresor");
				break;
			case 3:
				System.out.println("Coco Mademolisella");
				break;
			case 4:
				System.out.println("Paris Roma");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Dolce() {

		System.out.println("=====================");
		System.out.println("Press 1 For Miss Dior Blooming");
		System.out.println("Press 2 For Christain Dior");
		System.out.println("Press 3 For Joy");
		System.out.println("Press 4 For Dior Addict");
		System.out.println("===============================");
		Scanner d06 = new Scanner(System.in);
		System.out.println("Please Choose Your Fragrance");
		int o06 = d06.nextInt();
		switch (o06) {
			case 1:
				System.out.println("Miss Dior Blooming");
				break;
			case 2:
				System.out.println("Christain Dior");
				break;
			case 3:
				System.out.println("Joy");
				break;
			case 4:
				System.out.println("Dior Addict");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Dior() {

		System.out.println("=====================");
		System.out.println("Press 1 For Miss Dior Blooming");
		System.out.println("Press 2 For Christain Dior");
		System.out.println("Press 3 For Joy");
		System.out.println("Press 4 For Dior Addict");
		System.out.println("===============================");
		Scanner d05 = new Scanner(System.in);
		System.out.println("Please Choose Your Fragrance");
		int o05 = d05.nextInt();
		switch (o05) {
			case 1:
				System.out.println("Miss Dior Blooming");
				break;
			case 2:
				System.out.println("Christain Dior");
				break;
			case 3:
				System.out.println("Joy");
				break;
			case 4:
				System.out.println("Dior Addict");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Ralph() {

		System.out.println("=====================");
		System.out.println("Press 1 For Polo Black");
		System.out.println("Press 2 For Polo  Blue");
		System.out.println("Press 3 For Pony Women");
		System.out.println("Press 4 For Deep Blue ");
		System.out.println("===============================");
		Scanner d04 = new Scanner(System.in);
		System.out.println("Please Choose Your Fragrance");
		int o04 = d04.nextInt();
		switch (o04) {
			case 1:
				System.out.println("Neroli");
				break;
			case 2:
				System.out.println("Bergamot");
				break;
			case 3:
				System.out.println("Clementine");
				break;
			case 4:
				System.out.println("Tangerine");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Eliza() {

		System.out.println("=====================");
		System.out.println("Press 1 For Neroli");
		System.out.println("Press 2 For Bergamot");
		System.out.println("Press 3 For Clementine");
		System.out.println("Press 4 For Tangerine");
		System.out.println("===============================");
		Scanner d03 = new Scanner(System.in);
		System.out.println("Please Choose Your Fragrance");
		int o03 = d03.nextInt();
		switch (o03) {
			case 1:
				System.out.println("Neroli");
				break;
			case 2:
				System.out.println("Bergamot");
				break;
			case 3:
				System.out.println("Clementine");
				break;
			case 4:
				System.out.println("Tangerine");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Pbrand() {
		System.out.println("=====================");
		System.out.println("Press 1 For Elizabeth Areden");
		System.out.println("Press 2 For Ralp Lauren");
		System.out.println("Press 3 For Dior");
		System.out.println("Press 4 For Dolce & Gabban");
		System.out.println("Press 5 For Channel");
		System.out.println("Press 6 For Calvin Klein ");
		System.out.println("===============================");
		Scanner e12 = new Scanner(System.in);
		System.out.println("Please Choose Your Perfume");
		int h12 = e12.nextInt();
		switch (h12) {
			case 1:
				System.out.println("Elizabeth Areden");
				Eliza();
				break;
			case 2:
				System.out.println("Ralp Lauren");
				Ralph();
				break;
			case 3:
				System.out.println("Dior");
				Dior();
				break;
			case 4:
				System.out.println("Dolce & Gabban");
				Dolce();
				break;
			case 5:
				System.out.println("Channel");
				Channel();
				break;
			case 6:
				System.out.println("Calvin Klein");
				Calvin();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Cblush() {

		System.out.println("=====================");
		System.out.println("Press 1 For Ligh Lavender Blush");
		System.out.println("Press 2 For Lavender Blush");
		System.out.println("Press 3 For Pale Blush");
		System.out.println("Press 4 For Peach Blush");
		System.out.println("===============================");
		Scanner d352 = new Scanner(System.in);
		System.out.println("Please Choose Your Shade");
		int o352 = d352.nextInt();
		switch (o352) {
			case 1:
				System.out.println("Light Lavender Blush");
				break;
			case 2:
				System.out.println("Lavender Blush");
				break;
			case 3:
				System.out.println("Pale Blush");
				break;
			case 4:
				System.out.println("Peach Blush");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Ceyeliner() {

		System.out.println("=====================");
		System.out.println("Press 1 For Classic Black");
		System.out.println("Press 2 For Almost Black");
		System.out.println("Press 3 For Deep Purple");
		System.out.println("Press 4 For Navy");
		System.out.println("===============================");
		Scanner d352 = new Scanner(System.in);
		System.out.println("Please Choose Your Shade");
		int o352 = d352.nextInt();
		switch (o352) {
			case 1:
				System.out.println("Classic Black");
				break;
			case 2:
				System.out.println("Almost Black");
				break;
			case 3:
				System.out.println("Deep Purple");
				break;
			case 4:
				System.out.println("Deep Purple");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Eyeliner() {

		System.out.println("=====================");
		System.out.println("Press 1 For Gel Eyeliner");
		System.out.println("Press 2 For Pencil Eyeliner");
		System.out.println("Press 3 For Liquid Eyeliner");
		System.out.println("Press 4 For Felt-Tip Eyeyliner");
		System.out.println("===============================");
		Scanner d352 = new Scanner(System.in);
		System.out.println("Please Choose Your Comfort-Zone");
		int o352 = d352.nextInt();
		switch (o352) {
			case 1:
				System.out.println("Gel Eyeliner");
				Ceyeliner();
				break;
			case 2:
				System.out.println("Pencil Eyeliner");
				Ceyeliner();
				break;
			case 3:
				System.out.println("Liquid Eyeliner");
				Ceyeliner();
				break;
			case 4:
				System.out.println("Felt-Tip Eyeliner");
				Ceyeliner();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Mmascara() {

		System.out.println("=====================");
		System.out.println("Press 1 For Purple Mascara");
		System.out.println("Press 2 For Green Mascara");
		System.out.println("Press 3 For Blue Mascara");
		System.out.println("Press 4 For Gold Mascara");
		System.out.println("===============================");
		Scanner d352 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o352 = d352.nextInt();
		switch (o352) {
			case 1:
				System.out.println("Purple Mascara");
				break;
			case 2:
				System.out.println("Green Mascara");
				break;
			case 3:
				System.out.println(" Blue Mascara");
				break;
			case 4:
				System.out.println("Gold Mascara");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Mascara() {
		brand();
		System.out.println("=====================");
		System.out.println("Press 1 For Mascara Primer");
		System.out.println("Press 2 For Volumizing Mascara");
		System.out.println("Press 3 For Waterproof Mascara");
		System.out.println("Press 4 For Conditioning Mascara");
		System.out.println("===============================");
		Scanner d352 = new Scanner(System.in);
		System.out.println("Please Choose Your Comfort-Zone");
		int o352 = d352.nextInt();
		switch (o352) {
			case 1:
				System.out.println("Macara Primer");
				Mmascara();
				break;
			case 2:
				System.out.println("Volumizing Mascara");
				Mmascara();
				break;
			case 3:
				System.out.println("Waterptroof Mascara");
				Mmascara();
				break;
			case 4:
				System.out.println("Conditional Mascara");
				Mmascara();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Blush() {
		brand();
		System.out.println("=====================");
		System.out.println("Press 1 For Powder Blush");
		System.out.println("Press 2 For NARS Powder Blush");
		System.out.println("Press 3 For Cream Blush");
		System.out.println("Press 4 For Stick Blush");
		System.out.println("Press 5 For Tinted Blush");
		System.out.println("===============================");
		Scanner d352 = new Scanner(System.in);
		System.out.println("Please Choose Your Comfort-Zone");
		int o352 = d352.nextInt();
		switch (o352) {
			case 1:
				System.out.println("Powder Blush");

				break;
			case 2:
				System.out.println("NARS Powder Blush");
				Cblush();
				break;
			case 3:
				System.out.println("Cream Blush");
				Cblush();
				break;
			case 4:
				System.out.println("Stick Blush ");
				Cblush();
				break;
			case 5:
				System.out.println("Tinted Blush");
				Cblush();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Lipstick() {
		brand();
		System.out.println("=====================");
		System.out.println("Press 1 For Lip Gloss");
		System.out.println("Press 2 For Lip Stain");
		System.out.println("Press 3 For Gloss Lipstick");
		System.out.println("Press 4 For Mosturizing Lipstick ");
		System.out.println("Press 5 For NARS Lipstick");
		System.out.println("===============================");
		Scanner d351 = new Scanner(System.in);
		System.out.println("Please Choose Your Comfort-Zone");
		int o351 = d351.nextInt();
		switch (o351) {
			case 1:
				System.out.println("Lip Gloss");
				Clipstick();
				break;
			case 2:
				System.out.println("Lip Stain ");
				Clipstick();
				break;
			case 3:
				System.out.println("Gloss Lipstick");
				Clipstick();
				break;
			case 4:
				System.out.println("Mosturizing Lipstick");
				Clipstick();
				break;
			case 5:
				System.out.println("NARS Lipstick");
				Clipstick();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Clipstick() {

		System.out.println("=====================");
		System.out.println("Press 1 For Jungle Red");
		System.out.println("Press 2 For Rimmel London");
		System.out.println("Press 3 For 999 Christian");
		System.out.println("Press 4 For Ruby Woo");
		System.out.println("Press 5 For Fire and Ice");
		System.out.println("===============================");
		Scanner d100 = new Scanner(System.in);
		System.out.println("Please Choose Your Shade");
		int o100 = d100.nextInt();
		switch (o100) {
			case 1:
				System.out.println("Jungle Red");
				break;
			case 2:
				System.out.println("Rimmel London");
				break;
			case 3:
				System.out.println("999 Christian");
				break;
			case 4:
				System.out.println("Ruby Woo");
				break;
			case 5:
				System.out.println("Fire and Ice");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Foundation() {
		brand();
		System.out.println("============================");
		System.out.println("Enter 1 For Liquid Foundation");
		System.out.println("Enter 2 For Serum Foundation");
		System.out.println("Enter 3 For Tinted Oil Foundation");
		System.out.println("Enter 4 For Cream Foundation");
		System.out.println("Enter 5 For Whipped Mousse Foundation");
		System.out.println("Enter 6 For Stick Foundation");
		System.out.println("============================");
		Scanner d35 = new Scanner(System.in);
		System.out.println("Please Choose Your Comfort-Zone");
		int o35 = d35.nextInt();
		switch (o35) {
			case 1:
				System.out.println("Liquid Foundation");
				Fcolour();
				break;
			case 2:
				System.out.println("Serum Foundation");
				Fcolour();
				break;
			case 3:
				System.out.println("Tinted Oil Foundation");
				Fcolour();
				break;
			case 4:
				System.out.println("Cream Foundation");
				Fcolour();
				break;
			case 5:
				System.out.println("Whipped Mousse Foundation");
				Fcolour();
				break;
			case 6:
				System.out.println("Stick Foundation");
				Fcolour();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Fcolour() {
		System.out.println("============================");
		System.out.println("Enter 1 For MAC Studion Fix Fluid Foundation SPF 15");
		System.out.println("Enter 2 For Maybelline it Me, Matte+Poreless Foundation");
		System.out.println("Enter 3 For NYX Profesional Makeup High Definition Foundation");
		System.out.println("============================");
		Scanner d47 = new Scanner(System.in);
		System.out.println("Please Choose Your Shade");
		int o247 = d47.nextInt();
		switch (o247) {
			case 1:
				System.out.println("AC Studion Fix Fluid Foundation SPF 15");
				break;
			case 2:
				System.out.println("Maybelline it Me, Matte+Poreless Foundation");
				break;
			case 3:
				System.out.println("NYX Profesional Makeup High Definition Foundation");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void brand() {
		System.out.println("============================");
		System.out.println("Enter 1 For LOreal");
		System.out.println("Enter 2 For Maybelline");
		System.out.println("Enter 3 For Lakeme Cosmetics");
		System.out.println("Enter 4 For Glossier");
		System.out.println("Enter 5 For NARS Cosmetics");
		System.out.println("Enter 6 For Channel");
		System.out.println("============================");
		Scanner d32 = new Scanner(System.in);
		System.out.println("Please Choose Your Cosmetic Brand");
		int o34 = d32.nextInt();
		switch (o34) {
			case 1:
				System.out.println("LOreal");
				break;
			case 2:
				System.out.println("Maybelline");
				break;
			case 3:
				System.out.println("Lakeme Cosmetics");
				break;
			case 4:
				System.out.println("Glossier");
				break;
			case 5:
				System.out.println("NARS Cosmetics");
				break;
			case 6:
				System.out.println("Channel");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Mkajal() {
		brand();
		System.out.println("============================");
		System.out.println("Enter 1 For Pencil Kajal ");
		System.out.println("Enter 2 For Gel Kajal");
		System.out.println("Enter 3 For Liquid Kajal");
		System.out.println("============================");
		Scanner d42 = new Scanner(System.in);
		System.out.println("Please Choose Your Comfort-Zone");
		int o242 = d42.nextInt();
		switch (o242) {
			case 1:
				System.out.println("Pencil Kajal");
				Mcolour();
				break;
			case 2:
				System.out.println("Gel Kajal");
				Mcolour();
				break;
			case 3:
				System.out.println("Liquid Kajal");
				Mcolour();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Mcolour() {
		System.out.println("============================");
		System.out.println("Enter 1 For Turquoise ");
		System.out.println("Enter 2 For Greenish-Blue");
		System.out.println("Enter 3 For Silver");
		System.out.println("============================");
		Scanner d43 = new Scanner(System.in);
		System.out.println("Please Choose Your Shade");
		int o243 = d43.nextInt();
		switch (o243) {
			case 1:
				System.out.println("Turquoise");
				break;
			case 2:
				System.out.println("Greenish-Blue");
				break;
			case 3:
				System.out.println("Silver");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Patter() {
		System.out.println("============================");
		System.out.println("Enter 1 For Solitaire ");
		System.out.println("Enter 2 For Floral");
		System.out.println("Enter 3 For Striped");
		System.out.println("Enter 4 For Plaid");
		System.out.println("============================");
		Scanner d18 = new Scanner(System.in);
		System.out.println("Please Choose Your Pattern");
		int o18 = d18.nextInt();
		switch (o18) {
			case 1:
				System.out.println("Solitaire");
				break;
			case 2:
				System.out.println("Floral");
				break;
			case 3:
				System.out.println("Striped");
				break;
			case 4:
				System.out.println("Plaid");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Earrings() {
		System.out.println("============================");
		System.out.println("Enter 1 For Stud Earring ");
		System.out.println("Enter 2 For Hoop Earring");
		System.out.println("Enter 3 For Chandelier Earring");
		System.out.println("Enter 4 For Threaded Earring");
		System.out.println("============================");
		Scanner d22 = new Scanner(System.in);
		System.out.println("Please Choose Your Earrings");
		int o22 = d22.nextInt();
		switch (o22) {
			case 1:
				System.out.println("Stud Earring");
				break;
			case 2:
				System.out.println("Hoop Earring");
				break;
			case 3:
				System.out.println("Chandelier Earring");
				break;
			case 4:
				System.out.println("Threaded Earring");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Watches() {
		System.out.println("============================");
		System.out.println("Enter 1 For Casual Watches");
		System.out.println("Enter 2 For Rose Gold Watches");
		System.out.println("Enter 3 For Smart Watches");
		System.out.println("Enter 4 For Two-Tone Watches");
		System.out.println("============================");
		Scanner d21 = new Scanner(System.in);
		System.out.println("Please Choose Your Bags");
		int o21 = d21.nextInt();
		switch (o21) {
			case 1:
				System.out.println("Casual Watches");
				break;
			case 2:
				System.out.println("Rose Gold Watches");
				break;
			case 3:
				System.out.println("Smart Watches");
				break;
			case 4:
				System.out.println("Two-Tone Watches");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Handbags() {
		System.out.println("============================");
		System.out.println("Enter 1 For Tote Bags ");
		System.out.println("Enter 2 For Satchel");
		System.out.println("Enter 3 For Hobo Bags");
		System.out.println("Enter 4 For Backpack");
		System.out.println("============================");
		Scanner d20 = new Scanner(System.in);
		System.out.println("Please Choose Your Bags");
		int o20 = d20.nextInt();
		switch (o20) {
			case 1:
				System.out.println("Tote Bags");
				break;
			case 2:
				System.out.println("Satchel");
				break;
			case 3:
				System.out.println("Hobo Bags");
				break;
			case 4:
				System.out.println("Backpack");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Necklaces() {
		System.out.println("============================");
		System.out.println("Enter 1 For Choker");
		System.out.println("Enter 2 For Opera Necklace");
		System.out.println("Enter 3 For Love Beads");
		System.out.println("Enter 4 For Locket");
		System.out.println("============================");
		Scanner d19 = new Scanner(System.in);
		System.out.println("Please Choose Your Necklace");
		int o19 = d19.nextInt();
		switch (o19) {
			case 1:
				System.out.println("Choker");
				break;
			case 2:
				System.out.println("Opera Necklace");
				break;
			case 3:
				System.out.println("Love Beads");
				break;
			case 4:
				System.out.println("Locket");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Bracelets() {
		System.out.println("============================");
		System.out.println("Enter 1 For Charm Bracelet ");
		System.out.println("Enter 2 For Pearl Bracelet");
		System.out.println("Enter 3 For Annie Bing link  Bracelet");
		System.out.println("Enter 4 For Anklet");
		System.out.println("============================");
		Scanner d18 = new Scanner(System.in);
		System.out.println("Choose Your Bracelets");
		int o18 = d18.nextInt();
		switch (o18) {
			case 1:
				System.out.println("charm Bracelet");
				break;
			case 2:
				System.out.println("Pearl Bracelet");
				break;
			case 3:
				System.out.println("Annie Bing Link Bracelet");
				break;
			case 4:
				System.out.println("Anklet");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Sunglasses() {
		System.out.println("============================");
		System.out.println("Enter 1 For Avitor");
		System.out.println("Enter 2 For Ray-Ban Wayfarer");
		System.out.println("Enter 3 For Mirrored Sunglasses");
		System.out.println("Enter 4 For Cat Eyes Glasses");
		System.out.println("============================");
		Scanner d17 = new Scanner(System.in);
		System.out.println("Please Choose Your Sunglass");
		int o17 = d17.nextInt();
		switch (o17) {
			case 1:
				System.out.println("Avitor");
				break;
			case 2:
				System.out.println("Ray-Ban Wayfarer");
				break;
			case 3:
				System.out.println("Mirrored Sunglasses");
				break;
			case 4:
				System.out.println("Cat Eyes Glasses");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Abrand() {
		System.out.println("============================");
		System.out.println("Enter 1 For Prada");
		System.out.println("Enter 2 For Fendi");
		System.out.println("Enter 3 For Balenciaga");
		System.out.println("Enter 4 For Old Navy");
		System.out.println("Enter 5 For Kate Spade New York");
		System.out.println("Enter 6 For Lacoste");
		System.out.println("============================");
		Scanner d16 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o16 = d16.nextInt();
		switch (o16) {
			case 1:
				System.out.println("Prada");
				break;
			case 2:
				System.out.println("Fendi");
				break;
			case 3:
				System.out.println("Balenciaga");
				break;
			case 4:
				System.out.println("Old Navy");
				break;
			case 5:
				System.out.println("Kate Spade New York");
				break;
			case 6:
				System.out.println("Lacoste");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Colour() {
		System.out.println("============================");
		System.out.println("Enter 1 For Black");
		System.out.println("Enter 2 For Red");
		System.out.println("Enter 3 For White");
		System.out.println("Enter 4 For Pearl");
		System.out.println("Enter 5 For Biscotti");
		System.out.println("Enter 6 For Crimson");
		System.out.println("============================");
		Scanner d15 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o15 = d15.nextInt();
		switch (o15) {
			case 1:
				System.out.println("Black");
				break;
			case 2:
				System.out.println("Red");
				break;
			case 3:
				System.out.println("White");
				break;
			case 4:
				System.out.println("Pearl");
				break;
			case 5:
				System.out.println("Biscotti");
				break;
			case 6:
				System.out.println("Crimson");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Ibrand() {
		System.out.println("============================");
		System.out.println("Enter 1 For Peter England");
		System.out.println("Enter 2 For FabIndia");
		System.out.println("Enter 3 For Raymond");
		System.out.println("Enter 4 For Allen Solly");
		System.out.println("Enter 5 For Biba");
		System.out.println("Enter 6 For Mufti");
		System.out.println("============================");
		Scanner d14 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o14 = d14.nextInt();
		switch (o14) {
			case 1:
				System.out.println("Peter England");
				break;
			case 2:
				System.out.println("FabIndia");
				break;
			case 3:
				System.out.println("Raymond");
				break;
			case 4:
				System.out.println("Allen Solly");
				break;
			case 5:
				System.out.println("Biba");
				break;
			case 6:
				System.out.println("Mufti");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Icolour() {
		System.out.println("============================");
		System.out.println("Enter 1 For Muted Tones");
		System.out.println("Enter 2 For Indigo Blue");
		System.out.println("Enter 3 For Pastel Blue");
		System.out.println("Enter 4 For Monochromes");
		System.out.println("Enter 5 For Mint Green");
		System.out.println("Enter 6 For Blush Pink");
		System.out.println("Enter 7 For Vibrant Red");
		System.out.println("============================");
		Scanner d13 = new Scanner(System.in);
		System.out.println("Please Choose Your Colour");
		int o13 = d13.nextInt();
		switch (o13) {
			case 1:
				System.out.println("Muted Tones");
				break;
			case 2:
				System.out.println("Indigo");
				break;
			case 3:
				System.out.println("Pastel Blue");
				break;
			case 4:
				System.out.println("Monochromes");
				break;
			case 5:
				System.out.println("Mint Green");
				break;
			case 6:
				System.out.println("Blush Pink");
				break;
			case 7:
				System.out.println("Vibrant Red");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Brand() {
		System.out.println("============================");
		System.out.println("Enter 1 For Louis Vuitton");
		System.out.println("Enter 2 For Channel");
		System.out.println("Enter 3 For Dior ");
		System.out.println("Enter 4 For Armani");
		System.out.println("Enter 5 For Tommy Hilfiger");
		System.out.println("Enter 6 For Calvin Klein");
		System.out.println("============================");
		Scanner d12 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o12 = d12.nextInt();
		switch (o12) {
			case 1:
				System.out.println("Louis Vuitton");
				break;
			case 2:
				System.out.println("Channel");
				break;
			case 3:
				System.out.println("Dior");
				break;
			case 4:
				System.out.println("Armani");
				break;
			case 5:
				System.out.println("Tommy Helfiger ");
				break;
			case 6:
				System.out.println("Calvin Klein");
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}
	}

	public static void Lehenga() {
		System.out.println("============================");
		System.out.println("Enter 1 For Glob");
		System.out.println("Enter 2 For FabIndia");
		System.out.println("Enter 3 For Globus");
		System.out.println("Enter 4 For Aurelia");
		System.out.println("Enter 5 For W for Women");
		System.out.println("============================");
		Scanner d11 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o11 = d11.nextInt();
		switch (o11) {
			case 1:
				System.out.println("Global");
				break;
			case 2:
				System.out.println("FabIndia");
				break;
			case 3:
				System.out.println("Globus");
				break;
			case 4:
				System.out.println("Aurelia");
				break;
			case 5:
				System.out.println("W for Women");
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}
	}

	public static void Ghagra() {
		System.out.println("============================");
		System.out.println("Enter 1 For Global Desi");
		System.out.println("Enter 2 For FabIndia");
		System.out.println("Enter 3 For Globus");
		System.out.println("Enter 4 For Aurelia");
		System.out.println("Enter 5 For W for Women");
		System.out.println("============================");
		Scanner d10 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o10 = d10.nextInt();
		switch (o10) {
			case 1:
				System.out.println("Global");
				break;
			case 2:
				System.out.println("FabIndia");
				break;
			case 3:
				System.out.println("Globus");
				break;
			case 4:
				System.out.println("Aurelia");
				break;
			case 5:
				System.out.println("W for Women");
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}
	}

	public static void Kurta() {
		System.out.println("============================");
		System.out.println("Enter 1 For Global Desi");
		System.out.println("Enter 2 For FabIndia");
		System.out.println("Enter 3 For Globus");
		System.out.println("Enter 4 For Aurelia");
		System.out.println("Enter 5 For W for Women");
		System.out.println("============================");
		Scanner d9 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o9 = d9.nextInt();
		switch (o9) {
			case 1:
				System.out.println("Global");
				break;
			case 2:
				System.out.println("FabIndia");
				break;
			case 3:
				System.out.println("Globus");
				break;
			case 4:
				System.out.println("Aurelia");
				break;
			case 5:
				System.out.println("W for Women");
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}
	}

	public static void Salwar() {
		System.out.println("============================");
		System.out.println("Enter 1 For Madame");
		System.out.println("Enter 2 For Biba");
		System.out.println("Enter 3 For Only");
		System.out.println("Enter 4 For Vero Moda");
		System.out.println("Enter 5 For Peter England");
		System.out.println("============================");
		Scanner d8 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o8 = d8.nextInt();
		switch (o8) {
			case 1:
				System.out.println("Madame");
				break;
			case 2:
				System.out.println("Biba");
				break;
			case 3:
				System.out.println("Only");
				break;
			case 4:
				System.out.println("Vero Moa");
				break;
			case 5:
				System.out.println("Peter England");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Saree() {
		System.out.println("============================");
		System.out.println("Enter 1 For Satya Paul");
		System.out.println("Enter 2 For Desi Butik");
		System.out.println("Enter 3 For Mimosa");
		System.out.println("Enter 4 For Kalanjali");
		System.out.println("Enter 5 For Gaurang");
		System.out.println("============================");
		Scanner d7 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o7 = d7.nextInt();
		switch (o7) {
			case 1:
				System.out.println("Satya Paul");
				break;
			case 2:
				System.out.println("Desi Butik");
				break;
			case 3:
				System.out.println("Mimosa");
				break;
			case 4:
				System.out.println("Kalanjali");
				break;
			case 5:
				System.out.println("Gaurang");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Cock() {
		System.out.println("============================");
		System.out.println("Enter 1 For Prada");
		System.out.println("Enter 2 For Burberry");
		System.out.println("Enter 3 For Gucci");
		System.out.println("Enter 4 For Louis Vuitton");
		System.out.println("Enter 5 For Dior");
		System.out.println("============================");
		Scanner d6 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o6 = d6.nextInt();
		switch (o6) {
			case 1:
				System.out.println("Prada");
				break;
			case 2:
				System.out.println("Burberry");
				break;
			case 3:
				System.out.println("Gucci");
				break;
			case 4:
				System.out.println("Louis Vuitton");
				break;
			case 5:
				System.out.println("Dior");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Slip() {
		System.out.println("============================");
		System.out.println("Enter 1 For Hermes");
		System.out.println("Enter 2 For Channel");
		System.out.println("Enter 3 For Allen Solly");
		System.out.println("Enter 4 For Levi's");
		System.out.println("Enter 5 For Versace");
		System.out.println("============================");
		Scanner d5 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o5 = d5.nextInt();
		switch (o5) {
			case 1:
				System.out.println("Hermes");
				break;
			case 2:
				System.out.println("Channel");
				break;
			case 3:
				System.out.println("Allen Solly");
				break;
			case 4:
				System.out.println("Levi's");
				break;
			case 5:
				System.out.println("Versace");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Tube() {
		System.out.println("============================");
		System.out.println("Enter 1 For Lee");
		System.out.println("Enter 2 For Louis Philippe");
		System.out.println("Enter 3 For H&M");
		System.out.println("Enter 4 For Clavin Klein");
		System.out.println("Enter 5 For Flying Machine");
		System.out.println("============================");
		Scanner d4 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o4 = d4.nextInt();
		switch (o4) {
			case 1:
				System.out.println("Lee");
				break;
			case 2:
				System.out.println("Louis Philipee ");
				break;
			case 3:
				System.out.println("H&M");
				break;
			case 4:
				System.out.println("Calvin Klein");
				break;
			case 5:
				System.out.println("Flying Machine");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Wrap() {
		System.out.println("============================");
		System.out.println("Enter 1 For Tara");
		System.out.println("Enter 2 For Biiba");
		System.out.println("Enter 3 For Panit");
		System.out.println("Enter 4 For Neofaa");
		System.out.println("Enter 5 For Trendycloth");
		System.out.println("============================");
		Scanner d3 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o3 = d3.nextInt();
		switch (o3) {
			case 1:
				System.out.println("Tara");
				break;
			case 2:
				System.out.println("Biiba");
				break;
			case 3:
				System.out.println("Panit");
				break;
			case 4:
				System.out.println("Neofaa");
				break;
			case 5:
				System.out.println("TrendyCloth");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Line() {
		System.out.println("============================");
		System.out.println("Enter 1 For Catt");
		System.out.println("Enter 2 For Twenty One");
		System.out.println("Enter 3 For Amazon");
		System.out.println("Enter 4 For Mast and Harbour");
		System.out.println("Enter 5 For All About You");
		System.out.println("============================");
		Scanner d1 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o1 = d1.nextInt();
		switch (o1) {
			case 1:
				System.out.println("Forever");
				break;
			case 2:
				System.out.println("Twenty One");
				break;
			case 3:
				System.out.println("Amazon");
				break;
			case 4:
				System.out.println("Mast and Harbour");
				break;
			case 5:
				System.out.println("All About You");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	public static void Body() {
		System.out.println("============================");
		System.out.println("Enter 1 For Louis Vuitton");
		System.out.println("Enter 2 For Channel");
		System.out.println("Enter 3 For Dior ");
		System.out.println("Enter 4 For Armani");
		System.out.println("Enter 5 For Tommy Hilfiger");
		System.out.println("Enter 6 For Calvin Klein");
		System.out.println("============================");
		Scanner d71 = new Scanner(System.in);
		System.out.println("Please Choose Your Brand");
		int o71 = d71.nextInt();
		switch (o71) {
			case 1:
				System.out.println("Louis Vuitton");
				break;
			case 2:
				System.out.println("Channel");
				break;
			case 3:
				System.out.println("Dior");
				break;
			case 4:
				System.out.println("Armani");
				break;
			case 5:
				System.out.println("Tommy Helfiger ");
				break;
			case 6:
				System.out.println("Calvin Klein");
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}
	}

	static {
		System.out.println("**********************   Welcome To Roshan Shopping Center    **************************");
		System.out.println("**********************    Please Enter Your Detail    ***********************************");
	}

	public static void order() {
		System.out.println("============================");
		System.out.println("Enter 1 for Cloths");
		System.out.println("Enter 2 for Accessories");
		System.out.println("Enter 3 for Makeup");
		System.out.println("Enter 4 for Perfume");
		System.out.println("Enter 5 for Footwear");
		System.out.println("==============================");
	}

	public static void outfit() {
		System.out.println("Enter 1 For Wester Attire");
		System.out.println("Enter 2 for Indian Attire");
		System.out.println("========================");
	}

	public static void wester() {
		System.out.println("=====================");
		System.out.println("Press 1 For BodyCon Dress");
		System.out.println("Press 2 For A-line Dress");
		System.out.println("Press 3 For Wrap Dress");
		System.out.println("Press 4 For Tube Dress");
		System.out.println("Press 5 For Slip Dress");
		System.out.println("Press 6 For Cocktail Dress");
		System.out.println("===============================");
	}

	public static void indian() {
		System.out.println("=====================");
		System.out.println("Press 1 For Saree");
		System.out.println("Press 2 For Salwar Kamez");
		System.out.println("Press 3 For  Kurta");
		System.out.println("Press 4 For Ghagra Choli");
		System.out.println("Press 5 For Lehenga");
		System.out.println("Press 6 For Churidar");
		System.out.println("=====================");
	}

	public static void paying() {
		System.out.println("============================");
		System.out.println("Enter 1 for UPI");
		System.out.println("Enter 2 for GPay");
		System.out.println("Enter 3 for Credit Card");
		System.out.println("Enter 4 for Debit Card");
		System.out.println("Enter 5 for Online Transaction");
		System.out.println("==============================");
		Scanner s100 = new Scanner(System.in);
		System.out.println("Choose Your Way Of Paying");
		int a11 = s100.nextInt();
		switch (a11) {
			case 1:
				System.out.println("UPI");
				Details e01 = new Details();
				Scanner r04 = new Scanner(System.in);
				System.out.println("Please Enter Your UPI Number ------");
				String j01 = r04.nextLine();
				e01.setCard(j01);
				System.out.println("============================");
				break;
			case 2:
				System.out.println("GPay");
				Details e02 = new Details();
				Scanner r02 = new Scanner(System.in);
				System.out.println("Please Enter Your GPay Number ------");
				String j02 = r02.nextLine();
				e02.setCard(j02);
				System.out.println("============================");
				break;
			case 3:
				System.out.println("Credit Crad");
				Details e12 = new Details();
				Scanner r14 = new Scanner(System.in);
				System.out.println("Please Enter CardholderName ------");
				String j12 = r14.nextLine();
				e12.setCard(j12);
				System.out.println("============================");
				Details e15 = new Details();
				Scanner r15 = new Scanner(System.in);
				System.out.println("Please Enter The Expiry Date------");
				String j15 = r15.nextLine();
				e15.setExpiry(j15);
				Details e16 = new Details();
				Scanner r16 = new Scanner(System.in);
				System.out.println("Please Enter Your Card Cvv ------");
				String j16 = r16.nextLine();
				e16.setCvv(j16);
				System.out.println("============================");
				break;
			case 4:
				System.out.println("Debit Card");
				Details e17 = new Details();
				Scanner r17 = new Scanner(System.in);
				System.out.println("Please Enter CardholderName ------");
				String j17 = r17.nextLine();
				e17.setCard(j17);
				System.out.println("============================");
				Details e18 = new Details();
				Scanner r18 = new Scanner(System.in);
				System.out.println("Please Enter The Expiry Date------");
				String j18 = r18.nextLine();
				e18.setExpiry(j18);
				Details e19 = new Details();
				Scanner r19 = new Scanner(System.in);
				System.out.println("Please Enter Your Card Cvv ------");
				String j19 = r19.nextLine();
				e19.setCvv(j19);
				System.out.println("============================");
				break;
			case 5:
				System.out.println("Online Transaction");
				Details e00 = new Details();
				Scanner r00 = new Scanner(System.in);
				System.out.println("Please Enter Your Account Details ------");
				String j00 = r00.nextLine();
				e00.setCard(j00);
				System.out.println("============================");
				break;
		}
	}

	public static void way() {
		System.out.println("============================");
		System.out.println("Enter 1 To Pay Before Delivery");
		System.out.println("Enter 2 To Pay After Delivery");
		System.out.println("============================");
		Scanner e999 = new Scanner(System.in);
		int h999 = e999.nextInt();
		switch (h999) {
			case 1:
				System.out.println("Pay Before Delivery");
				paying();
				break;
			case 2:
				System.out.println("Pay After Delivery");
				break;
			default:
				System.out.println("Inavlid Input");
		}
	}

	public static void main(String[] args) {

		Details e1 = new Details();
		Scanner r1 = new Scanner(System.in);
		System.out.println("Please Enter Your Name------");
		String j1 = r1.nextLine();
		e1.setName(j1);
		System.out.println("============================");
		Details e2 = new Details();
		Scanner r2 = new Scanner(System.in);
		System.out.println("Please Enter Your Email---------");
		String j2 = r1.nextLine();
		e1.setEmail(j1);
		System.out.println("============================");
		Details e3 = new Details();
		Scanner r3 = new Scanner(System.in);
		System.out.println("Please Enter Your Number-----");
		String j3 = r1.nextLine();
		e1.setName(j1);
		System.out.println("============================");
		center();
		pay();
	}

	public static void center() {
		System.out.println("**********************   Please Place Your Order    ***********************************");
		order();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Place Your Order");
		int a = s1.nextInt();
		switch (a) {
			case 1:
				System.out.println("Please Select Your Desire Outfit");
				outfit();
				Scanner s2 = new Scanner(System.in);
				System.out.println("Please Enter a Value");
				int b = s2.nextInt();
				switch (b) {
					case 1:
						wester();
						Scanner g1 = new Scanner(System.in);
						System.out.println("Place Your Order");
						int v = g1.nextInt();
						switch (v) {
							case 1:
								System.out.println("BodyCon Dress");
								Body();
								Colour();
								break;
							case 2:
								System.out.println("A-Line Dress");
								Line();
								Colour();
								break;
							case 3:
								System.out.println("Wrap Dress");
								Wrap();
								Colour();
								break;
							case 4:
								System.out.println("Tube Dress");
								Tube();
								Colour();
								break;
							case 5:
								System.out.println("Slip Dress");
								Slip();
								Colour();
								break;
							case 6:
								System.out.println("Cock-Tail Dress");
								Cock();
								Colour();
								break;
							default:
								System.out.println("Invalid Input");
						}
						break;
					case 2:
						indian();
						Scanner g2 = new Scanner(System.in);
						System.out.println("Place Your Order");
						int v1 = g2.nextInt();
						switch (v1) {
							case 1:
								System.out.println("Saree");
								Saree();
								Icolour();
								break;
							case 2:
								System.out.println("Salwar Kamez");
								Salwar();
								Icolour();
								break;
							case 3:
								System.out.println("Kurta");
								Kurta();
								Icolour();
								break;
							case 4:
								System.out.println("Ghagra Choli");
								Ghagra();
								Icolour();
								break;
							case 5:
								System.out.println("Lehenga");
								Lehenga();
								Icolour();
								break;
							case 6:
								System.out.println("Churidar");
								Ibrand();
								Icolour();
								break;
						}
						break;
				}
				break;
			case 2:
				System.out.println("Please Select Your Desire Accessories");
				System.out.println("============================");
				System.out.println("Enter 1 For Sunglasses ");
				System.out.println("Enter 2 For Rings");
				System.out.println("Enter 3 For Necklaces");
				System.out.println("Enter 4 For Handbags");
				System.out.println("Enter 5 For Watches");
				System.out.println("Enter 6 For Earings");
				System.out.println("============================");
				Scanner e = new Scanner(System.in);
				System.out.println("Please Choose Your Accessories");
				int h = e.nextInt();
				switch (h) {
					case 1:
						System.out.println("Sunglasses");
						Sunglasses();
						Abrand();
						Patter();
						break;
					case 2:
						System.out.println("Bracelets");
						Bracelets();
						Abrand();
						Patter();
						break;
					case 3:
						System.out.println("Necklaces");
						Necklaces();
						Abrand();
						Patter();
						break;
					case 4:
						System.out.println("Handbags");
						Handbags();
						Abrand();
						Patter();
						break;
					case 5:
						System.out.println("Watches");
						Watches();
						Abrand();
						Patter();
						break;
					case 6:
						System.out.println("Earrings");
						Earrings();
						Abrand();
						Patter();
						break;
					default:
						System.out.println("Invalid Input");
				}
				break;
			case 3:
				System.out.println("Please Select Your Desire Makeup");
				System.out.println("============================");
				System.out.println("Enter 1 For Kajal");
				System.out.println("Enter 2 For Foundation");
				System.out.println("Enter 3 For LipStick");
				System.out.println("Enter 4 For Blush");
				System.out.println("Enter 5 For Mascara");
				System.out.println("Enter 6 For Eyeliner");
				System.out.println("============================");
				Scanner el1 = new Scanner(System.in);
				System.out.println("Please Choose Your Makeup");
				int h1 = el1.nextInt();
				switch (h1) {
					case 1:
						System.out.println("Kajal");
						Mkajal();
						break;
					case 2:
						System.out.println("Foundation");
						Foundation();
						break;
					case 3:
						System.out.println("Lipstick");
						Lipstick();
						break;
					case 4:
						System.out.println("Blush");
						Blush();
						break;
					case 5:
						System.out.println("Mascara");
						Mascara();
						break;
					case 6:
						System.out.println("Eyeliner");
						Eyeliner();
						break;
					default:
						System.out.println("Invalid Input");
				}
				break;
			case 4:
				System.out.println("Please Select Your Desire Perfume");
				System.out.println("============================");
				System.out.println("Press 1 For Eau de Cologne");
				System.out.println("Press 2 For Chypre");
				System.out.println("Press 3 For Solid Perfume");
				System.out.println("Press 4 For Soft Floral");
				System.out.println("============================");
				Scanner e21 = new Scanner(System.in);
				System.out.println("Please Choose Your Perfume");
				int h21 = e21.nextInt();
				switch (h21) {
					case 1:
						System.out.println("Eau de Cologne");
						Pbrand();
						break;
					case 2:
						System.out.println("Chypre");
						Pbrand();
						break;
					case 3:
						System.out.println("Solid Perfume");
						Pbrand();
						break;
					case 4:
						System.out.println("Soft Floral");
						Pbrand();
						break;
					default:
						System.out.println("Invalid Input");
				}
				break;
			case 5:
				System.out.println("Please Select Your Desire Footwear");
				System.out.println("============================");
				System.out.println("Enter 1 For Sneaker");
				System.out.println("Enter 2 For Boot");
				System.out.println("Enter 3 For Flip-Flop");
				System.out.println("Enter 4 For Converse");
				System.out.println("Enter 5 For Heels");
				System.out.println("============================");
				Scanner e99 = new Scanner(System.in);
				System.out.println("Please Choose Your Footwear");
				int h99 = e99.nextInt();
				switch (h99) {
					case 1:
						System.out.println("Sneaker");
						Sneaker();
						break;
					case 2:
						System.out.println("Boot");
						Boot();
						break;
					case 3:
						System.out.println("Flip-Flop");
						Flip();
						break;
					case 4:
						System.out.println("Converse");
						Converse();
						break;
					case 5:
						System.out.println("Heels");
						Heels();
						break;
					default:
						System.out.println("Invalid Input");
				}
		}
	}

	public static void pay() {
		System.out.println("============================");
		System.out.println("Enter 1 To Proceed For Payment");
		System.out.println("Enter 2 To Make Changes In Your Order");
		System.out.println("============================");
		Scanner e999 = new Scanner(System.in);
		int h999 = e999.nextInt();
		switch (h999) {
			case 1:
				System.out.println("Proceed For Payment");
				way();
				break;
			case 2:
				System.out.println("Please Place Order Wisely");
				center();
				way();
				break;
			default:
				System.out.println("Inavlid Input");
		}
		System.out.println("-------------------Thank You For Choosing Roshan Shopping Center-----------------");
		System.out.println("----------------Please Do Visit Again----------------------------");
	}
}
