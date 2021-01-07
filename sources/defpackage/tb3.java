package defpackage;

import com.spotify.mobile.android.util.t;

/* renamed from: tb3  reason: default package */
public final class tb3 implements fjf<String> {
    private final wlf<t> a;

    public tb3(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
