package defpackage;

import androidx.fragment.app.c;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.c;

/* renamed from: a04  reason: default package */
public final class a04 implements a71 {
    private final c a;
    private final v3 b;
    private final c.a c;
    private final p71 f;
    private final j81 n;
    private final ere o;

    public a04(androidx.fragment.app.c cVar, v3 v3Var, c.a aVar, p71 p71, j81 j81, ere ere) {
        cVar.getClass();
        this.a = cVar;
        v3Var.getClass();
        this.b = v3Var;
        aVar.getClass();
        this.c = aVar;
        p71.getClass();
        this.f = p71;
        j81.getClass();
        this.n = j81;
        ere.getClass();
        this.o = ere;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        String string2 = o81.data().string("title", "");
        if (string != null) {
            com.spotify.music.libs.viewuri.c viewUri = this.c.getViewUri();
            ContextMenuFragment.f5(this.b.a(viewUri, string, string2), this.a, viewUri);
            this.f.a(string, n61.d(), "context-menu", null);
        } else {
            Assertion.g("Could not open context menu with null uri");
        }
        this.o.a(this.n.a(n61).j());
    }
}
