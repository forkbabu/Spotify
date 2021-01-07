package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: dy  reason: default package */
public class dy {
    public static final tx m = new by(0.5f);
    ux a;
    ux b;
    ux c;
    ux d;
    tx e;
    tx f;
    tx g;
    tx h;
    wx i;
    wx j;
    wx k;
    wx l;

    dy(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    public static b a(Context context, int i2, int i3) {
        return b(context, i2, i3, new rx((float) 0));
    }

    private static b b(Context context, int i2, int i3, tx txVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, pw.G);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            tx h2 = h(obtainStyledAttributes, 5, txVar);
            tx h3 = h(obtainStyledAttributes, 8, h2);
            tx h4 = h(obtainStyledAttributes, 9, h2);
            tx h5 = h(obtainStyledAttributes, 7, h2);
            tx h6 = h(obtainStyledAttributes, 6, h2);
            b bVar = new b();
            bVar.y(i5, h3);
            bVar.B(i6, h4);
            bVar.u(i7, h5);
            bVar.r(i8, h6);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b c(Context context, AttributeSet attributeSet, int i2, int i3, tx txVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pw.A, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, txVar);
    }

    private static tx h(TypedArray typedArray, int i2, tx txVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return txVar;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new rx((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i3 == 6 ? new by(peekValue.getFraction(1.0f, 1.0f)) : txVar;
    }

    public ux d() {
        return this.d;
    }

    public tx e() {
        return this.h;
    }

    public ux f() {
        return this.c;
    }

    public tx g() {
        return this.g;
    }

    public wx i() {
        return this.i;
    }

    public ux j() {
        return this.a;
    }

    public tx k() {
        return this.e;
    }

    public ux l() {
        return this.b;
    }

    public tx m() {
        return this.f;
    }

    public boolean n(RectF rectF) {
        boolean z = this.l.getClass().equals(wx.class) && this.j.getClass().equals(wx.class) && this.i.getClass().equals(wx.class) && this.k.getClass().equals(wx.class);
        float a2 = this.e.a(rectF);
        boolean z2 = this.f.a(rectF) == a2 && this.h.a(rectF) == a2 && this.g.a(rectF) == a2;
        boolean z3 = (this.b instanceof cy) && (this.a instanceof cy) && (this.c instanceof cy) && (this.d instanceof cy);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    public dy o(float f2) {
        b bVar = new b(this);
        bVar.o(f2);
        return bVar.m();
    }

    public dy() {
        this.a = new cy();
        this.b = new cy();
        this.c = new cy();
        this.d = new cy();
        this.e = new rx(0.0f);
        this.f = new rx(0.0f);
        this.g = new rx(0.0f);
        this.h = new rx(0.0f);
        this.i = new wx();
        this.j = new wx();
        this.k = new wx();
        this.l = new wx();
    }

    /* renamed from: dy$b */
    public static final class b {
        private ux a = new cy();
        private ux b = new cy();
        private ux c = new cy();
        private ux d = new cy();
        private tx e = new rx(0.0f);
        private tx f = new rx(0.0f);
        private tx g = new rx(0.0f);
        private tx h = new rx(0.0f);
        private wx i = new wx();
        private wx j = new wx();
        private wx k = new wx();
        private wx l = new wx();

        public b() {
        }

        private static float n(ux uxVar) {
            if (uxVar instanceof cy) {
                ((cy) uxVar).getClass();
                return -1.0f;
            }
            if (uxVar instanceof vx) {
                ((vx) uxVar).getClass();
            }
            return -1.0f;
        }

        public b A(tx txVar) {
            this.e = txVar;
            return this;
        }

        public b B(int i2, tx txVar) {
            ux a2 = zx.a(i2);
            this.b = a2;
            n(a2);
            this.f = txVar;
            return this;
        }

        public b C(float f2) {
            this.f = new rx(f2);
            return this;
        }

        public b D(tx txVar) {
            this.f = txVar;
            return this;
        }

        public dy m() {
            return new dy(this, null);
        }

        public b o(float f2) {
            this.e = new rx(f2);
            this.f = new rx(f2);
            this.g = new rx(f2);
            this.h = new rx(f2);
            return this;
        }

        public b p(int i2, float f2) {
            ux a2 = zx.a(i2);
            this.a = a2;
            n(a2);
            this.b = a2;
            n(a2);
            this.c = a2;
            n(a2);
            this.d = a2;
            n(a2);
            o(f2);
            return this;
        }

        public b q(wx wxVar) {
            this.k = wxVar;
            return this;
        }

        public b r(int i2, tx txVar) {
            ux a2 = zx.a(i2);
            this.d = a2;
            n(a2);
            this.h = txVar;
            return this;
        }

        public b s(float f2) {
            this.h = new rx(f2);
            return this;
        }

        public b t(tx txVar) {
            this.h = txVar;
            return this;
        }

        public b u(int i2, tx txVar) {
            ux a2 = zx.a(i2);
            this.c = a2;
            n(a2);
            this.g = txVar;
            return this;
        }

        public b v(float f2) {
            this.g = new rx(f2);
            return this;
        }

        public b w(tx txVar) {
            this.g = txVar;
            return this;
        }

        public b x(wx wxVar) {
            this.i = wxVar;
            return this;
        }

        public b y(int i2, tx txVar) {
            ux a2 = zx.a(i2);
            this.a = a2;
            n(a2);
            this.e = txVar;
            return this;
        }

        public b z(float f2) {
            this.e = new rx(f2);
            return this;
        }

        public b(dy dyVar) {
            this.a = dyVar.a;
            this.b = dyVar.b;
            this.c = dyVar.c;
            this.d = dyVar.d;
            this.e = dyVar.e;
            this.f = dyVar.f;
            this.g = dyVar.g;
            this.h = dyVar.h;
            this.i = dyVar.i;
            this.j = dyVar.j;
            this.k = dyVar.k;
            this.l = dyVar.l;
        }
    }
}
