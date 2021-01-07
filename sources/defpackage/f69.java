package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.BansResponse;
import io.reactivex.functions.l;

/* renamed from: f69  reason: default package */
public final /* synthetic */ class f69 implements l {
    public static final /* synthetic */ f69 a = new f69();

    private /* synthetic */ f69() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(!((BansResponse) obj).getArtists().isEmpty());
    }
}
