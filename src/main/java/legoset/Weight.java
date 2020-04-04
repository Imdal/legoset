package legoset;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Weight {
    @XmlValue
    private double value;
    @XmlAttribute
    private  String unit;

    public Weight(){};

    public Weight(double value, String unit){
        this.value = value;
        this.unit = unit;
    }
}
