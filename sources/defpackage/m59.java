package defpackage;

import android.view.View;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: m59  reason: default package */
public final /* synthetic */ class m59 implements View.OnClickListener {
    public final /* synthetic */ c69 a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ m59(c69 c69, MusicItem musicItem, int i) {
        this.a = c69;
        this.b = musicItem;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.p(this.b, this.c, view);
    }
}
