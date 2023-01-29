import java.util.Random;

public class Layer {

    double[][] weights;
    double[] biases;

    double[] output;
    int inputCount;

    public Layer(int inputCount, int outputCount){
        Random r = new Random();
        this.inputCount = inputCount;

        weights = new double[outputCount][inputCount];
        biases = new double[outputCount];
        for(int i = 0; i < outputCount; i++){
            for(int j = 0; j < inputCount; j++){
                weights[i][j] = r.nextDouble() * (r.nextBoolean() ? 1 : -1);
            }
            biases[i] = r.nextDouble() * (r.nextBoolean() ? 1 : -1);
        }
    }

    public double[] feed(double[] inputs){
//        if(inputCount != inputs.length){
//            System.out.println("Input sizes do not match");
//            return new double[]{0, 0};
//        }
        output = Util.dotProduct(weights, inputs, biases);
        for(int i = 0; i < output.length; i++){
            output[i] = Math.max(0, output[i]);
        }
        return output;
    }
}
