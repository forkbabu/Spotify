package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.j;

/* renamed from: g9  reason: default package */
public class g9 extends e9<z8> {
    private static final String e = j.f("NetworkMeteredCtrlr");

    public g9(Context context, na naVar) {
        super(q9.c(context, naVar).d());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.e9
    public boolean b(ga gaVar) {
        return gaVar.j.b() == NetworkType.METERED;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // defpackage.e9
    public boolean c(z8 z8Var) {
        z8 z8Var2 = z8Var;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            j.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !z8Var2.a();
        }
        if (z8Var2.a() && z8Var2.b()) {
            z = false;
        }
        return z;
    }
}
