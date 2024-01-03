import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class DisplayWindow extends JFrame{
    private final JLabel displayLabel;

    DisplayWindow(){
        setSize(300, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Display Window");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        displayLabel = new JLabel("0");
        displayLabel.setFont(new Font("", Font.BOLD, 25));
        add(displayLabel);
        setVisible(true);
    }

    public void displayWaterLevel(int waterLevel){
        displayLabel.setText(Integer.toString(waterLevel));
    }
}

class AlarmWindow extends JFrame{
    private final JLabel alarmLabel;

    AlarmWindow(){
        setSize(300, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Alarm Window");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());


        alarmLabel = new JLabel("OFF");
        alarmLabel.setFont(new Font("", Font.BOLD, 25));
        add(alarmLabel);
        setVisible(true);
    }

    public void operateAlarm(int waterLevel){
        alarmLabel.setText( waterLevel >= 50 ? "ON" : "OFF");
    }
}


class  SplitterWindow extends JFrame{
    private final JLabel splitterLabel;

    SplitterWindow(){
        setSize(300, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Alarm Window");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());


        splitterLabel = new JLabel("OFF");
        splitterLabel.setFont(new Font("", Font.BOLD, 25));
        add(splitterLabel);
        setVisible(true);
    }

    public void split(int waterLevel){
        splitterLabel.setText( waterLevel >= 75 ? "Splitter ON" : "Splitter OFF");
    }
}



class WaterTankWindow extends JFrame{

    private AlarmWindow alarmWindow;
    private DisplayWindow displayWindow;
    private SplitterWindow splitterWindow;
    private final JSlider waterLevelSlider;

    WaterTankWindow(){
        setSize(300, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Water Tank Window");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());


        waterLevelSlider = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        waterLevelSlider.setFont(new Font("", Font.BOLD, 25));
        waterLevelSlider.setMajorTickSpacing(25);
        waterLevelSlider.setMinorTickSpacing(5);
        waterLevelSlider.setPaintLabels(true);


        waterLevelSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int waterLevel = waterLevelSlider.getValue();
                displayWindow.displayWaterLevel(waterLevel);
                alarmWindow.operateAlarm(waterLevel);
                splitterWindow.split(waterLevel);
            }
        });
        add(waterLevelSlider);
    }

    public void setAlarmWindow(AlarmWindow alarmWindow) {
        this.alarmWindow = alarmWindow;
    }
    public void setDisplayWindow(DisplayWindow displayWindow) {
        this.displayWindow = displayWindow;
    }
    public void setSplitterWindow(SplitterWindow splitterWindow) {
        this.splitterWindow = splitterWindow;
    }
}


class Demo {
    public static void main(String[] args) {
        WaterTankWindow wt = new WaterTankWindow();
        wt.setAlarmWindow(new AlarmWindow());
        wt.setDisplayWindow(new DisplayWindow());
        wt.setSplitterWindow(new SplitterWindow());
        wt.setVisible(true);
    }
}