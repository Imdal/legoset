package legoset;

import javax.xml.bind.annotation.*;

public class Minifig {
    @XmlValue
    private String name;
    @XmlAttribute
    private int count;

    public  Minifig() {}

    public Minifig(int count, String name) {
        this.count = count;
        this.name = name;
    }

}
