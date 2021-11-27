package lesson6_2.Task1.Realization;

import lesson6_2.Task1.Interfaces.VideoAdapter;

public class AMDVideoAdapter implements VideoAdapter {
    public void renderVideo() {
        System.out.println("AMD video adapter");
    }
}