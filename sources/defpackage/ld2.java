package defpackage;

import com.spotify.music.ads.voice.domain.EarconType;
import com.spotify.music.ads.voice.domain.s;
import java.util.concurrent.Callable;

/* renamed from: ld2  reason: default package */
public final /* synthetic */ class ld2 implements Callable {
    public final /* synthetic */ EarconType a;

    public /* synthetic */ ld2(EarconType earconType) {
        this.a = earconType;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return s.d(this.a);
    }
}
