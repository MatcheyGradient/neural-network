public class Perceptron {
    public double[] weights;
    public double bias;
    public double learningRate;

    public Perceptron(int numInputs, double learningRate) {
        this.weights = new double[numInputs];
        this.bias = Math.random();
        this.learningRate = learningRate;

        for (int i = 0; i < numInputs; i++) {
            this.weights[i] = Math.random();
        }
    }

    public int predict(double[] inputs) {
        double sum = bias;
        for (int i = 0; i < weights.length; i++) {
            sum += inputs[i] * weights[i];
        }
        return activate(sum);
    }

    public void train(double[] inputs, int target) {
        int prediction = predict(inputs);
        int error = target - prediction;

        bias += error * learningRate;

        for (int i = 0; i < weights.length; i++) {
            weights[i] += error * learningRate * inputs[i];
        }
    }

    private int activate(double n) {
        return (int) Math.round(1 / (1 + Math.exp(-n)));
    }
}