package defpackage;

import io.reactivex.functions.l;

/* renamed from: af1  reason: default package */
public final /* synthetic */ class af1 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ af1(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.equals((String) obj));
    }
}
