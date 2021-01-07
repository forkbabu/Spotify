package com.spotify.termsandconditions;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ TermsAndConditionsView a;
    public final /* synthetic */ View b;

    public /* synthetic */ g(TermsAndConditionsView termsAndConditionsView, View view) {
        this.a = termsAndConditionsView;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TermsAndConditionsView termsAndConditionsView = this.a;
        View view = this.b;
        termsAndConditionsView.getClass();
        Rect rect = new Rect();
        if (!(termsAndConditionsView.getGlobalVisibleRect(rect) && termsAndConditionsView.getHeight() == rect.height() && termsAndConditionsView.getWidth() == rect.width())) {
            ViewGroup viewGroup = (ViewGroup) termsAndConditionsView.getParent();
            int indexOfChild = viewGroup.indexOfChild(termsAndConditionsView);
            int indexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(termsAndConditionsView);
            viewGroup.addView(termsAndConditionsView, indexOfChild2);
            viewGroup.removeView(view);
            viewGroup.addView(view, indexOfChild);
        }
    }
}
