package com.spotify.mobile.android.spotlets.bixbyhomecards.cards;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;

public class b {
    private static final Uri b;
    private static final Uri c;
    private final Context a;

    static {
        Uri parse = Uri.parse("content://com.samsung.android.app.spage.provider");
        b = parse;
        c = Uri.withAppendedPath(parse, "card");
    }

    public b(Context context) {
        this.a = context;
    }

    public void a(n60 n60) {
        try {
            this.a.getContentResolver().update(c, n60.a(), null, null);
        } catch (IllegalArgumentException | SecurityException e) {
            Logger.e(e, e.getLocalizedMessage(), new Object[0]);
        }
    }
}
