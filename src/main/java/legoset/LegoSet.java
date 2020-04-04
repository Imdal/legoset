package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URL;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder = {"name","theme","subtheme","year","pieces","tags","minifigs","unit","url"})
@Data
public class LegoSet {
    @XmlAttribute
    private int number;
    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private java.time.Year year;
    private int pieces;
    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private java.util.Set<String> tags;
    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private java.util.List<Minifig> minifigs;
    private Weight weight;
    private URL url;


    public LegoSet() {
    }
}
