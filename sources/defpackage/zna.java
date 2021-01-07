package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.boa;

/* renamed from: zna  reason: default package */
final class zna extends boa {
    private final int a;
    private final int b;
    private final Bitmap c;
    private final Drawable d;

    /* renamed from: zna$b */
    static final class b implements boa.a {
        private Integer a;
        private Integer b;
        private Bitmap c;
        private Drawable d;

        b() {
        }

        public boa.a a(Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        public boa b() {
            String str = this.a == null ? " vibrantColor" : "";
            if (this.b == null) {
                str = je.x0(str, " dominantColor");
            }
            if (str.isEmpty()) {
                return new zna(this.a.intValue(), this.b.intValue(), this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public boa.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public boa.a d(Drawable drawable) {
            this.d = drawable;
            return this;
        }

        public boa.a e(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }
    }

    zna(int i, int i2, Bitmap bitmap, Drawable drawable, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = bitmap;
        this.d = drawable;
    }

    @Override // defpackage.boa
    public Bitmap a() {
        return this.c;
    }

    @Override // defpackage.boa
    public int b() {
        return this.b;
    }

    @Override // defpackage.boa
    public Drawable c() {
        return this.d;
    }

    @Override // defpackage.boa
    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof boa)) {
            return false;
        }
        boa boa = (boa) obj;
        if (this.a == boa.d() && this.b == boa.b() && ((bitmap = this.c) != null ? bitmap.equals(boa.a()) : boa.a() == null)) {
            Drawable drawable = this.d;
            if (drawable == null) {
                if (boa.c() == null) {
                    return true;
                }
            } else if (drawable.equals(boa.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        Bitmap bitmap = this.c;
        int i2 = 0;
        int hashCode = (i ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        Drawable drawable = this.d;
        if (drawable != null) {
            i2 = drawable.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CoverArtModel{vibrantColor=");
        V0.append(this.a);
        V0.append(", dominantColor=");
        V0.append(this.b);
        V0.append(", bitmap=");
        V0.append(this.c);
        V0.append(", holderDrawable=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}
