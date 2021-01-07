package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.h;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.k;
import com.facebook.share.model.d;
import com.spotify.music.C0707R;

public final class DeviceShareButton extends h {
    private d r;
    private int s = 0;
    private boolean t = false;
    private com.facebook.share.a u = null;

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!uf.c(this)) {
                try {
                    DeviceShareButton.this.d(view);
                    DeviceShareButton.this.getDialog().g(DeviceShareButton.this.getShareContent());
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    public DeviceShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_device_share_button_create", "fb_device_share_button_did_tap");
        this.s = isInEditMode() ? 0 : getDefaultRequestCode();
        setEnabled(false);
        this.t = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private com.facebook.share.a getDialog() {
        com.facebook.share.a aVar = this.u;
        if (aVar != null) {
            return aVar;
        }
        if (getFragment() != null) {
            this.u = new com.facebook.share.a(getFragment());
        } else if (getNativeFragment() != null) {
            this.u = new com.facebook.share.a(getNativeFragment());
        } else {
            this.u = new com.facebook.share.a(getActivity());
        }
        return this.u;
    }

    private void setRequestCode(int i) {
        if (!k.s(i)) {
            this.s = i;
            return;
        }
        throw new IllegalArgumentException(je.q0("Request code ", i, " cannot be within the range reserved by the Facebook SDK."));
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public void e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.e(context, attributeSet, i, i2);
        setInternalOnClickListener(getShareOnClickListener());
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

    @Override // com.facebook.h
    public int getRequestCode() {
        return this.s;
    }

    public d getShareContent() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public View.OnClickListener getShareOnClickListener() {
        return new a();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.t = true;
    }

    public void setShareContent(d dVar) {
        this.r = dVar;
        if (!this.t) {
            setEnabled(new com.facebook.share.a(getActivity()).a(getShareContent()));
            this.t = false;
        }
    }
}
