package defpackage;

import com.google.android.datatransport.g;
import com.google.android.gms.tasks.h;
import com.google.firebase.crashlytics.internal.common.g0;

/* access modifiers changed from: package-private */
/* renamed from: m00  reason: default package */
public final /* synthetic */ class m00 implements g {
    private final h a;
    private final g0 b;

    private m00(h hVar, g0 g0Var) {
        this.a = hVar;
        this.b = g0Var;
    }

    public static g b(h hVar, g0 g0Var) {
        return new m00(hVar, g0Var);
    }

    @Override // com.google.android.datatransport.g
    public void a(Exception exc) {
        h hVar = this.a;
        g0 g0Var = this.b;
        int i = o00.f;
        if (exc != null) {
            hVar.d(exc);
        } else {
            hVar.e(g0Var);
        }
    }
}
