package com.spotify.music.libs.facebook;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ FacebookPlaceholderActivity a;

    public /* synthetic */ g(FacebookPlaceholderActivity facebookPlaceholderActivity) {
        this.a = facebookPlaceholderActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        FacebookPlaceholderActivity facebookPlaceholderActivity = this.a;
        facebookPlaceholderActivity.getClass();
        Logger.e((Throwable) obj, "Failed to subscribe to social events", new Object[0]);
        facebookPlaceholderActivity.M.c(C0707R.string.toast_generic_facebook_error, new Object[0]);
    }
}
