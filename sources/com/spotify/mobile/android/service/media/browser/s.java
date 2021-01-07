package com.spotify.mobile.android.service.media.browser;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.mobile.android.util.d0;
import com.spotify.music.C0707R;
import java.util.Locale;

public final class s {
    public static MediaBrowserItem a(Context context, String str) {
        b bVar = new b(str);
        bVar.r(d0.b(context.getString(C0707R.string.shuffle_play), Locale.getDefault()));
        bVar.j(gf0.g(context, C0707R.drawable.ic_eis_shuffle));
        bVar.o(true);
        bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
        return bVar.a();
    }

    public static String b(Bundle bundle) {
        if (bundle != null && bundle.containsKey("com.spotify.music.extra.SUGGESTED_TYPE")) {
            return bundle.getString("com.spotify.music.extra.SUGGESTED_TYPE", "default");
        }
        return "default";
    }

    public static String c(s81 s81) {
        x81 main = s81.images().main();
        r81 images = s81.images();
        x81 background = main == null ? images.background() : images.main();
        if (background == null) {
            return null;
        }
        return background.uri();
    }

    public static String d(s81 s81) {
        a91 target = s81.target();
        if (target != null) {
            return target.uri();
        }
        return null;
    }
}
