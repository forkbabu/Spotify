package defpackage;

import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;

/* renamed from: a1d  reason: default package */
public class a1d {
    private final q0d a;
    private final c1d b;

    public a1d(c1d c1d, q0d q0d) {
        this.b = c1d;
        this.a = q0d;
    }

    public void a(pzc pzc, z7e z7e, u0d u0d, t0d t0d, long j) {
        z7e.e(j);
        ContextMenuFragment a2 = this.a.a(this.b.a(u0d, z7e), pzc.k().g());
        if (a2 != null) {
            t0d.d(a2);
        }
    }
}
