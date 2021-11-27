package lesson6_2.Task1.Realization;

import lesson6_2.Task1.Interfaces.VideoAdapter;

public class IntelVideoAdapter implements VideoAdapter {
    public void renderVideo() {
        System.out.println("Intel Video Adapter");
    }
}