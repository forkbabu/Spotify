package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.connectivity.r;
import io.reactivex.z;

/* renamed from: l4e  reason: default package */
public class l4e implements x3e {
    private final o4e a;
    private final j4e b;
    private final y3e c;
    private final a d;
    private final jrd e;

    /* renamed from: l4e$a */
    public static class a {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        public boolean a() {
            return !r.a(this.a).h();
        }
    }

    public l4e(a aVar, o4e o4e, j4e j4e, y3e y3e, jrd jrd) {
        this.d = aVar;
        this.a = o4e;
        this.b = j4e;
        this.c = y3e;
        this.e = jrd;
    }

    @Override // defpackage.x3e
    public z<w3e> a(b4e b4e) {
        boolean a2 = this.c.a();
        z<w3e> p = this.a.a(b4e).p(new g4e(this, b4e));
        return (!a2 || !this.d.a()) ? p : this.b.a(b4e).p(new e4e(this, b4e)).D(new f4e(p));
    }

    public void b(b4e b4e, w3e w3e) {
        Assertion.v("Falling back to local link generation");
        String d2 = b4e.d();
        String b2 = w3e.b();
        if (this.d.a()) {
            this.e.a(d2, b2);
        }
    }

    public void c(b4e b4e, w3e w3e) {
        String d2 = b4e.d();
        String b2 = w3e.b();
        if (this.d.a()) {
            this.e.a(d2, b2);
        }
    }
}
