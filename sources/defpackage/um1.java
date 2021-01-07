package defpackage;

import com.spotify.music.playback.api.RemotePlaybackStatus;
import io.reactivex.functions.g;

/* renamed from: um1  reason: default package */
public final /* synthetic */ class um1 implements g {
    public final /* synthetic */ pn1 a;

    public /* synthetic */ um1(pn1 pn1) {
        this.a = pn1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        pn1.f(this.a, (RemotePlaybackStatus) obj);
    }
}
