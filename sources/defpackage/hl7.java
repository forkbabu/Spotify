package defpackage;

import com.spotify.mobile.android.util.l0;

/* renamed from: hl7  reason: default package */
public class hl7 implements gl7 {
    private final yk7 a;
    private final al7 b;
    private final el7 c;
    private final cl7 d;

    public hl7(yk7 yk7, al7 al7, el7 el7, cl7 cl7) {
        this.a = yk7;
        this.b = al7;
        this.c = el7;
        this.d = cl7;
    }

    public fl7 a(String str) {
        l0 z = l0.z(str);
        int ordinal = z.q().ordinal();
        if (ordinal == 211) {
            return this.c.b(z.r());
        }
        switch (ordinal) {
            case 206:
                return this.d.b(z.r());
            case 207:
                return this.a.b(z.r());
            case 208:
                return this.b.b(z.r());
            default:
                throw new AssertionError(je.x0("No profile list page found for uri: ", str));
        }
    }
}
