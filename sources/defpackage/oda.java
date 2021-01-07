package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.libs.connect.volume.c;
import com.spotify.libs.connect.volume.controllers.p;
import com.spotify.libs.connect.volume.l;
import com.spotify.rxjava2.q;
import io.reactivex.internal.operators.observable.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: oda  reason: default package */
public class oda {
    private final p a;
    private final c b;
    private final l c;
    private final mda d;
    private final h e;
    private final y f;
    private final com.spotify.rxjava2.p g = new com.spotify.rxjava2.p();
    private final q h = new q();

    public oda(p pVar, c cVar, l lVar, mda mda, h hVar, y yVar) {
        this.a = pVar;
        this.b = cVar;
        this.c = lVar;
        this.d = mda;
        this.e = hVar;
        this.f = yVar;
    }

    public static void a(oda oda, Float f2) {
        if (oda.d.a()) {
            oda.a.g(f2);
        }
    }

    public static void b(oda oda, Float f2) {
        if (oda.d.a()) {
            oda.b.b(f2.floatValue(), hda.a);
        }
    }

    public void c(Optional optional) {
        if (!optional.isPresent()) {
            Logger.b("M2M No active device", new Object[0]);
            this.h.c();
        } else if (((GaiaDevice) optional.get()).isSelf()) {
            Logger.b("M2M Local is active", new Object[0]);
            q qVar = this.h;
            s<Float> a2 = this.c.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            y yVar = this.f;
            a2.getClass();
            qVar.a(new g(a2, s.X0(500, timeUnit, yVar)).N(ida.a).subscribe(new gda(this)));
            this.h.a(this.a.a().subscribe(new kda(this)));
        } else {
            Logger.b("M2M Local is not active", new Object[0]);
            this.h.c();
        }
    }

    public void d() {
        float f2 = this.a.f();
        Logger.b("M2M volume initiated to %.2f", Float.valueOf(f2));
        this.b.b(f2, jda.a);
        this.g.b(this.e.a().subscribe(new lda(this)));
    }

    public void e() {
        this.g.a();
        this.h.c();
    }
}
