package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: ev4  reason: default package */
public class ev4 {
    private final cv4 a;
    private final uda b;
    private final wlf<ew4> c;
    private final cw4 d;
    private final y e;
    private ew4 f;
    private final q g = new q();
    private b h = EmptyDisposable.INSTANCE;
    private boolean i;

    ev4(cv4 cv4, uda uda, cw4 cw4, wlf<ew4> wlf, y yVar) {
        cv4.getClass();
        this.a = cv4;
        uda.getClass();
        this.b = uda;
        cw4.getClass();
        this.d = cw4;
        wlf.getClass();
        this.c = wlf;
        yVar.getClass();
        this.e = yVar;
    }

    public static void a(ev4 ev4, jv4 jv4) {
        ew4 ew4 = ev4.f;
        if (ew4 == null) {
            ew4 = ev4.c.get();
            ev4.f = ew4;
        }
        if (ev4.i) {
            ew4.c(jv4.b());
        }
        ev4.i = true;
        if (ev4.h.d()) {
            ev4.d.getClass();
            DebugFlag debugFlag = DebugFlag.DATA_SAVER_MODE_SYNC_WITH_ANDROID;
            s<Object> sVar = o.a;
            uda uda = ev4.b;
            uda.getClass();
            ev4.h = sVar.subscribe(new vu4(uda), bv4.a);
        }
    }

    public void b() {
        this.g.c();
        this.g.a(this.a.b().F(wu4.a).o0(this.e).subscribe(new zu4(this), av4.a));
    }

    public void c() {
        this.g.c();
        this.h.dispose();
        this.i = false;
    }
}
