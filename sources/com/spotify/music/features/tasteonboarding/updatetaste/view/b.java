package com.spotify.music.features.tasteonboarding.updatetaste.view;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

class b implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ UpdateTasteFragment b;

    b(UpdateTasteFragment updateTasteFragment, View view) {
        this.b = updateTasteFragment;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        TextView textView = (TextView) this.a.findViewById(C0707R.id.textview);
        float primaryHorizontal = textView.getLayout().getPrimaryHorizontal(textView.getText().length());
        ProgressIndicator progressIndicator = (ProgressIndicator) this.a.findViewById(C0707R.id.progress_indicator);
        progressIndicator.setTranslationX(primaryHorizontal - progressIndicator.getX());
        progressIndicator.setTranslationY(-((float) this.b.i0.getLayout().getLineDescent(1)));
    }
}
