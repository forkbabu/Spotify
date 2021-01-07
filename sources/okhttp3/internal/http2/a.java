package okhttp3.internal.http2;

import okio.ByteString;

public final class a {
    public static final ByteString d = ByteString.m(":");
    public static final ByteString e = ByteString.m(":status");
    public static final ByteString f = ByteString.m(":method");
    public static final ByteString g = ByteString.m(":path");
    public static final ByteString h = ByteString.m(":scheme");
    public static final ByteString i = ByteString.m(":authority");
    public final ByteString a;
    public final ByteString b;
    final int c;

    public a(String str, String str2) {
        this(ByteString.m(str), ByteString.m(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public String toString() {
        return rnf.o("%s: %s", this.a.C(), this.b.C());
    }

    public a(ByteString byteString, String str) {
        this(byteString, ByteString.m(str));
    }

    public a(ByteString byteString, ByteString byteString2) {
        this.a = byteString;
        this.b = byteString2;
        this.c = byteString2.x() + byteString.x() + 32;
    }
}
