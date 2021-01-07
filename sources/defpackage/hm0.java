package defpackage;

import android.app.Activity;
import com.spotify.termsandconditions.l;

/* renamed from: hm0  reason: default package */
public final class hm0 implements fjf<l> {
    private final wlf<Activity> a;

    public hm0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get());
    }
}
