package defpackage;

import com.spotify.music.features.ads.model.AdBreakState;
import io.reactivex.functions.n;

/* renamed from: nr3  reason: default package */
public final /* synthetic */ class nr3 implements n {
    public static final /* synthetic */ nr3 a = new nr3();

    private /* synthetic */ nr3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((u3) obj).b == AdBreakState.IN_PROGRESS;
    }
}
