package defpackage;

import android.view.View;
import com.spotify.playlist.models.Episode;

/* renamed from: sgc  reason: default package */
public final /* synthetic */ class sgc implements View.OnClickListener {
    public final /* synthetic */ zgc a;
    public final /* synthetic */ Episode b;
    public final /* synthetic */ String c;

    public /* synthetic */ sgc(zgc zgc, Episode episode, String str) {
        this.a = zgc;
        this.b = episode;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, this.c, view);
    }
}
