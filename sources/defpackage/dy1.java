package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import io.reactivex.functions.a;

/* access modifiers changed from: package-private */
/* renamed from: dy1  reason: default package */
public final class dy1 implements a {
    final /* synthetic */ nmf a;

    dy1(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.invoke(PauseState.PAUSED);
    }
}
