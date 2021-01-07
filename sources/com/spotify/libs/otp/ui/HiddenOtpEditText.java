package com.spotify.libs.otp.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.widget.AppCompatEditText;

public class HiddenOtpEditText extends AppCompatEditText {
    private a f;

    public interface a {
    }

    private class b extends InputConnectionWrapper {
        public b(InputConnection inputConnection) {
            super(inputConnection, true);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            if (HiddenOtpEditText.this.f == null || i <= 0) {
                return false;
            }
            a aVar = HiddenOtpEditText.this.f;
            ((h) aVar).a.o(HiddenOtpEditText.this);
            return true;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getAction() != 0 || !HiddenOtpEditText.this.c(keyEvent.getKeyCode())) {
                return super.sendKeyEvent(keyEvent);
            }
            return true;
        }
    }

    public HiddenOtpEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean c(int i) {
        a aVar = this.f;
        if (aVar == null || i != 67) {
            return false;
        }
        return ((h) aVar).a.o(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipRect(0, 0, 0, 0);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new b(super.onCreateInputConnection(editorInfo));
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.widget.TextView, android.view.KeyEvent.Callback, android.view.View
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (c(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setOnDeleteListener(a aVar) {
        this.f = aVar;
    }

    public HiddenOtpEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
