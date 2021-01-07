package defpackage;

import com.google.android.datatransport.Priority;
import defpackage.tg;
import java.util.Arrays;

/* renamed from: lg  reason: default package */
final class lg extends tg {
    private final String a;
    private final byte[] b;
    private final Priority c;

    /* access modifiers changed from: package-private */
    /* renamed from: lg$b */
    public static final class b extends tg.a {
        private String a;
        private byte[] b;
        private Priority c;

        b() {
        }

        @Override // defpackage.tg.a
        public tg a() {
            String str = this.a == null ? " backendName" : "";
            if (this.c == null) {
                str = je.x0(str, " priority");
            }
            if (str.isEmpty()) {
                return new lg(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.tg.a
        public tg.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // defpackage.tg.a
        public tg.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // defpackage.tg.a
        public tg.a d(Priority priority) {
            if (priority != null) {
                this.c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    lg(String str, byte[] bArr, Priority priority, a aVar) {
        this.a = str;
        this.b = bArr;
        this.c = priority;
    }

    @Override // defpackage.tg
    public String b() {
        return this.a;
    }

    @Override // defpackage.tg
    public byte[] c() {
        return this.b;
    }

    @Override // defpackage.tg
    public Priority d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        if (this.a.equals(tgVar.b())) {
            if (Arrays.equals(this.b, tgVar instanceof lg ? ((lg) tgVar).b : tgVar.c()) && this.c.equals(tgVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
