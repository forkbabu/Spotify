package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.functions.l;

/* renamed from: hf9  reason: default package */
public final /* synthetic */ class hf9 implements l {
    public static final /* synthetic */ hf9 a = new hf9();

    private /* synthetic */ hf9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        vh0 vh0 = (vh0) obj;
        SongsMetadataFromTracks.a builder = SongsMetadataFromTracks.builder();
        builder.d(vh0.b());
        builder.b(false);
        builder.c(vh0.a());
        return builder.a();
    }
}
