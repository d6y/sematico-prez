package underscore;

import org.joda.time.*;

public class AltSubscription {

    private final String name;
    private final boolean trial;
    private final DateTime expiry;

    public AltSubscription(String name, boolean trial, DateTime expiry) {
        this.name = name;
        this.trial = trial;
        this.expiry = expiry;
    }

    public DateTime getExpiry() {
        return expiry;
    }

    public String getName() {
        return name;
    }

    public boolean isTrial() {
        return trial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AltSubscription that = (AltSubscription) o;

        if (trial != that.trial) return false;
        if (expiry != null ? !expiry.equals(that.expiry) : that.expiry != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (trial ? 1 : 0);
        result = 31 * result + (expiry != null ? expiry.hashCode() : 0);
        return result;
    }
}
