package com.spotify.music.features.yourlibrary.container.view;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashSet;
import java.util.Set;

public class ListenableScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private final Set<a> g = new HashSet(2);

    /* access modifiers changed from: package-private */
    public interface a {
        void b(CoordinatorLayout coordinatorLayout, View view, View view2);
    }

    public void l(a aVar) {
        this.g.add(aVar);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.onDependentViewChanged(coordinatorLayout, view, view2);
        for (a aVar : this.g) {
            aVar.b(coordinatorLayout, view, view2);
        }
        return false;
    }
}
