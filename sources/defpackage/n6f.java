package defpackage;

import com.spotify.player.options.d;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: n6f  reason: default package */
public final /* synthetic */ class n6f implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ q7f b;

    public /* synthetic */ n6f(d dVar, q7f q7f) {
        this.a = dVar;
        this.b = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(((p2f.x) obj).a()).E(j5f.a).t(new a4f(this.b));
    }
}
