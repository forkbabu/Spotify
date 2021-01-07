package com.spotify.android.glue.patterns.prettylist;

import android.view.View;

public interface m {
    void a(boolean z);

    void b(boolean z);

    PrettyHeaderView getPrettyHeaderView();

    View getView();

    void setFilterView(View view);

    void setHeaderAccessory(View view);

    void setHeaderBackgroundColor(int i);

    void setHeaderSticky(boolean z);

    void setTitle(String str);

    void setToolbarUpdater(u uVar);
}
