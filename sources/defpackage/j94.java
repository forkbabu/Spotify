package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: j94  reason: default package */
public final class j94 extends l94 {
    private final Bitmap a;
    private final Drawable b;
    private final boolean c;

    j94(Bitmap bitmap, Drawable drawable, boolean z) {
        this.a = bitmap;
        this.b = drawable;
        this.c = z;
    }

    @Override // defpackage.l94
    public Bitmap a() {
        return this.a;
    }

    @Override // defpackage.l94
    public boolean b() {
        return this.c;
    }

    @Override // defpackage.l94
    public Drawable d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l94)) {
            return false;
        }
        l94 l94 = (l94) obj;
        Bitmap bitmap = this.a;
        if (bitmap != null ? bitmap.equals(l94.a()) : l94.a() == null) {
            Drawable drawable = this.b;
            if (drawable != null ? drawable.equals(l94.d()) : l94.d() == null) {
                if (this.c == l94.b()) {
                    return true;
                }
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
        return ((hashCode ^ i) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowsePromoImageViewModel{bitmap=");
        V0.append(this.a);
        V0.append(", placeholder=");
        V0.append(this.b);
        V0.append(", cached=");
        return je.P0(V0, this.c, "}");
    }
}
