package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;

public class d1 {
    private final Context a;
    private boolean b;

    public d1(Context context) {
        this.a = context;
    }

    public void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            l70.k(this.a).b(z);
        }
    }

    public ToolbarConfig.Visibility b() {
        if (this.b) {
            return ToolbarConfig.Visibility.ONLY_MAKE_ROOM;
        }
        return ToolbarConfig.Visibility.SHOW;
    }
}
