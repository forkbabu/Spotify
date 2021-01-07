package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.TrackListItemType;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.ReadinessSubject;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.UtilsKt;
import com.spotify.rxjava2.q;
import defpackage.j1c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class TimeLine extends View implements e {
    private final int A;
    private final int B;
    private final int C;
    private final float D;
    private final float E;
    private e.a F;
    private n1c G;
    private ReadinessSubject<ViewState> H;
    private final q I;
    private final boolean J;
    private Pair<a.C0316a, a.b> K;
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private final Rect f;
    private final Rect n;
    private final RectF o;
    private final Rect p;
    private final RectF q;
    private final Rect r;
    private final RectF s;
    private final Rect t;
    private final RectF u;
    private int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    private enum ViewState {
        IS_STARTED,
        IS_MEASURED,
        HAS_LISTENER
    }

    public TimeLine(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void a(TimeLine timeLine) {
        e.a aVar = timeLine.F;
        if (aVar != null) {
            aVar.onStart();
        } else {
            h.k("listener");
            throw null;
        }
    }

    private final void b(Canvas canvas, int i, f fVar, boolean z2) {
        int b2 = fVar.e().a().b() + i;
        int i2 = 0;
        if (z2) {
            Rect rect = this.f;
            if (this.J) {
                i2 = getMeasuredWidth();
            }
            int i3 = this.v;
            rect.set(i2, i3, i, this.B + i3);
        } else {
            Rect rect2 = this.f;
            boolean z3 = this.J;
            if (!z3) {
                i = b2;
            }
            int i4 = this.v;
            if (!z3) {
                i2 = getMeasuredWidth();
            }
            rect2.set(i, i4, i2, this.v + this.B);
        }
        canvas.drawRect(this.f, this.a);
    }

    private final void c(Canvas canvas, RectF rectF, boolean z2, boolean z3, Paint paint) {
        Path path = new Path();
        float f2 = this.D;
        float width = rectF.width() - f2;
        float f3 = width - f2;
        if (z2 && z3) {
            path.moveTo(rectF.left + f2, rectF.top);
            path.rLineTo(f3, 0.0f);
            float f4 = -f2;
            path.rQuadTo(f2, 0.0f, f2, f4);
            path.rQuadTo(0.0f, f4, f4, f4);
            path.rLineTo(-f3, 0.0f);
            path.rQuadTo(f4, 0.0f, f4, f2);
            path.rQuadTo(0.0f, f2, f2, f2);
            path.rLineTo(f3, 0.0f);
        } else if (z3) {
            path.moveTo(rectF.left, rectF.top);
            path.rLineTo(width, 0.0f);
            float f5 = -f2;
            path.rQuadTo(f2, 0.0f, f2, f5);
            path.rQuadTo(0.0f, f5, f5, f5);
            path.rLineTo(-width, 0.0f);
            path.rLineTo(0.0f, -rectF.height());
        } else {
            path.moveTo(rectF.right, rectF.top);
            path.rLineTo(-width, 0.0f);
            float f6 = -f2;
            path.rQuadTo(f6, 0.0f, f6, f6);
            path.rQuadTo(0.0f, f6, f2, f6);
            path.rLineTo(width, 0.0f);
            path.rLineTo(0.0f, -rectF.height());
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    private final int e(int i, int i2) {
        return this.J ? i - i2 : i + i2;
    }

    public void d(e.a aVar, n1c n1c) {
        h.e(aVar, "listener");
        h.e(n1c, "timeLineDragHelper");
        this.F = aVar;
        this.G = n1c;
        ReadinessSubject<ViewState> readinessSubject = this.H;
        if (readinessSubject != null) {
            readinessSubject.a(ViewState.HAS_LISTENER, true);
        } else {
            h.k("readinessSubject");
            throw null;
        }
    }

    public Pair<a.C0316a, a.b> getTimeLineFullContext() {
        return this.K;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ReadinessSubject<ViewState> readinessSubject = new ReadinessSubject<>(ViewState.values(), new TimeLine$onAttachedToWindow$1(this));
        this.I.a(readinessSubject);
        this.H = readinessSubject;
        if (readinessSubject != null) {
            readinessSubject.a(ViewState.IS_STARTED, true);
        } else {
            h.k("readinessSubject");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReadinessSubject<ViewState> readinessSubject = this.H;
        if (readinessSubject != null) {
            readinessSubject.a(ViewState.IS_STARTED, false);
            this.I.c();
            e.a aVar = this.F;
            if (aVar != null) {
                aVar.onStop();
            } else {
                h.k("listener");
                throw null;
            }
        } else {
            h.k("readinessSubject");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        Pair<a.C0316a, a.b> timeLineFullContext = getTimeLineFullContext();
        ReadinessSubject<ViewState> readinessSubject = this.H;
        if (readinessSubject == null) {
            h.k("readinessSubject");
            throw null;
        } else if (readinessSubject.b() && timeLineFullContext != null && getVisibility() != 8 && getWidth() != 0 && getHeight() != 0) {
            j1c.a.b.C0627b a2 = timeLineFullContext.b().a();
            List<f> a3 = timeLineFullContext.a().a();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a3.iterator();
            while (true) {
                i = 1;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                int b2 = a2.b();
                int measuredWidth = getMeasuredWidth() + b2;
                int centerX = this.t.centerX() + t2.c().b();
                if (centerX <= measuredWidth && t2.e().a().b() + centerX >= b2) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    f fVar = (f) next2;
                    boolean z2 = fVar.b().i() != TrackListItemType.MUSIC;
                    int centerX2 = this.t.centerX();
                    if (z2) {
                        i2 = this.v - (this.C / 2);
                    } else {
                        i2 = this.v + (this.C / 2);
                    }
                    int i6 = this.B + i2;
                    if (i4 == 0) {
                        i3 = 0;
                    } else {
                        i3 = this.x;
                    }
                    int i7 = i4 == a3.size() - i ? 0 : -this.w;
                    int e = e(e(e(e(this.t.centerX(), this.B / 2), fVar.c().b()), -a2.b()), i3);
                    int e2 = e(e(e, fVar.e().a().b()), i7);
                    Rect rect = this.n;
                    boolean z3 = this.J;
                    rect.left = z3 ? e2 : e;
                    rect.top = i2;
                    rect.right = z3 ? e : e2;
                    rect.bottom = i6;
                    this.o.set(rect);
                    if (i4 == 0) {
                        b(canvas, e, fVar, true);
                    }
                    if (i4 == a3.size() - 1) {
                        b(canvas, e, fVar, false);
                    }
                    boolean z4 = this.J;
                    boolean z5 = !z4 ? e < centerX2 : e > centerX2;
                    boolean z6 = !z4 ? e2 < centerX2 : e2 > centerX2;
                    if (!z5) {
                        c(canvas, this.o, true, true, this.b);
                    } else if (z6) {
                        c(canvas, this.o, true, true, this.c);
                    } else {
                        int centerX3 = this.t.centerX() - e;
                        if (this.J) {
                            Rect rect2 = this.p;
                            Rect rect3 = this.n;
                            int i8 = rect3.right;
                            rect2.right = i8;
                            rect2.top = rect3.top;
                            rect2.bottom = rect3.bottom;
                            rect2.left = i8 + centerX3;
                        } else {
                            Rect rect4 = this.p;
                            Rect rect5 = this.n;
                            int i9 = rect5.left;
                            rect4.left = i9;
                            rect4.top = rect5.top;
                            rect4.bottom = rect5.bottom;
                            rect4.right = i9 + centerX3;
                        }
                        this.q.set(this.p);
                        RectF rectF = this.q;
                        boolean z7 = this.J;
                        c(canvas, rectF, !z7, z7, this.c);
                        if (this.J) {
                            Rect rect6 = this.r;
                            Rect rect7 = this.n;
                            rect6.left = rect7.left;
                            rect6.top = rect7.top;
                            rect6.bottom = rect7.bottom;
                            rect6.right = this.p.left;
                        } else {
                            Rect rect8 = this.r;
                            rect8.left = this.p.right;
                            Rect rect9 = this.n;
                            rect8.top = rect9.top;
                            rect8.bottom = rect9.bottom;
                            rect8.right = rect9.right;
                        }
                        this.s.set(this.r);
                        RectF rectF2 = this.s;
                        boolean z8 = this.J;
                        c(canvas, rectF2, z8, !z8, this.b);
                    }
                    i4 = i5;
                    i = 1;
                } else {
                    d.L();
                    throw null;
                }
            }
            RectF rectF3 = this.u;
            float f2 = this.E;
            canvas.drawRoundRect(rectF3, f2, f2, this.b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(i, this.A + this.y + this.z);
        int measuredWidth = getMeasuredWidth() / 2;
        int c2 = UtilsKt.c(this, 2.0f) / 2;
        int c3 = UtilsKt.c(this, 24.0f);
        Rect rect = this.t;
        rect.left = measuredWidth - c2;
        int i3 = this.y;
        rect.top = i3;
        rect.right = measuredWidth + c2;
        rect.bottom = i3 + c3;
        this.u.set(rect);
        this.v = anf.b(((float) (this.A - this.B)) / 2.0f) + this.y;
        ReadinessSubject<ViewState> readinessSubject = this.H;
        if (readinessSubject != null) {
            readinessSubject.a(ViewState.IS_MEASURED, true);
            invalidate();
            return;
        }
        h.k("readinessSubject");
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h.e(motionEvent, "event");
        ReadinessSubject<ViewState> readinessSubject = this.H;
        if (readinessSubject == null) {
            h.k("readinessSubject");
            throw null;
        } else if (!readinessSubject.b() || getTimeLineFullContext() == null) {
            return true;
        } else {
            n1c n1c = this.G;
            if (n1c != null) {
                return n1c.c(motionEvent, this.J);
            }
            h.k("timeLineDragHelper");
            throw null;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e
    public void setTimeLineFullContext(Pair<a.C0316a, a.b> pair) {
        this.K = pair;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeLine(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setAlpha(anf.b(25.5f));
        this.a = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        paint2.setAlpha(anf.b(102.0f));
        this.b = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        this.c = paint3;
        this.f = new Rect();
        this.n = new Rect();
        this.o = new RectF();
        this.p = new Rect();
        this.q = new RectF();
        this.r = new Rect();
        this.s = new RectF();
        this.t = new Rect();
        this.u = new RectF();
        int c2 = UtilsKt.c(this, 4.0f);
        this.w = c2;
        this.x = c2 / 2;
        this.y = UtilsKt.c(this, 14.0f);
        this.z = UtilsKt.c(this, 3.0f);
        this.A = UtilsKt.c(this, 24.0f);
        this.B = UtilsKt.c(this, 2.0f);
        this.C = UtilsKt.c(this, 4.0f);
        this.D = ((float) UtilsKt.c(this, 2.0f)) / 2.0f;
        this.E = ((float) UtilsKt.c(this, 2.0f)) / 2.0f;
        this.I = new q();
        this.J = nud.n(this);
    }
}
