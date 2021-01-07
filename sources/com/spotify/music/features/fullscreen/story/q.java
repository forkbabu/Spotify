package com.spotify.music.features.fullscreen.story;

import android.content.res.Resources;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.C0707R;
import com.spotify.music.follow.m;
import com.spotify.music.libs.fullscreen.story.domain.OverlayContextMenu;
import com.spotify.music.libs.fullscreen.story.domain.j;
import com.spotify.music.libs.viewuri.c;

public class q implements p {
    private final t8a a;
    private final SnackbarManager b;
    private final String c;
    private final l22 f;
    private final b42 n;
    private final m o;
    private final Resources p;
    private final f<OverlayContextMenu> q;

    public q(t8a t8a, SnackbarManager snackbarManager, l22 l22, b42 b42, m mVar, Resources resources, f<OverlayContextMenu> fVar, String str) {
        this.a = t8a;
        this.b = snackbarManager;
        this.f = l22;
        this.n = b42;
        this.o = mVar;
        this.p = resources;
        this.q = fVar;
        this.c = str;
    }

    private SnackbarConfiguration a(int i, String str) {
        return SnackbarConfiguration.builder(this.p.getString(i, str)).build();
    }

    public void b(String str, boolean z) {
        if (z) {
            this.a.a(str, this.c, false);
        } else {
            this.a.f(str, false);
        }
    }

    public void c(j jVar) {
        if (jVar instanceof j.b) {
            this.b.show(SnackbarConfiguration.builder((int) C0707R.string.toast_saved_to_collection_your_library).build());
        } else if (jVar instanceof j.d) {
            this.b.show(SnackbarConfiguration.builder((int) C0707R.string.toast_removed_from_collection_your_library).build());
        } else if (jVar instanceof j.a) {
            this.b.show(a(C0707R.string.snackbar_following_entity, ((j.a) jVar).a()));
        } else if (jVar instanceof j.c) {
            this.b.show(a(C0707R.string.snackbar_unfollowing_entity, ((j.c) jVar).a()));
        } else {
            throw new IllegalStateException("Unknown FullscreenStoryFeedback: " + jVar);
        }
    }

    public void d(OverlayContextMenu overlayContextMenu) {
        this.q.a(overlayContextMenu, this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(OverlayContextMenu overlayContextMenu) {
        OverlayContextMenu overlayContextMenu2 = overlayContextMenu;
        String b2 = overlayContextMenu2.b();
        String a2 = overlayContextMenu2.a();
        String c2 = overlayContextMenu2.c();
        int ordinal = overlayContextMenu2.d().ordinal();
        if (ordinal == 0) {
            return this.n.a(b2, c2, a2).a(c.a(a2)).t(true).g(true).r(true).w(false).b();
        }
        if (ordinal == 1) {
            return this.f.a(b2, c2).a(c.a(a2)).g(true).c(true).d(true).b();
        }
        throw new AssertionError("unsupported ContextMenu type");
    }
}
