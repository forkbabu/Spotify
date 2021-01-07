package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.sleeptimer.n;
import com.spotify.music.sleeptimer.s;

/* renamed from: c2c  reason: default package */
public class c2c {
    private final Context a;
    private final y32 b;
    private final n c;
    private final s d;
    private final SnackbarManager e;

    c2c(Context context, y32 y32, n nVar, s sVar, SnackbarManager snackbarManager) {
        this.a = context;
        this.b = y32;
        this.c = nVar;
        this.d = sVar;
        this.e = snackbarManager;
    }

    public void a(String str) {
        LinkType q = l0.z(str).q();
        Context context = this.a;
        c a2 = c.a("spotify:contextmenu:sleeptimer");
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(c(str, q, null), (androidx.fragment.app.c) context, a2);
    }

    public void b(String str, String str2) {
        Context context = this.a;
        c a2 = c.a("spotify:contextmenu:episode:podcast:speedcontrol");
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(this.b.a(str, str2), (androidx.fragment.app.c) context, a2);
    }

    public r3 c(String str, LinkType linkType, Object obj) {
        n nVar = this.c;
        return new c4d(new e4d(this.a, new d4d(nVar, this.e, str, this.d), nVar, linkType, str)).a();
    }
}
