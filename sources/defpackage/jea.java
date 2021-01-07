package defpackage;

import com.spotify.base.java.logging.Logger;
import defpackage.lea;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: jea  reason: default package */
public final class jea implements iea {
    private final lea a;

    public jea(lea lea) {
        h.e(lea, "connectedA2dpDevicesProvider");
        this.a = lea;
    }

    @Override // defpackage.iea
    public String a(gea gea) {
        T t;
        T t2;
        boolean z;
        h.e(gea, "route");
        if (gea.e() != 8) {
            return null;
        }
        Logger.b("Trying to match route '%s' with a connected active a2dp device", gea.d());
        List<lea.a> b = this.a.b();
        if (b.size() == 1) {
            String b2 = b.get(0).b();
            Logger.b("Only one a2dp device connected, matching route.", new Object[0]);
            return b2;
        }
        if (gea.b() != null) {
            Iterator<T> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                T t3 = t2;
                if (t3.a() == null || !h.a(t3.a(), gea.b())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            T t4 = t2;
            if (t4 != null) {
                Logger.b("Found matching connected BT address, matching route.", new Object[0]);
                return t4.b();
            }
        }
        Iterator<T> it2 = b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (t.c()) {
                break;
            }
        }
        T t5 = t;
        if (t5 != null) {
            Logger.b("Found BT device with isA2dpPlaying, matching route.", new Object[0]);
            return t5.b();
        }
        Logger.b("Failed to find a better device name for %s", gea);
        return null;
    }
}
