package com.spotify.music.libs.thestage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.music.libs.thestage.config.TheStageUri;
import com.spotify.music.libs.thestage.config.c;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

public class d {
    private final AndroidLibsAdsCommonProperties a;

    public d(AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties) {
        this.a = androidLibsAdsCommonProperties;
    }

    public Optional<TheStageUri> a(Uri uri) {
        if (uri == null) {
            return Optional.absent();
        }
        if (!(this.a.i() == AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid.ENABLED)) {
            return Optional.absent();
        }
        return TheStageUri.d(uri);
    }

    public void b(Context context, TheStageUri theStageUri) {
        if (this.a.i() == AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid.ENABLED) {
            int i = TheStageActivity.G;
            Intent intent = new Intent(context, TheStageActivity.class);
            intent.putExtra("the-stage-config", c.a(theStageUri));
            context.startActivity(intent);
            return;
        }
        context.startActivity(new Intent("android.intent.action.VIEW", theStageUri.g()));
    }
}
