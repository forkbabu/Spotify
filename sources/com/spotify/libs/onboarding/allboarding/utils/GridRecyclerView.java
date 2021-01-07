package com.spotify.libs.onboarding.allboarding.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController;
import android.view.animation.LayoutAnimationController;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class GridRecyclerView extends RecyclerView {

    public static final class a extends GridLayoutManager.b {
        final /* synthetic */ GridLayoutManager d;
        final /* synthetic */ GridRecyclerView e;

        a(GridLayoutManager gridLayoutManager, GridRecyclerView gridRecyclerView) {
            this.d = gridLayoutManager;
            this.e = gridRecyclerView;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int e(int i) {
            RecyclerView.e adapter = this.e.getAdapter();
            h.c(adapter);
            int w = adapter.w(i);
            if (w == C0707R.layout.allboarding_item_header) {
                return this.d.C2();
            }
            if (w == C0707R.layout.allboarding_item_banner) {
                return this.d.C2() / this.e.getResources().getInteger(C0707R.integer.allboarding_row_number_of_items_2);
            }
            return this.d.C2() / this.e.getResources().getInteger(C0707R.integer.allboarding_row_number_of_items_3);
        }
    }

    public GridRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public void attachLayoutAnimationParameters(View view, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        int i3;
        h.e(view, "child");
        h.e(layoutParams, "params");
        RecyclerView.e adapter = getAdapter();
        h.c(adapter);
        int w = adapter.w(i);
        if (w == C0707R.layout.allboarding_item_header) {
            i3 = 1;
        } else if (w == C0707R.layout.allboarding_item_banner) {
            i3 = getResources().getInteger(C0707R.integer.allboarding_row_number_of_items_2);
        } else {
            i3 = getResources().getInteger(C0707R.integer.allboarding_row_number_of_items_3);
        }
        GridLayoutAnimationController.AnimationParameters animationParameters = (GridLayoutAnimationController.AnimationParameters) layoutParams.layoutAnimationParameters;
        if (animationParameters == null) {
            animationParameters = new GridLayoutAnimationController.AnimationParameters();
        }
        layoutParams.layoutAnimationParameters = animationParameters;
        animationParameters.count = i2;
        animationParameters.index = i;
        animationParameters.columnsCount = i3;
        int i4 = i2 / i3;
        animationParameters.rowsCount = i4;
        int i5 = (i2 - 1) - i;
        animationParameters.column = (i3 - 1) - (i5 % i3);
        animationParameters.row = (i4 - 1) - (i5 / i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 30);
        gridLayoutManager.K2(new a(gridLayoutManager, this));
        setLayoutManager(gridLayoutManager);
        LayoutAnimationController loadLayoutAnimation = AnimationUtils.loadLayoutAnimation(context, C0707R.anim.artist_picker_item_animation);
        Animation animation = loadLayoutAnimation.getAnimation();
        h.d(animation, "animation");
        animation.setInterpolator(new a());
        Animation animation2 = loadLayoutAnimation.getAnimation();
        h.d(animation2, "animation");
        animation2.setDuration(800);
        setLayoutAnimation(loadLayoutAnimation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public GridLayoutManager getLayoutManager() {
        RecyclerView.m layoutManager = super.getLayoutManager();
        h.c(layoutManager);
        return (GridLayoutManager) layoutManager;
    }
}
