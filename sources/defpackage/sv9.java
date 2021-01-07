package defpackage;

import com.spotify.music.playback.api.LocalPlaybackStatus;
import io.reactivex.functions.g;

/* renamed from: sv9  reason: default package */
public final /* synthetic */ class sv9 implements g {
    public final /* synthetic */ wv9 a;

    public /* synthetic */ sv9(wv9 wv9) {
        this.a = wv9;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((LocalPlaybackStatus) obj);
    }
}
