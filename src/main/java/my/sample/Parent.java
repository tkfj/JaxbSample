package my.sample;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

//@XmlRootElement(name = "parent")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parent {

    @XmlElementWrapper(name = "children")
    @XmlElement(name = "child")
    private List<Child> children;

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }


}
