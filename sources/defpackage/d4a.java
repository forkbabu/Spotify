package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobius.MobiusLoop;
import com.spotify.remoteconfig.AndroidLibsCarDetectionProperties;

/* renamed from: d4a  reason: default package */
public class d4a implements b {
    public static final /* synthetic */ int c = 0;
    private final AndroidLibsCarDetectionProperties a;
    MobiusLoop.g<w4a, v4a> b;

    public d4a(b4a b4a, AndroidLibsCarDetectionProperties androidLibsCarDetectionProperties) {
        this.a = androidLibsCarDetectionProperties;
        if (b()) {
            this.b = b4a.a(w4a.a);
        }
    }

    private boolean b() {
        return this.a.a() == AndroidLibsCarDetectionProperties.CarDetectionIsEnabled.ENABLED || this.a.a() == AndroidLibsCarDetectionProperties.CarDetectionIsEnabled.FORCED;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        MobiusLoop.g<w4a, v4a> gVar;
        if (b() && (gVar = this.b) != null) {
            gVar.c(v3a.a);
            this.b.start();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        MobiusLoop.g<w4a, v4a> gVar;
        if (b() && (gVar = this.b) != null) {
            gVar.stop();
            this.b.d();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "CarDetection";
    }
}
