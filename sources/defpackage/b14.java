package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: b14  reason: default package */
public final class b14 implements fjf<a14> {
    private final wlf<HubsGlueImageDelegate> a;

    public b14(wlf<HubsGlueImageDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a14(this.a.get());
    }
}
