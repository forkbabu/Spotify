package com.spotify.music.builtinauth.cache;

import android.content.Context;
import androidx.room.h;

public final class o0 implements fjf<AuthCacheRoomDatabase> {
    private final wlf<Context> a;

    public o0(wlf<Context> wlf) {
        this.a = wlf;
    }

    public static AuthCacheRoomDatabase a(Context context) {
        return (AuthCacheRoomDatabase) h.a(context.getApplicationContext(), AuthCacheRoomDatabase.class, "auth-cache.db").d();
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
