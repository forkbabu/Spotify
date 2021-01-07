package com.spotify.mobile.android.ui.view.anchorbar;

import android.view.ViewGroup;

public interface AnchorItem extends d {

    public enum Priority {
        DEFAULT,
        HIGH;
        
        public static final Priority[] c = values();
    }

    public enum Type {
        DEFAULT,
        NAVIGATION
    }

    void a(ViewGroup viewGroup);

    void b(Type type, Priority priority);

    Priority c();

    Type getType();

    boolean isVisible();

    @Override // com.spotify.mobile.android.ui.view.anchorbar.d
    void setVisible(boolean z);
}
