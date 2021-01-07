package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.j;

/* renamed from: h9  reason: default package */
public class h9 extends e9<z8> {
    private static final String e = j.f("NetworkNotRoamingCtrlr");

    public h9(Context context, na naVar) {
        super(q9.c(context, naVar).d());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.e9
    public boolean b(ga gaVar) {
        return gaVar.j.b() == NetworkType.NOT_ROAMING;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // defpackage.e9
    public boolean c(z8 z8Var) {
        z8 z8Var2 = z8Var;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            j.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !z8Var2.a();
        }
        if (z8Var2.a() && z8Var2.c()) {
            z = false;
        }
        return z;
    }
}
