package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.share.logging.ShareMenuLogger;

/* renamed from: t0d  reason: default package */
public class t0d implements rzc {
    private final o0 b;
    private final z7e c;
    private final rzc d;
    private final qg0<rzc> e;
    private final ShareMenuLogger f;
    private ContextMenuFragment g;
    private boolean h;

    public t0d(o0 o0Var, z7e z7e, rzc rzc, qg0<rzc> qg0, ShareMenuLogger shareMenuLogger) {
        this.b = o0Var;
        this.c = z7e;
        this.d = rzc;
        this.e = qg0;
        this.f = shareMenuLogger;
    }

    @Override // defpackage.rzc
    public void a() {
        this.h = true;
        this.d.a();
        ContextMenuFragment contextMenuFragment = this.g;
        if (contextMenuFragment != null) {
            contextMenuFragment.M4();
        }
    }

    @Override // defpackage.rzc
    public void b(Throwable th) {
        Logger.e(th, "Error sharing: ", new Object[0]);
        this.h = true;
        this.b.c(C0707R.string.toast_shared_to_external_app_error_general, new Object[0]);
        this.d.b(th);
        ContextMenuFragment contextMenuFragment = this.g;
        if (contextMenuFragment != null) {
            contextMenuFragment.M4();
        }
    }

    @Override // defpackage.rzc
    public void c() {
        if (!this.h) {
            this.h = true;
            this.d.c();
        }
        ContextMenuFragment contextMenuFragment = this.g;
        if (contextMenuFragment != null) {
            contextMenuFragment.M4();
        }
    }

    public void d(ContextMenuFragment contextMenuFragment) {
        ContextMenuFragment contextMenuFragment2 = this.g;
        if (contextMenuFragment2 != null) {
            contextMenuFragment2.M4();
        }
        this.g = contextMenuFragment;
    }
}
