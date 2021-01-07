package defpackage;

import com.spotify.music.follow.m;
import defpackage.kef;
import io.reactivex.functions.a;

/* renamed from: rbf  reason: default package */
public final /* synthetic */ class rbf implements a {
    public final /* synthetic */ m a;
    public final /* synthetic */ kef.c b;

    public /* synthetic */ rbf(m mVar, kef.c cVar) {
        this.a = mVar;
        this.b = cVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e(this.b.t(), true);
    }
}
