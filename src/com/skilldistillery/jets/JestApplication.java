package com.skilldistillery.jets;

import java.util.Scanner;

public class JestApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jet[] tempJetArr; 
		int choice;
		AirField af;

		{
			af = new AirField();

			af.addJet(new JetImpl("BasicJet", 1200, 1500, 10_000_000));
			af.addJet(new DogFightJet("DogFightJet1", 1800, 2200, 30_000_000, 5000));
			af.addJet(new DogFightJet("DogFightJet2", 2000, 2000, 35_000_000, 6500));
			af.addJet(new DestroyerJet("DestroyerJet1", 2500, 1500, 50_000_000, 10_000, 6));
			af.addJet(new DestroyerJet("DestroyerJet2", 2700, 1600, 60_000_000, 10_000, 4));
			af.addJet(new BomberJet("bomberJet1", 1500, 5000, 45_000_000, 400));
			af.addJet(new BomberJet("bomberJet2", 1200, 9000, 60_000_000, 500));
			af.addJet(new CargoJet("CargoJet1", 900, 10_000, 40_000_000, 5000));
			af.addJet(new CargoJet("CargoJet2", 800, 12_000, 38_000_000, 7000));
			
			af.addPilot(new Pilot("Bob", "Male", 25, 100_000));
			af.addPilot(new Pilot("Sally", "Female", 15, 85_000));
			af.addPilot(new Pilot("Dave", "Male", 5, 60_000));
			af.addPilot(new Pilot("Steve", "Male", 6, 65_000));
			af.addPilot(new Pilot("Deb", "Female", 25, 100_000));
			af.addPilot(new Pilot("Chris", "Male", 8, 70_000));
			af.addPilot(new Pilot("Jack", "Male", 16, 86_000));
			af.addPilot(new Pilot("Karen", "Female", 30, 120_000));
			af.addPilot(new Pilot("Jackie", "Female", 14, 80_000));
		
	
		tempJetArr = af.getJetsArray();
	}

		System.out.println("Welcome to the Jets Application");
		System.out.println("Here are the things you can do: ");
		do {
			mainMenu();
			choice = sc.nextInt();
			switch (choice) {

			case (1): {
				af.displayAllJets();
				break;
			}
			case (2): {
				af.flyAllJets();
				break;
			}
			case (3): {
				af.fastestJet();
				break;
			}
			case (4): {
				af.furthestJet();
				break;
			}
			case (5): {
				af.loadAllCargoJets();
				break;
			}
			case (6): {
				do{
					fightMenu();
					choice = sc.nextInt();
					
					switch (choice) {
	
					case (1): {
						af.allFightingJetsFire();
						break;
					}
					case (2): {
						af.allFightingJetsReload();
						break;
					}
					case (3): {
						af = blowUpAJet(af);
						break;
					}
					case(4):{
						af.allShootingJetsShoot();
						break;
						}
					case(5):{
						af.allMissileJetsShoot();
						break;
					}
					case(6):{
						af.allBombingJetsBomb();
						break;
					}
					case(7):{
						af.allFightingJetsManuver();
						break;
					}
					case(8):{
						af.allFightingJetsKamakazie();
						break;
					}
					default:
						break;
					}
				}while(choice != 9);
				break;
			}
			case(7):{
				af = addJetToFleet(af);
				break;
			}
			case (8):{
				af = flyOneJet(af);
				break;
			}
			case(9):{
				af = replacePilot(af);
				break;
			}
			default:
				break;
			}
		} while (choice != 10);
		
		System.out.println("GoodBye");
		sc.close();
	}

	public static void mainMenu() {
		StringBuilder menu = new StringBuilder("*****MENU*****\n"
				+ "1) List Fleet\n"
				+ "2) Fly All Jets\n"
				+ "3) View Fastest Jet\n"
				+ "4) View Jet with Longest Range\n" 
				+ "5) Load All Cargo Jets\n"
				+ "6) FIGHT!!\n"
				+ "7) Add A Jet To The Fleet\n"
				+ "8) Fly an Individual Jet\n"
				+ "9) Hire a New Pilot for a Jet\n"
				+ "10) Quit");

		System.out.println(menu);
	}

	public static void fightMenu() {
		StringBuilder fightMenu = new StringBuilder("*****FIGHT MENU*****\n" 
				+ "1) Fire All Weapons\n"
				+ "2) Load All Weapons\n"
				+ "3) Attack Another Jet\n"
				+ "4) Fire All Machine Guns\n"
				+ "5) Fire All Missiles\n"
				+ "6) Drop All Bombs\n"
				+ "7) All Jets Barrel Roll\n" 
				+ "8) All Jets Kamakazie\n"
				+ "9) Exit Fight Mode");
		System.out.println(fightMenu);

		System.out.println();
	}
	public static AirField blowUpAJet(AirField af) {
		Scanner sc = new Scanner(System.in);
		String quit = "Y";
		int choice;
		Jet[] tempJetArr =af.getJetsArray();
		while (!quit.equalsIgnoreCase("N")) {
			System.out.println("Select a Jet: ");
			af.allFightingJets();
			choice = sc.nextInt();
			
			System.out.println("Select a Jet to Blow Up: ");
			af.allFightingJets();
			int jetToDestroy = sc.nextInt();
			
			
			FightingJet chosenJet = ((FightingJet)tempJetArr[choice]);
			FightingJet chosenJetToDestory = ((FightingJet)tempJetArr[jetToDestroy]);
			chosenJet.attack(chosenJetToDestory);
			chosenJetToDestory.takeDamage();
			
			System.out.print("Again? (Y/N): ");
			quit = sc.next();
			
		}
		return af;
	}
	public static AirField addJetToFleet(AirField af) {
		Scanner sc = new Scanner(System.in);
		System.out.println("We are Going to add Your Jet to the FLeet.\n"
				+ "(You can only add Basic Jets until you buy the Premium Version)");
		
		System.out.print("Model Name: ");
		String model = sc.next();
		
		System.out.print("How Fast can it go in MPH: ");
		int speedInMPH = sc.nextInt();
		
		System.out.print("What is the Range in Miles: ");
		int rangeInMiles = sc.nextInt();
		
		System.out.print("How much does it cost: ");
		int price = sc.nextInt();
		
		JetImpl customJet = new JetImpl(model, speedInMPH, rangeInMiles, price);
		System.out.println();
		
		System.out.println("Here is your Jet: ");
		System.out.println(customJet);
		System.out.println();
		
		System.out.println("Added to the inventory, You should hire a pilot, then go to view fleet to see your jet and make it fly");
		af.addJet(customJet);
		return af;
	}
	public static AirField flyOneJet(AirField af) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Pick a jet: ");
		af.displayAllJets();
		choice = sc.nextInt();
		af.flyOneJets(choice - 1);
		
		return af;
	}
	public static AirField replacePilot(AirField af) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("Which Jet do you want to change pilots: ");
		af.displayAllJets();
		choice = sc.nextInt();
		System.out.print("Lets get a new Pilot, What is there name? (First Name Only): ");
		String name = sc.next();
		System.out.print("Gender? (Male/Female): ");
		String gender = sc.next();
		System.out.print("Years flying: ");
		int yearsFlying = sc.nextInt();
		System.out.print("Salary (no spaces or commas): ");
		int salary = sc.nextInt();
		
		Pilot customPilot = new Pilot(name, gender, yearsFlying, salary);
		af.changePilotsArray(customPilot, choice - 1);
		
		System.out.println("Here is your new Pilot with their Jet: ");
		System.out.println(af.getOnePilot(choice -1));
		
		return af;
	}
}
