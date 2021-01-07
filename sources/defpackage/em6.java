package defpackage;

import android.view.View;
import com.spotify.playlist.models.l;

/* renamed from: em6  reason: default package */
public final /* synthetic */ class em6 implements View.OnClickListener {
    public final /* synthetic */ sm6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ l c;

    public /* synthetic */ em6(sm6 sm6, int i, l lVar) {
        this.a = sm6;
        this.b = i;
        this.c = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.Y(this.b, this.c, view);
    }
}
