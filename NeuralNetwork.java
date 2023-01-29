import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeuralNetwork {

    List<Layer> layers = new ArrayList<>();
    double learningRate;


    public NeuralNetwork(int inputSize, int outputSize, int hiddenLayerCount, int[] hiddenLayerSizes, double learningRate){
        this.learningRate = learningRate;
        layers.add(new Layer(inputSize, hiddenLayerSizes[0]));
        for(int i = 0; i < hiddenLayerCount; i++){
            if(i == hiddenLayerCount - 1){
                layers.add(new Layer(hiddenLayerSizes[i], outputSize));
                continue;
            }
            layers.add(new Layer(hiddenLayerSizes[0], hiddenLayerSizes[i + 1]));
        }
        layers.add(new Layer(outputSize, 0));

        layers.forEach(l -> System.out.println(Arrays.toString(l.biases)));
    }
}
