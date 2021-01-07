package com.spotify.music.libs.facebook;

import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ FacebookPlaceholderActivity a;

    public /* synthetic */ f(FacebookPlaceholderActivity facebookPlaceholderActivity) {
        this.a = facebookPlaceholderActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        FacebookPlaceholderActivity facebookPlaceholderActivity = this.a;
        SocialEvent socialEvent = (SocialEvent) obj;
        facebookPlaceholderActivity.setResult(0);
        facebookPlaceholderActivity.finish();
    }
}
