
public class Limb {

	int limbLevel;
		//0 = Vestigial
		//1 = Basic
		//2 = Average
		//3 = Good
		//4 = Exceptional
		//5 = Incredible
		//6 = Strong
		//7 = Powerful
		//8 = Unnatural
		//9 = Magic
		//10 = Divine
	int limbType;
		//0 = Limblet (typeless)
		//1 = Leg
		//2 = Leg with webbed Foot
		//3 = Arm
		//4 = Arm with webbed Hand
		//5 = Flipper
		//6 = Wing
		//7 = Wing with Hand
	public Limb(int type, int level){
		limbType = type;
		limbLevel = level;
	}
}
