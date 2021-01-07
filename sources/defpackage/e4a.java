package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.AndroidLibsCarDetectionProperties;

/* renamed from: e4a  reason: default package */
public class e4a implements d {
    private final g4a a;
    private final wlf<AndroidLibsCarDetectionProperties> b;

    e4a(g4a g4a, wlf<AndroidLibsCarDetectionProperties> wlf) {
        this.a = g4a;
        this.b = wlf;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.a(this.b.get().a() == AndroidLibsCarDetectionProperties.CarDetectionIsEnabled.FORCED);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "CarDetectionRemoteConfig";
    }
}
