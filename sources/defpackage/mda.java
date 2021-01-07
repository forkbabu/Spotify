package defpackage;

import com.spotify.libs.connect.j;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.volume.g;
import com.spotify.rxjava2.q;

/* renamed from: mda  reason: default package */
public class mda {
    private final g a;
    private final j b;
    private boolean c;
    private boolean d;
    private final q e = new q();

    public mda(g gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    public static void b(mda mda, GaiaDevice gaiaDevice) {
        mda.getClass();
        if (gaiaDevice.isSelf()) {
            mda.d = true;
            return;
        }
        mda.d = false;
        mda.c = false;
    }

    public static void c(mda mda, Boolean bool) {
        mda.getClass();
        mda.c = bool.booleanValue();
    }

    public boolean a() {
        return this.d || this.c;
    }

    public void d() {
        this.e.a(this.a.a().subscribe(new fda(this)));
        this.e.a(this.b.p(mda.class.getSimpleName()).subscribe(new eda(this)));
    }

    public void e() {
        this.e.c();
    }
}
