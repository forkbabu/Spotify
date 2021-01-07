package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.n;

/* renamed from: f6c  reason: default package */
public final /* synthetic */ class f6c implements n {
    public static final /* synthetic */ f6c a = new f6c();

    private /* synthetic */ f6c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return InterruptionUtil.isInterruptionUri(((ContextTrack) obj).uri());
    }
}
