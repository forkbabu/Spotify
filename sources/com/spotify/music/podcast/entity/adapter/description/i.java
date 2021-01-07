package com.spotify.music.podcast.entity.adapter.description;

import android.text.SpannableStringBuilder;
import android.view.View;

class i implements View.OnLayoutChangeListener {
    final /* synthetic */ DescriptionViewBinderModel a;
    final /* synthetic */ SpannableStringBuilder b;
    final /* synthetic */ j c;

    i(j jVar, DescriptionViewBinderModel descriptionViewBinderModel, SpannableStringBuilder spannableStringBuilder) {
        this.c = jVar;
        this.a = descriptionViewBinderModel;
        this.b = spannableStringBuilder;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.c.e.removeOnLayoutChangeListener(this);
        if (this.a.d()) {
            this.c.e(this.b);
        } else {
            this.c.d(this.b);
        }
    }
}
