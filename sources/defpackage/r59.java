package defpackage;

import android.widget.TextView;
import com.spotify.encore.ViewProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.view.l1;
import defpackage.d39;

/* renamed from: r59  reason: default package */
public final /* synthetic */ class r59 implements d39.e {
    public final /* synthetic */ c69 a;

    public /* synthetic */ r59(c69 c69) {
        this.a = c69;
    }

    @Override // defpackage.d39.e
    public final void a(ViewProvider viewProvider, d39.b bVar, int i) {
        c69 c69 = this.a;
        MusicItem musicItem = (MusicItem) bVar;
        c69.getClass();
        l1 l1Var = (l1) viewProvider;
        l1Var.setTitle(musicItem.w());
        TextView actionView = l1Var.getActionView();
        actionView.setText(musicItem.s().b());
        actionView.setOnClickListener(new m59(c69, musicItem, i));
    }
}
