package defpackage;

import android.app.Activity;
import com.spotify.termsandconditions.l;

/* renamed from: kbe  reason: default package */
public final class kbe implements fjf<l> {
    private final wlf<Activity> a;

    public kbe(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get());
    }
}
