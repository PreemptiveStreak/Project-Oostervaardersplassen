package domain;

public class CattleCalculator {

	public float calculatePopulationSize(float birth1, float death1, float birth2, float death2, float amount1, float amount2, float carryingCapacity1) {
		float intrinsicRate1 = birth1 - death1;
		float growthFactor1 = 1 + ((intrinsicRate1 * amount1) * ((carryingCapacity1 - amount1 - amount2)/carryingCapacity1))/100;
	    float finalValue = (float) ((amount1) * (Math.pow(growthFactor1, ConstantsSingleton.instance().getNumberOfYears())));
	    return finalValue;
	}
}
