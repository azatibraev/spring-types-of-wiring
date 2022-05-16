package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peaksoft.model.Ocean1;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;


    public String getRulesByDeath() {
        return "\u001B[35m На свете есть океан, " + ocean.toString();
    }

    @Autowired
    public KoscheiTheDeathless(Ocean1 ocean1) {
        this.ocean = ocean1;
    }
}
