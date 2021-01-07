package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: c50  reason: default package */
public class c50 {
    public b50[] a;
    public b50[] b;

    public String toString() {
        StringBuilder sb = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        b50[] b50Arr = this.a;
        List list = null;
        sb.append(b50Arr == null ? null : Arrays.asList(b50Arr));
        sb.append("\n");
        sb.append(", ScalingList8x8=");
        b50[] b50Arr2 = this.b;
        if (b50Arr2 != null) {
            list = Arrays.asList(b50Arr2);
        }
        sb.append(list);
        sb.append("\n");
        sb.append('}');
        return sb.toString();
    }
}
