package project5;

import java.util.Observable;
import java.util.Observer;

import CS2114.Shape;
import CS2114.Window;

public class DisplayWindow implements Observer{
    
    private Window window;
    private Shape topLeftBar;
    private Shape topMiddleBar;
    private Shape topRightBar;
    private Shape middleLeftBar;
    private Shape middleMiddleBar;
    private Shape middleRightBar;
    private Shape bottomLeftBar;
    private Shape bottomMiddleBar;
    private Shape bottomRightBar;
    /**
     * Height of each bar (subject to change).
     */
    public static final int BAR_HEIGHT = 10;
    /**
     * Width of each bar (subject to change).
     */
    public static final int BAR_WIDTH = 10;
    private Shape legendBox;
    private Shape legendBar;
    
    public DisplayWindow()
    {
        window = new Window();
        window.setTitle("Project 5");
        
        topLeftBar = new Shape();
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        // TODO Auto-generated method stub
        
    }
}
