
public class Personality
	{
		int rank;
		String trait;
		
		public Personality(int r, String t)
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
				return "Personality [rank=" + rank + ", trait=" + trait + "]";
			}
		
	}
