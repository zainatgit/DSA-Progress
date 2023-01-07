package programming.usedCase;

import java.util.Date;

public class Customer {
    public Customer(Name name, Date lastUpdated) {
        this.name = name;
        this.lastUpdated = lastUpdated;
    }

    Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    Date lastUpdated;
}
