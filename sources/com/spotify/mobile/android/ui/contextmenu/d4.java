package com.spotify.mobile.android.ui.contextmenu;

import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.contextmenu.model.c;

public class d4 {
    private final boolean a;
    private final ImmutableList<Drawable> b;
    private final c.a c;

    public d4(boolean z, ImmutableList<Drawable> immutableList, c.a aVar) {
        this.a = z;
        this.b = immutableList;
        this.c = aVar;
    }

    public c.a a() {
        return this.c;
    }

    public ImmutableList<Drawable> b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }
}
