package defpackage;

import io.reactivex.functions.l;

/* renamed from: qs7  reason: default package */
public final /* synthetic */ class qs7 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ qs7(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.equals((String) obj));
    }
}
