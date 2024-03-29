package mqtt.publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	/** The logger. */
    @SuppressWarnings("unused")
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
    	CliProcessor.getInstance().parseCliOptions(args);
    	 // Start the MQTT subscriber.
        Publisher publisher = new Publisher();
        publisher.run();
    }
}
