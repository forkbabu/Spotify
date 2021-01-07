package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;
import io.reactivex.functions.g;

/* renamed from: op8  reason: default package */
public final /* synthetic */ class op8 implements g {
    public final /* synthetic */ tp8 a;
    public final /* synthetic */ String b;

    public /* synthetic */ op8(tp8 tp8, String str) {
        this.a = tp8;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g(this.b, (ArtistSearchResponse) obj);
    }
}
