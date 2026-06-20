class FinancialForcasting{
public static double PredictValue(
     double currentValue,
        double growthRate,
        int years){
            if(years==0){
                return currentValue;
            }

            return PredictValue(currentValue, growthRate, years-1 )*(1+growthRate);

        }
         public static void main(String[] args) {

        double currentValue = 1000;
        double growthRate = 0.10; // 10%
        int years = 3;

        double futureValue=PredictValue(currentValue, growthRate, years);
        System.out.println("Future value = "+ futureValue);
         }
}


