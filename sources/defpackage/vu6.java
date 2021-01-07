package defpackage;

import android.view.View;
import com.spotify.playlist.models.j;

/* renamed from: vu6  reason: default package */
public final /* synthetic */ class vu6 implements View.OnClickListener {
    public final /* synthetic */ cv6 a;
    public final /* synthetic */ j b;
    public final /* synthetic */ b66 c;

    public /* synthetic */ vu6(cv6 cv6, j jVar, b66 b66) {
        this.a = cv6;
        this.b = jVar;
        this.c = b66;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e(this.b, this.c, view);
    }
}
