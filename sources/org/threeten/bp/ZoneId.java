package org.threeten.bp;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.g;
import org.threeten.bp.zone.ZoneRules;

public abstract class ZoneId implements Serializable {
    public static final Map<String, String> a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        a = Collections.unmodifiableMap(hashMap);
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != ZoneRegion.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId h(b bVar) {
        ZoneId zoneId = (ZoneId) bVar.m(g.f());
        if (zoneId != null) {
            return zoneId;
        }
        throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain ZoneId from TemporalAccessor: ", bVar, ", type ")));
    }

    public static ZoneId w(String str) {
        yif.J(str, "zoneId");
        if (str.equals("Z")) {
            return ZoneOffset.n;
        }
        if (str.length() == 1) {
            throw new DateTimeException(je.x0("Invalid zone: ", str));
        } else if (str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.D(str);
        } else {
            if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
                ZoneOffset zoneOffset = ZoneOffset.n;
                zoneOffset.getClass();
                return new ZoneRegion(str, ZoneRules.g(zoneOffset));
            } else if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                ZoneOffset D = ZoneOffset.D(str.substring(3));
                if (D.C() == 0) {
                    return new ZoneRegion(str.substring(0, 3), ZoneRules.g(D));
                }
                return new ZoneRegion(str.substring(0, 3) + D.i(), ZoneRules.g(D));
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return ZoneRegion.A(str, true);
            } else {
                ZoneOffset D2 = ZoneOffset.D(str.substring(2));
                if (D2.C() == 0) {
                    return new ZoneRegion("UT", ZoneRules.g(D2));
                }
                StringBuilder V0 = je.V0("UT");
                V0.append(D2.i());
                return new ZoneRegion(V0.toString(), ZoneRules.g(D2));
            }
        }
    }

    public static ZoneId x(String str, ZoneOffset zoneOffset) {
        yif.J(str, "prefix");
        yif.J(zoneOffset, "offset");
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException(je.x0("Invalid prefix, must be GMT, UTC or UT: ", str));
        } else if (zoneOffset.C() == 0) {
            return new ZoneRegion(str, ZoneRules.g(zoneOffset));
        } else {
            StringBuilder V0 = je.V0(str);
            V0.append(zoneOffset.i());
            return new ZoneRegion(V0.toString(), ZoneRules.g(zoneOffset));
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return i().equals(((ZoneId) obj).i());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return i().hashCode();
    }

    public abstract String i();

    public abstract ZoneRules l();

    @Override // java.lang.Object
    public String toString() {
        return i();
    }

    /* access modifiers changed from: package-private */
    public abstract void z(DataOutput dataOutput);
}
