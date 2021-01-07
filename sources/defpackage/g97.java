package defpackage;

import defpackage.k97;
import io.reactivex.functions.l;

/* renamed from: g97  reason: default package */
public final /* synthetic */ class g97 implements l {
    public final /* synthetic */ k97 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ g97(k97 k97, String str, long j) {
        this.a = k97;
        this.b = str;
        this.c = j;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, this.c, (k97.a) obj);
    }
}
