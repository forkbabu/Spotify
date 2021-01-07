package defpackage;

import android.view.View;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: j39  reason: default package */
public final /* synthetic */ class j39 implements View.OnLongClickListener {
    public final /* synthetic */ w59 a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ j39(w59 w59, MusicItem musicItem, int i) {
        this.a = w59;
        this.b = musicItem;
        this.c = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return this.a.g(this.b, this.c, view);
    }
}
