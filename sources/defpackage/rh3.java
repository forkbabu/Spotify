package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import androidx.lifecycle.g0;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.c;
import com.spotify.music.C0707R;
import defpackage.lh3;

/* renamed from: rh3  reason: default package */
public final class rh3 implements c {
    private qh3 a;
    private final uh3 b;
    private final th3 c;
    private final Resources f;

    rh3(androidx.fragment.app.c cVar, lh3.a aVar, uh3 uh3) {
        this.b = uh3;
        this.f = cVar.getResources();
        th3 th3 = (th3) new g0(cVar.Z(), aVar).a(lh3.class);
        this.c = th3;
        th3.a().h(cVar, new jh3(this));
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void P0(Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        qh3 qh3 = this.a;
        if (qh3 != null) {
            if (z && qh3 != null && !qh3.isVisible()) {
                this.b.b(this.f.getString(C0707R.string.text_utterance_suggestion));
            }
            this.a.setVisible(z);
        }
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void r2(AnchorBar anchorBar) {
        qh3 qh3 = new qh3(anchorBar, this.b, this.c);
        this.a = qh3;
        anchorBar.e(qh3);
    }
}
