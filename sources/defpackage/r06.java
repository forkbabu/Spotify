package defpackage;

import android.view.View;
import com.spotify.playlist.models.l;

/* renamed from: r06  reason: default package */
public final /* synthetic */ class r06 implements View.OnClickListener {
    public final /* synthetic */ u06 a;
    public final /* synthetic */ l b;
    public final /* synthetic */ int c;

    public /* synthetic */ r06(u06 u06, l lVar, int i) {
        this.a = u06;
        this.b = lVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.X(this.b, this.c, view);
    }
}
