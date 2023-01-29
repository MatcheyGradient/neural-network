import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Perceptron perceptron = new Perceptron(2, .1);
//
//        double[][] inputs = {{1, 0}, {0, 1}, {1, 1}, {0, 0}};
//        int[] targets = {0, 0, 1, 0};
//
//        for (int i = 0; i < 1000; i++) {
//            for (int j = 0; j < inputs.length; j++) {
//                perceptron.train(inputs[j], targets[j]);
//            }
//        }
//
//        System.out.println(perceptron.predict(new double[] {1, 1}));
//
//        double[] inputs1 = {1.0, 2.0, 3.0, 2.5};
//        double[][] weights =    {{0.2, .8, -0.5, 1.0},
//                                {0.5, -0.91, 0.26, -0.5},
//                                {-0.26, -0.27, 0.17, 0.87}};
//
//        double[] bias = {2, 3, .5};
//
//        System.out.println(Arrays.toString(Util.dotProduct(weights, inputs1, bias)));


        double[] inputs1 = {1, 0};


        Layer layer1 = new Layer(2, 2);
        Layer layer2 = new Layer(2, 0);

        layer1.biases = new double[]{0, -1};
        layer2.biases = new double[]{0};

        layer1.weights = new double[][]{{1, 1}, {1, 1}};
        layer2.weights = new double[][]{{1, -2}};


        //System.out.println(Arrays.toString(layer2.feed(layer1.feed(inputs1))));


        NeuralNetwork network = new NeuralNetwork(2, 1, 3, new int[]{2, 3, 4}, .01);


    }
}