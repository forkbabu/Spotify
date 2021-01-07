package defpackage;

import android.view.View;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.features.localfilesimport.view.LocalFileRow;

/* renamed from: nn5  reason: default package */
class nn5 implements View.OnClickListener {
    final /* synthetic */ LocalItem a;
    final /* synthetic */ LocalFileRow b;
    final /* synthetic */ int c;
    final /* synthetic */ mn5 f;

    nn5(mn5 mn5, LocalItem localItem, LocalFileRow localFileRow, int i) {
        this.f = mn5;
        this.a = localItem;
        this.b = localFileRow;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean c2 = this.f.n.c(this.a);
        this.f.n.a(this.a, !c2, this.f.r);
        this.b.h0(c2 ? LocalFileRow.Activated.INACTIVE : LocalFileRow.Activated.FULLY);
        this.f.p.l(this.f.q, this.c);
    }
}
