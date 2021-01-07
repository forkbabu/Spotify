package defpackage;

import com.spotify.music.features.freetierartist.ArtistFragment;

/* renamed from: j55  reason: default package */
public final class j55 implements fjf<String> {
    private final wlf<ArtistFragment> a;

    public j55(wlf<ArtistFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().k4().getString("artist_view_uri");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
