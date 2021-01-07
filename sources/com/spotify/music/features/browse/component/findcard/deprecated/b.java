package com.spotify.music.features.browse.component.findcard.deprecated;

import android.view.ViewTreeObserver;

class b implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ FindCardView a;

    b(FindCardView findCardView) {
        this.a = findCardView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        FindCardView.b(this.a).getViewTreeObserver().removeOnPreDrawListener(this);
        FindCardView.b(this.a).setMaxLines(((FindCardView.b(this.a).getMeasuredHeight() - FindCardView.b(this.a).getPaddingTop()) - FindCardView.b(this.a).getPaddingBottom()) / FindCardView.b(this.a).getLineHeight());
        return false;
    }
}
