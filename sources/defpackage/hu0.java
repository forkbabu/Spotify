package defpackage;

import com.spotify.ubi.specification.factories.r0;

/* renamed from: hu0  reason: default package */
public class hu0 {
    private r0 a;
    private String b;

    public r0 a(String str) {
        if (str == null || str.isEmpty()) {
            str = "local_device";
        }
        if (!str.equals(this.b)) {
            this.b = str;
            this.a = new r0(str);
        }
        return this.a;
    }
}
