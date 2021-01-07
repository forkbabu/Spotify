package defpackage;

import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;
import com.spotify.music.artist.dac.ui.binders.ArtistItemComponentBinder;
import com.spotify.music.navigation.t;
import kotlin.jvm.internal.h;

/* renamed from: lj2  reason: default package */
public final class lj2 implements fjf<a<?>> {
    private final wlf<t> a;
    private final wlf<CoverArtView.ViewContext> b;

    public lj2(wlf<t> wlf, wlf<CoverArtView.ViewContext> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        t tVar = this.a.get();
        CoverArtView.ViewContext viewContext = this.b.get();
        h.e(tVar, "navigator");
        h.e(viewContext, "coverArtViewContext");
        return new ArtistItemComponentBinder(tVar, viewContext);
    }
}
