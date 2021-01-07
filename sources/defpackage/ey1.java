package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import io.reactivex.functions.a;

/* access modifiers changed from: package-private */
/* renamed from: ey1  reason: default package */
public final class ey1 implements a {
    final /* synthetic */ nmf a;

    ey1(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.invoke(PauseState.RESUMED);
    }
}
