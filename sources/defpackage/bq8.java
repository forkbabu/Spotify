package defpackage;

import io.reactivex.functions.l;

/* renamed from: bq8  reason: default package */
public final /* synthetic */ class bq8 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ bq8(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.equals((String) obj));
    }
}
