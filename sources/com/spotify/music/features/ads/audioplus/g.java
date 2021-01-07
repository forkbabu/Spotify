package com.spotify.music.features.ads.audioplus;

import android.os.Bundle;
import com.spotify.music.features.ads.audioplus.topbanner.LeaveBehindTopBannerContainerFragment;
import com.spotify.music.features.ads.audioplus.topbanner.a;

public class g implements a {
    private final h a;

    public g(i iVar) {
        this.a = iVar.a();
    }

    @Override // com.spotify.music.features.ads.audioplus.topbanner.a
    public void a(d dVar) {
        h hVar = this.a;
        if (hVar != null && !hVar.isVisible()) {
            LeaveBehindTopBannerContainerFragment leaveBehindTopBannerContainerFragment = new LeaveBehindTopBannerContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ad", dVar);
            leaveBehindTopBannerContainerFragment.r4(bundle);
            this.a.e(leaveBehindTopBannerContainerFragment);
            this.a.setVisible(true);
        }
    }

    @Override // com.spotify.music.features.ads.audioplus.topbanner.a
    public void close() {
        h hVar = this.a;
        if (hVar != null && hVar.isVisible()) {
            this.a.setVisible(false);
        }
    }
}
