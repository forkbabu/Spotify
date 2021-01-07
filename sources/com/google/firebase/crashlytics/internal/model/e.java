package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

final class e extends CrashlyticsReport.c.b {
    private final String a;
    private final byte[] b;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.c.b.a {
        private String a;
        private byte[] b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.b.a
        public CrashlyticsReport.c.b a() {
            String str = this.a == null ? " filename" : "";
            if (this.b == null) {
                str = je.x0(str, " contents");
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.b.a
        public CrashlyticsReport.c.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.b.a
        public CrashlyticsReport.c.b.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    e(String str, byte[] bArr, a aVar) {
        this.a = str;
        this.b = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.b
    public byte[] b() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.c.b)) {
            return false;
        }
        CrashlyticsReport.c.b bVar = (CrashlyticsReport.c.b) obj;
        if (this.a.equals(bVar.c())) {
            if (Arrays.equals(this.b, bVar instanceof e ? ((e) bVar).b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder V0 = je.V0("File{filename=");
        V0.append(this.a);
        V0.append(", contents=");
        V0.append(Arrays.toString(this.b));
        V0.append("}");
        return V0.toString();
    }
}
