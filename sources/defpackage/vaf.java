package defpackage;

import com.spotify.playlist.endpoints.v;
import defpackage.kef;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;
import java.util.List;

/* renamed from: vaf  reason: default package */
public final /* synthetic */ class vaf implements l {
    public final /* synthetic */ v a;
    public final /* synthetic */ kef.o b;

    public /* synthetic */ vaf(v vVar, kef.o oVar) {
        this.a = vVar;
        this.b = oVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        v vVar = this.a;
        kef.o oVar = this.b;
        List list = (List) obj;
        if (list.size() != 1 || !((Boolean) list.get(0)).booleanValue()) {
            return vVar.c(oVar.t());
        }
        return b.a;
    }
}
