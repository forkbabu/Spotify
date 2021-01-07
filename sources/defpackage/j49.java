package defpackage;

import android.view.View;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: j49  reason: default package */
public final /* synthetic */ class j49 implements View.OnClickListener {
    public final /* synthetic */ y59 a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ j49(y59 y59, MusicItem musicItem, int i) {
        this.a = y59;
        this.b = musicItem;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.k(this.b, this.c, view);
    }
}
