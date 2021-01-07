package org.threeten.bp.zone;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;

public abstract class ZoneRules {

    /* access modifiers changed from: package-private */
    public static final class Fixed extends ZoneRules implements Serializable {
        private static final long serialVersionUID = -8733721350312276297L;
        private final ZoneOffset offset;

        Fixed(ZoneOffset zoneOffset) {
            this.offset = zoneOffset;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public ZoneOffset a(Instant instant) {
            return this.offset;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public ZoneOffsetTransition b(LocalDateTime localDateTime) {
            return null;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public List<ZoneOffset> c(LocalDateTime localDateTime) {
            return Collections.singletonList(this.offset);
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public boolean d(Instant instant) {
            return false;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public boolean e() {
            return true;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Fixed) {
                return this.offset.equals(((Fixed) obj).offset);
            }
            if (!(obj instanceof StandardZoneRules)) {
                return false;
            }
            StandardZoneRules standardZoneRules = (StandardZoneRules) obj;
            if (!standardZoneRules.e() || !this.offset.equals(standardZoneRules.a(Instant.a))) {
                return false;
            }
            return true;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public boolean f(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
            return this.offset.equals(zoneOffset);
        }

        @Override // java.lang.Object
        public int hashCode() {
            return ((((this.offset.hashCode() + 31) ^ 1) ^ 1) ^ (this.offset.hashCode() + 31)) ^ 1;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("FixedRules:");
            V0.append(this.offset);
            return V0.toString();
        }
    }

    ZoneRules() {
    }

    public static ZoneRules g(ZoneOffset zoneOffset) {
        yif.J(zoneOffset, "offset");
        return new Fixed(zoneOffset);
    }

    public abstract ZoneOffset a(Instant instant);

    public abstract ZoneOffsetTransition b(LocalDateTime localDateTime);

    public abstract List<ZoneOffset> c(LocalDateTime localDateTime);

    public abstract boolean d(Instant instant);

    public abstract boolean e();

    public abstract boolean f(LocalDateTime localDateTime, ZoneOffset zoneOffset);
}
