package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.c;
import androidx.core.widget.g;
import defpackage.m3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements p4, g, b {
    private final e mBackgroundTintHelper;
    private Future<m3> mPrecomputedTextFuture;
    private final l mTextClassifierHelper;
    private final m mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<m3> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                c.m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.d) {
            return super.getAutoSizeMaxTextSize();
        }
        m mVar = this.mTextHelper;
        if (mVar != null) {
            return mVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b.d) {
            return super.getAutoSizeMinTextSize();
        }
        m mVar = this.mTextHelper;
        if (mVar != null) {
            return mVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b.d) {
            return super.getAutoSizeStepGranularity();
        }
        m mVar = this.mTextHelper;
        if (mVar != null) {
            return mVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        m mVar = this.mTextHelper;
        return mVar != null ? mVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (!b.d) {
            m mVar = this.mTextHelper;
            if (mVar != null) {
                return mVar.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // defpackage.p4
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // defpackage.p4
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        l lVar;
        if (Build.VERSION.SDK_INT >= 28 || (lVar = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return lVar.a();
    }

    public m3.a getTextMetricsParamsCompat() {
        return c.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        k0.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m mVar = this.mTextHelper;
        if (mVar != null && !b.d && mVar.l()) {
            this.mTextHelper.c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.r(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.s(iArr, i);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.t(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.p(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            c.i(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            c.j(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        c.k(this, i);
    }

    public void setPrecomputedText(m3 m3Var) {
        c.m(this, m3Var);
    }

    @Override // defpackage.p4
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    @Override // defpackage.p4
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // androidx.core.widget.g
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.u(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.g
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.v(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        l lVar;
        if (Build.VERSION.SDK_INT >= 28 || (lVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            lVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<m3> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m3.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            TextDirectionHeuristic d = aVar.d();
            int i2 = 1;
            if (!(d == TextDirectionHeuristics.FIRSTSTRONG_RTL || d == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
                if (d == TextDirectionHeuristics.ANYRTL_LTR) {
                    i2 = 2;
                } else if (d == TextDirectionHeuristics.LTR) {
                    i2 = 3;
                } else if (d == TextDirectionHeuristics.RTL) {
                    i2 = 4;
                } else if (d == TextDirectionHeuristics.LOCALE) {
                    i2 = 5;
                } else if (d == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i2 = 6;
                } else if (d == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i2 = 7;
                }
            }
            setTextDirection(i2);
        }
        if (i < 23) {
            float textScaleX = aVar.e().getTextScaleX();
            getPaint().set(aVar.e());
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.e());
        setBreakStrategy(aVar.b());
        setHyphenationFrequency(aVar.c());
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (b.d) {
            super.setTextSize(i, f);
            return;
        }
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.w(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : v2.a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(e0.a(context), attributeSet, i);
        c0.a(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.d(attributeSet, i);
        m mVar = new m(this);
        this.mTextHelper = mVar;
        mVar.m(attributeSet, i);
        mVar.b();
        this.mTextClassifierHelper = new l(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? i0.b(context, i) : null;
        Drawable b2 = i2 != 0 ? i0.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? i0.b(context, i3) : null;
        if (i4 != 0) {
            drawable = i0.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? i0.b(context, i) : null;
        Drawable b2 = i2 != 0 ? i0.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? i0.b(context, i3) : null;
        if (i4 != 0) {
            drawable = i0.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        m mVar = this.mTextHelper;
        if (mVar != null) {
            mVar.b();
        }
    }
}
