package defpackage;

import io.reactivex.functions.l;

/* renamed from: x95  reason: default package */
public final /* synthetic */ class x95 implements l {
    public final /* synthetic */ aa5 a;
    public final /* synthetic */ String b;

    public /* synthetic */ x95(aa5 aa5, String str) {
        this.a = aa5;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (Boolean) obj);
    }
}
