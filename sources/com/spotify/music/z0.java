package com.spotify.music;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class z0 {
    private final String a;

    public static final class b {
        final Intent a;

        b(Context context, Intent intent, String str, a aVar) {
            this.a = intent;
            intent.setExtrasClassLoader(context.getClassLoader());
            intent.setClassName(context, str);
        }

        public Intent a() {
            return this.a;
        }

        public b b() {
            this.a.putExtra("extra_crossfade", true);
            return this;
        }

        public b c(String str) {
            Intent intent = this.a;
            str.getClass();
            intent.putExtra("title", str);
            return this;
        }
    }

    public z0(String str) {
        this.a = str;
    }

    public b a(Context context) {
        context.getClass();
        return b(context, "spotify:home");
    }

    public b b(Context context, String str) {
        str.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(67108864);
        intent.putExtra("is_internal_navigation", true);
        context.getClass();
        return new b(context, intent, this.a, null);
    }

    public b c(Context context) {
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.player.SHOW");
        intent.setFlags(805306368);
        context.getClass();
        return new b(context, intent, this.a, null);
    }
}
