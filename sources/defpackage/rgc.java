package defpackage;

import android.view.View;
import com.spotify.playlist.models.Episode;

/* renamed from: rgc  reason: default package */
public final /* synthetic */ class rgc implements View.OnClickListener {
    public final /* synthetic */ zgc a;
    public final /* synthetic */ Episode b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int f;

    public /* synthetic */ rgc(zgc zgc, Episode episode, String str, int i) {
        this.a = zgc;
        this.b = episode;
        this.c = str;
        this.f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(this.b, this.c, this.f, view);
    }
}
