package defpackage;

import android.view.View;
import com.spotify.playlist.models.o;

/* renamed from: cf5  reason: default package */
public final /* synthetic */ class cf5 implements View.OnClickListener {
    public final /* synthetic */ ff5 a;
    public final /* synthetic */ o b;
    public final /* synthetic */ int c;

    public /* synthetic */ cf5(ff5 ff5, o oVar, int i) {
        this.a = ff5;
        this.b = oVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.X(this.b, this.c, view);
    }
}
