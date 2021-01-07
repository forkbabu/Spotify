package org.threeten.bp;

import java.io.Serializable;

public abstract class Clock {

    /* access modifiers changed from: package-private */
    public static final class SystemClock extends Clock implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;
        private final ZoneId zone;

        SystemClock(ZoneId zoneId) {
            this.zone = zoneId;
        }

        @Override // org.threeten.bp.Clock
        public ZoneId a() {
            return this.zone;
        }

        @Override // org.threeten.bp.Clock
        public Instant b() {
            return Instant.D(System.currentTimeMillis());
        }

        @Override // org.threeten.bp.Clock
        public long c() {
            return System.currentTimeMillis();
        }

        @Override // org.threeten.bp.Clock, java.lang.Object
        public boolean equals(Object obj) {
            if (obj instanceof SystemClock) {
                return this.zone.equals(((SystemClock) obj).zone);
            }
            return false;
        }

        @Override // org.threeten.bp.Clock, java.lang.Object
        public int hashCode() {
            return this.zone.hashCode() + 1;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("SystemClock[");
            V0.append(this.zone);
            V0.append("]");
            return V0.toString();
        }
    }

    protected Clock() {
    }

    public static Clock d() {
        return new SystemClock(ZoneOffset.n);
    }

    public abstract ZoneId a();

    public abstract Instant b();

    public long c() {
        return b().N();
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return super.hashCode();
    }
}
