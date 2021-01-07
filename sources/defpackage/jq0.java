package defpackage;

import com.spotify.inappmessaging.k;
import defpackage.fq0;
import io.reactivex.functions.g;

/* renamed from: jq0  reason: default package */
public final /* synthetic */ class jq0 implements g {
    public final /* synthetic */ k a;

    public /* synthetic */ jq0(k kVar) {
        this.a = kVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        fq0.b bVar = (fq0.b) obj;
        this.a.a(new u3<>(bVar.b(), bVar.a()));
    }
}
