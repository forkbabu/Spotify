package defpackage;

import io.reactivex.functions.l;

/* renamed from: qwc  reason: default package */
public final /* synthetic */ class qwc implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ qwc(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.equals((String) obj));
    }
}
