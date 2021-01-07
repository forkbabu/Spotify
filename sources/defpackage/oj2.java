package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.music.artist.dac.ui.binders.ArtistPageWithHeaderComponentBinder;
import kotlin.jvm.internal.h;

/* renamed from: oj2  reason: default package */
public final class oj2 implements fjf<a<?>> {
    private final wlf<s80> a;

    public oj2(wlf<s80> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        wlf<s80> wlf = this.a;
        h.e(wlf, "dacResolverProvider");
        return new ArtistPageWithHeaderComponentBinder(wlf);
    }
}
