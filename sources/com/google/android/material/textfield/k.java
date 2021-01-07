package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;

/* access modifiers changed from: package-private */
public class k implements AutoCompleteTextView.OnDismissListener {
    final /* synthetic */ h a;

    k(h hVar) {
        this.a = hVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        this.a.i = true;
        this.a.k = System.currentTimeMillis();
        h.f(this.a, false);
    }
}
