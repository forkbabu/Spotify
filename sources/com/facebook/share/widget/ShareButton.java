package com.facebook.share.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.i;
import com.facebook.share.b;
import com.facebook.share.model.d;
import com.spotify.music.C0707R;

public final class ShareButton extends d {
    public ShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.share.widget.d, com.facebook.h
    public void e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.e(context, attributeSet, i, i2);
        setCompoundDrawablesWithIntrinsicBounds(i0.b(getContext(), C0707R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Share.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public int getDefaultStyleResource() {
        return C0707R.style.com_facebook_button_share;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.share.widget.d
    public i<d, b> getDialog() {
        if (getFragment() != null) {
            return new ShareDialog(getFragment(), getRequestCode());
        }
        if (getNativeFragment() != null) {
            return new ShareDialog(getNativeFragment(), getRequestCode());
        }
        return new ShareDialog(getActivity(), getRequestCode());
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_share_button_create", "fb_share_button_did_tap");
    }
}
