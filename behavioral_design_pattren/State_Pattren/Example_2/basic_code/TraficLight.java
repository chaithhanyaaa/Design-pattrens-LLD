class TrafficLight {

    String state = "RED";

    void next() {
        if (state.equals("RED")) {
            state = "GREEN";
        } else if (state.equals("GREEN")) {
            state = "YELLOW";
        } else if (state.equals("YELLOW")) {
            state = "RED";
        }
    }

    void showSignal() {
        if (state.equals("RED")) {
            System.out.println("STOP");
        } else if (state.equals("GREEN")) {
            System.out.println("GO");
        } else if (state.equals("YELLOW")) {
            System.out.println("READY");
        }
    }
}