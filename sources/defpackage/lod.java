package defpackage;

import com.google.common.base.Function;

/* renamed from: lod  reason: default package */
public final /* synthetic */ class lod implements Function {
    public final /* synthetic */ mod a;
    public final /* synthetic */ o81 b;

    public /* synthetic */ lod(mod mod, o81 o81) {
        this.a = mod;
        this.b = o81;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.b(this.b, (s81) obj);
    }
}
