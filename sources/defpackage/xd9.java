package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.o;
import com.spotify.music.connection.l;
import com.spotify.music.features.yourlibrary.musicpages.datasource.g5;
import com.spotify.music.features.yourlibrary.musicpages.datasource.w3;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.music.libs.viewuri.c;
import defpackage.fe9;
import defpackage.ie9;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: xd9  reason: default package */
public class xd9 extends g5 {
    private final w3 b;
    private final int c;
    private final n1a d;
    private final CollectionStateProvider e;
    private final c f;
    private final m g;
    private final l h;
    private final y i;
    private final String j;

    public xd9(w3 w3Var, String str, int i2, n1a n1a, CollectionStateProvider collectionStateProvider, c cVar, m mVar, l lVar, y yVar) {
        this.b = w3Var;
        this.j = str;
        this.c = i2;
        this.d = n1a;
        this.e = collectionStateProvider;
        this.f = cVar;
        this.g = mVar;
        this.h = lVar;
        this.i = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.g5
    public s<y3> a() {
        s<Object> sVar = e0.a;
        td9 td9 = td9.a;
        n1a n1a = this.d;
        CollectionStateProvider collectionStateProvider = this.e;
        String cVar = this.f.toString();
        m mVar = this.g;
        com.spotify.mobius.rx2.m f2 = i.f();
        f2.h(fe9.b.class, new te9(n1a));
        f2.h(fe9.a.class, new le9(mVar, cVar, new we9(collectionStateProvider)));
        MobiusLoop.f h2 = i.c(td9, f2.i()).b(new ud9(this)).d(new vd9(this)).h(i.a(this.b.c().j0(new af9(this.c)).E(), this.h.b().E().j0(ze9.a)));
        ie9 ie9 = ie9.a;
        String str = this.j;
        ie9.a i2 = ie9.i();
        i2.c(str);
        ie9 a = i2.a();
        int i3 = this.c;
        ie9.a i4 = a.i();
        i4.e(i3);
        return sVar.q(i.d(h2, i4.a())).j0(wd9.a).E().j0(sd9.a);
    }

    public /* synthetic */ ia2 f() {
        return new o(this.i);
    }

    public /* synthetic */ ia2 g() {
        return new o(this.i);
    }
}
