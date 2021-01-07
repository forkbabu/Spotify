package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: g1d  reason: default package */
public final class g1d extends h1d {
    private final Bitmap a;
    private final List<String> b;

    g1d(Bitmap bitmap, List<String> list) {
        if (bitmap != null) {
            this.a = bitmap;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null colors");
        }
        throw new NullPointerException("Null sticker");
    }

    @Override // defpackage.h1d
    public List<String> a() {
        return this.b;
    }

    @Override // defpackage.h1d
    public Bitmap b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1d)) {
            return false;
        }
        h1d h1d = (h1d) obj;
        if (!this.a.equals(h1d.b()) || !this.b.equals(h1d.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShareableStickerResponse{sticker=");
        V0.append(this.a);
        V0.append(", colors=");
        return je.L0(V0, this.b, "}");
    }
}
