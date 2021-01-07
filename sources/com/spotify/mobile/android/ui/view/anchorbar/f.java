package com.spotify.mobile.android.ui.view.anchorbar;

import com.spotify.mobile.android.ui.view.anchorbar.AnchorItem;

public abstract class f implements AnchorItem {
    private final AnchorBar a;
    protected boolean b = false;
    private final int c;

    protected f(AnchorBar anchorBar, int i, String str) {
        this.a = anchorBar;
        this.c = i;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void b(AnchorItem.Type type, AnchorItem.Priority priority) {
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public AnchorItem.Priority c() {
        return AnchorItem.Priority.DEFAULT;
    }

    public int d() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public AnchorItem.Type getType() {
        return AnchorItem.Type.DEFAULT;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public boolean isVisible() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem, com.spotify.mobile.android.ui.view.anchorbar.d
    public void setVisible(boolean z) {
        boolean z2 = this.b != z;
        this.b = z;
        if (z2) {
            this.a.i(this, z);
        }
    }
}
