package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.h;
import com.facebook.internal.i;
import com.facebook.k;
import com.facebook.share.b;

public abstract class d extends h {
    private com.facebook.share.model.d r;
    private int s = 0;
    private boolean t = false;

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!uf.c(this)) {
                try {
                    d.this.d(view);
                    d.this.getDialog().g(d.this.getShareContent());
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    protected d(Context context, AttributeSet attributeSet, int i, String str, String str2) {
        super(context, attributeSet, i, 0, str, str2);
        this.s = isInEditMode() ? 0 : getDefaultRequestCode();
        setEnabled(false);
        this.t = false;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.h
    public void e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.e(context, attributeSet, i, i2);
        setInternalOnClickListener(getShareOnClickListener());
    }

    /* access modifiers changed from: protected */
    public abstract i<com.facebook.share.model.d, b> getDialog();

    @Override // com.facebook.h
    public int getRequestCode() {
        return this.s;
    }

    public com.facebook.share.model.d getShareContent() {
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

    /* access modifiers changed from: protected */
    public void setRequestCode(int i) {
        if (!k.s(i)) {
            this.s = i;
            return;
        }
        throw new IllegalArgumentException(je.q0("Request code ", i, " cannot be within the range reserved by the Facebook SDK."));
    }

    public void setShareContent(com.facebook.share.model.d dVar) {
        this.r = dVar;
        if (!this.t) {
            setEnabled(getDialog().a(getShareContent()));
            this.t = false;
        }
    }
}
