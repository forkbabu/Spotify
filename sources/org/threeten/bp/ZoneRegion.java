package org.threeten.bp;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.zone.ZoneRules;
import org.threeten.bp.zone.ZoneRulesException;
import org.threeten.bp.zone.c;

/* access modifiers changed from: package-private */
public final class ZoneRegion extends ZoneId implements Serializable {
    private static final Pattern c = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    public static final /* synthetic */ int f = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    private final transient ZoneRules b;
    private final String id;

    ZoneRegion(String str, ZoneRules zoneRules) {
        this.id = str;
        this.b = zoneRules;
    }

    static ZoneRegion A(String str, boolean z) {
        yif.J(str, "zoneId");
        if (str.length() < 2 || !c.matcher(str).matches()) {
            throw new DateTimeException(je.x0("Invalid ID for region-based ZoneId, invalid format: ", str));
        }
        ZoneRules zoneRules = null;
        try {
            zoneRules = c.b(str, true);
        } catch (ZoneRulesException e) {
            if (str.equals("GMT0")) {
                ZoneOffset zoneOffset = ZoneOffset.n;
                zoneOffset.getClass();
                zoneRules = ZoneRules.g(zoneOffset);
            } else if (z) {
                throw e;
            }
        }
        return new ZoneRegion(str, zoneRules);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    /* access modifiers changed from: package-private */
    public void B(DataOutput dataOutput) {
        dataOutput.writeUTF(this.id);
    }

    @Override // org.threeten.bp.ZoneId
    public String i() {
        return this.id;
    }

    @Override // org.threeten.bp.ZoneId
    public ZoneRules l() {
        ZoneRules zoneRules = this.b;
        return zoneRules != null ? zoneRules : c.b(this.id, false);
    }

    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.ZoneId
    public void z(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.id);
    }
}
