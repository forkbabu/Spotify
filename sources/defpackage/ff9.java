package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.functions.g;

/* renamed from: ff9  reason: default package */
public final /* synthetic */ class ff9 implements g {
    public final /* synthetic */ jf9 a;

    public /* synthetic */ ff9(jf9 jf9) {
        this.a = jf9;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((SongsMetadataFromTracks) obj);
    }
}
