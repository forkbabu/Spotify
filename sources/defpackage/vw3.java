package defpackage;

import com.spotify.music.features.album.offline.model.OfflineState;
import io.reactivex.functions.l;

/* renamed from: vw3  reason: default package */
public final /* synthetic */ class vw3 implements l {
    public static final /* synthetic */ vw3 a = new vw3();

    private /* synthetic */ vw3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((OfflineState) obj).getAlbum().getOfflineState();
    }
}
