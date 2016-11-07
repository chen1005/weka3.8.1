package weka.mot.event;

import java.util.EventObject;

/**
 * A customized event with two arguments
 */
public class MLPLearningEvent extends EventObject
{
    /**
     * Multi-layer Perceptron learning event object
     */
    private static final long serialVersionUID = 5748716625119581710L;
    private final int epochNumber;
    private final double totalNetworkError;

    public MLPLearningEvent(final Object source, final int epochNumber, final double totalNetworkError)
    {
        super(source);
        this.epochNumber = epochNumber;
        this.totalNetworkError = totalNetworkError;
    }

    public int getEpochNumber()
    {
        return epochNumber;
    }

    public double getTotalNetworkError()
    {
        return totalNetworkError;
    }
}
