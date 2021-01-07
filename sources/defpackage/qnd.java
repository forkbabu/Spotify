package defpackage;

import io.reactivex.functions.l;
import retrofit2.v;

/* renamed from: qnd  reason: default package */
public final /* synthetic */ class qnd implements l {
    public final /* synthetic */ aod a;
    public final /* synthetic */ String b;

    public /* synthetic */ qnd(aod aod, String str) {
        this.a = aod;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (v) obj);
    }
}
