package com.spotify.music.storylines.service;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.f;
import com.spotify.mobile.android.service.plugininterfaces.d;

public class k implements d {
    private final Context a;
    private final djd b;

    public k(Context context, djd djd) {
        this.a = context;
        this.b = djd;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.b.a() && !this.b.b()) {
            Context context = this.a;
            int i = StorylinesUrisFetcher.w;
            f.a(context, StorylinesUrisFetcher.class, 4431, new Intent());
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "Storylines";
    }
}
