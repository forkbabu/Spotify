package defpackage;

import com.spotify.cosmos.playback.PlaybackClient;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: oc2  reason: default package */
public final /* synthetic */ class oc2 implements w {
    public final /* synthetic */ PlaybackClient a;

    public /* synthetic */ oc2(PlaybackClient playbackClient) {
        this.a = playbackClient;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new pc2(this.a));
    }
}
