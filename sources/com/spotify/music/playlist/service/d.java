package com.spotify.music.playlist.service;

import android.content.Context;
import com.spotify.music.playlist.service.b;

public final class d implements b.a {
    @Override // com.spotify.music.playlist.service.b.a
    public b a(Context context) {
        if (context != null) {
            return new c(context);
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", 1));
    }
}
