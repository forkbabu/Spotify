package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.v;

/* renamed from: ll  reason: default package */
final class ll {

    /* renamed from: ll$a */
    public static final class a {
        public a(String str, String[] strArr, int i) {
        }
    }

    /* renamed from: ll$b */
    public static final class b {
        public final boolean a;

        public b(boolean z, int i, int i2, int i3) {
            this.a = z;
        }
    }

    /* renamed from: ll$c */
    public static final class c {
        public final int a;
        public final long b;
        public final int c;
        public final int d;
        public final int e;
        public final byte[] f;

        public c(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.a = i;
            this.b = j2;
            this.c = i3;
            this.d = i5;
            this.e = i6;
            this.f = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean b(int i, v vVar, boolean z) {
        if (vVar.a() < 7) {
            if (z) {
                return false;
            }
            StringBuilder V0 = je.V0("too short header: ");
            V0.append(vVar.a());
            throw new ParserException(V0.toString());
        } else if (vVar.x() != i) {
            if (z) {
                return false;
            }
            StringBuilder V02 = je.V0("expected header type ");
            V02.append(Integer.toHexString(i));
            throw new ParserException(V02.toString());
        } else if (vVar.x() == 118 && vVar.x() == 111 && vVar.x() == 114 && vVar.x() == 98 && vVar.x() == 105 && vVar.x() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }
}
