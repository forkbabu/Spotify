package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;
import io.reactivex.functions.g;

/* renamed from: qp8  reason: default package */
public final /* synthetic */ class qp8 implements g {
    public final /* synthetic */ tp8 a;

    public /* synthetic */ qp8(tp8 tp8) {
        this.a = tp8;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i((ArtistSearchResponse) obj);
    }
}
