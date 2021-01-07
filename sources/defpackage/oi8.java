package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import defpackage.wi8;
import io.reactivex.functions.g;

/* renamed from: oi8  reason: default package */
public final /* synthetic */ class oi8 implements g {
    public final /* synthetic */ t a;
    public final /* synthetic */ li8 b;

    public /* synthetic */ oi8(t tVar, li8 li8) {
        this.a = tVar;
        this.b = li8;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        t tVar = this.a;
        li8 li8 = this.b;
        wi8.c cVar = (wi8.c) obj;
        c cVar2 = ViewUris.i1;
        tVar.d(cVar2.toString());
        li8.b(cVar2.toString());
    }
}
