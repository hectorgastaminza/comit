package Mqtt;

public class MqttConnectionConfiguration {
	private String brokerHost = "mqtt.dioty.co";
	private int brokerPort = 1883;
	/* Optional */
	private int brokerWebSocketsPort = 8080;
	/* Optional */
	private String userId = "hectorgastaminza@gmail.com";
	/* Optional */
	private String password = "67b9ee69";
	/* Optional */
	private String rootTopic = "/hectorgastaminza@gmail.com/";
	/* Quality of service */
	private int qos = 0;
	/* Clean session */
	private boolean cleanSession = true;

	public String getUsername() {
		return userId;
	}

	public char[] getPassword() {
		return password.toCharArray();
	}

	public String getBrokerURL() {
		return ("tcp://"+brokerHost+":"+String.valueOf(brokerPort));		
	}
	
	public String getRootTopic() {
		return rootTopic;
	}
	
	public int getQOS() {
		return qos;
	}
	
	public boolean getCleanSession() {
		return cleanSession;
	}
}
