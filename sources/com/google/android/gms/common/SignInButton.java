package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p0;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamic.RemoteCreator;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    private int a;
    private int b;
    private View c;
    private View.OnClickListener f;

    public SignInButton(@RecentlyNonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i, int i2) {
        this.a = i;
        this.b = i2;
        Context context = getContext();
        View view = this.c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.c = p0.c(context, this.a, this.b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i3 = this.a;
            int i4 = this.b;
            s sVar = new s(context);
            sVar.b(context.getResources(), i3, i4);
            this.c = sVar;
        }
        addView(this.c);
        this.c.setEnabled(isEnabled());
        this.c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@RecentlyNonNull View view) {
        View.OnClickListener onClickListener = this.f;
        if (onClickListener != null && view == this.c) {
            onClickListener.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        a(this.a, i);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
        View view = this.c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(@RecentlyNonNull Scope[] scopeArr) {
        a(this.a, this.b);
    }

    public final void setSize(int i) {
        a(i, this.b);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(@RecentlyNonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, uq.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getInt(0, 0);
            this.b = obtainStyledAttributes.getInt(1, 2);
            obtainStyledAttributes.recycle();
            a(this.a, this.b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
