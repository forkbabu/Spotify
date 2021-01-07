package com.spotify.music.features.yourlibrary.container.view;

import android.view.View;
import com.spotify.music.features.yourlibrary.container.view.GroupedTabLayout;

public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ GroupedTabLayout.d a;

    public /* synthetic */ i(GroupedTabLayout.d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GroupedTabLayout.d dVar = this.a;
        int i = GroupedTabLayout.y;
        l lVar = (l) dVar;
        lVar.a.n(lVar.b);
    }
}
