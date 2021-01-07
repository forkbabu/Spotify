package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.g;
import com.google.android.gms.common.internal.m;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastSeekBar extends View {
    public static final /* synthetic */ int v = 0;
    public b a;
    private List<a> b;
    private final float c;
    private final float f;
    private final float n;
    private final float o;
    private final float p;
    private final Paint q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;

    public static class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            Integer num = 0;
            return num.hashCode();
        }
    }

    public static class b {
        public int a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.a == bVar.a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.a), 0, 0, 0, Boolean.FALSE});
        }
    }

    class c extends View.AccessibilityDelegate {
        c(a aVar) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SeekBar.class.getName());
            accessibilityEvent.setItemCount(CastSeekBar.this.a.a);
            accessibilityEvent.setCurrentItemIndex(CastSeekBar.this.getProgress());
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(SeekBar.class.getName());
            int i = Build.VERSION.SDK_INT;
            if (view.isEnabled()) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (!view.isEnabled()) {
                return false;
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i == 4096 || i == 8192) {
                CastSeekBar castSeekBar = CastSeekBar.this;
                int i3 = CastSeekBar.v;
                castSeekBar.getClass();
                CastSeekBar castSeekBar2 = CastSeekBar.this;
                int i4 = castSeekBar2.a.a / 20;
                castSeekBar2.getProgress();
                castSeekBar2.a.getClass();
                CastSeekBar.this.getClass();
            }
            return false;
        }
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void a(Canvas canvas, int i, int i2, int i3, int i4) {
        this.q.setColor(i4);
        float f2 = (float) this.a.a;
        float f3 = (float) i3;
        float f4 = this.n;
        canvas.drawRect(((((float) i) * 1.0f) / f2) * f3, -f4, ((((float) i2) * 1.0f) / f2) * f3, f4, this.q);
    }

    public int getMaxProgress() {
        return this.a.a;
    }

    public int getProgress() {
        this.a.getClass();
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas.translate(0.0f, (float) (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2));
        this.a.getClass();
        this.a.getClass();
        int max = Math.max(0, 0);
        if (max > 0) {
            a(canvas, 0, max, measuredWidth, this.t);
        }
        if (progress > max) {
            a(canvas, max, progress, measuredWidth, this.r);
        }
        int i = this.a.a;
        if (i > progress) {
            a(canvas, progress, i, measuredWidth, this.t);
        }
        canvas.restoreToCount(save2);
        List<a> list = this.b;
        if (list != null && !list.isEmpty()) {
            this.q.setColor(this.u);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            for (a aVar : this.b) {
                if (aVar != null) {
                    canvas.drawCircle((((float) Math.min(0, this.a.a)) * ((float) measuredWidth2)) / ((float) this.a.a), (float) (measuredHeight / 2), this.p, this.q);
                }
            }
        }
        if (isEnabled()) {
            this.a.getClass();
        }
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.c + ((float) getPaddingLeft()) + ((float) getPaddingRight())), i, 0), View.resolveSizeAndState((int) (this.f + ((float) getPaddingTop()) + ((float) getPaddingBottom())), i2, 0));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.a.getClass();
        return false;
    }

    public final void setAdBreaks(List<a> list) {
        ArrayList arrayList;
        if (!m.a(this.b, list)) {
            if (list == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(list);
            }
            this.b = arrayList;
            postInvalidate();
        }
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList();
        setAccessibilityDelegate(new c(null));
        Paint paint = new Paint(1);
        this.q = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = context.getResources().getDimension(C0707R.dimen.cast_seek_bar_minimum_width);
        this.f = context.getResources().getDimension(C0707R.dimen.cast_seek_bar_minimum_height);
        this.n = context.getResources().getDimension(C0707R.dimen.cast_seek_bar_progress_height) / 2.0f;
        this.o = context.getResources().getDimension(C0707R.dimen.cast_seek_bar_thumb_size) / 2.0f;
        this.p = context.getResources().getDimension(C0707R.dimen.cast_seek_bar_ad_break_radius);
        b bVar = new b();
        this.a = bVar;
        bVar.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, g.a, C0707R.attr.castExpandedControllerStyle, C0707R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.r = context.getResources().getColor(resourceId);
        this.s = context.getResources().getColor(resourceId2);
        this.t = context.getResources().getColor(resourceId3);
        this.u = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }
}
