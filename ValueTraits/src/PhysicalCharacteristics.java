
public class PhysicalCharacteristics
	{
		int rank;
		String trait;
		
		public PhysicalCharacteristics(int r, String t)
		{
			rank= r;
			trait= t;
			
		}

		public int getRank()
			{
				return rank;
			}

		public void setRank(int rank)
			{
				this.rank = rank;
			}

		public String getTrait()
			{
				return trait;
			}

		public void setTrait(String trait)
			{
				this.trait = trait;
			}

		@Override
		public String toString()
			{
				return "PhysicalCharacteristics [rank=" + rank + ", trait=" + trait + "]";
			}
		
	}

