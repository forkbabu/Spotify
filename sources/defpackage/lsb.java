package defpackage;

import android.content.res.Resources;

/* renamed from: lsb  reason: default package */
public class lsb implements ksb {
    private final int a;

    public lsb(int i) {
        this.a = i;
    }

    @Override // defpackage.ksb
    public String a(Resources resources) {
        int i = this.a;
        if (i == 0) {
            return "";
        }
        return resources.getString(i);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof lsb) && this.a == ((lsb) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}
