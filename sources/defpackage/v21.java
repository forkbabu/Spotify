package defpackage;

import com.spotify.http.u;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: v21  reason: default package */
public final /* synthetic */ class v21 implements w {
    public final /* synthetic */ u a;
    public final /* synthetic */ s b;

    public /* synthetic */ v21(u uVar, s sVar) {
        this.a = uVar;
        this.b = sVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new e31(this.a, this.b), false, Integer.MAX_VALUE);
    }
}
