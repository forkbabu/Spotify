package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.i;
import com.facebook.internal.q;
import com.spotify.music.C0707R;

public abstract class h extends Button {
    private String a;
    private String b;
    private View.OnClickListener c;
    private View.OnClickListener f;
    private boolean n;
    private int o;
    private int p;
    private q q;

    protected h(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        i2 = i2 == 0 ? getDefaultStyleResource() : i2;
        e(context, attributeSet, i, i2 == 0 ? C0707R.style.com_facebook_button : i2);
        this.a = str;
        this.b = str2;
        setClickable(true);
        setFocusable(true);
    }

    static void a(h hVar, Context context) {
        hVar.getClass();
        new i(context).f(hVar.b);
    }

    /* access modifiers changed from: protected */
    public void d(View view) {
        View.OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void e(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(a.b(context, C0707R.color.com_facebook_blue));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
        try {
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes2.getResourceId(0, 0), obtainStyledAttributes2.getResourceId(1, 0), obtainStyledAttributes2.getResourceId(2, 0), obtainStyledAttributes2.getResourceId(3, 0));
            setCompoundDrawablePadding(obtainStyledAttributes2.getDimensionPixelSize(4, 0));
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
            try {
                setPadding(obtainStyledAttributes3.getDimensionPixelSize(0, 0), obtainStyledAttributes3.getDimensionPixelSize(1, 0), obtainStyledAttributes3.getDimensionPixelSize(2, 0), obtainStyledAttributes3.getDimensionPixelSize(3, 0));
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
                try {
                    setTextColor(obtainStyledAttributes4.getColorStateList(0));
                    obtainStyledAttributes4.recycle();
                    TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
                    try {
                        setGravity(obtainStyledAttributes5.getInt(0, 17));
                        obtainStyledAttributes5.recycle();
                        TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                        try {
                            setTextSize(0, (float) obtainStyledAttributes6.getDimensionPixelSize(0, 0));
                            setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes6.getInt(1, 1)));
                            setText(obtainStyledAttributes6.getString(2));
                            obtainStyledAttributes6.recycle();
                            super.setOnClickListener(new g(this));
                        } catch (Throwable th) {
                            obtainStyledAttributes6.recycle();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        obtainStyledAttributes5.recycle();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    obtainStyledAttributes4.recycle();
                    throw th3;
                }
            } catch (Throwable th4) {
                obtainStyledAttributes3.recycle();
                throw th4;
            }
        } catch (Throwable th5) {
            obtainStyledAttributes2.recycle();
            throw th5;
        }
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        boolean z;
        Context context = getContext();
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        throw new FacebookException("Unable to get Activity.");
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (this.n) {
            return this.o;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (this.n) {
            return this.p;
        }
        return super.getCompoundPaddingRight();
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return 0;
    }

    public Fragment getFragment() {
        q qVar = this.q;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public android.app.Fragment getNativeFragment() {
        q qVar = this.q;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public int getRequestCode() {
        return getDefaultRequestCode();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            new i(getContext()).f(this.a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if ((getGravity() & 1) != 0) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - ((int) Math.ceil((double) getPaint().measureText(getText().toString())))) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.o = compoundPaddingLeft - min;
            this.p = compoundPaddingRight + min;
            this.n = true;
        }
        super.onDraw(canvas);
        this.n = false;
    }

    public void setFragment(Fragment fragment) {
        this.q = new q(fragment);
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public void setFragment(android.app.Fragment fragment) {
        this.q = new q(fragment);
    }
}
