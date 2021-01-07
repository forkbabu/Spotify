package com.facebook.share.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.h;
import com.spotify.music.C0707R;

@Deprecated
public class n extends h {
    @Deprecated
    public n(Context context, boolean z) {
        super(context, null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
        setSelected(z);
    }

    private void f() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(C0707R.drawable.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(C0707R.string.com_facebook_like_button_liked));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(i0.b(getContext(), C0707R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        setText(getResources().getString(C0707R.string.com_facebook_like_button_not_liked));
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public void e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.e(context, attributeSet, i, i2);
        f();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public int getDefaultRequestCode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public int getDefaultStyleResource() {
        return C0707R.style.com_facebook_button_like;
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public void setSelected(boolean z) {
        super.setSelected(z);
        f();
    }
}
