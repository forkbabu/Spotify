package defpackage;

import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.mobile.android.ui.contextmenu.s3;

/* renamed from: s0d  reason: default package */
public class s0d implements rzc {
    private final s3 b;

    public s0d(s3 s3Var) {
        this.b = s3Var;
    }

    @Override // defpackage.rzc
    public void a() {
        this.b.a(ContextMenuEvent.SHARE);
    }

    @Override // defpackage.rzc
    public void b(Throwable th) {
    }

    @Override // defpackage.rzc
    public void c() {
    }
}
