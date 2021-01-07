package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: eu5  reason: default package */
public final class eu5 extends mu5 {
    private final ea2<Context, Drawable> a;
    private final int b;

    eu5(ea2<Context, Drawable> ea2, int i) {
        if (ea2 != null) {
            this.a = ea2;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null drawable");
    }

    @Override // defpackage.mu5
    public int a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.mu5
    public ea2<Context, Drawable> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mu5)) {
            return false;
        }
        mu5 mu5 = (mu5) obj;
        if (!this.a.equals(mu5.d()) || this.b != mu5.a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayPauseViewData{drawable=");
        V0.append(this.a);
        V0.append(", contentDescriptionResId=");
        return je.B0(V0, this.b, "}");
    }
}
