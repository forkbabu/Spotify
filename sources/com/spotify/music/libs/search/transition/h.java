package com.spotify.music.libs.search.transition;

import android.content.Context;

public class h implements g {
    private final boolean a;

    h(boolean z) {
        this.a = z;
    }

    @Override // com.spotify.music.libs.search.transition.g
    public f a(Context context) {
        if (this.a) {
            return new j(context);
        }
        return new FindSearchFieldViewOldImpl(context, null);
    }
}
