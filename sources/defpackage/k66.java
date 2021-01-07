package defpackage;

import android.text.TextUtils;
import io.reactivex.functions.d;

/* renamed from: k66  reason: default package */
public final /* synthetic */ class k66 implements d {
    public static final /* synthetic */ k66 a = new k66();

    private /* synthetic */ k66() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        z66 z66 = (z66) obj;
        z66 z662 = (z66) obj2;
        int i = d76.s;
        if (TextUtils.equals(z66.b(), z662.b())) {
            ane a2 = z66.a();
            ane a3 = z662.a();
            if ((a2 == null || a3 == null) ? a2 == a3 : a2.equals(a3)) {
                return true;
            }
        }
        return false;
    }
}
