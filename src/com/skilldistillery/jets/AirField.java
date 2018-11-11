package com.skilldistillery.jets;

public class AirField {
	private Jet[] jets = new Jet[20];
//	private Pilot[] pilots = new Pilot[20];

	public Jet[] getJetsArray() {
		Jet[] jetsCopy = new Jet[20];
		int counter = 0;
		for (Jet i : jets) {
			jetsCopy[counter] = i;
			counter++;
		}
		return jetsCopy;
	}
//	public Pilot[] getPilotsArray() {
//		int counter = 0;
//		for (Pilot i : pilots) {
//			pilots[counter] = i;
//			counter++;
//		}
//		return pilots;
//	}
	public void changePilotsArray(Pilot pilot, int index) {
		jets[index].setPilot(pilot);
		
	}

	private int j = 0;
	public void addJet(Jet jet) {
		jets[j] = jet;
		this.j++;
	}
	private int p = 0;
	public void addPilot(Pilot pilot) {
		jets[p].setPilot(pilot);
		this.p++;
	}

	private int n = 1;
	public void displayAllJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.print("Jet and its Pilot " + this.n + ") ");
				System.out.println(jets[i]);
//				System.out.println(pilots[i]);
				this.n++;
			}

		}
		System.out.println();
		n=1;
	}
	
	public Jet getOnePilot(int index) {
		return jets[index];
	}

	public void fastestJet() {
		Jet fastest = jets[0];
		for (Jet jet : jets) {
			if (jet != null) {
				fastest = (fastest.getSpeedInMPH() > jet.getSpeedInMPH() ? fastest : jet);
			}
		}
		System.out.println(fastest);
		System.out.println();

	}

	public void furthestJet() {
		Jet furthest = jets[0];
		for (Jet jet : jets) {
			if (jet != null) {
				furthest = (furthest.getRangeInMiles() > jet.getRangeInMiles() ? furthest : jet);

			}
		}
		System.out.println(furthest);
		System.out.println();
	}

	public void allFightingJetsFire() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof CanShootMissiles && ((CanShootMissiles)jet).getNumMissiles() == 0) {
					System.out.println("You don't have any missiles, Reload");
				}
				else if (jet instanceof CanShoot && ((CanShoot) jet).getNumBullets() == 0) {
					System.out.println("You don't have any bullets, Reload");
				
				}
				else if (jet instanceof CanBomb && ((CanBomb) jet).getNumBombs() == 0) {
					System.out.println("You don't have any Bombs, Reload");
				
				}
				else if (jet instanceof FightingJet) {
					((FightingJet) jet).fireAllWeapons();
					System.out.println();

				}
			}
		}

	}

	public void allFightingJetsReload() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof FightingJet) {
					((FightingJet) jet).reloadAllWeapons();
					System.out.println();

				}
			}

		}

	}

	public void allFightingJetsManuver() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof FightingJet) {
					((FightingJet) jet).evasiveManuver();
					System.out.println();

				}
			}

		}
	}
	public void allFightingJetsKamakazie() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof FightingJet) {
					((FightingJet) jet).kamakazie();
					System.out.println();
					
				}
			}
			
		}
	}

	public void allShootingJetsShoot() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof CanShoot && ((CanShoot) jet).getNumBullets() == 0) {
					System.out.println("You don't have any bullets, Reload");
				}
				else if (jet instanceof CanShoot) {
					((CanShoot) jet).shooting();
					System.out.println();

				}
			}
		}

	}

	public void allMissileJetsShoot() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof CanShootMissiles && ((CanShootMissiles) jet).getNumMissiles() == 0) {
					System.out.println("You don't have any Missiles, Reload");
				
				}
				else if (jet instanceof CanShootMissiles) {
					((CanShootMissiles) jet).fireMissiles();
					System.out.println();

				}
			}
		}

	}

	public void allBombingJetsBomb() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof CanBomb && ((CanBomb) jet).getNumBombs() == 0) {
					System.out.println("You don't have any Bombs, Reload");
				
				}
				else if (jet instanceof CanBomb) {
					((CanBomb) jet).bomb();
					System.out.println();

				}
			}
		}

	}

	public void allFightingJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i] instanceof FightingJet) {
					System.out.println("Jet and its Pilot " + i + ") " + jets[i].toString());
//					System.out.println(pilots[i]);
	
					System.out.println();

				}
			}
		}

	}

	public void loadAllCargoJets() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof CargoJet) {
					((CargoJet) jet).setLoad();
					System.out.println();

				}
			}
		}
	}

	public void flyAllJets() {
		for (int i = 0; i < jets.length; i++){
			if (jets[i] != null) {
//				System.out.println(pilots[i] + " is flying");
				jets[i].fly();
				System.out.println();

			}
		}
	}
	public void flyOneJets(int choice) {
			if (jets[choice] != null) {
//				System.out.println(pilots[choice] + " is flying");
				jets[choice].fly();
				System.out.println();
				
			}
		}
	

}
