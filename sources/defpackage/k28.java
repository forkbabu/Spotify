package defpackage;

import android.os.Bundle;
import com.spotify.inappmessaging.display.n;

/* renamed from: k28  reason: default package */
public final class k28 implements fjf<n> {
    private final wlf<s18> a;
    private final wlf<Bundle> b;

    public k28(wlf<s18> wlf, wlf<Bundle> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        n d = this.a.get().d(((fp0) this.b.get().getParcelable("message_extra")).c());
        yif.g(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
