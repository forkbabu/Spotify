package defpackage;

import com.spotify.mobile.android.util.ui.d;
import com.spotify.mobile.android.util.ui.e;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: qlb  reason: default package */
public class qlb {
    private final g<Integer> a;
    private final d b;
    private final p c = new p();
    private boolean d;
    private fqd e;

    public qlb(g<Integer> gVar, e eVar) {
        this.a = gVar.O(olb.a);
        this.b = eVar.b(0, 500, new plb(this));
    }

    public static void a(qlb qlb, int i) {
        if (qlb.d) {
            qlb.d = false;
            qlb.b.b(i);
            return;
        }
        qlb.b.c(i);
    }

    public static void b(qlb qlb, int i) {
        fqd fqd = qlb.e;
        if (fqd != null) {
            fqd.setColor(i);
        }
    }

    public void c() {
        this.c.a();
        this.e = null;
    }

    public void d(fqd fqd) {
        if (this.e == null) {
            fqd.getClass();
            this.e = fqd;
            this.d = true;
            this.c.b(this.a.subscribe(new nlb(this)));
            return;
        }
        throw new IllegalStateException("There's already a widget attached to this controller. Make sure you use a unique WidgetColorTransitionController per widget or don't call `setColorSetter` again before `removeColorSetter`.");
    }
}
