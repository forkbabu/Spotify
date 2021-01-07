package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.music.follow.l;
import io.reactivex.functions.f;

/* renamed from: xs7  reason: default package */
public final /* synthetic */ class xs7 implements f {
    public final /* synthetic */ at7 a;
    public final /* synthetic */ ImmutableSet b;
    public final /* synthetic */ l c;

    public /* synthetic */ xs7(at7 at7, ImmutableSet immutableSet, l lVar) {
        this.a = at7;
        this.b = immutableSet;
        this.c = lVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.c(this.b, this.c);
    }
}
