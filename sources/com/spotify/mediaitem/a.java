package com.spotify.mediaitem;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

public class a {
    private final Bundle a;

    public a(Bundle bundle) {
        this.a = bundle;
    }

    public a a(Bundle bundle) {
        this.a.putAll(bundle);
        return this;
    }

    public Bundle b() {
        return this.a;
    }

    public a c(boolean z) {
        this.a.putBoolean("android.media.browse.AUTO_TABS_OPT_IN_HINT", z);
        return this;
    }

    public a d(int i) {
        if (i == -1) {
            this.a.remove("android.media.extra.PLAYBACK_STATUS");
        } else {
            this.a.putInt("android.media.extra.PLAYBACK_STATUS", i);
        }
        return this;
    }

    public a e(int i) {
        this.a.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", i);
        return this;
    }

    public a f(int i) {
        this.a.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", i);
        return this;
    }

    public a g(Uri uri) {
        if (Uri.EMPTY.equals(uri)) {
            this.a.remove("com.spotify.music.extra.CONTEXT_SHARE_URL");
        } else {
            this.a.putString("com.spotify.music.extra.CONTEXT_SHARE_URL", uri.toString());
        }
        return this;
    }

    public a h(long j) {
        if (j <= 0) {
            this.a.remove("com.spotify.music.extra.DURATION_MS");
        } else {
            this.a.putLong("com.spotify.music.extra.DURATION_MS", j);
        }
        return this;
    }

    public a i(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a.remove("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT");
        } else {
            this.a.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
        }
        return this;
    }

    public a j(Uri uri) {
        if (Uri.EMPTY.equals(uri)) {
            this.a.remove("com.spotify.music.extra.ART_HTTPS_URI");
        } else {
            this.a.putString("com.spotify.music.extra.ART_HTTPS_URI", uri.toString());
        }
        return this;
    }

    public a k(boolean z) {
        this.a.putLong("android.media.extra.DOWNLOAD_STATUS", z ? 2 : 0);
        return this;
    }

    public a l(boolean z) {
        this.a.putLong("android.media.IS_EXPLICIT", z ? 1 : 0);
        return this;
    }

    public a m(Uri uri) {
        if (Uri.EMPTY.equals(uri)) {
            this.a.remove("com.spotify.music.extra.ICON_URI_LARGE");
        } else {
            this.a.putString("com.spotify.music.extra.ICON_URI_LARGE", uri.toString());
        }
        return this;
    }

    public a n(Uri uri) {
        if (Uri.EMPTY.equals(uri)) {
            this.a.remove("com.spotify.music.extra.ICON_URI_MEDIUM");
        } else {
            this.a.putString("com.spotify.music.extra.ICON_URI_MEDIUM", uri.toString());
        }
        return this;
    }

    public a o(PlayOriginReferrer playOriginReferrer) {
        if (playOriginReferrer != null) {
            this.a.putString("com.spotify.music.extra.PLAY_ORIGIN", playOriginReferrer.d());
        }
        return this;
    }

    public a p(Boolean bool) {
        this.a.putBoolean("android.media.browse.SEARCH_SUPPORTED", bool.booleanValue());
        return this;
    }

    public a q(Uri uri) {
        if (Uri.EMPTY.equals(uri)) {
            this.a.remove("com.spotify.music.extra.ICON_URI_SMALL");
        } else {
            this.a.putString("com.spotify.music.extra.ICON_URI_SMALL", uri.toString());
        }
        return this;
    }

    public a r(long j) {
        if (j <= 0) {
            this.a.remove("com.spotify.music.extra.TIME_LEFT_MS");
        } else {
            this.a.putLong("com.spotify.music.extra.TIME_LEFT_MS", j);
        }
        return this;
    }

    public a() {
        this.a = new Bundle();
    }
}
