package hdmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vga.IVGA;
@Component("hdmi")
public class HdmiVgaAdapter implements IVGA {
    @Autowired
    private IHDMI hdmi;
    @Override
    public String print(String d) {
        byte[] b = d.getBytes();
        hdmi.print(b);
        return d;
    }

    /**
     * L'injection des dependances
     * @param hdmi
     */
    public void setHdmi(IHDMI hdmi) {
        this.hdmi = hdmi;
    }
}
