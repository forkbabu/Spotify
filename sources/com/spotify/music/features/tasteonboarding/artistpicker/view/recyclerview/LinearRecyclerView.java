package com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

public class LinearRecyclerView extends RecyclerView {
    public LinearRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T0();
    }

    private void T0() {
        setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        setHasFixedSize(true);
        setClipToPadding(false);
        setLayoutManager(new LinearLayoutManager(getContext()));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0707R.dimen.std_16dp);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getResources().getDimensionPixelSize(C0707R.dimen.solar_button_height) + dimensionPixelSize + getResources().getDimensionPixelSize(C0707R.dimen.std_16dp));
    }

    public LinearRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0();
    }
}
