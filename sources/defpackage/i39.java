package defpackage;

import android.view.View;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: i39  reason: default package */
public final /* synthetic */ class i39 implements View.OnClickListener {
    public final /* synthetic */ u59 a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ i39(u59 u59, MusicItem musicItem, int i) {
        this.a = u59;
        this.b = musicItem;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(this.b, this.c, view);
    }
}
