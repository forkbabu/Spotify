package com.spotify.mobile.android.ui.view.anchorbar;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.ui.fragments.OfflineBarFragment;
import com.spotify.music.C0707R;
import com.spotify.music.features.nowplayingbar.NowPlayingBarFragment;
import com.spotify.music.sociallistening.participantlist.impl.m;
import kotlin.jvm.internal.h;

public class g {
    private final o a;
    private final s08 b;
    private i c;
    private i d;
    private boolean e;

    public g(o oVar, s08 s08) {
        this.a = oVar;
        this.b = s08;
    }

    private void b(c cVar) {
        int i = NowPlayingBarFragment.m0;
        h.e(cVar, "flags");
        NowPlayingBarFragment nowPlayingBarFragment = new NowPlayingBarFragment();
        m.d(nowPlayingBarFragment, yn0.a(kfd.D0));
        d.a(nowPlayingBarFragment, cVar);
        this.d.f(nowPlayingBarFragment);
        nowPlayingBarFragment.L4(this.d);
    }

    public void a(boolean z, c cVar) {
        this.e = z;
        OfflineBarFragment offlineBarFragment = (OfflineBarFragment) this.a.U(this.c.e());
        if (offlineBarFragment != null) {
            offlineBarFragment.P4(this.c);
        }
        Fragment U = this.a.U(this.d.e());
        boolean z2 = false;
        boolean z3 = U == null && z && cVar != null;
        boolean z4 = U != null && !z;
        if (U != null && z) {
            z2 = true;
        }
        if (z3) {
            b(cVar);
        } else if (z4) {
            x i = this.a.i();
            i.p(U);
            i.i();
        } else if (z2) {
            ((NowPlayingBarFragment) U).L4(this.d);
        }
    }

    public void c(c cVar) {
        OfflineBarFragment offlineBarFragment = new OfflineBarFragment();
        this.c.f(offlineBarFragment);
        offlineBarFragment.P4(this.c);
        if (this.e) {
            b(cVar);
        }
    }

    public void d(AnchorBar anchorBar) {
        i iVar = new i(anchorBar, C0707R.id.offline_anchor_item, this.a, "Offline bar");
        this.c = iVar;
        anchorBar.e(iVar);
        i iVar2 = new i(anchorBar, C0707R.id.now_playing_bar_anchor_item, this.a, "Player preview bar");
        this.d = iVar2;
        anchorBar.e(iVar2);
        this.b.b(anchorBar);
    }
}
