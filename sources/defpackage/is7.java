package defpackage;

import com.spotify.music.features.profile.entity.v;
import defpackage.fs7;
import io.reactivex.functions.g;

/* renamed from: is7  reason: default package */
public final /* synthetic */ class is7 implements g {
    public final /* synthetic */ v a;

    public /* synthetic */ is7(v vVar) {
        this.a = vVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        fs7.a aVar = (fs7.a) obj;
        this.a.a(aVar.f(), aVar.c(), aVar.e(), aVar.d(), aVar.b());
    }
}
