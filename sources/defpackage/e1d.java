package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.C0707R;
import com.spotify.music.share.logging.ShareMenuLogger;
import io.reactivex.s;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: e1d  reason: default package */
public class e1d implements x3<Void> {
    private final r0d b;
    private final Context c;
    private final z7e d;
    private final List<o8e> e;
    private final ShareMenuLogger f;

    e1d(Context context, r0d r0d, z7e z7e, List<o8e> list, ShareMenuLogger shareMenuLogger) {
        this.c = context;
        this.b = r0d;
        this.d = z7e;
        this.e = list;
        this.f = shareMenuLogger;
    }

    private void d(o8e o8e, ContextMenuViewModel contextMenuViewModel, int i) {
        b b2 = contextMenuViewModel.b(o8e.id(), this.c.getString(o8e.c()), o8e.icon());
        b2.l(false);
        b2.o(new z0d(this, o8e, i));
        this.f.d(o8e.a(), i);
        this.d.j(i, o8e.a());
    }

    private Optional<o8e> e(int i) {
        for (o8e o8e : this.e) {
            if (o8e.id() == i) {
                return Optional.of(o8e);
            }
        }
        return Optional.absent();
    }

    private ContextMenuViewModel f() {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.G(this.c.getString(C0707R.string.share_app_facebook_dialog_title));
        Optional<o8e> e2 = e(C0707R.id.share_app_facebook_stories);
        Optional<o8e> e3 = e(C0707R.id.share_app_facebook_feed);
        if (e2.isPresent() && e3.isPresent()) {
            d(e2.get(), contextMenuViewModel, 0);
            d(e3.get(), contextMenuViewModel, 1);
        }
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<Void> y3Var) {
        return s.i0(f());
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<Void> y3Var) {
        return f();
    }

    public /* synthetic */ void g(o8e o8e, int i, b bVar) {
        ((u0d) this.b).i(o8e, i);
    }
}
