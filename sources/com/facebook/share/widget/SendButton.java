package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.i;
import com.facebook.share.b;
import com.facebook.share.model.d;
import com.spotify.music.C0707R;

@Deprecated
public final class SendButton extends d {
    public SendButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Message.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public int getDefaultStyleResource() {
        return C0707R.style.com_facebook_button_send;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.share.widget.d
    public i<d, b> getDialog() {
        if (getFragment() != null) {
            return new b(getFragment(), getRequestCode());
        }
        if (getNativeFragment() != null) {
            return new b(getNativeFragment(), getRequestCode());
        }
        return new b(getActivity(), getRequestCode());
    }

    public SendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_send_button_create", "fb_send_button_did_tap");
    }
}
