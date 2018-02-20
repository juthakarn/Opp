import java.util.*;
public class DiceBox{
	private ArrayList<Dice>dicelist;

	public DiceBox(){
		this.dicelist = new ArrayList<Dice>();
	}
	public void addDice(Dice dice){
		this.dicelist.add(dice);
	}
	public int getSizeOfDiceList(){
		return this.dicelist.size();
	}
	public int getTotal(){
		int total = 0;
		for(int i=0;i<this.dicelist.size();i++){
			total = total + this.dicelist.get(i).getFace();
		}
		return total;
	}
	public void shake(){
		for(int i=0;i<this.dicelist.size();i++){
			this.dicelist.get(i).roll();
		}
	}
	public void printDice(){
		for(int i=0;i<getSizeOfDiceList();i++){
			System.out.println("Dice: "+(i+1)+this.dicelist.get(i).toString());
		}
	}
}