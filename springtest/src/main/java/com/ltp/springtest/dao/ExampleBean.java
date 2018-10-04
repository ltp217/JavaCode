package com.ltp.springtest.dao;

public class ExampleBean {
	// Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;
    
	public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ultimateAnswer == null) ? 0 : ultimateAnswer.hashCode());
		result = prime * result + years;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExampleBean other = (ExampleBean) obj;
		if (ultimateAnswer == null) {
			if (other.ultimateAnswer != null)
				return false;
		} else if (!ultimateAnswer.equals(other.ultimateAnswer))
			return false;
		if (years != other.years)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExampleBean [years=" + years + ", ultimateAnswer=" + ultimateAnswer + "]";
	}
	
	
	
	
	
}
