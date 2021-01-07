package defpackage;

/* renamed from: ric  reason: default package */
public final class ric {
    public static int a(boolean z, boolean z2, int i, int i2) {
        if (z || i2 == 0) {
            return 2;
        }
        int i3 = i - i2;
        if (i2 >= 0) {
            return (z2 || i3 > 0) ? 1 : 0;
        }
        return 0;
    }
}
