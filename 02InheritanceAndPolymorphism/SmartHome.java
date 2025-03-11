import java.util.*;

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
    List<SmartDevice> devices = new ArrayList<>();
    for(int i=0;i<10;++i) {
      if(i%3!=0){
        devices.add(new SmartSpeaker("Speaker " + (i+1), false, 48+i*2));
      }
      else {
        devices.add(new SmartLight("Light " + (i+1), false, 27+i*3));
      }
    }

    for(int i=0;i<10;++i){
      String status = devices.get(i).getStatus();
      System.out.println(status);
    }

    for(SmartDevice obj : devices){
      obj.turnOn();
      if(obj instanceof SmartSpeaker) {
        SmartSpeaker speaker = (SmartSpeaker) obj;
        speaker.setVolume(30);
      }
      else {
        SmartLight speaker = (SmartLight) obj;
        speaker.setBrightness(50);
      }
      String status = obj.getStatus();
      System.out.println(status);
    }
  }
}
