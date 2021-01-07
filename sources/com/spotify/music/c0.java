package com.spotify.music;

import androidx.appcompat.app.g;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.spotlets.uitooling.ViewDebugToolbarFragment;

public class c0 {
    private final g a;
    private ViewDebugToolbarFragment b;

    public c0(g gVar) {
        this.a = gVar;
    }

    public void a(Fragment fragment) {
        ViewDebugToolbarFragment viewDebugToolbarFragment = this.b;
        if (viewDebugToolbarFragment != null) {
            viewDebugToolbarFragment.K4();
        }
    }

    public void b() {
        this.b = (ViewDebugToolbarFragment) this.a.v0().U("tag_view_debug_toolbar_fragment_stub");
    }
}
