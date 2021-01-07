package com.spotify.mobile.android.ui.view.anchorbar;

import android.content.Intent;
import java.util.Set;

public class e {
    private final Set<c> a;

    public e(Set<c> set) {
        this.a = set;
    }

    public void a(Intent intent) {
        for (c cVar : this.a) {
            cVar.P0(intent);
        }
    }

    public void b(AnchorBar anchorBar) {
        for (c cVar : this.a) {
            cVar.r2(anchorBar);
        }
    }
}
