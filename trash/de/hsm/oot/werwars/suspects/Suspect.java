package de.hsm.oot.werwars.suspects;


public class Suspect {
	public enum Function {
		BLACKSMITH,CHARWOMAN,COOK,DAMSEL,GUARD,KNIGHT,NANNY,PRIEST,STABLEBOY,WITCH;
		private String image;
		private Function() { this(null); }
		private Function(String image) {
			StringBuilder build = new StringBuilder();
			if(!(image instanceof String))
				image = this.toString();
			if(!image.endsWith(".png"))
				build.append(".png");
			this.image = build.toString();
		}
		public String getImage() {
			return this.image;
		}
	}
	
	private Chest chest; //each suspect has got a chest
	
	public Suspect(Function function) { this(function,false); }
	public Suspect(Function function,boolean stoleRing) {
		this.chest = new Chest(this,stoleRing);
		
	}
	
	public Chest getChest() { return chest; }
}
