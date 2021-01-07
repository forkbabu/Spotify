package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import com.spotify.playlist.models.offline.a;
import io.reactivex.functions.n;

/* renamed from: mc9  reason: default package */
public final /* synthetic */ class mc9 implements n {
    public static final /* synthetic */ mc9 a = new mc9();

    private /* synthetic */ mc9() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        a offlineState = ((SongsMetadataFromTracks) obj).offlineState();
        offlineState.getClass();
        return !(offlineState instanceof a.b);
    }
}
