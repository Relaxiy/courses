package lesson6_2.Task1;

import lesson6_2.Task1.Realization.AMDVideoAdapter;
import lesson6_2.Task1.Realization.AmdCPU;
import lesson6_2.Task1.Realization.DD3;
import lesson6_2.Task1.Realization.DD4;
import lesson6_2.Task1.Realization.Hitachi;
import lesson6_2.Task1.Realization.IntelCPU;
import lesson6_2.Task1.Realization.Kingston;
import lesson6_2.Task1.Realization.LGScreen;
import lesson6_2.Task1.Realization.LogiTechKeyBoard;
import lesson6_2.Task1.Realization.LogiTechMouse;
import lesson6_2.Task1.Realization.Marshall;
import lesson6_2.Task1.Realization.Samsung;
import lesson6_2.Task1.Realization.SamsungScreen;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        PC[] pc = new PC[]{new PC(new LogiTechMouse(), new LogiTechKeyBoard(), new LGScreen(), new Marshall(), new Kingston(), new AmdCPU(), new DD4(), new AMDVideoAdapter()), new PC(new LogiTechMouse(), new LogiTechKeyBoard(), new SamsungScreen(), new Samsung(), new IntelCPU(), new DD4()), new PC(new Hitachi(), new IntelCPU(), new DD3(), new AMDVideoAdapter())};
        pc[0].show();
        System.out.println();
        pc[1].show();
        System.out.println();
        pc[2].show();
    }
}