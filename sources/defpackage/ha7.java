package defpackage;

import androidx.fragment.app.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.d42;

/* renamed from: ha7  reason: default package */
public class ha7 implements ga7 {
    private final b42 a;
    private final c b;

    public ha7(b42 b42, c cVar) {
        this.a = b42;
        this.b = !(cVar instanceof aj9) ? null : cVar;
    }

    @Override // defpackage.ga7
    public void a(String str, String str2, String str3, com.spotify.music.libs.viewuri.c cVar) {
        b42 b42 = this.a;
        if (b42 == null || this.b == null) {
            Logger.d("Could not show the context menu on Episode TrackList Inspector", new Object[0]);
            return;
        }
        d42.f w = b42.a(str, str2, str3).a(cVar).t(true).g(true).r(true).w(false);
        w.c(false);
        w.p(true);
        w.k(false);
        ContextMenuFragment.f5(w.b(), this.b, ViewUris.h0);
    }
}
