package defpackage;

import com.spotify.mobile.android.util.ui.d;
import com.spotify.mobile.android.util.ui.e;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: grb  reason: default package */
public class grb {
    private final g<Integer> a;
    private final d b;
    private final p c = new p();
    private boolean d;
    private fqd e;

    public grb(g<Integer> gVar, e eVar) {
        this.a = gVar;
        this.b = eVar.c(new frb(this));
    }

    public static void a(grb grb, int i) {
        if (grb.d) {
            grb.d = false;
            grb.b.b(i);
            return;
        }
        grb.b.c(i);
    }

    public static void b(grb grb, int i) {
        fqd fqd = grb.e;
        if (fqd != null) {
            fqd.setColor(i);
        }
    }

    public void c() {
        this.c.a();
        this.e = null;
    }

    public void d(fqd fqd) {
        fqd.getClass();
        this.e = fqd;
        this.d = true;
        this.c.b(this.a.subscribe(new erb(this)));
    }
}
