package defpackage;

import com.spotify.music.playback.api.LocalPlaybackStatus;
import io.reactivex.functions.l;

/* renamed from: fn1  reason: default package */
public final /* synthetic */ class fn1 implements l {
    public static final /* synthetic */ fn1 a = new fn1();

    private /* synthetic */ fn1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? LocalPlaybackStatus.PLAYING : LocalPlaybackStatus.NOT_PLAYING;
    }
}
