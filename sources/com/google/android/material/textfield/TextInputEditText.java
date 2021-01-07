package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;
import java.util.Locale;

public class TextInputEditText extends AppCompatEditText {
    private final Rect f;
    private boolean n;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.editTextStyle);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.n && rect != null) {
            textInputLayout.getFocusedRect(this.f);
            rect.bottom = this.f.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.n || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f, point);
            rect.bottom = this.f.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.r()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.r() && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            CharSequence helperText = textInputLayout.getHelperText();
            CharSequence error = textInputLayout.getError();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            String str = "";
            String charSequence = z2 ? hint.toString() : str;
            StringBuilder V0 = je.V0(charSequence);
            V0.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : str);
            StringBuilder V02 = je.V0(V0.toString());
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = str;
            }
            V02.append((Object) helperText);
            String sb = V02.toString();
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) text);
                if (!TextUtils.isEmpty(sb)) {
                    str = je.x0(", ", sb);
                }
                sb2.append(str);
                str = sb2.toString();
            } else if (!TextUtils.isEmpty(sb)) {
                str = sb;
            }
            accessibilityNodeInfo.setText(str);
        }
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.n) {
            this.f.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C0707R.dimen.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.n = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, 0), attributeSet, i);
        this.f = new Rect();
        TypedArray f2 = j.f(context, attributeSet, pw.O, i, C0707R.style.res_2132083760_widget_design_textinputedittext, new int[0]);
        setTextInputLayoutFocusedRectEnabled(f2.getBoolean(0, false));
        f2.recycle();
    }
}
