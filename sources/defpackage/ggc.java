package defpackage;

import android.view.View;
import com.spotify.playlist.models.Episode;

/* renamed from: ggc  reason: default package */
public final /* synthetic */ class ggc implements View.OnClickListener {
    public final /* synthetic */ ogc a;
    public final /* synthetic */ Episode b;
    public final /* synthetic */ Episode[] c;
    public final /* synthetic */ String f;
    public final /* synthetic */ int n;

    public /* synthetic */ ggc(ogc ogc, Episode episode, Episode[] episodeArr, String str, int i) {
        this.a = ogc;
        this.b = episode;
        this.c = episodeArr;
        this.f = str;
        this.n = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.f(this.b, this.c, this.f, this.n, view);
    }
}
