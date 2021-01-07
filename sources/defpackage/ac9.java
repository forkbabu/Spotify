package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.functions.l;

/* renamed from: ac9  reason: default package */
public final /* synthetic */ class ac9 implements l {
    public static final /* synthetic */ ac9 a = new ac9();

    private /* synthetic */ ac9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Integer.valueOf(((SongsMetadataFromTracks) obj).length());
    }
}
