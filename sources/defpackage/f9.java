package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;

/* renamed from: f9  reason: default package */
public class f9 extends e9<z8> {
    public f9(Context context, na naVar) {
        super(q9.c(context, naVar).d());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.e9
    public boolean b(ga gaVar) {
        return gaVar.j.b() == NetworkType.CONNECTED;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // defpackage.e9
    public boolean c(z8 z8Var) {
        z8 z8Var2 = z8Var;
        if (Build.VERSION.SDK_INT < 26) {
            return true ^ z8Var2.a();
        }
        if (!z8Var2.a() || !z8Var2.d()) {
            return true;
        }
        return false;
    }
}
