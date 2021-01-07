package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: d14  reason: default package */
public final class d14 implements fjf<c14> {
    private final wlf<HubsGlueImageDelegate> a;

    public d14(wlf<HubsGlueImageDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c14(this.a.get());
    }
}
