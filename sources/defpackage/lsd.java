package defpackage;

import com.spotify.packagevalidator.denylist.cache.db.DenylistDatabase;
import com.spotify.packagevalidator.denylist.cache.db.b;

/* renamed from: lsd  reason: default package */
public final class lsd implements fjf<b> {
    private final wlf<DenylistDatabase> a;

    public lsd(wlf<DenylistDatabase> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        b t = this.a.get().t();
        yif.g(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }
}
