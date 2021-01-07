package com.spotify.music.libs.facebook;

import android.content.Intent;
import com.facebook.a;
import com.google.common.base.Joiner;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ FacebookPlaceholderActivity a;
    public final /* synthetic */ a b;

    public /* synthetic */ h(FacebookPlaceholderActivity facebookPlaceholderActivity, a aVar) {
        this.a = facebookPlaceholderActivity;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        FacebookPlaceholderActivity facebookPlaceholderActivity = this.a;
        a aVar = this.b;
        facebookPlaceholderActivity.getClass();
        if (((SocialState) obj).enabled()) {
            Intent intent = facebookPlaceholderActivity.getIntent();
            intent.putExtra("extraGrantedScopes", Joiner.on(',').join(aVar.l()));
            facebookPlaceholderActivity.setResult(-1, intent);
            facebookPlaceholderActivity.finish();
        }
    }
}
