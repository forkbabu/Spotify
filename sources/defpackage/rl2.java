package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.connection.l;
import com.spotify.rxjava2.p;
import io.reactivex.y;

/* renamed from: rl2  reason: default package */
public class rl2 {
    private final y a;
    private final l b;
    private final p c = new p();
    private Boolean d;
    private final com.spotify.mobile.android.util.ui.l e;

    /* renamed from: rl2$a */
    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStart() {
            rl2.this.e();
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            rl2.b(rl2.this);
        }
    }

    public rl2(y yVar, k kVar, l lVar) {
        a aVar = new a();
        this.e = aVar;
        this.a = yVar;
        this.b = lVar;
        this.d = Boolean.FALSE;
        kVar.y0(aVar);
        e();
    }

    static void b(rl2 rl2) {
        rl2.c.a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        this.c.b(this.b.b().o0(this.a).subscribe(new ml2(this)));
    }

    public boolean c() {
        return this.d.booleanValue();
    }

    public /* synthetic */ void d(Boolean bool) {
        this.d = bool;
    }
}
