package android.support.wearable.complications.rendering;

import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

class ComplicationStyle {
    private static final Typeface u = Typeface.create("sans-serif-condensed", 0);
    private final int a;
    private final Drawable b;
    private final int c;
    private final int d;
    private final Typeface e;
    private final Typeface f;
    private final int g;
    private final int h;
    private final ColorFilter i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;

    ComplicationStyle(int i2, Drawable drawable, int i3, int i4, Typeface typeface, Typeface typeface2, int i5, int i6, ColorFilter colorFilter, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, a aVar) {
        this.a = i2;
        this.b = drawable;
        this.c = i3;
        this.d = i4;
        this.e = typeface;
        this.f = typeface2;
        this.g = i5;
        this.h = i6;
        this.i = colorFilter;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i12;
        this.n = i13;
        this.o = i10;
        this.p = i11;
        this.q = i14;
        this.r = i15;
        this.s = i16;
        this.t = i17;
    }

    public int b() {
        return this.a;
    }

    public Drawable c() {
        return this.b;
    }

    public int d() {
        return this.k;
    }

    public int e() {
        return this.n;
    }

    public int f() {
        return this.m;
    }

    public int g() {
        return this.o;
    }

    public int h() {
        return this.l;
    }

    public int i() {
        return this.p;
    }

    public ColorFilter j() {
        return this.i;
    }

    public int k() {
        return this.t;
    }

    public int l() {
        return this.j;
    }

    public int m() {
        return this.r;
    }

    public int n() {
        return this.q;
    }

    public int o() {
        return this.s;
    }

    public int p() {
        return this.c;
    }

    public int q() {
        return this.g;
    }

    public Typeface r() {
        return this.e;
    }

    public int s() {
        return this.d;
    }

    public int t() {
        return this.h;
    }

    public Typeface u() {
        return this.f;
    }

    public static class Builder implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new a();
        private int A = -1;
        private int B = -3355444;
        private int C = -3355444;
        private int a = -16777216;
        private Drawable b = null;
        private int c = -1;
        private int f = -3355444;
        private Typeface n = ComplicationStyle.u;
        private Typeface o = ComplicationStyle.u;
        private int p = Integer.MAX_VALUE;
        private int q = Integer.MAX_VALUE;
        private ColorFilter r = null;
        private int s = -1;
        private int t = -1;
        private int u = 1;
        private int v = 3;
        private int w = 3;
        private int x = Integer.MAX_VALUE;
        private int y = 1;
        private int z = 2;

        class a implements Parcelable.Creator<Builder> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public Builder createFromParcel(Parcel parcel) {
                return new Builder(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public Builder[] newArray(int i) {
                return new Builder[i];
            }
        }

        public Builder() {
        }

        public ComplicationStyle a() {
            return new ComplicationStyle(this.a, this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, null);
        }

        public Builder b(int i) {
            this.a = i;
            return this;
        }

