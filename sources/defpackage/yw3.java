package defpackage;

import com.spotify.music.features.album.offline.model.OfflineState;
import io.reactivex.functions.g;

/* renamed from: yw3  reason: default package */
public final /* synthetic */ class yw3 implements g {
    public final /* synthetic */ cy3 a;

    public /* synthetic */ yw3(cy3 cy3) {
        this.a = cy3;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((OfflineState) obj);
    }
}
