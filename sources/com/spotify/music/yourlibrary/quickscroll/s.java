package com.spotify.music.yourlibrary.quickscroll;

import android.view.View;

/* access modifiers changed from: package-private */
public class s {
    private final k a;

    s(k kVar) {
        this.a = kVar;
    }

    /* access modifiers changed from: package-private */
    public int a(View view) {
        if (this.a.i()) {
            return view.getPaddingLeft();
        }
        return view.getPaddingRight();
    }

    /* access modifiers changed from: package-private */
    public void b(View view, int i) {
        if (this.a.i()) {
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }
}
