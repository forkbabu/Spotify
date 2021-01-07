package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.spotify.music.C0707R;

public class StateListAnimatorButton extends AppCompatButton implements zud {
    private rvd mButtonTintHelper;
    private d mScaleLogic = new c(null);
    private yud mStateListAnimatorHelper;

    /* access modifiers changed from: private */
    public class b implements d {
        private float a = 1.0f;
        private float b = 1.0f;

        b(a aVar) {
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public void a(Canvas canvas) {
            canvas.save();
            canvas.translate(((float) StateListAnimatorButton.this.getWidth()) / 2.0f, ((float) StateListAnimatorButton.this.getHeight()) / 2.0f);
            canvas.scale(this.a, this.b);
            canvas.translate(((float) (-StateListAnimatorButton.this.getWidth())) / 2.0f, ((float) (-StateListAnimatorButton.this.getHeight())) / 2.0f);
            StateListAnimatorButton.super.onDraw(canvas);
            canvas.restore();
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public void b(float f) {
            this.a = f;
            StateListAnimatorButton stateListAnimatorButton = StateListAnimatorButton.this;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            stateListAnimatorButton.postInvalidateOnAnimation();
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public float c() {
            return this.a;
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public void d(float f) {
            this.b = f;
            StateListAnimatorButton stateListAnimatorButton = StateListAnimatorButton.this;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            stateListAnimatorButton.postInvalidateOnAnimation();
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public float e() {
            return this.b;
        }
    }

    /* access modifiers changed from: private */
    public class c implements d {
        c(a aVar) {
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public void a(Canvas canvas) {
            StateListAnimatorButton.super.onDraw(canvas);
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public void b(float f) {
            StateListAnimatorButton.super.setScaleX(f);
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public float c() {
            return StateListAnimatorButton.super.getScaleX();
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public void d(float f) {
            StateListAnimatorButton.super.setScaleY(f);
        }

        @Override // com.spotify.paste.widgets.internal.StateListAnimatorButton.d
        public float e() {
            return StateListAnimatorButton.super.getScaleY();
        }
    }

    /* access modifiers changed from: private */
    public interface d {
        void a(Canvas canvas);

        void b(float f);

        float c();

        void d(float f);

        float e();
    }

    public StateListAnimatorButton(Context context) {
        super(context);
        init(null, 0);
    }

    private void init(AttributeSet attributeSet, int i) {
        this.mStateListAnimatorHelper = new yud(this);
        dvd.a(this).a();
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{C0707R.attr.glueFullBleed});
            try {
                z = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.mScaleLogic = z ? new b(null) : new c(null);
        int i2 = uvd.a;
        rvd rvd = new rvd(this, pvd.a);
        this.mButtonTintHelper = rvd;
        rvd.b(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        rvd rvd = this.mButtonTintHelper;
        if (rvd != null) {
            rvd.a();
        }
        yud yud = this.mStateListAnimatorHelper;
        if (yud != null) {
            yud.a();
        }
    }

    @Override // android.view.View
    public float getScaleX() {
        d dVar = this.mScaleLogic;
        if (dVar != null) {
            return dVar.c();
        }
        return super.getScaleX();
    }

    @Override // android.view.View
    public float getScaleY() {
        d dVar = this.mScaleLogic;
        if (dVar != null) {
            return dVar.e();
        }
        return super.getScaleY();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.mStateListAnimatorHelper.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        yud yud = this.mStateListAnimatorHelper;
        if (yud != null) {
            yud.c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.mScaleLogic.a(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        rvd rvd = this.mButtonTintHelper;
        if (rvd != null) {
            rvd.c();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        rvd rvd = this.mButtonTintHelper;
        if (rvd != null) {
            rvd.d(i);
        }
    }

    public void setPasteBackgroundTint(int i) {
        rvd rvd = this.mButtonTintHelper;
        if (rvd != null) {
            rvd.e(i);
        }
    }

    public void setPasteTextTint(int i) {
        rvd rvd = this.mButtonTintHelper;
        if (rvd != null) {
            rvd.f(i);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        d dVar = this.mScaleLogic;
        if (dVar != null) {
            dVar.b(f);
        } else {
            super.setScaleX(f);
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        d dVar = this.mScaleLogic;
        if (dVar != null) {
            dVar.d(f);
        } else {
            super.setScaleY(f);
        }
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.mStateListAnimatorHelper.d(lVar);
    }

    public StateListAnimatorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    public StateListAnimatorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }
}
