package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* access modifiers changed from: package-private */
public class j implements View.OnTouchListener {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ h b;

    j(h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = hVar;
        this.a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.b.v()) {
                this.b.i = false;
            }
            h.o(this.b, this.a);
        }
        return false;
    }
}
