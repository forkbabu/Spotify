package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.a0;
import com.spotify.mobile.android.util.k0;
import com.spotify.mobile.android.util.m0;
import defpackage.ov9;

/* renamed from: gv9  reason: default package */
public final class gv9 {
    private final k0 a;
    private final ov9.a b;

    gv9(k0 k0Var, ov9.a aVar) {
        this.a = k0Var;
        this.b = aVar;
    }

    public void a() {
        Assertion.x(this.b.d() ? new m0() : new a0(this.a));
    }
}
