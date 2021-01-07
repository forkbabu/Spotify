package defpackage;

import android.view.View;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: n39  reason: default package */
public final /* synthetic */ class n39 implements View.OnClickListener {
    public final /* synthetic */ w59 a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ n39(w59 w59, MusicItem musicItem, int i) {
        this.a = w59;
        this.b = musicItem;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e(this.b, this.c, view);
    }
}
