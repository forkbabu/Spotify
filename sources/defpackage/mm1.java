package defpackage;

import com.spotify.music.playback.api.RemotePlaybackStatus;
import io.reactivex.functions.l;

/* renamed from: mm1  reason: default package */
public final /* synthetic */ class mm1 implements l {
    public static final /* synthetic */ mm1 a = new mm1();

    private /* synthetic */ mm1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? RemotePlaybackStatus.PLAYING : RemotePlaybackStatus.NOT_PLAYING;
    }
}
