package defpackage;

import io.reactivex.functions.l;
import okhttp3.c0;

/* renamed from: fhf  reason: default package */
public final /* synthetic */ class fhf implements l {
    public final /* synthetic */ mhf a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ fhf(mhf mhf, boolean z) {
        this.a = mhf;
        this.b = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (c0) obj);
    }
}
