package defpackage;

import com.spotify.superbird.ota.model.f;
import defpackage.noe;
import io.reactivex.functions.g;
import io.reactivex.x;

/* renamed from: toe  reason: default package */
public final /* synthetic */ class toe implements g {
    public final /* synthetic */ x a;

    public /* synthetic */ toe(x xVar) {
        this.a = xVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        noe.c cVar = (noe.c) obj;
        this.a.onNext(f.a("download_success", cVar.b(), cVar.d(), cVar.a(), cVar.c()));
    }
}
