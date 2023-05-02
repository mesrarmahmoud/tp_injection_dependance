package UC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import usb.IUSB;
import vga.IVGA;
@Component("uc")
public class UC {
    @Autowired
    private IUSB usb;//coublage faible
    @Autowired
    private IVGA vga;//coublage faible

    public int readData(){
        int d = usb.read();
        return d;
    }

    public void printData(String s){
            vga.print(s);
    }

    /**
     * L'injection des dependances
     * @param usb
     */
    public void setUsb(IUSB usb) {
        this.usb = usb;
    }

    /**
     * l'injection des dependances
     * @param vga
     */
    public void setVga(IVGA vga) {
        this.vga = vga;
    }
}
