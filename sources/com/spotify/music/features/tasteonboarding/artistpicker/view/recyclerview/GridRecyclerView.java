package com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController;
import android.view.animation.LayoutAnimationController;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

public class GridRecyclerView extends RecyclerView {
    public GridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T0();
    }

    private void T0() {
        setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        setHasFixedSize(true);
        setClipToPadding(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0707R.dimen.std_24dp);
        int round = Math.round(getResources().getDimension(C0707R.dimen.solar_button_height));
        int round2 = Math.round(getResources().getDimension(C0707R.dimen.std_8dp));
        setPadding(round2, getPaddingTop(), round2, round + dimensionPixelSize);
        setLayoutManager(new GridLayoutManager(getContext(), 3));
        LayoutAnimationController loadLayoutAnimation = AnimationUtils.loadLayoutAnimation(getContext(), C0707R.anim.artist_picker_item_animation);
        loadLayoutAnimation.getAnimation().setInterpolator(new po8());
        loadLayoutAnimation.getAnimation().setDuration(800);
        setLayoutAnimation(loadLayoutAnimation);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public void attachLayoutAnimationParameters(View view, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
        gridLayoutManager.getClass();
        int C2 = gridLayoutManager.C2();
        GridLayoutAnimationController.AnimationParameters animationParameters = (GridLayoutAnimationController.AnimationParameters) layoutParams.layoutAnimationParameters;
        if (animationParameters == null) {
            animationParameters = new GridLayoutAnimationController.AnimationParameters();
            layoutParams.layoutAnimationParameters = animationParameters;
        }
        animationParameters.count = i2;
        animationParameters.index = i;
        animationParameters.columnsCount = C2;
        int i3 = i2 / C2;
        animationParameters.rowsCount = i3;
        int i4 = (i2 - 1) - i;
        animationParameters.column = (C2 - 1) - (i4 % C2);
        animationParameters.row = (i3 - 1) - (i4 / C2);
    }

    public GridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0();
    }
}
