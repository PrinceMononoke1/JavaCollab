
public class Animal {
	
	
		
	Limb [] Appendages = new Limb [16]; 
	
	//This is an alternate means of handling limbs. I'll see which makes more sense.
	/*
	int limbs; //The number of limbs the animal species allows. Tough to change this stat. Generally come in pairs. Fins and tails are not limbs.
	boolean limblets; //If the creature has limblets it is in a preliminary stage of limbs. Limblets come in pairs, and only one pair can exist at a time. 
	
	boolean wings; //Does the creature have wings or not? Count as limbs.
	int wingPairs; //How many pairs of wings does the creature have? 0 if no wings, 1 if 2 wings, 2 if 4 wings
	int wingLevel; //The level of wings the creature has. 0 = Gliding only, 1 = Basic flight, 2 = Strong flight, 3 = Masterful Flight
	
	boolean foreLegs; //Does the creature have a pair of legs in the front? Count as limbs.
	int foreLegPairs; //How many pairs of forelegs does the creature have? 0 if no front legs, 1 if 2 front legs, 2 if 4 front legs
	int forelegLevel; //How good the legs in the front are. Cannot have forelegs and arms if the species only has 4 total limbs.
	boolean hindLegs; //Does the creature have a pair of rear legs? Count as limbs.
	int hindLegPairs; //How many pairs of forelegs does the creature have? 0 if no hind legs, 1 if 2 hind legs, 2 if 4 hind legs
	int hindLegLevel; //How good the rear legs are.
					  //Leg level. 0 = Vestigial legs, 1 = Basic Legs, 2 = Exceptional Legs, 3 = Strong Legs, 4 = Powerful Legs, 5 = Incredible Legs
	
	boolean flippers; // Does the animal have flippers? Flippers count as limbs.
	int flipperLevel; // 0 = Not helpful for swimming, 1 = Basic Swimming Flippers, 2 = Strong swimming flippers, 3 = Exceptional swimming flippers,
					  //4 = Strong swimming flippers, 5 = Powerful swimming flippers
	
	boolean arms; //Does the animal have arms? Count as limbs.
	int armLevel; //How good are the arms. 0 = Vestigial, 1 = T-Rex-like, 2 = Ape-like, 3 = Human-like
	*/
	
	boolean fins; // Does the animal have fins? Do not count as limbs.
	int finLevel; // 0 = Vestigial Fin, 1 = One Fin, 2 = One Strong Fin, 3 = Multiple Fins, 4 = Multiple Strong Fins, 5 = Full set of fins, 6 = Full set of Strong Fins
	
	boolean tail; //Does the animal have a tail?
	int tailLevel; // 0 = Vestigial Tail, 1 = Can be used for balance, 2 = Can be used to grip, 3 = Can be used as a weapon
		
	int diet; //1 = Herbivore, 2 = Omnivore, 3 = Carnivore
	String name; //The species name
	boolean male; //AKA Gender. True means the animal is male, False means the animal is female
	int size;
		// 0 = Insect
		// 1 = Mouse
		// 2 = Rat
		// 3 = Rabbit
		// 4 = Raccoon
		// 5 = Dog
		// 6 = Human
		// 7 = Horse
		// 8 = Buffalo
		// 9 = Rhinoceros
		// 10 = Elephant
		// 11 = T-Rex
		// 12 = Blue Whale
		// 13 = Mansion
		// 14 = Office Building
		// 15 = Godzilla
	
	boolean fur; // Does the creature have fur?
	boolean scales; // Does the creature have scales?
	boolean feathers; //Does the creature have feathers?
	boolean hair; // Does the creature have hair?
	
	boolean flight; // Is the creature able to fly? Largely dependent on wings, the environment, bone structure and feathers.
	boolean swimming; // Not as exclusive as flying, skill is highly variable depending on appendages and other factors.
	
	boolean claws; // Does the creature have claws?
	int clawLevel; // Strength of the creature's claws. 0 = Basic claws, 1 = Strong Claws, 2 = Powerful Claws, 3 = Badass Claws
	
	boolean fangs; // Does the creature have fangs?
	int fangLevel; // Strength of fangs. 0 = Basic fangs, 1 = Strong Fangs, 2 = Powerful Fangs, 3 = Badass Fangs
	
	boolean thumbs; // Does the creature have opposable thumbs? Can it use tools?
	
	int eyes; //How many eyes does the creature have? Generally 2.
	int eyeColor; // 0 = Black, 1 = White, 2 = Gray, 3 = Brown, 4 = Blue, 5 = Green, 6 = Yellow, 7 = Orange, 8 = Red, 9 = Pink
					//10 = Purple
	int sight; // 0 = Blind, 1 = Infrared Only, 2 = Color Blind, 3 = Visible Light, 4 = VL + IR, 5 = VL + UV, 6 = VL + UV & IR
	
	double skinColor;
	double furColor;
	double scaleColor;
	double featherColor;
	double hairColor;
	int secondaryColor;
	// 0 = Black, 1 = White, 2 = Gray, 3 = Brown, 4 = Blue, 5 = Green, 6 = Yellow, 7 = Orange, 8 = Red, 9 = Pink, 10 = Purple
	// .0 = Very Light Solid, .1 = Light Solid, .2 = Solid, .3 = Dark Solid, .4 = Very Dark Solid
	// .5 = Solid w/Secondary Stomach, .6 = Spotted, .7 = Checkered, .8 = Patched, .9 = Stripped
	
	boolean patternCamo; // Does the creature have a natural pattern on its surface for blending in?
	int environmentCamo; // Does the creature have have the ability to be better hidden in certain environments?
						 //0 = None, 1 = Desert, 2 = Plains, 3 = Mountains, 4 = Forest, 5 = Jungle, 6 = River bed
						 //7 = Ocean/Ocean floor, 8 = Coral Reef, 9 = Volcanic, 10 = Clouds, 11 = Cameleon (Any)
	
	int poison; // 0 = Not poisonous, 1 = Poisonous Spray, 2 = Poisonous to Eat, 3 = Slightly venomous bite, 4 = Venomous Bite, 5 = Strongly Venomous Bite
	
	int maxFoodEnergy; // The maximum energy the animal can store at one time.
	int foodEnergy; // The current food energy stored by the animal.
	int foodRate;
	double foodEfficiency;
	
	int waterEnergy;
	int waterRate;
	double waterEfficiency;
	
	/*
	Amount of food or water that can be consumed(the maximum of a food or water meter): Ints
	The rate at which food and water meters deplete: Int
	Life/health/hit points: Decrease when taking kinds of damage.
	*/
	
	public Animal(){
		
	}
	
	public Animal(){
		
	}
	
}
