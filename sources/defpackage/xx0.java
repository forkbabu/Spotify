package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.TimeZone;
import org.threeten.bp.Clock;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.b;
import org.threeten.bp.zone.c;

/* renamed from: xx0  reason: default package */
public class xx0 implements wx0 {
    private final Clock a;
    private final b b;

    public xx0(Clock clock, b bVar, TimeZone timeZone) {
        ZoneId zoneId;
        this.a = clock;
        Map<String, String> map = ZoneId.a;
        HashSet hashSet = new HashSet(c.a());
        if ("Asia/Hanoi".equals(timeZone.getID()) && !hashSet.contains("Asia/Hanoi")) {
            zoneId = ZoneId.w("Asia/Ho_Chi_Minh");
        } else if (!"America/Nuuk".equals(timeZone.getID()) || hashSet.contains("America/Nuuk")) {
            zoneId = ZoneId.w(timeZone.getID());
        } else {
            zoneId = ZoneId.w("America/Godthab");
        }
        this.b = bVar.k(zoneId);
    }

    @Override // defpackage.wx0
    public String a() {
        return this.b.a(this.a.b());
    }
}
