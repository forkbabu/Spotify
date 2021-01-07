package defpackage;

import androidx.fragment.app.c;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import kotlin.jvm.internal.h;

/* renamed from: b4c  reason: default package */
public final class b4c {
    private final c a;
    private final d4c b;
    private final com.spotify.music.libs.viewuri.c c;

    public b4c(c cVar, d4c d4c, com.spotify.music.libs.viewuri.c cVar2) {
        h.e(cVar, "activity");
        h.e(d4c, "contextMenuProvider");
        h.e(cVar2, "viewUri");
        this.a = cVar;
        this.b = d4c;
        this.c = cVar2;
    }

    public final void a(String str, String str2) {
        h.e(str, "trackUri");
        h.e(str2, "title");
        ContextMenuFragment.f5(this.b.a(this.c, str, str2), this.a, this.c);
    }
}
