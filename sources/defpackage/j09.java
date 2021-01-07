package defpackage;

import android.view.ViewGroup;
import com.spotify.music.features.yourepisodes.domain.a;
import com.spotify.music.features.yourepisodes.domain.c;
import com.spotify.music.features.yourepisodes.domain.e;
import com.squareup.picasso.Picasso;
import defpackage.onc;
import kotlin.jvm.internal.h;

/* renamed from: j09  reason: default package */
public final class j09 extends i09 {
    private e.a c = e.a.e;
    private a[] f = new a[0];
    private final Picasso n;
    private final ngc o;
    private final etc p;

    public j09(Picasso picasso, ngc ngc, etc etc) {
        h.e(picasso, "picasso");
        h.e(ngc, "actionCardViewBinder");
        h.e(etc, "cardStateLogic");
        this.n = picasso;
        this.o = ngc;
        this.p = etc;
        e.a aVar = e.a.f;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(n09 n09, int i) {
        n09 n092 = n09;
        h.e(n092, "viewHolder");
        if (!this.c.b().i(i)) {
            n092.m0();
            return;
        }
        int d = i - this.c.b().d();
        a[] aVarArr = this.f;
        n092.h0(aVarArr[d], aVarArr);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public n09 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        Picasso picasso = this.n;
        ngc ngc = this.o;
        h.e(viewGroup, "root");
        h.e(picasso, "picasso");
        h.e(ngc, "cardBinder");
        uoc b = voc.b(viewGroup.getContext(), viewGroup, picasso);
        h.d(b, "cardView");
        return new o09(b, ngc);
    }

    @Override // defpackage.i09
    public void X(e.a aVar) {
        h.e(aVar, "value");
        this.c = aVar;
        Object[] array = aVar.d().toArray(new a[0]);
        if (array != null) {
            this.f = (a[]) array;
            z();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // defpackage.i09
    public void Y(c cVar) {
        dtc dtc;
        h.e(cVar, "playerState");
        onc a = cVar.a();
        etc etc = this.p;
        a.getClass();
        if ((a instanceof onc.b) || (a instanceof onc.a)) {
            dtc = new dtc(null, null, null, null, false, 0, 63);
        } else {
            onc.c cVar2 = (onc.c) a;
            dtc = new dtc(cVar2.d(), cVar2.b(), cVar2.c(), cVar2.a(), cVar2.f(), cVar2.e());
        }
        etc.d(dtc);
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.e();
    }
}
