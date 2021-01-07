package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;

/* renamed from: bx  reason: default package */
public class bx extends Drawable implements h.b {
    private final WeakReference<Context> a;
    private final yx b = new yx();
    private final h c;
    private final Rect f = new Rect();
    private final float n;
    private final float o;
    private final float p;
    private final a q;
    private float r;
    private float s;
    private int t;
    private float u;
    private float v;
    private float w;
    private WeakReference<View> x;
    private WeakReference<ViewGroup> y;

    private bx(Context context) {
        kx kxVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.a = weakReference;
        j.c(context);
        Resources resources = context.getResources();
        this.n = (float) resources.getDimensionPixelSize(C0707R.dimen.mtrl_badge_radius);
        this.p = (float) resources.getDimensionPixelSize(C0707R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.o = (float) resources.getDimensionPixelSize(C0707R.dimen.mtrl_badge_with_text_radius);
        h hVar = new h(this);
        this.c = hVar;
        hVar.d().setTextAlign(Paint.Align.CENTER);
        this.q = new a(context);
        Context context3 = weakReference.get();
        if (context3 != null && hVar.c() != (kxVar = new kx(context3, C0707R.style.TextAppearance_MaterialComponents_Badge)) && (context2 = weakReference.get()) != null) {
            hVar.f(kxVar, context2);
            o();
        }
    }

    public static bx b(Context context) {
        bx bxVar = new bx(context);
        TypedArray f2 = j.f(context, null, pw.c, C0707R.attr.badgeStyle, C0707R.style.Widget_MaterialComponents_Badge, new int[0]);
        bxVar.l(f2.getInt(4, 4));
        if (f2.hasValue(5)) {
            bxVar.m(f2.getInt(5, 0));
        }
        bxVar.i(jx.a(context, f2, 0).getDefaultColor());
        if (f2.hasValue(2)) {
            bxVar.k(jx.a(context, f2, 2).getDefaultColor());
        }
        bxVar.j(f2.getInt(1, 8388661));
        bxVar.q.s = f2.getDimensionPixelOffset(3, 0);
        bxVar.o();
        bxVar.q.t = f2.getDimensionPixelOffset(6, 0);
        bxVar.o();
        f2.recycle();
        return bxVar;
    }

    static bx c(Context context, a aVar) {
        bx bxVar = new bx(context);
        bxVar.l(aVar.n);
        if (aVar.f != -1) {
            bxVar.m(aVar.f);
        }
        bxVar.i(aVar.a);
        bxVar.k(aVar.b);
        bxVar.j(aVar.r);
        bxVar.q.s = aVar.s;
        bxVar.o();
        bxVar.q.t = aVar.t;
        bxVar.o();
        return bxVar;
    }

    private String d() {
        if (f() <= this.t) {
            return Integer.toString(f());
        }
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(C0707R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.t), "+");
    }

    private void o() {
        float f2;
        float f3;
        Context context = this.a.get();
        WeakReference<View> weakReference = this.x;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.y;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || cx.a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            int i = this.q.r;
            if (i == 8388691 || i == 8388693) {
                this.s = (float) (rect2.bottom - this.q.t);
            } else {
                this.s = (float) (rect2.top + this.q.t);
            }
            if (f() <= 9) {
                float f4 = !h() ? this.n : this.o;
                this.u = f4;
                this.w = f4;
                this.v = f4;
            } else {
                float f5 = this.o;
                this.u = f5;
                this.w = f5;
                this.v = (this.c.e(d()) / 2.0f) + this.p;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(h() ? C0707R.dimen.mtrl_badge_text_horizontal_edge_offset : C0707R.dimen.mtrl_badge_horizontal_edge_offset);
            int i2 = this.q.r;
            if (i2 == 8388659 || i2 == 8388691) {
                if (q4.o(view) == 0) {
                    f2 = (((float) rect2.left) - this.v) + ((float) dimensionPixelSize) + ((float) this.q.s);
                } else {
                    f2 = ((((float) rect2.right) + this.v) - ((float) dimensionPixelSize)) - ((float) this.q.s);
                }
                this.r = f2;
            } else {
                if (q4.o(view) == 0) {
                    f3 = ((((float) rect2.right) + this.v) - ((float) dimensionPixelSize)) - ((float) this.q.s);
                } else {
                    f3 = (((float) rect2.left) - this.v) + ((float) dimensionPixelSize) + ((float) this.q.s);
                }
                this.r = f3;
            }
            Rect rect3 = this.f;
            float f6 = this.r;
            float f7 = this.s;
            float f8 = this.v;
            float f9 = this.w;
            boolean z = cx.a;
            rect3.set((int) (f6 - f8), (int) (f7 - f9), (int) (f6 + f8), (int) (f7 + f9));
            this.b.F(this.u);
            if (!rect.equals(this.f)) {
                this.b.setBounds(this.f);
            }
        }
    }

