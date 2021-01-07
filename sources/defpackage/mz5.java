package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.uy5;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: mz5  reason: default package */
public class mz5 {
    private final List<uy5.a> a;

    public mz5(List<uy5.a> list) {
        h.e(list, "loggers");
        this.a = list;
    }

    private final uy5.a a(String str) {
        T t;
        Iterator<T> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.d(str)) {
                break;
            }
        }
        return t;
    }

    public final void b(String str, String str2, String str3) {
        je.x(str, "mode", str2, "deviceId", str3, AppProtocol.TrackData.TYPE_TRACK);
        uy5.a a2 = a(str);
        if (!(a2 instanceof yz5)) {
            a2 = null;
        }
        yz5 yz5 = (yz5) a2;
        if (yz5 != null) {
            yz5.e(str2, str3);
        }
    }

    public final void c(String str, String str2, String str3) {
        je.x(str, "mode", str2, "deviceId", str3, AppProtocol.TrackData.TYPE_TRACK);
        uy5.a a2 = a(str);
        if (!(a2 instanceof yz5)) {
            a2 = null;
        }
        yz5 yz5 = (yz5) a2;
        if (yz5 != null) {
            yz5.g(str2, str3);
        }
    }

    public final void d(String str, String str2, String str3) {
        je.x(str, "mode", str2, "deviceId", str3, AppProtocol.TrackData.TYPE_TRACK);
        uy5.a a2 = a(str);
        if (!(a2 instanceof zz5)) {
            a2 = null;
        }
        zz5 zz5 = (zz5) a2;
        if (zz5 != null) {
            zz5.a(str2, str3);
        }
    }

    public final void e(String str, String str2, String str3) {
        je.x(str, "mode", str2, "deviceId", str3, AppProtocol.TrackData.TYPE_TRACK);
        uy5.a a2 = a(str);
        if (!(a2 instanceof zz5)) {
            a2 = null;
        }
        zz5 zz5 = (zz5) a2;
        if (zz5 != null) {
            zz5.f(str2, str3);
        }
    }

    public final void f(String str, String str2, String str3) {
        je.x(str, "mode", str2, "deviceId", str3, AppProtocol.TrackData.TYPE_TRACK);
        uy5.a a2 = a(str);
        if (!(a2 instanceof a06)) {
            a2 = null;
        }
        a06 a06 = (a06) a2;
        if (a06 != null) {
            a06.b(str2, str3);
        }
    }

    public final void g(String str, String str2, String str3) {
        je.x(str, "mode", str2, "deviceId", str3, AppProtocol.TrackData.TYPE_TRACK);
        uy5.a a2 = a(str);
        if (!(a2 instanceof b06)) {
            a2 = null;
        }
        b06 b06 = (b06) a2;
        if (b06 != null) {
            b06.c(str2, str3);
        }
    }
}
