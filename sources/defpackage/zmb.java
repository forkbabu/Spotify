package defpackage;

import com.spotify.mobile.android.util.ui.d;
import com.spotify.mobile.android.util.ui.e;

/* renamed from: zmb  reason: default package */
public class zmb implements d.b {
    private final d a;
    private qg0<Integer> b;
    private boolean c = true;

    zmb(e eVar) {
        this.a = eVar.b(0, 500, this);
    }

    @Override // com.spotify.mobile.android.util.ui.d.b
    public void a(int i) {
        qg0<Integer> qg0 = this.b;
        if (qg0 != null) {
            qg0.accept(Integer.valueOf(i));
        }
    }

    public void b(int i, qg0<Integer> qg0) {
        this.b = qg0;
        if (this.c) {
            this.c = false;
            this.a.b(i);
            return;
        }
        this.a.c(i);
    }
}
