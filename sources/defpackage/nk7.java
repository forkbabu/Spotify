package defpackage;

import com.google.common.base.Function;
import com.spotify.music.features.profile.proto.ArtistlistResponse$Artist;

/* renamed from: nk7  reason: default package */
public final /* synthetic */ class nk7 implements Function {
    public final /* synthetic */ il7 a;

    public /* synthetic */ nk7(il7 il7) {
        this.a = il7;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        il7 il7 = this.a;
        ArtistlistResponse$Artist artistlistResponse$Artist = (ArtistlistResponse$Artist) obj;
        il7.getClass();
        artistlistResponse$Artist.getClass();
        return il7.b(artistlistResponse$Artist);
    }
}
