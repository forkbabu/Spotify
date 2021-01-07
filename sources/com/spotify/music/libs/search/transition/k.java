package com.spotify.music.libs.search.transition;

import android.content.Intent;
import android.graphics.Rect;
import android.view.View;

public final class k {
    public static Intent a(Intent intent, Rect rect, String str, String str2) {
        intent.putExtra("EXTRA_TRANSITION_PARAMS", new e(rect, str, str2));
        return intent;
    }

    public static Rect b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float scaleX = view.getScaleX();
        for (View view2 = (View) view.getParent(); view2.getParent() instanceof View; view2 = (View) view2.getParent()) {
            scaleX *= view2.getScaleX();
        }
        float scaleY = view.getScaleY();
        for (View view3 = (View) view.getParent(); view3.getParent() instanceof View; view3 = (View) view3.getParent()) {
            scaleY *= view3.getScaleY();
        }
        int round = Math.round(((1.0f - scaleX) * ((float) view.getMeasuredWidth())) / 2.0f);
        int round2 = Math.round(((1.0f - scaleY) * ((float) view.getMeasuredHeight())) / 2.0f);
        return new Rect(iArr[0] - round, iArr[1] - round2, (view.getMeasuredWidth() + iArr[0]) - round, (view.getMeasuredHeight() + iArr[1]) - round2);
    }
}
