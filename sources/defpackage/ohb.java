package defpackage;

import android.content.Context;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.c4;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.C0707R;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: ohb  reason: default package */
public final class ohb implements x3<Void> {
    private final Context b;
    private final a c;

    /* renamed from: ohb$a */
    public interface a {
        void a();
    }

    /* renamed from: ohb$b */
    static final class b implements e {
        final /* synthetic */ ohb a;

        b(ohb ohb) {
            this.a = ohb;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.e
        public final void a(com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
            this.a.c.a();
        }
    }

    public ohb(Context context, a aVar) {
        h.e(context, "context");
        h.e(aVar, "listener");
        this.b = context;
        this.c = aVar;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<Void> y3Var) {
        h.e(y3Var, "menuModel");
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.b(C0707R.id.marketing_formats_slide_header_share, this.b.getString(C0707R.string.share), l70.i(this.b, SpotifyIconV2.SHARE_ANDROID)).o(new b(this));
        s<ContextMenuViewModel> i0 = s.i0(contextMenuViewModel);
        h.d(i0, "Observable.just(contextMenuViewModel)");
        return i0;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        h.e(contextMenuViewModel, "contextMenu");
        c4.a(contextMenuViewModel, z);
        h.d(contextMenuViewModel, "OnlineOnlyItemsDisabler.…contextMenu, isConnected)");
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<Void> y3Var) {
        h.e(y3Var, "menuModel");
        return new ContextMenuViewModel();
    }
}
