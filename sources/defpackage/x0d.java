package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.a;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.share.logging.ShareMenuLogger;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: x0d  reason: default package */
class x0d implements x3<Void> {
    private final Activity b;
    private final String c;
    private final Uri d;
    private final y3<l0> e;
    private final r0d f;
    private final b1d g;
    private final z7e h;
    private final ShareMenuLogger i;
    private final z<List<o8e>> j;

    x0d(Activity activity, r0d r0d, b1d b1d, y3<l0> y3Var, String str, Uri uri, z<List<o8e>> zVar, z7e z7e, ShareMenuLogger shareMenuLogger) {
        this.b = activity;
        this.c = str;
        this.d = uri;
        this.e = y3Var;
        this.f = r0d;
        this.g = b1d;
        this.h = z7e;
        this.i = shareMenuLogger;
        this.j = zVar;
    }

    private void d(ContextMenuViewModel contextMenuViewModel, o8e o8e, String str, Drawable drawable, int i2) {
        b b2 = contextMenuViewModel.b(o8e.id(), str, drawable);
        b2.o(new n0d(this, o8e, i2));
        b2.l(false);
        this.i.c(o8e.a(), i2);
        this.h.j(i2, o8e.a());
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<Void> y3Var) {
        return this.j.A(new m0d(this, this.e)).P();
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<Void> y3Var) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.w(new a("", this.c, this.d, SpotifyIconV2.PLAYLIST, false));
        return contextMenuViewModel;
    }

    public /* synthetic */ void e(int i2, b bVar) {
        ((u0d) this.g).h(i2);
    }

    public /* synthetic */ void f(o8e o8e, int i2, b bVar) {
        ((u0d) this.f).i(o8e, i2);
    }

    public ContextMenuViewModel g(y3 y3Var, List list) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.D(true);
        contextMenuViewModel.f();
        Object f2 = y3Var.f();
        f2.getClass();
        LinkType q = ((l0) f2).q();
        q.getClass();
        String g2 = y3Var.g();
        g2.getClass();
        contextMenuViewModel.w(new a(g2, this.c, this.d, SpotifyIconV2.PLAYLIST, q == LinkType.ARTIST));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((o8e) it.next()).id()));
        }
        boolean z = arrayList.contains(Integer.valueOf(C0707R.id.share_app_facebook_feed)) && arrayList.contains(Integer.valueOf(C0707R.id.share_app_facebook_stories));
        boolean z2 = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            o8e o8e = (o8e) list.get(i2);
            if (!z || !(o8e.id() == C0707R.id.share_app_facebook_feed || o8e.id() == C0707R.id.share_app_facebook_stories)) {
                if (o8e.id() == C0707R.id.share_app_facebook_stories) {
                    d(contextMenuViewModel, o8e, (String) this.b.getText(C0707R.string.share_app_facebook), androidx.core.content.a.d(this.b, C0707R.drawable.share_icn_facebook), i2);
                } else {
                    d(contextMenuViewModel, o8e, (String) this.b.getText(o8e.c()), o8e.icon(), i2);
                }
            } else if (!z2) {
                Drawable d2 = androidx.core.content.a.d(this.b, C0707R.drawable.share_icn_facebook);
                int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(C0707R.dimen.share_icon_size);
                b b2 = contextMenuViewModel.b(C0707R.id.share_app_facebook_popup, this.b.getText(C0707R.string.share_app_facebook), new BitmapDrawable(this.b.getResources(), Bitmap.createScaledBitmap(((BitmapDrawable) d2).getBitmap(), dimensionPixelSize, dimensionPixelSize, true)));
                b2.o(new l0d(this, i2));
                b2.l(false);
                z2 = true;
            }
        }
        return contextMenuViewModel;
    }
}
