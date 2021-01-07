package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.functions.l;

/* renamed from: df9  reason: default package */
public final /* synthetic */ class df9 implements l {
    public static final /* synthetic */ df9 a = new df9();

    private /* synthetic */ df9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SongsMetadataFromTracks) obj).length() > 0);
    }
}
