package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.features.freetierartist.ArtistReleasesFragment;

/* renamed from: c65  reason: default package */
public final class c65 implements fjf<e61> {
    private final wlf<ArtistReleasesFragment> a;
    private final wlf<m> b;
    private final wlf<Activity> c;
    private final wlf<tk9> d;

    public c65(wlf<ArtistReleasesFragment> wlf, wlf<m> wlf2, wlf<Activity> wlf3, wlf<tk9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        m mVar = this.b.get();
        return new f75(this.c.get(), mVar, this.a.get(), this.d.get());
    }
}
