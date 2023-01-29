public class Util {

    static double[] dotProduct(double[][] input1, double[] input2, double[] biases){
        double[] finalOutput = new double[input1.length];
        for(int i = 0; i < input1.length; i++){
            double fin = 0;
            for(int j = 0; j < input1[i].length; j++){
                fin += input1[i][j] * input2[j];
            }
            finalOutput[i] = fin + biases[i];
        }
        return finalOutput;
    }
}
