package defpackage;

import com.spotify.mobile.android.util.ui.d;
import com.spotify.mobile.android.util.ui.e;
import kotlin.jvm.internal.h;

/* renamed from: feb  reason: default package */
public final class feb implements d.b {
    private final d a;
    private qg0<Integer> b;
    private boolean c = true;
    private final e d;

    public feb(e eVar) {
        h.e(eVar, "colorTransitionHelperFactory");
        this.d = eVar;
        d b2 = eVar.b(0, 250, this);
        h.d(b2, "colorTransitionHelperFac…           this\n        )");
        this.a = b2;
    }

    @Override // com.spotify.mobile.android.util.ui.d.b
    public void a(int i) {
        qg0<Integer> qg0 = this.b;
        if (qg0 != null) {
            qg0.accept(Integer.valueOf(i));
        }
    }

    public final void b(int i, qg0<Integer> qg0) {
        this.b = qg0;
        if (this.c) {
            this.c = false;
            this.a.b(i);
            return;
        }
        this.a.c(i);
    }
}
