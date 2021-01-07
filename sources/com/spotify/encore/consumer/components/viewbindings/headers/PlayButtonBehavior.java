package com.spotify.encore.consumer.components.viewbindings.headers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import java.util.Iterator;
import kotlin.jvm.internal.h;

public final class PlayButtonBehavior extends CoordinatorLayout.Behavior<PlayButtonView> {
    private Toolbar toolbar;

    public PlayButtonBehavior() {
    }

    private final Toolbar getToolbar(View view) {
        if (this.toolbar == null) {
            this.toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        }
        return this.toolbar;
    }

    private final void updatePlayButtonTranslationY(PlayButtonView playButtonView, View view, Toolbar toolbar2) {
        float f;
        float height = (float) toolbar2.getHeight();
        float y = view.getY() + ((float) view.getHeight());
        if (y <= ((float) (playButtonView.getPlayButtonHeightWithoutShuffleBadge() / 2)) + height) {
            f = height - ((float) (playButtonView.getPlayButtonHeightWithoutShuffleBadge() / 2));
        } else {
            f = y - ((float) playButtonView.getPlayButtonHeightWithoutShuffleBadge());
        }
        playButtonView.setTranslationY(f);
    }

    public PlayButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, PlayButtonView playButtonView, View view) {
        h.e(coordinatorLayout, "parent");
        h.e(playButtonView, "child");
        h.e(view, "dependency");
        return (view instanceof AppBarLayout) && getToolbar(view) != null;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, PlayButtonView playButtonView, View view) {
        h.e(coordinatorLayout, "parent");
        h.e(playButtonView, "child");
        h.e(view, "dependency");
        Toolbar toolbar2 = this.toolbar;
        h.c(toolbar2);
        updatePlayButtonTranslationY(playButtonView, view, toolbar2);
        return super.onDependentViewChanged(coordinatorLayout, (CoordinatorLayout) playButtonView, view);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, PlayButtonView playButtonView, int i) {
        Object obj;
        h.e(coordinatorLayout, "parent");
        h.e(playButtonView, "child");
        Iterator<View> it = ((v4) e4.b(coordinatorLayout)).iterator();
        while (true) {
            w4 w4Var = (w4) it;
            if (!w4Var.hasNext()) {
                obj = null;
                break;
            }
            obj = w4Var.next();
            if (((View) obj) instanceof AppBarLayout) {
                break;
            }
        }
        View view = (View) obj;
        if (!(view == null || getToolbar(view) == null)) {
            Toolbar toolbar2 = this.toolbar;
            h.c(toolbar2);
            updatePlayButtonTranslationY(playButtonView, view, toolbar2);
        }
        return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) playButtonView, i);
    }
}
