package defpackage;

import com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto.GetAllPlaylistsResponse;
import io.reactivex.functions.g;

/* renamed from: aga  reason: default package */
public final /* synthetic */ class aga implements g {
    public final /* synthetic */ gga a;

    public /* synthetic */ aga(gga gga) {
        this.a = gga;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((GetAllPlaylistsResponse) obj);
    }
}
