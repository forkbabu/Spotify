package defpackage;

import android.media.AudioManager;
import com.spotify.music.features.ads.api.b;

/* renamed from: ev3  reason: default package */
public final class ev3 implements fjf<dv3> {
    private final wlf<b> a;
    private final wlf<AudioManager> b;

    public ev3(wlf<b> wlf, wlf<AudioManager> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dv3(this.a.get(), this.b.get());
    }
}
