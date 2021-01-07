package defpackage;

import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;
import defpackage.kef;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: icf  reason: default package */
public final /* synthetic */ class icf implements l {
    public final /* synthetic */ p a;
    public final /* synthetic */ v b;

    public /* synthetic */ icf(p pVar, v vVar) {
        this.a = pVar;
        this.b = vVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.o oVar = (kef.o) obj;
        return this.a.c(Collections.singletonList(oVar.t())).t(new vaf(this.b, oVar)).N();
    }
}
