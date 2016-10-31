import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TraitRunner
	{
	static ArrayList <Trait> traits = new ArrayList<Trait>();
	static ArrayList <Trait> roundOne = new ArrayList<Trait>();
	static ArrayList <Trait> roundTwo = new ArrayList<Trait>();
	static ArrayList <Trait> roundThree = new ArrayList<Trait>();
	static ArrayList <Trait> roundFour = new ArrayList<Trait>();
	static ArrayList <Trait> roundFive = new ArrayList<Trait>();
	static ArrayList <Trait> roundSix = new ArrayList<Trait>();
	static int counter = 0;
	static int tot = 209;
	
		public static void main(String[] args)
			{
				declareSuperficialityModifierCounter();
				greetUser();
				askForGender();
				fillTraits();
				//showAllTraitsBeingCompared();
				shuffleTraits();
				start();
				askQuestionsBeginningRound();
				roundOne();
				roundTwo();
				roundThree();
				roundFour();
				roundFive();
				declareWinner();
				superficialModifier(counter);
				System.out.println("On the superficial scale... you are " + counter + "/209 superficial.");
				total(counter, tot);
			}
		public static void declareSuperficialityModifierCounter()
		{
			// counter is declared above with static
		}
		public static void greetUser()
		{
		System.out.println("Welcome to Trait Finder!");
		Scanner userInput = new Scanner(System.in);			
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, " + name + ".");
		System.out.println("I am here to help you figure out what the most important quality is that you look for in a partner.");
		}
		public static void askForGender()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Are you looking for a guy or girl? Type 1 for guy. Type 2 for girl.");
		int gender = userInput.nextInt();
		
		if(gender==1)
		{
			System.out.println("I will help you find the best quality for you in a guy!");
			
		}
		else if(gender==2)
		{
			System.out.println("I will help you find the best quality for you in a girl!");
		
		}
		else
		{
			System.out.println("Type 1 or 2.");
		}
		}
		public static void fillTraits()
		{

			traits.add(new Trait("political party", 0));
			traits.add(new Trait("eye color", 1));
			traits.add(new Trait("hair color", 1));
			traits.add(new Trait("height", 1));
			traits.add(new Trait("shoe size", 1));
			traits.add(new Trait("athetic ability", 0));
			traits.add(new Trait("humor", 0));
			traits.add(new Trait("intelligence", 0));
			traits.add(new Trait("modesty", 0));
			traits.add(new Trait("humility", 0));		
			traits.add(new Trait("compassion", 0));		
			traits.add(new Trait("sympathy", 0));		
			traits.add(new Trait("ambition", 0));
			traits.add(new Trait("muscularity", 1));
			traits.add(new Trait("popularity", 1));
			traits.add(new Trait("race", 1));
			traits.add(new Trait("religion", 1));
			traits.add(new Trait("wealth", 1));
			traits.add(new Trait("20/20 vision", 1));
			traits.add(new Trait("desire for children", 0));
			traits.add(new Trait("family respect", 0));
			traits.add(new Trait("good parenting skills", 0));
			traits.add(new Trait("adventurousness", 0));
			traits.add(new Trait("gratitude", 0));
			traits.add(new Trait("love of winter", 1));
			traits.add(new Trait("love of fall", 1));
			traits.add(new Trait("love of spring", 1));
			traits.add(new Trait("love of summer", 1));
			traits.add(new Trait("openness to new experiences", 0));
			traits.add(new Trait("fearlessness", 0));
			traits.add(new Trait("independence", 0));
			traits.add(new Trait("obedience", 0));		
			traits.add(new Trait("charm", 0));
			traits.add(new Trait("culture", 0));
			traits.add(new Trait("dependability", 0));
			traits.add(new Trait("conscientiousness", 0));		
			traits.add(new Trait("fairness", 0));
			traits.add(new Trait("impartialness", 0));
			traits.add(new Trait("optimism", 0));				
			traits.add(new Trait("persistence", 0));	
			traits.add(new Trait("preciseness", 0));
			traits.add(new Trait("confidence", 1));		
			traits.add(new Trait("encouragement", 0));
			traits.add(new Trait("reliablility", 0));
			traits.add(new Trait("helpfulness", 0));		
			traits.add(new Trait("imagination", 1));
			traits.add(new Trait("trust-worthyness", 0));
			traits.add(new Trait("bossiness", 1));
			traits.add(new Trait("meticulousness", 1));
			traits.add(new Trait("good-fashion", 1));
			traits.add(new Trait("good-communication", 0));
			traits.add(new Trait("chemistry", 0));
		}
		public static void showAllTraitsBeingCompared()
		{
			System.out.println();
			System.out.println("These are all the traits being compared:");
			for(Trait t: traits)
					{
								System.out.println(t.getTrait());
					}
			System.out.println();
		}
		public static void shuffleTraits()
		{
			Collections.shuffle(traits);
		}
		public static void start()
		{
			System.out.println("Lets get started!");
		}
		public static void askQuestionsBeginningRound()
		{
			for(int i = 0; i < 26; i++)
			{
				Scanner userInput = new Scanner(System.in);			
				System.out.println("Choose which one is more important. Type 1 or 2. ");
				System.out.println("1. " + traits.get(0).getTrait());
				System.out.println("2. " + traits.get(1).getTrait());
				int answer = userInput.nextInt();
				if (answer == 1)
				{
					roundOne.add(traits.get(0));
					if (traits.get(0).getSuperficialityModifier() == 1)
					{
						counter++;
					}
				}
				else if (answer == 2)
				{
					roundOne.add(traits.get(1));
					if (traits.get(1).getSuperficialityModifier() == 1)
					{
						counter++;
					}
				}
				else
				{
					System.out.println("Type 1 or 2 for your answer.");
				}
				traits.remove(0);
				traits.remove(0);
			}
			System.out.println("NEXT ROUND");
		}
			public static void roundOne()
			{
				for(int i = 0; i < 13; i++)
				{
					Scanner userInput = new Scanner(System.in);			
					System.out.println("Choose which one is more important. Type 1 or 2. ");
					System.out.println("1. " + roundOne.get(0).getTrait());
					System.out.println("2. " + roundOne.get(1).getTrait());
					int answer = userInput.nextInt();
					if (answer == 1)
					{
						roundTwo.add(roundOne.get(0));
						if (roundOne.get(0).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else if (answer == 2)
					{
						roundTwo.add(roundOne.get(1));
						if (roundOne.get(1).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else
					{
						System.out.println("Type 1 or 2 for your answer.");
					}
					roundOne.remove(0);
					roundOne.remove(0);
				}
				System.out.println("NEXT ROUND");
			}
			public static void roundTwo()
			{
				for(int i = 0; i < 6; i++)
				{
					Scanner userInput = new Scanner(System.in);			
					System.out.println("Choose which one is more important. Type 1 or 2. ");
					System.out.println("1. " + roundTwo.get(0).getTrait());
					System.out.println("2. " + roundTwo.get(1).getTrait());
					int answer = userInput.nextInt();
					if (answer == 1)
					{
						roundThree.add(roundTwo.get(0));
						if (roundTwo.get(0).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else if (answer == 2)
					{
						roundThree.add(roundTwo.get(1));
						if (roundTwo.get(1).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else
					{
						System.out.println("Type 1 or 2 for your answer.");
					}
					roundTwo.remove(0);
					roundTwo.remove(0);
				}
				roundThree.add(roundTwo.get(0));
				System.out.println("NEXT ROUND");
			}
			public static void roundThree()
			{ for(int i = 0; i < 3; i++)
				{
					Scanner userInput = new Scanner(System.in);			
					System.out.println("Choose which one is more important. Type 1 or 2. ");
					System.out.println("1. " + roundThree.get(0).getTrait());
					System.out.println("2. " + roundThree.get(1).getTrait());
					int answer = userInput.nextInt();
					if (answer == 1)
					{
						roundFour.add(roundThree.get(0));
						if (roundThree.get(0).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else if (answer == 2)
					{
						roundFour.add(roundThree.get(1));
						if (roundThree.get(1).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else
					{
						System.out.println("Type 1 or 2 for your answer.");
					}
					roundThree.remove(0);
					roundThree.remove(0);
				}
				roundFour.add(roundThree.get(0));
				System.out.println("NEXT ROUND");
			}
			public static void roundFour()
			{
				for(int i = 0; i < 2; i++)
				{
					Scanner userInput = new Scanner(System.in);			
					System.out.println("Choose which one is more important. Type 1 or 2. ");
					System.out.println("1. " + roundFour.get(0).getTrait());
					System.out.println("2. " + roundFour.get(1).getTrait());
					int answer = userInput.nextInt();
					if (answer == 1)
					{
						roundFive.add(roundFour.get(0));
						if (roundFour.get(0).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else if (answer == 2)
					{
						roundFive.add(roundFour.get(1));
						if (roundFour.get(1).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else
					{
						System.out.println("Type 1 or 2 for your answer.");
					}
					roundFour.remove(0);
					roundFour.remove(0);
				}
				System.out.println("NEXT ROUND");
			}
			public static void roundFive()
			{
				for(int i = 0; i < 1; i++)
				{
					Scanner userInput = new Scanner(System.in);			
					System.out.println("Choose which one is more important. Type 1 or 2. ");
					System.out.println("1. " + roundFive.get(0).getTrait());
					System.out.println("2. " + roundFive.get(1).getTrait());
					int answer = userInput.nextInt();
					if (answer == 1)
					{
						roundSix.add(roundFive.get(1));
						if (roundFive.get(0).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else if (answer == 2)
					{
						roundSix.add(roundFive.get(1));
						if (roundFive.get(1).getSuperficialityModifier() == 1)
						{
							counter++;
						}
					}
					else
					{
						System.out.println("Type 1 or 2 for your answer.");
					}
					roundFive.remove(0);
					roundFive.remove(0);
				}
			}
			public static void declareWinner()
			{
				System.out.println("The most important quality you look for in a girl/guy is " + roundSix.get(0).getTrait());
			}
			
			public static int superficialModifier(int counter)
			{
				return counter;
			}
			
			public static void total(int counter, int tot)
			{
				
				if (counter==tot)
					{
						System.out.println("You are 100% superficial.");
					}
				
			}
			
			
//			
//			public static int precentage(int percentage)
//			{
//			
//				return percentage;
//				
//			}
			
	}
