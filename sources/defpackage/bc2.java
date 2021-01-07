package defpackage;

import com.spotify.music.ads.voice.domain.EarconType;
import com.spotify.music.ads.voice.domain.s;
import io.reactivex.functions.l;

/* renamed from: bc2  reason: default package */
public final /* synthetic */ class bc2 implements l {
    public static final /* synthetic */ bc2 a = new bc2();

    private /* synthetic */ bc2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return s.d(EarconType.valueOf(((Throwable) obj).getMessage()));
    }
}
