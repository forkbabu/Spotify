package defpackage;

import android.graphics.Rect;

/* access modifiers changed from: package-private */
/* renamed from: d74  reason: default package */
public final class d74 extends e74 {
    private final Rect a;
    private final String b;
    private final String c;

    d74(Rect rect, String str, String str2) {
        if (rect != null) {
            this.a = rect;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null accessibilityText");
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null viewBounds");
    }

    @Override // defpackage.e74
    public String b() {
        return this.c;
    }

    @Override // defpackage.e74
    public String c() {
        return this.b;
    }

    @Override // defpackage.e74
    public Rect d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e74)) {
            return false;
        }
        e74 e74 = (e74) obj;
        if (!this.a.equals(e74.d()) || !this.b.equals(e74.c()) || !this.c.equals(e74.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchFieldButtonData{viewBounds=");
        V0.append(this.a);
        V0.append(", text=");
        V0.append(this.b);
        V0.append(", accessibilityText=");
        return je.I0(V0, this.c, "}");
    }
}
