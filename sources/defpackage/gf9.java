package defpackage;

import io.reactivex.functions.l;

/* renamed from: gf9  reason: default package */
public final /* synthetic */ class gf9 implements l {
    public final /* synthetic */ boolean a;

    public /* synthetic */ gf9(boolean z) {
        this.a = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean z = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = booleanValue ? null : bool;
        if (!z) {
            bool = null;
        }
        return new ph0(bool2, bool, 500);
    }
}
