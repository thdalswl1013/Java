//2020112099 �۹���
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class Time1{
   private int hour;
   private int minute;
   private int second;
   
  
  public Time1() {
     this(0, 0, 0);
  }
  
  public Time1(int hour) {
     this(hour, 0, 0);
  }
  
  public Time1(int hour, int minute) {
     this(hour, minute, 0);
  }
  
  public Time1(int hour, int minute, int second) {
     if (hour<0 || hour >=24) {
        throw new IllegalArgumentException("hour must be 0-23");
     }
     if (minute<0 || minute >=60) {
        throw new IllegalArgumentException("minute must be 0-59");
     }
     if (second<0 || second >=60) {
        throw new IllegalArgumentException("second must be 0-59");
     }
     
     this.hour = hour;
     this.minute = minute;
     this.second = second;
  }
  
  public Time1(Time1 time) {
     this(time.hour, time.minute, time.second);
  }
  
  public void setTime(int hour, int minute, int second) {
     if (hour<0 || hour >=24) {
        throw new IllegalArgumentException("hour must be 0-23");
     }
     if (minute<0 || minute >=60) {
        throw new IllegalArgumentException("minute must be 0-59");
     }
     if (second<0 || second >=60) {
        throw new IllegalArgumentException("second must be 0-59");
     }
     
     this.hour = hour;
     this.minute = minute;
     this.second = second;
  }
  
  public void setMinute(int minute) {
     if (minute<0 || minute >=60) {
        throw new IllegalArgumentException("minute must be 0-59");
     }
     this.minute = minute;
  }
  
  public void setSecond(int second) {
     if (second<0 || second >=60) {
        throw new IllegalArgumentException("second must be 0-59");
     }
     this.second = second;
  }

  public int getHour() {return hour;}
  public int getMinute() {return minute;}
  public int getSecond() {return ((3600*hour) + (60*minute) + second);}
  
  public String toUniversalString() {
     return String.format("%d", getSecond());
  }
  
  public String toString() {
     return String.format("%d %s",(getHour()<12 ? getSecond(): getSecond()-(3600*12)), (getHour()<12 ? "AM": "PM"));
  }
}