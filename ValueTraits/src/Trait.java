
public class Trait
	{
		
		String trait;

		int superficialityModifier;
		
		public Trait(String t, int s)
		{
			trait= t;
			superficialityModifier= s;
			
		}

		public String getTrait()
			{
				return trait;
			}

		public void setTrait(String trait)
			{
				this.trait = trait;
			}

		public int getSuperficialityModifier()
			{
				return superficialityModifier;
			}

		public void setSuperficialityModifier(int superficialityModifier)
			{
				this.superficialityModifier = superficialityModifier;
			}

		@Override
		public String toString()
			{
				return "Trait [trait=" + trait + ", superficialityModifier=" + superficialityModifier + "]";
			}

	
		
		
		
	}
