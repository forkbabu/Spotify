package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.a;

public class HeaderSecondaryButtonBehavior extends CoordinatorLayout.Behavior<View> {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof a;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (!(view2 instanceof a)) {
            return false;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view2.getLayoutParams();
        CoordinatorLayout.Behavior c = eVar != null ? eVar.c() : null;
        c.getClass();
        q4.A(view, (((HeaderBehavior) c).p() + view2.getHeight()) - view.getTop());
        return true;
    }
}
