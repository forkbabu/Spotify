package defpackage;

import android.view.View;
import com.spotify.playlist.models.Episode;

/* renamed from: qgc  reason: default package */
public final /* synthetic */ class qgc implements View.OnClickListener {
    public final /* synthetic */ zgc a;
    public final /* synthetic */ Episode b;
    public final /* synthetic */ Episode[] c;
    public final /* synthetic */ String f;
    public final /* synthetic */ int n;

    public /* synthetic */ qgc(zgc zgc, Episode episode, Episode[] episodeArr, String str, int i) {
        this.a = zgc;
        this.b = episode;
        this.c = episodeArr;
        this.f = str;
        this.n = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e(this.b, this.c, this.f, this.n, view);
    }
}
