package weka.mot.event;

/**
 * One implementation of MLPLearningEventHandler interface
 */
public class MLPLearningEventHandlerImpl implements MLPLearningEventHandler {
    @Override
    public void handleMLPLearningEvent(final MLPLearningEvent event) {
        // final MultilayerPerceptron mlperceptron = (UserTaskApp) event.getSource();
        System.out.println("Information from MLPLearningEventHandler implementor:");
        System.out.println("Information carried within event - EpochNumber = " + event.getEpochNumber()
                + "; TotalNetworkError = " + event.getTotalNetworkError());
    }
}
