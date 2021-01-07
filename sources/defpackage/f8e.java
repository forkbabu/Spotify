package defpackage;

import android.graphics.Bitmap;

/* renamed from: f8e  reason: default package */
abstract class f8e extends l8e {
    private final Bitmap a;

    f8e(Bitmap bitmap) {
        if (bitmap != null) {
            this.a = bitmap;
            return;
        }
        throw new NullPointerException("Null image");
    }

    @Override // defpackage.l8e
    public Bitmap c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l8e) {
            return this.a.equals(((l8e) obj).c());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ImageShareMedia{image=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
