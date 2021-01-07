package defpackage;

import com.spotify.music.playback.api.LocalPlaybackStatus;
import io.reactivex.functions.g;

/* renamed from: sm1  reason: default package */
public final /* synthetic */ class sm1 implements g {
    public final /* synthetic */ pn1 a;

    public /* synthetic */ sm1(pn1 pn1) {
        this.a = pn1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        pn1.b(this.a, (LocalPlaybackStatus) obj);
    }
}
