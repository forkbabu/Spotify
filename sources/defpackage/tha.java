package defpackage;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import com.spotify.mobile.android.service.media.w2;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: tha  reason: default package */
public final class tha implements fjf<rha> {
    private final wlf<g<PlayerState>> a;
    private final wlf<pc1> b;
    private final wlf<pea> c;
    private final wlf<SensorRecorder> d;
    private final wlf<w2> e;
    private final wlf<s<HeadsetPluggedStatus>> f;
    private final wlf<y> g;

    public tha(wlf<g<PlayerState>> wlf, wlf<pc1> wlf2, wlf<pea> wlf3, wlf<SensorRecorder> wlf4, wlf<w2> wlf5, wlf<s<HeadsetPluggedStatus>> wlf6, wlf<y> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rha(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
