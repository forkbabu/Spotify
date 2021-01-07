package defpackage;

import com.spotify.mobile.android.core.internal.AudioRouteChangeDispatcher;

/* renamed from: fea  reason: default package */
public final class fea implements fjf<eea> {
    private final wlf<AudioRouteChangeDispatcher> a;

    public fea(wlf<AudioRouteChangeDispatcher> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eea(this.a.get());
    }
}
