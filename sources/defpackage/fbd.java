package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import com.spotify.music.container.app.foregroundstate.d;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.sociallistening.models.b;
import com.spotify.rxjava2.p;
import defpackage.rbd;
import defpackage.tbd;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.internal.operators.observable.z;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: fbd  reason: default package */
public class fbd implements xad {
    private final Context a;
    private final f4d b;
    private final t7d c;
    private final y d;
    private final d e;
    private final NotificationManager f;
    private final SnackbarManager g;
    private final qcd h;
    private final cfd i;
    private final p j = new p();

    public fbd(Context context, f4d f4d, t7d t7d, y yVar, d dVar, NotificationManager notificationManager, SnackbarManager snackbarManager, qcd qcd, cfd cfd) {
        this.a = context;
        this.b = f4d;
        this.c = t7d;
        this.d = yVar;
        this.e = dVar;
        this.f = notificationManager;
        this.g = snackbarManager;
        this.h = qcd;
        this.i = cfd;
    }

    public /* synthetic */ ia2 a() {
        return new o(this.d);
    }

    public v b() {
        s<Object> sVar = e0.a;
        yad yad = yad.a;
        Context context = this.a;
        qcd qcd = this.h;
        SnackbarManager snackbarManager = this.g;
        NotificationManager notificationManager = this.f;
        d dVar = this.e;
        y yVar = this.d;
        f4d f4d = this.b;
        t7d t7d = this.c;
        m f2 = i.f();
        f2.d(rbd.i.class, new icd(qcd));
        f2.d(rbd.j.class, new ccd(qcd));
        f2.h(rbd.a.class, new fcd(snackbarManager, context));
        f2.h(rbd.g.class, new mcd(snackbarManager, context));
        f2.h(rbd.c.class, new acd(context, snackbarManager));
        f2.d(rbd.b.class, new ncd(dVar, t7d, context, notificationManager));
        f2.h(rbd.h.class, new zbd(context, snackbarManager, yVar));
        f2.h(rbd.f.class, new lcd(context, snackbarManager, yVar));
        f2.h(rbd.d.class, new wbd(snackbarManager, context));
        f2.h(rbd.k.class, new dcd(dVar, t7d));
        f2.h(rbd.l.class, new ecd(dVar, t7d));
        f2.d(rbd.e.class, new jcd(f4d));
        MobiusLoop.f b2 = i.c(yad, f2.i()).e(dbd.a).h(i.a(this.b.a().j0(ebd.a))).b(new cbd(this));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        DebugFlag debugFlag2 = DebugFlag.SOCIAL_LISTENING_EDUCATION;
        boolean a2 = this.h.a(false);
        boolean b3 = this.h.b(false);
        tbd.a a3 = tbd.a();
        a3.d(b.n);
        a3.b(a2);
        a3.c(b3);
        return sVar.q(i.d(b2, a3.a()));
    }

    @Override // defpackage.xad
    public void start() {
        if (this.i.c()) {
            this.j.b(new z(s.B(new abd(this)).M(bbd.a, Functions.c).M(Functions.f(), zad.a)).subscribe());
        }
    }

    @Override // defpackage.xad
    public void stop() {
        this.j.a();
    }
}
