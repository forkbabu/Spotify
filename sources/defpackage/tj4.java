package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import io.reactivex.functions.l;

/* renamed from: tj4  reason: default package */
public final /* synthetic */ class tj4 implements l {
    public final /* synthetic */ zj4 a;
    public final /* synthetic */ ContextMenuItem b;

    public /* synthetic */ tj4(zj4 zj4, ContextMenuItem contextMenuItem) {
        this.a = zj4;
        this.b = contextMenuItem;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ContextMenuViewModel contextMenuViewModel = (ContextMenuViewModel) obj;
        this.a.b(this.b, contextMenuViewModel);
        return contextMenuViewModel;
    }
}
