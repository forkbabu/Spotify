package defpackage;

import com.spotify.cosmos.playback.PlaybackClient;
import com.spotify.music.ads.voice.domain.r;
import io.reactivex.functions.l;

/* renamed from: pc2  reason: default package */
public final /* synthetic */ class pc2 implements l {
    public final /* synthetic */ PlaybackClient a;

    public /* synthetic */ pc2(PlaybackClient playbackClient) {
        this.a = playbackClient;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.position(((r.c) obj).a()).j0(lc2.a);
    }
}
