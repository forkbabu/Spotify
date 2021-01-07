package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.c;

/* renamed from: b71  reason: default package */
public final class b71 implements a71 {
    private final Context a;
    private final v3 b;
    private final c.a c;
    private final p71 f;
    private final j81 n;
    private final ere o;

    public b71(Context context, v3 v3Var, c.a aVar, p71 p71, j81 j81, ere ere) {
        context.getClass();
        this.a = context;
        v3Var.getClass();
        this.b = v3Var;
        this.c = aVar;
        p71.getClass();
        this.f = p71;
        this.n = j81;
        this.o = ere;
    }

    public static o81 a(String str, String str2) {
        return z81.b().e("contextMenu").b("uri", str).b("title", str2).c();
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        String string2 = o81.data().string("title", "");
        if (string != null) {
            c viewUri = this.c.getViewUri();
            ContextMenuFragment.f5(this.b.a(viewUri, string, string2), (androidx.fragment.app.c) this.a, viewUri);
            this.f.a(string, n61.d(), "context-menu", null);
        } else {
            Assertion.g("Could not open context menu with null uri");
        }
        this.o.a(this.n.a(n61).j());
    }
}