        public Builder c(Drawable drawable) {
            this.b = drawable;
            return this;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Builder e(int i) {
            this.t = i;
            return this;
        }

        public Builder f(int i) {
            this.w = i;
            return this;
        }

        public Builder g(int i) {
            this.v = i;
            return this;
        }

        public Builder h(int i) {
            this.x = i;
            return this;
        }

        public Builder i(int i) {
            if (i == 1) {
                this.u = 1;
            } else if (i == 2) {
                this.u = 2;
            } else {
                this.u = 0;
            }
            return this;
        }

        public Builder j(int i) {
            this.y = i;
            return this;
        }

        public Builder k(ColorFilter colorFilter) {
            this.r = colorFilter;
            return this;
        }

        public Builder l(int i) {
            this.C = i;
            return this;
        }

        public Builder m(int i) {
            this.s = i;
            return this;
        }

        public Builder n(int i) {
            this.A = i;
            return this;
        }

        public Builder o(int i) {
            this.z = i;
            return this;
        }

        public Builder p(int i) {
            this.B = i;
            return this;
        }

        public Builder q(int i) {
            this.c = i;
            return this;
        }

        public Builder r(int i) {
            this.p = i;
            return this;
        }

        public Builder s(Typeface typeface) {
            this.n = typeface;
            return this;
        }

        public Builder t(int i) {
            this.f = i;
            return this;
        }

        public Builder u(int i) {
            this.q = i;
            return this;
        }

        public Builder v(Typeface typeface) {
            this.o = typeface;
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("background_color", this.a);
            bundle.putInt("text_color", this.c);
            bundle.putInt("title_color", this.f);
            bundle.putInt("text_style", this.n.getStyle());
            bundle.putInt("title_style", this.o.getStyle());
            bundle.putInt("text_size", this.p);
            bundle.putInt("title_size", this.q);
            bundle.putInt("icon_color", this.s);
            bundle.putInt("border_color", this.t);
            bundle.putInt("border_style", this.u);
            bundle.putInt("border_dash_width", this.v);
            bundle.putInt("border_dash_gap", this.w);
            bundle.putInt("border_radius", this.x);
            bundle.putInt("border_width", this.y);
            bundle.putInt("ranged_value_ring_width", this.z);
            bundle.putInt("ranged_value_primary_color", this.A);
            bundle.putInt("ranged_value_secondary_color", this.B);
            bundle.putInt("highlight_color", this.C);
            parcel.writeBundle(bundle);
        }

        public Builder(Builder builder) {
            this.a = builder.a;
            this.b = builder.b;
            this.c = builder.c;
            this.f = builder.f;
            this.n = builder.n;
            this.o = builder.o;
            this.p = builder.p;
            this.q = builder.q;
            this.r = builder.r;
            this.s = builder.s;
            this.t = builder.t;
            this.u = builder.u;
            this.v = builder.v;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
            this.z = builder.z;
            this.A = builder.A;
            this.B = builder.B;
            this.C = builder.C;
        }

        public Builder(ComplicationStyle complicationStyle) {
            this.a = complicationStyle.b();
            this.b = complicationStyle.c();
            this.c = complicationStyle.p();
            this.f = complicationStyle.s();
            this.n = complicationStyle.r();
            this.o = complicationStyle.u();
            this.p = complicationStyle.q();
            this.q = complicationStyle.t();
            this.r = complicationStyle.j();
            this.s = complicationStyle.l();
            this.t = complicationStyle.d();
            this.u = complicationStyle.h();
            this.v = complicationStyle.f();
            this.w = complicationStyle.e();
            this.x = complicationStyle.g();
            this.y = complicationStyle.i();
            this.z = complicationStyle.n();
            this.A = complicationStyle.m();
            this.B = complicationStyle.o();
            this.C = complicationStyle.k();
        }

        Builder(Parcel parcel, a aVar) {
            Bundle readBundle = parcel.readBundle(Builder.class.getClassLoader());
            this.a = readBundle.getInt("background_color");
            this.c = readBundle.getInt("text_color");
            this.f = readBundle.getInt("title_color");
            this.n = Typeface.defaultFromStyle(readBundle.getInt("text_style", 0));
            this.o = Typeface.defaultFromStyle(readBundle.getInt("title_style", 0));
            this.p = readBundle.getInt("text_size");
            this.q = readBundle.getInt("title_size");
            this.s = readBundle.getInt("icon_color");
            this.t = readBundle.getInt("border_color");
            this.u = readBundle.getInt("border_style");
            this.v = readBundle.getInt("border_dash_width");
            this.w = readBundle.getInt("border_dash_gap");
            this.x = readBundle.getInt("border_radius");
            this.y = readBundle.getInt("border_width");
            this.z = readBundle.getInt("ranged_value_ring_width");
            this.A = readBundle.getInt("ranged_value_primary_color");
            this.B = readBundle.getInt("ranged_value_secondary_color");
            this.C = readBundle.getInt("highlight_color");
        }
    }
}
