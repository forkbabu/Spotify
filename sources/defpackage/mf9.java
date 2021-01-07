package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import com.spotify.music.settings.a;
import io.reactivex.s;

/* renamed from: mf9  reason: default package */
public class mf9 implements lf9 {
    private final oh0 a;
    private final a b;

    public mf9(oh0 oh0, a aVar) {
        this.a = oh0;
        this.b = aVar;
    }

    @Override // defpackage.lf9
    public s<SongsMetadataFromTracks> a(boolean z) {
        s<R> j0 = this.b.a().j0(bf9.a).j0(new gf9(z));
        oh0 oh0 = this.a;
        oh0.getClass();
        return j0.J0(new if9(oh0)).j0(hf9.a);
    }
}
