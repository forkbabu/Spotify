package defpackage;

import android.view.View;
import com.spotify.playlist.models.Episode;

/* renamed from: fgc  reason: default package */
public final /* synthetic */ class fgc implements View.OnClickListener {
    public final /* synthetic */ ogc a;
    public final /* synthetic */ Episode b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int f;

    public /* synthetic */ fgc(ogc ogc, Episode episode, String str, int i) {
        this.a = ogc;
        this.b = episode;
        this.c = str;
        this.f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(this.b, this.c, this.f, view);
    }
}