    @Override // com.google.android.material.internal.h.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.b.draw(canvas);
            if (h()) {
                Rect rect = new Rect();
                String d = d();
                this.c.d().getTextBounds(d, 0, d.length(), rect);
                canvas.drawText(d, this.r, this.s + ((float) (rect.height() / 2)), this.c.d());
            }
        }
    }

    public CharSequence e() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!h()) {
            return this.q.o;
        }
        if (this.q.p <= 0 || (context = this.a.get()) == null) {
            return null;
        }
        if (f() <= this.t) {
            return context.getResources().getQuantityString(this.q.p, f(), Integer.valueOf(f()));
        }
        return context.getString(this.q.q, Integer.valueOf(this.t));
    }

    public int f() {
        if (!h()) {
            return 0;
        }
        return this.q.f;
    }

    public a g() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.q.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h() {
        return this.q.f != -1;
    }

    public void i(int i) {
        this.q.a = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.b.r() != valueOf) {
            this.b.H(valueOf);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public void j(int i) {
        if (this.q.r != i) {
            this.q.r = i;
            WeakReference<View> weakReference = this.x;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.x.get();
                WeakReference<ViewGroup> weakReference2 = this.y;
                ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
                this.x = new WeakReference<>(view);
                this.y = new WeakReference<>(viewGroup);
                o();
                invalidateSelf();
            }
        }
    }

    public void k(int i) {
        this.q.b = i;
        if (this.c.d().getColor() != i) {
            this.c.d().setColor(i);
            invalidateSelf();
        }
    }

    public void l(int i) {
        if (this.q.n != i) {
            this.q.n = i;
            double d = (double) this.q.n;
            Double.isNaN(d);
            Double.isNaN(d);
            this.t = ((int) Math.pow(10.0d, d - 1.0d)) - 1;
            this.c.g(true);
            o();
            invalidateSelf();
        }
    }

    public void m(int i) {
        int max = Math.max(0, i);
        if (this.q.f != max) {
            this.q.f = max;
            this.c.g(true);
            o();
            invalidateSelf();
        }
    }

    public void n(View view, ViewGroup viewGroup) {
        this.x = new WeakReference<>(view);
        this.y = new WeakReference<>(viewGroup);
        o();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.q.c = i;
        this.c.d().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: bx$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0060a();
        private int a;
        private int b;
        private int c = BitmapRenderer.ALPHA_VISIBLE;
        private int f = -1;
        private int n;
        private CharSequence o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;

        /* renamed from: bx$a$a  reason: collision with other inner class name */
        static class C0060a implements Parcelable.Creator<a> {
            C0060a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Context context) {
            this.b = new kx(context, C0707R.style.TextAppearance_MaterialComponents_Badge).b.getDefaultColor();
            this.o = context.getString(C0707R.string.mtrl_badge_numberless_content_description);
            this.p = C0707R.plurals.mtrl_badge_content_description;
            this.q = C0707R.string.mtrl_exceed_max_badge_number_content_description;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f);
            parcel.writeInt(this.n);
            parcel.writeString(this.o.toString());
            parcel.writeInt(this.p);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
        }

        protected a(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.f = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readString();
            this.p = parcel.readInt();
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            this.t = parcel.readInt();
        }
    }
}
