package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.ViewProvider;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.g;
import com.spotify.music.playlist.ui.d0;

/* renamed from: hi6  reason: default package */
public abstract class hi6 extends RecyclerView.e<b> implements g<hi6> {

    /* renamed from: hi6$a */
    interface a {
        hi6 a(d0 d0Var, ajf<b4<ContextMenuItem>> ajf, c0 c0Var);
    }

    /* renamed from: hi6$b */
    public static class b extends vh6 {
        protected b(ViewProvider viewProvider) {
            super(viewProvider);
        }
    }
}
