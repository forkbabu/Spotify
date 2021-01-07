package defpackage;

import com.google.common.base.Function;

/* renamed from: y7b  reason: default package */
public final /* synthetic */ class y7b implements Function {
    public static final /* synthetic */ y7b a = new y7b();

    private /* synthetic */ y7b() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        s81 s81 = (s81) obj;
        int i = g8b.a;
        String str = null;
        if (s81 == null) {
            return null;
        }
        a91 target = s81.target();
        if (target != null) {
            str = target.uri();
        }
        return str != null ? str : s81.custom().string("trackUri");
    }
}
