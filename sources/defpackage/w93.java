package defpackage;

import com.spotify.mobile.android.util.t;

/* renamed from: w93  reason: default package */
public final class w93 implements fjf<String> {
    private final wlf<t> a;

    public w93(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String y = this.a.get().y();
        yif.g(y, "Cannot return null from a non-@Nullable @Provides method");
        return y;
    }
}
