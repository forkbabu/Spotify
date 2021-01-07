package android.support.wearable.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.WindowInsets;
import android.widget.FrameLayout;

@Deprecated
public class WatchViewStub extends FrameLayout {
    private boolean a;
    private int b;
    private int c;
    private boolean f;
    private boolean n;
    private boolean o;
    private a p;

    public interface a {
        void a(WatchViewStub watchViewStub);
    }

    public WatchViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        removeAllViews();
        if (this.c == 0 && !isInEditMode()) {
            throw new IllegalStateException("You must supply a roundLayout resource");
        } else if (this.b != 0 || isInEditMode()) {
            LayoutInflater.from(getContext()).inflate(this.a ? this.c : this.b, this);
            this.f = false;
            a aVar = this.p;
            if (aVar != null) {
                aVar.a(this);
            }
        } else {
            throw new IllegalStateException("You must supply a rectLayout resource");
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.n = true;
        boolean isRound = windowInsets.isRound();
        if (isRound != this.a) {
            this.a = isRound;
            this.f = true;
        }
        if (this.f) {
            a();
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        this.o = (context instanceof Activity) && (((Activity) context).getWindow().getAttributes().flags & 33554432) != 0;
        this.n = false;
        requestApplyInsets();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.o) {
            boolean z2 = this.n;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f && !this.o) {
            a();
        }
        super.onMeasure(i, i2);
    }

    public void setOnLayoutInflatedListener(a aVar) {
        this.p = aVar;
    }

    public void setRectLayout(int i) {
        if (this.f) {
            this.b = i;
        }
    }

    public void setRoundLayout(int i) {
        if (this.f) {
            this.c = i;
        }
    }

    public WatchViewStub(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.n, 0, 0);
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        this.c = obtainStyledAttributes.getResourceId(1, 0);
        this.f = true;
        obtainStyledAttributes.recycle();
    }
}
