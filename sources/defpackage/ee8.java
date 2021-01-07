package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.c;
import defpackage.d42;

/* renamed from: ee8  reason: default package */
public class ee8 implements a71 {
    public static final /* synthetic */ int n = 0;
    private final Context a;
    private final b42 b;
    private final c.a c;
    private final p71 f;

    public ee8(Context context, b42 b42, c.a aVar, p71 p71) {
        this.a = context;
        this.b = b42;
        this.c = aVar;
        this.f = p71;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        n61.getClass();
        String string = o81.data().string("uri");
        String string2 = o81.data().string("title", "");
        if (string != null) {
            c viewUri = this.c.getViewUri();
            d42.f w = this.b.a(string, string2, viewUri.toString()).a(viewUri).t(false).g(true).r(true).w(false);
            w.l(true);
            w.c(true);
            ContextMenuFragment.f5(w.b(), (androidx.fragment.app.c) this.a, viewUri);
            this.f.a(string, n61.d(), "context-menu", null);
            return;
        }
        Assertion.g("Could not open context menu with null uri");
    }
}
