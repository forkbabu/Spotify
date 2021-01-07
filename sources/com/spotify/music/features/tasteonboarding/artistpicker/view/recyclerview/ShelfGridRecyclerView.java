package com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

public class ShelfGridRecyclerView extends RecyclerView {
    private static int O0;

    public ShelfGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T0();
    }

    private void T0() {
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        setHasFixedSize(true);
        setLayoutManager(new GridLayoutManager(getContext(), 2, 0, false));
    }

    public int getNumOfItemsInPage() {
        return O0 * 2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        RecyclerView.e adapter = getAdapter();
        if (size > 0 && getAdapter() != null && adapter.u() > 0) {
            int dimensionPixelSize = size - (getResources().getDimensionPixelSize(C0707R.dimen.std_8dp) * 2);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0707R.dimen.taste_picker_artist_name_height);
            int max = Math.max(dimensionPixelSize / ((Math.round(((float) size) * 0.7f) / 2) - dimensionPixelSize2), 3);
            O0 = max;
            i2 = z42.A(((dimensionPixelSize / max) + 2 + dimensionPixelSize2) * 2);
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public GridLayoutManager getLayoutManager() {
        return (GridLayoutManager) super.getLayoutManager();
    }

    public ShelfGridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0();
    }
}
