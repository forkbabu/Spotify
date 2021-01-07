package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import defpackage.n8d;
import io.reactivex.w;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: w9d  reason: default package */
public final class w9d {
    public static final w9d a = new w9d();

    private w9d() {
    }

    public static final z a(w9d w9d, ConnectManager connectManager, y yVar) {
        z<R> m = connectManager.m(w9d.class.getSimpleName()).j0(r9d.a).Q(s9d.a).j0(t9d.a).j0(u9d.a).N0(1).B0().J((long) CrashReportManager.TIME_WINDOW, TimeUnit.MILLISECONDS, yVar).m(new v9d("Failed getting local device id", new Object[0]));
        h.d(m, "connectManager\n         …etting local device id\"))");
        return m;
    }

    public final w<n8d, o8d> b(w7d w7d, x7d x7d, ConnectManager connectManager, d8d d8d, y yVar) {
        h.e(w7d, "socialConnectEndpoint");
        h.e(x7d, "socialListeningCoreEndpoint");
        h.e(connectManager, "connectManager");
        h.e(d8d, "eventConsumer");
        h.e(yVar, "ioScheduler");
        m f = i.f();
        f.h(n8d.b.class, new b9d(connectManager, yVar, w7d));
        f.h(n8d.c.class, new d9d(connectManager, yVar, w7d));
        f.h(n8d.d.class, new f9d(connectManager, yVar, w7d));
        f.h(n8d.e.class, new h9d(connectManager, yVar, w7d));
        f.h(n8d.a.class, new z8d(connectManager, yVar, w7d));
        f.h(n8d.f.class, new i9d(x7d));
        f.d(n8d.k.class, new n9d(d8d));
        f.d(n8d.j.class, new m9d(d8d));
        f.d(n8d.g.class, new j9d(d8d));
        f.d(n8d.h.class, new k9d(d8d));
        f.d(n8d.i.class, new l9d(d8d));
        return f.i();
    }
}
