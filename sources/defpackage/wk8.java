package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.i;
import io.reactivex.g;

/* renamed from: wk8  reason: default package */
public final class wk8 implements fjf<uk8> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<g<SessionState>> c;

    public wk8(wlf<Context> wlf, wlf<i> wlf2, wlf<g<SessionState>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vk8(this.a.get(), this.b.get(), this.c.get());
    }
}
