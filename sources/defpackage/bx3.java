package defpackage;

import com.spotify.music.features.album.offline.model.OfflineState;
import com.spotify.playlist.models.offline.a;
import io.reactivex.functions.n;

/* renamed from: bx3  reason: default package */
public final /* synthetic */ class bx3 implements n {
    public static final /* synthetic */ bx3 a = new bx3();

    private /* synthetic */ bx3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        a offlineState = ((OfflineState) obj).getAlbum().getOfflineState();
        offlineState.getClass();
        return offlineState instanceof a.C0377a;
    }
}
