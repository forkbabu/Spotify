package defpackage;

import android.view.View;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: h49  reason: default package */
public final /* synthetic */ class h49 implements View.OnLongClickListener {
    public final /* synthetic */ y59 a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ h49(y59 y59, MusicItem musicItem, int i) {
        this.a = y59;
        this.b = musicItem;
        this.c = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.a.i(this.b, this.c, view);
        return true;
    }
}
