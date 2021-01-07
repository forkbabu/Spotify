package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: n74  reason: default package */
public final class n74 extends p74 {
    private final Bitmap a;
    private final Drawable b;

    n74(Bitmap bitmap, Drawable drawable) {
        this.a = bitmap;
        this.b = drawable;
    }

    @Override // defpackage.p74
    public Bitmap a() {
        return this.a;
    }

    @Override // defpackage.p74
    public Drawable b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p74)) {
            return false;
        }
        p74 p74 = (p74) obj;
        Bitmap bitmap = this.a;
        if (bitmap != null ? bitmap.equals(p74.a()) : p74.a() == null) {
            Drawable drawable = this.b;
            if (drawable == null) {
                if (p74.b() == null) {
                    return true;
                }
            } else if (drawable.equals(p74.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Bitmap bitmap = this.a;
        int i = 0;
        int hashCode = ((bitmap == null ? 0 : bitmap.hashCode()) ^ 1000003) * 1000003;
        Drawable drawable = this.b;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HeaderImageViewModel{bitmap=");
        V0.append(this.a);
        V0.append(", placeholder=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
