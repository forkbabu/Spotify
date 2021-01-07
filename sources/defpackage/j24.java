package defpackage;

import com.spotify.mobile.android.hubframework.defaults.playback.ExplicitPlaybackCommandHelper;
import com.spotify.music.features.assistedcuration.search.utils.RestrictedPlaybackCommandHelper;
import com.spotify.music.preview.v;

/* renamed from: j24  reason: default package */
public final class j24 implements fjf<i24> {
    private final wlf<c8b> a;
    private final wlf<v> b;
    private final wlf<ExplicitPlaybackCommandHelper> c;
    private final wlf<RestrictedPlaybackCommandHelper> d;

    public j24(wlf<c8b> wlf, wlf<v> wlf2, wlf<ExplicitPlaybackCommandHelper> wlf3, wlf<RestrictedPlaybackCommandHelper> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i24(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
