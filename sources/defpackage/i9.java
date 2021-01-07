package defpackage;

import android.content.Context;
import androidx.work.NetworkType;

/* renamed from: i9  reason: default package */
public class i9 extends e9<z8> {
    public i9(Context context, na naVar) {
        super(q9.c(context, naVar).d());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.e9
    public boolean b(ga gaVar) {
        return gaVar.j.b() == NetworkType.UNMETERED;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // defpackage.e9
    public boolean c(z8 z8Var) {
        z8 z8Var2 = z8Var;
        return !z8Var2.a() || z8Var2.b();
    }
}
