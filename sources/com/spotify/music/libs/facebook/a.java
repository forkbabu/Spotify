package com.spotify.music.libs.facebook;

import android.content.Intent;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ FacebookConnectFragment a;

    public /* synthetic */ a(FacebookConnectFragment facebookConnectFragment) {
        this.a = facebookConnectFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        FacebookConnectFragment facebookConnectFragment = this.a;
        int i = FacebookConnectFragment.l0;
        facebookConnectFragment.getClass();
        if (((SocialState) obj).enabled() && !facebookConnectFragment.i0) {
            facebookConnectFragment.K4();
        } else if (!facebookConnectFragment.i0) {
            facebookConnectFragment.i0 = true;
            facebookConnectFragment.H4(new Intent(facebookConnectFragment.F2(), FacebookPlaceholderActivity.class), 102, null);
        }
    }
}
