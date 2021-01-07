package defpackage;

import android.app.Activity;
import com.google.android.gms.common.d;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.l;
import defpackage.je0;

/* renamed from: jbe  reason: default package */
public final class jbe implements fjf<f> {
    private final wlf<Activity> a;

    public jbe(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), d.f(), new l(je0.g.b));
    }
}
