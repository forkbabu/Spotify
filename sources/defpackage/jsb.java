package defpackage;

import android.content.res.Resources;

/* renamed from: jsb  reason: default package */
public class jsb implements ksb {
    private final int a;
    private final Object[] b;

    public jsb(int i, Object... objArr) {
        this.a = i;
        this.b = objArr;
    }

    @Override // defpackage.ksb
    public String a(Resources resources) {
        return resources.getString(this.a, this.b);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof jsb) && this.a == ((jsb) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}
