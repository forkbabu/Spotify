package com.spotify.music.libs.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;

public class BackKeyEditText extends AppCompatEditText {
    private a f;

    public interface a {
    }

    public BackKeyEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842862);
    }

    public a getListener() {
        return this.f;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        a aVar;
        if (i != 4 || keyEvent.getAction() != 1 || (aVar = this.f) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        ((e) aVar).a.n();
        return true;
    }

    public void setBackKeyListener(a aVar) {
        this.f = aVar;
    }

    public BackKeyEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rud.a(this, context);
    }
}
