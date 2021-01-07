package defpackage;

import com.google.common.base.Function;
import com.spotify.music.features.profile.proto.ArtistlistResponse$Artist;

/* renamed from: iq7  reason: default package */
public final /* synthetic */ class iq7 implements Function {
    public final /* synthetic */ il7 a;

    public /* synthetic */ iq7(il7 il7) {
        this.a = il7;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.b((ArtistlistResponse$Artist) obj);
    }
}
