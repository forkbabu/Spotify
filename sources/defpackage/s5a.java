package defpackage;

import com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger;
import com.spotify.music.libs.carmodeengine.settings.p;
import com.spotify.ubi.specification.factories.r3;

/* renamed from: s5a  reason: default package */
public final class s5a implements fjf<CarModeUserSettingsLogger> {
    private final wlf<ere> a;

    public s5a(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), new r3());
    }
}
