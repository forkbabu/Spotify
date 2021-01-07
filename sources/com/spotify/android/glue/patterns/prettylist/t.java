package com.spotify.android.glue.patterns.prettylist;

import android.view.View;

public interface t {

    public interface a {
        void a(int i, float f);
    }

    void a(a aVar);

    int getStickinessOffset();

    void setHeaderBackgroundColor(int i);

    void setHeaderView(View view);

    void setSticky(boolean z);

    void setStickyView(View view);

    void setStickyViewOffset(int i);
}
