package DPIchi;

import DPIchi.Behaviours.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
