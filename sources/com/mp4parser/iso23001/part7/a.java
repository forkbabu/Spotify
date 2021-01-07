package com.mp4parser.iso23001.part7;

import java.math.BigInteger;
import java.util.Arrays;

public class a {
    public byte[] a = new byte[0];
    public j[] b = null;

    /* renamed from: com.mp4parser.iso23001.part7.a$a  reason: collision with other inner class name */
    private abstract class AbstractC0142a implements j {
        AbstractC0142a(a aVar, AbstractC0142a aVar2) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            j jVar = (j) obj;
            return clear() == jVar.clear() && a() == jVar.a();
        }

        public String toString() {
            return "P(" + clear() + "|" + a() + ")";
        }
    }

    /* access modifiers changed from: private */
    public class b extends AbstractC0142a {
        private byte a;
        private byte b;

        public b(a aVar, int i, long j) {
            super(aVar, null);
            this.a = (byte) i;
            this.b = (byte) ((int) j);
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class c extends AbstractC0142a {
        private byte a;
        private int b;

        public c(a aVar, int i, long j) {
            super(aVar, null);
            this.a = (byte) i;
            this.b = (int) j;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class d extends AbstractC0142a {
        private byte a;
        private long b;

        public d(a aVar, int i, long j) {
            super(aVar, null);
            this.a = (byte) i;
            this.b = j;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class e extends AbstractC0142a {
        private byte a;
        private short b;

        public e(a aVar, int i, long j) {
            super(aVar, null);
            this.a = (byte) i;
            this.b = (short) ((int) j);
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class f extends AbstractC0142a {
        private int a;
        private byte b;

        public f(a aVar, int i, long j) {
            super(aVar, null);
            this.a = i;
            this.b = (byte) ((int) j);
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class g extends AbstractC0142a {
        private int a;
        private int b;

        public g(a aVar, int i, long j) {
            super(aVar, null);
            this.a = i;
            this.b = (int) j;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class h extends AbstractC0142a {
        private int a;
        private long b;

        public h(a aVar, int i, long j) {
            super(aVar, null);
            this.a = i;
            this.b = j;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class i extends AbstractC0142a {
        private int a;
        private short b;

        public i(a aVar, int i, long j) {
            super(aVar, null);
            this.a = i;
            this.b = (short) ((int) j);
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    public interface j {
        long a();

        int clear();
    }

    /* access modifiers changed from: private */
    public class k extends AbstractC0142a {
        private short a;
        private byte b;

        public k(a aVar, int i, long j) {
            super(aVar, null);
            this.a = (short) i;
            this.b = (byte) ((int) j);
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class l extends AbstractC0142a {
        private short a;
        private int b;

        public l(a aVar, int i, long j) {
            super(aVar, null);
            this.a = (short) i;
            this.b = (int) j;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class m extends AbstractC0142a {
        private short a;
        private long b;

        public m(a aVar, int i, long j) {
            super(aVar, null);
            this.a = (short) i;
            this.b = j;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public class n extends AbstractC0142a {
        private short a;
        private short b;

        public n(a aVar, int i, long j) {
            super(aVar, null);
            this.a = (short) i;
            this.b = (short) ((int) j);
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public long a() {
            return (long) this.b;
        }

        @Override // com.mp4parser.iso23001.part7.a.j
        public int clear() {
            return this.a;
        }
    }

    public j a(int i2, long j2) {
        if (i2 <= 127) {
            if (j2 <= 127) {
                return new b(this, i2, j2);
            }
            if (j2 <= 32767) {
                return new e(this, i2, j2);
            }
            if (j2 <= 2147483647L) {
                return new c(this, i2, j2);
            }
            return new d(this, i2, j2);
        } else if (i2 <= 32767) {
            if (j2 <= 127) {
                return new k(this, i2, j2);
            }
            if (j2 <= 32767) {
                return new n(this, i2, j2);
            }
            if (j2 <= 2147483647L) {
                return new l(this, i2, j2);
            }
            return new m(this, i2, j2);
        } else if (j2 <= 127) {
            return new f(this, i2, j2);
        } else {
            if (j2 <= 32767) {
                return new i(this, i2, j2);
            }
            if (j2 <= 2147483647L) {
                return new g(this, i2, j2);
            }
            return new h(this, i2, j2);
        }
    }

    public int b() {
        int length = this.a.length;
        j[] jVarArr = this.b;
        return (jVarArr == null || jVarArr.length <= 0) ? length : length + 2 + (jVarArr.length * 6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!new BigInteger(this.a).equals(new BigInteger(aVar.a))) {
            return false;
        }
        j[] jVarArr = this.b;
        j[] jVarArr2 = aVar.b;
        return jVarArr == null ? jVarArr2 == null : Arrays.equals(jVarArr, jVarArr2);
    }

    public int hashCode() {
        byte[] bArr = this.a;
        int i2 = 0;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        j[] jVarArr = this.b;
        if (jVarArr != null) {
            i2 = Arrays.hashCode(jVarArr);
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Entry{iv=");
        sb.append(me.a(this.a));
        sb.append(", pairs=");
        return je.H0(sb, Arrays.toString(this.b), '}');
    }
}
