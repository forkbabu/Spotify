package defpackage;

import android.app.Activity;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;

/* renamed from: pt2  reason: default package */
public final class pt2 implements fjf<c> {
    private final wlf<Activity> a;

    public pt2(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c b = d.b(this.a.get());
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
