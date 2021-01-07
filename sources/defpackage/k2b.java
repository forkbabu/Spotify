package defpackage;

import io.reactivex.h;
import io.reactivex.i;

/* renamed from: k2b  reason: default package */
public final /* synthetic */ class k2b implements i {
    public final /* synthetic */ i4b a;
    public final /* synthetic */ i3b b;
    public final /* synthetic */ i5b c;

    public /* synthetic */ k2b(i4b i4b, i3b i3b, i5b i5b) {
        this.a = i4b;
        this.b = i3b;
        this.c = i5b;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        i4b i4b = this.a;
        i3b i3b = this.b;
        i5b i5b = this.c;
        i4b.getClass();
        i5b.i(new l2b(i4b, i3b, hVar));
        hVar.e(new j2b(i5b));
    }
}
