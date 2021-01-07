package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.g;
import com.spotify.music.features.playlistentity.itemlist.adapter.h;
import com.spotify.music.playlist.ui.d0;
import defpackage.wj4;
import java.util.Map;

/* renamed from: zj4  reason: default package */
public class zj4 implements h<d0, ajf<b4<ContextMenuItem>>> {
    private final dj4 a;
    private final wj4.a b;

    public zj4(dj4 dj4, wj4.a aVar) {
        this.a = dj4;
        this.b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, com.spotify.music.features.playlistentity.c0] */
    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.h
    public g a(d0 d0Var, ajf<b4<ContextMenuItem>> ajf, c0 c0Var) {
        return this.b.a(d0Var, new sj4(this, ajf));
    }

    public ContextMenuViewModel b(ContextMenuItem contextMenuItem, ContextMenuViewModel contextMenuViewModel) {
        Map<String, String> b2 = contextMenuItem.b();
        if (b2.containsKey("rank")) {
            String str = b2.get("rank");
            str.getClass();
            contextMenuViewModel.B(this.a.d(Integer.parseInt(str)));
        }
        return contextMenuViewModel;
    }
}
