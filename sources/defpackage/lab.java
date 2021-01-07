package defpackage;

import com.spotify.music.libs.viewartistscontextmenu.ui.ViewArtistsContextMenuDialogFragment;
import com.spotify.music.libs.viewartistscontextmenu.ui.f;
import com.squareup.picasso.Picasso;

/* renamed from: lab  reason: default package */
public final class lab implements fjf<f> {
    private final wlf<Picasso> a;
    private final wlf<ViewArtistsContextMenuDialogFragment> b;

    public lab(wlf<Picasso> wlf, wlf<ViewArtistsContextMenuDialogFragment> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        ViewArtistsContextMenuDialogFragment viewArtistsContextMenuDialogFragment = this.b.get();
        return new f(viewArtistsContextMenuDialogFragment.B2(), new kab(viewArtistsContextMenuDialogFragment), this.a.get());
    }
}
