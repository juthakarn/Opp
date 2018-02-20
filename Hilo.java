public class Hilo{
	public static void main(String[] args){
		Dice dice = new Dice();
		System.out.println(dice.toString());
		dice.roll();
		System.out.println(dice.toString());

		DiceBox box = new DiceBox();
		box.addDice(dice);
		box.addDice(new Dice());
		box.addDice(new Dice());

		System.out.println("Before Shaking is "+box.getTotal());
		box.shake();
		System.out.println("After Shaking is "+box.getTotal());
		box.printDice();
	}
}