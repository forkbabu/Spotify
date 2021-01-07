package defpackage;

import android.view.View;
import com.spotify.playlist.models.l;

/* renamed from: ww4  reason: default package */
public final /* synthetic */ class ww4 implements View.OnClickListener {
    public final /* synthetic */ mx4 a;
    public final /* synthetic */ l b;
    public final /* synthetic */ int c;

    public /* synthetic */ ww4(mx4 mx4, l lVar, int i) {
        this.a = mx4;
        this.b = lVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, this.c, view);
    }
}
