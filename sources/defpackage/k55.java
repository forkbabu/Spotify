package defpackage;

import android.content.Context;
import com.spotify.android.flags.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.freetierartist.ArtistFragment;
import defpackage.of3;

/* renamed from: k55  reason: default package */
public final class k55 implements fjf<of3> {
    private final wlf<c> a;
    private final wlf<Context> b;
    private final wlf<Boolean> c;
    private final wlf<tka> d;
    private final wlf<ArtistFragment> e;

    public k55(wlf<c> wlf, wlf<Context> wlf2, wlf<Boolean> wlf3, wlf<tka> wlf4, wlf<ArtistFragment> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        this.a.get();
        boolean booleanValue = this.c.get().booleanValue();
        of3.a a2 = of3.a();
        this.e.get().getClass();
        a2.a(this.b.get().getString(C0707R.string.artist_default_title));
        a2.f(SpotifyIconV2.ARTIST);
        a2.i(true);
        a2.c(true);
        a2.l(booleanValue);
        a2.g(true);
        a2.e(this.d.get().a());
        return a2.build();
    }
}
