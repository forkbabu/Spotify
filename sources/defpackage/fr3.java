package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: fr3  reason: default package */
public class fr3 implements d {
    private final wt3 a;

    public fr3(wt3 wt3) {
        this.a = wt3;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.f();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SponsorshipTimeHelperPlugin";
    }
}
