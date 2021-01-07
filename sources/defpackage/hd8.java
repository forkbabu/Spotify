package defpackage;

import com.google.common.base.Function;

/* renamed from: hd8  reason: default package */
public final /* synthetic */ class hd8 implements Function {
    public final /* synthetic */ String a;

    public /* synthetic */ hd8(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        String str = this.a;
        oxa oxa = new oxa();
        oxa.b((String) obj, str);
        return oxa.a();
    }
}
