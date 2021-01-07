package defpackage;

import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;
import java.util.Collections;
import java.util.List;

/* renamed from: om  reason: default package */
public interface om {

    /* renamed from: om$a */
    public static final class a {
        public final String a;
        public final byte[] b;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }
    }

    /* renamed from: om$b */
    public static final class b {
        public final int a;
        public final String b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            List<a> list2;
            this.a = i;
            this.b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.c = list2;
            this.d = bArr;
        }
    }

    /* renamed from: om$c */
    public interface c {
        om a(int i, b bVar);
    }

    /* renamed from: om$d */
    public static final class d {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
        }

        public void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.a + this.d;
        }

        public String b() {
            if (this.d != Integer.MIN_VALUE) {
                return this.e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public int c() {
            int i = this.d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a(e0 e0Var, rj rjVar, d dVar);

    void b(v vVar, int i);

    void c();
}
