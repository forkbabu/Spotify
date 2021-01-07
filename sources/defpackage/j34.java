package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.restrictedcontent.transformer.h;
import defpackage.b91;
import defpackage.s81;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: j34  reason: default package */
public class j34 {
    private final y a;
    private final ch3 b;
    private final h c;
    private b d = EmptyDisposable.INSTANCE;
    private p34 e;
    private final String f;
    private final sg0<b91, b91> g;

    public j34(y yVar, String str, sg0<b91, b91> sg0, ch3 ch3, h hVar) {
        this.a = yVar;
        this.f = str;
        this.g = sg0;
        this.b = ch3;
        this.c = hVar;
    }

    public static b91 a(j34 j34, b91 b91) {
        j34.getClass();
        s81.a y = z81.c().y(z81.h().a(j34.f));
        b91.a m = b91.toBuilder().m(j34.f);
        m.getClass();
        kotlin.jvm.internal.h.e(y, "headerBuilder");
        return m.j(y.l()).g();
    }

    public static void b(j34 j34, Throwable th) {
        j34.getClass();
        Logger.e(th, "Error fetching Assisted Curation search results!", new Object[0]);
        j34.e.b();
    }

    public static b91 c(j34 j34, b91 b91) {
        j34.getClass();
        try {
            return j34.g.apply(b91);
        } catch (Exception e2) {
            Assertion.i("Error while mapping hubs commands in assisted curation", e2);
            return b91;
        }
    }

    public void d(s<b91> sVar, p34 p34) {
        p34.getClass();
        this.e = p34;
        g<R> Q = sVar.j0(new f34(this)).j0(new h34(this)).q(this.b).Y0(BackpressureStrategy.LATEST).l(this.c).Q(this.a);
        p34 p342 = this.e;
        p342.getClass();
        this.d = Q.subscribe(new i34(p342), new g34(this));
    }

    public void e() {
        this.d.dispose();
        this.e = null;
    }
}
