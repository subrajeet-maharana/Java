class SmartDevice {
  String deviceName = "My Smart Device";
  boolean isOn = false;

  SmartDevice(String name, boolean status) {
    deviceName = name;
    isOn = status;
  }

  protected void turnOn() {
    isOn = true;
  }
  
  protected void turnOff() {
    isOn = false;
  }

  protected String getStatus() {
    return "SmartDevice [" + deviceName + "] is [" + (isOn?"ON":"OFF") + "]";
  }
}

class SmartSpeaker extends SmartDevice {
  int volume=0;

  SmartSpeaker(String name, boolean status, int vol) {
    super(name, status);
    volume = vol;
  }

  protected void setVolume(int volume) {
    this.volume=volume;
  }

  protected String getStatus() {
    return "SmartSpeaker [" + deviceName + "] is [" + (isOn?"ON":"OFF") + "] at [" + volume + "]%";
  }
}

class SmartLight extends SmartDevice {
  int brightness=0;

  SmartLight (String name, boolean status, int lumen) {
    super(name, status);
    brightness = lumen;
  }

  protected void setBrightness (int lumen) {
    this.brightness = lumen;
  }

  protected String getStatus() {
    return "SmartLight [" + deviceName + "] is [" + (isOn?"ON":"OFF") + "] at [" + brightness + "]%";
  }
}

public class SmartHome {
  public static void main(String[] args) {
    SmartDevice dev1 = new SmartDevice("My Sweet Device", false);
    String status = dev1.getStatus();
    System.out.println(status);
    SmartSpeaker speak1 = new SmartSpeaker("My Sweet Speaker", false, 15);
    speak1.setVolume(56);
    String speakStatus = speak1.getStatus();
    System.out.println(speakStatus);
    SmartLight light1 = new SmartLight("My Bright Light", false, 56);
    light1.setBrightness(80);
    String lightStatus = light1.getStatus();
    System.out.println(lightStatus);
  }
}
