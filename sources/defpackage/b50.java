package defpackage;

/* renamed from: b50  reason: default package */
public class b50 {
    public int[] a;
    public boolean b;

    public static b50 a(f50 f50, int i) {
        b50 b50 = new b50();
        b50.a = new int[i];
        int i2 = 8;
        int i3 = 8;
        int i4 = 0;
        while (i4 < i) {
            if (i2 != 0) {
                i2 = ((f50.g("deltaScale") + i3) + 256) % 256;
                b50.b = i4 == 0 && i2 == 0;
            }
            int[] iArr = b50.a;
            if (i2 != 0) {
                i3 = i2;
            }
            iArr[i4] = i3;
            i3 = iArr[i4];
            i4++;
        }
        return b50;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScalingList{scalingList=");
        sb.append(this.a);
        sb.append(", useDefaultScalingMatrixFlag=");
        return je.O0(sb, this.b, '}');
    }
}
