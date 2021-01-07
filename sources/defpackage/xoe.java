package defpackage;

import com.spotify.superbird.ota.model.f;
import defpackage.noe;
import io.reactivex.functions.g;
import io.reactivex.x;

/* renamed from: xoe  reason: default package */
public final /* synthetic */ class xoe implements g {
    public final /* synthetic */ x a;

    public /* synthetic */ xoe(x xVar) {
        this.a = xVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        noe.d dVar = (noe.d) obj;
        this.a.onNext(f.a("download_failed", dVar.b(), dVar.d(), dVar.a(), dVar.c()));
    }
}
