package Lecture8;

public class GasStation {
	public static void main(String[] args) {

		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };

		System.out.println(trip(gas, cost));

	}

	private static int trip(int[] gas, int[] cost) {
		// TODO Auto-generated method stub
		
		int total=0;

		int tank = 0;
		int start = 0;
		for (int i = 0; i < gas.length; i++) {
			total=total+(gas[i]-cost[i]);
			
			tank =  tank + (gas[i]-cost[i]);
			if (tank < 0) {
				start = i + 1;
				tank=0;
			}
		}
		if(total<0) return -1;
		return start;
	}

}
