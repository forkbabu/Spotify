package defpackage;

import android.view.View;
import com.spotify.playlist.models.l;
import defpackage.iw4;

/* renamed from: gw4  reason: default package */
public final /* synthetic */ class gw4 implements View.OnClickListener {
    public final /* synthetic */ iw4.c a;
    public final /* synthetic */ l b;

    public /* synthetic */ gw4(iw4.c cVar, l lVar) {
        this.a = cVar;
        this.b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        iw4.c cVar = this.a;
        l lVar = this.b;
        int w = cVar.w();
        if (w != -1) {
            iw4.this.n.remove(w - 1);
            iw4.this.I(w);
            iw4.this.c.a(lVar, w);
        }
    }
}
