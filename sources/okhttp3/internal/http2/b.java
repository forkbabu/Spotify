package okhttp3.internal.http2;

import com.adjust.sdk.Constants;
import com.spotify.cosmos.router.Request;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import okio.e;
import okio.g;
import okio.o;
import okio.w;

/* access modifiers changed from: package-private */
public final class b {
    static final a[] a;
    static final Map<ByteString, Integer> b;

    static final class a {
        private final List<a> a = new ArrayList();
        private final g b;
        private final int c;
        private int d;
        a[] e = new a[8];
        int f = 7;
        int g = 0;
        int h = 0;

        a(int i, w wVar) {
            this.c = i;
            this.d = i;
            this.b = o.d(wVar);
        }

        private void a() {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private int b(int i) {
            return this.f + 1 + i;
        }

        private int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    a[] aVarArr = this.e;
                    i -= aVarArr[length].c;
                    this.h -= aVarArr[length].c;
                    this.g--;
                    i3++;
                }
                a[] aVarArr2 = this.e;
                System.arraycopy(aVarArr2, i2 + 1, aVarArr2, i2 + 1 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        private ByteString e(int i) {
            if (i >= 0 && i <= b.a.length + -1) {
                return b.a[i].a;
            }
            int b2 = b(i - b.a.length);
            if (b2 >= 0) {
                a[] aVarArr = this.e;
                if (b2 < aVarArr.length) {
                    return aVarArr[b2].a;
                }
            }
            StringBuilder V0 = je.V0("Header index too large ");
            V0.append(i + 1);
            throw new IOException(V0.toString());
        }

        private void f(int i, a aVar) {
            this.a.add(aVar);
            int i2 = aVar.c;
            if (i != -1) {
                i2 -= this.e[(this.f + 1) + i].c;
            }
            int i3 = this.d;
            if (i2 > i3) {
                a();
                return;
            }
            int c2 = c((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                a[] aVarArr = this.e;
                if (i4 > aVarArr.length) {
                    a[] aVarArr2 = new a[(aVarArr.length * 2)];
                    System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                    this.f = this.e.length - 1;
                    this.e = aVarArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = aVar;
                this.g++;
            } else {
                this.e[this.f + 1 + i + c2 + i] = aVar;
            }
            this.h += i2;
        }

        public List<a> d() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public ByteString g() {
            int readByte = this.b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int i = i(readByte, 127);
            if (z) {
                return ByteString.s(l.d().a(this.b.B0((long) i)));
            }
            return this.b.Z0((long) i);
        }

        /* access modifiers changed from: package-private */
        public void h() {
            while (!this.b.l1()) {
                int readByte = this.b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    int i = i(readByte, 127) - 1;
                    if (i >= 0 && i <= b.a.length + -1) {
                        this.a.add(b.a[i]);
                    } else {
                        int b2 = b(i - b.a.length);
                        if (b2 >= 0) {
                            a[] aVarArr = this.e;
                            if (b2 < aVarArr.length) {
                                this.a.add(aVarArr[b2]);
                            }
                        }
                        StringBuilder V0 = je.V0("Header index too large ");
                        V0.append(i + 1);
                        throw new IOException(V0.toString());
                    }
                } else if (readByte == 64) {
                    ByteString g2 = g();
                    b.a(g2);
                    f(-1, new a(g2, g()));
                } else if ((readByte & 64) == 64) {
                    f(-1, new a(e(i(readByte, 63) - 1), g()));
                } else if ((readByte & 32) == 32) {
                    int i2 = i(readByte, 31);
                    this.d = i2;
                    if (i2 < 0 || i2 > this.c) {
                        StringBuilder V02 = je.V0("Invalid dynamic table size update ");
                        V02.append(this.d);
                        throw new IOException(V02.toString());
                    }
                    int i3 = this.h;
                    if (i2 < i3) {
                        if (i2 == 0) {
                            a();
                        } else {
                            c(i3 - i2);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    ByteString g3 = g();
                    b.a(g3);
                    this.a.add(new a(g3, g()));
                } else {
                    this.a.add(new a(e(i(readByte, 15) - 1), g()));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int i(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = this.b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b  reason: collision with other inner class name */
    static final class C0659b {
        private final e a;
        private int b = Integer.MAX_VALUE;
        private boolean c;
        int d = 4096;
        a[] e = new a[8];
        int f = 7;
        int g = 0;
        int h = 0;

        C0659b(e eVar) {
            this.a = eVar;
        }

        private void a() {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private int b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    a[] aVarArr = this.e;
                    i -= aVarArr[length].c;
                    this.h -= aVarArr[length].c;
                    this.g--;
                    i3++;
                }
                a[] aVarArr2 = this.e;
                System.arraycopy(aVarArr2, i2 + 1, aVarArr2, i2 + 1 + i3, this.g);
                a[] aVarArr3 = this.e;
                int i4 = this.f;
                Arrays.fill(aVarArr3, i4 + 1, i4 + 1 + i3, (Object) null);
                this.f += i3;
            }
            return i3;
        }

        private void c(a aVar) {
            int i = aVar.c;
            int i2 = this.d;
            if (i > i2) {
                a();
                return;
            }
            b((this.h + i) - i2);
            int i3 = this.g + 1;
            a[] aVarArr = this.e;
            if (i3 > aVarArr.length) {
                a[] aVarArr2 = new a[(aVarArr.length * 2)];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f = this.e.length - 1;
                this.e = aVarArr2;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = aVar;
            this.g++;
            this.h += i;
        }

        /* access modifiers changed from: package-private */
        public void d(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.d;
            if (i2 != min) {
                if (min < i2) {
                    this.b = Math.min(this.b, min);
                }
                this.c = true;
                this.d = min;
                int i3 = this.h;
                if (min >= i3) {
                    return;
                }
                if (min == 0) {
                    a();
                } else {
                    b(i3 - min);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e(ByteString byteString) {
            if (l.d().c(byteString) < byteString.x()) {
                e eVar = new e();
                l.d().b(byteString, eVar);
                ByteString q = eVar.q();
                g(q.x(), 127, 128);
                this.a.F(q);
                return;
            }
            g(byteString.x(), 127, 0);
            this.a.F(byteString);
        }

        /* access modifiers changed from: package-private */
        public void f(List<a> list) {
            int i;
            int i2;
            if (this.c) {
                int i3 = this.b;
                if (i3 < this.d) {
                    g(i3, 31, 32);
                }
                this.c = false;
                this.b = Integer.MAX_VALUE;
                g(this.d, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = list.get(i4);
                ByteString A = aVar.a.A();
                ByteString byteString = aVar.b;
                Integer num = b.b.get(A);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        a[] aVarArr = b.a;
                        if (rnf.n(aVarArr[i2 - 1].b, byteString)) {
                            i = i2;
                        } else if (rnf.n(aVarArr[i2].b, byteString)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f + 1;
                    int length = this.e.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (rnf.n(this.e[i5].a, A)) {
                            if (rnf.n(this.e[i5].b, byteString)) {
                                i2 = b.a.length + (i5 - this.f);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f) + b.a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    g(i2, 127, 128);
                } else if (i == -1) {
                    this.a.J(64);
                    e(A);
                    e(byteString);
                    c(aVar);
                } else {
                    ByteString byteString2 = a.d;
                    A.getClass();
                    if (!A.u(0, byteString2, 0, byteString2.x()) || a.i.equals(A)) {
                        g(i, 63, 64);
                        e(byteString);
                        c(aVar);
                    } else {
                        g(i, 15, 0);
                        e(byteString);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void g(int i, int i2, int i3) {
            if (i < i2) {
                this.a.J(i | i3);
                return;
            }
            this.a.J(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.a.J(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.a.J(i4);
        }
    }

    static {
        a aVar = new a(a.i, "");
        int i = 0;
        ByteString byteString = a.f;
        ByteString byteString2 = a.g;
        ByteString byteString3 = a.h;
        ByteString byteString4 = a.e;
        a[] aVarArr = {aVar, new a(byteString, Request.GET), new a(byteString, Request.POST), new a(byteString2, "/"), new a(byteString2, "/index.html"), new a(byteString3, "http"), new a(byteString3, Constants.SCHEME), new a(byteString4, "200"), new a(byteString4, "204"), new a(byteString4, "206"), new a(byteString4, "304"), new a(byteString4, "400"), new a(byteString4, "404"), new a(byteString4, "500"), new a("accept-charset", ""), new a("accept-encoding", "gzip, deflate"), new a("accept-language", ""), new a("accept-ranges", ""), new a("accept", ""), new a("access-control-allow-origin", ""), new a("age", ""), new a("allow", ""), new a("authorization", ""), new a("cache-control", ""), new a("content-disposition", ""), new a("content-encoding", ""), new a("content-language", ""), new a("content-length", ""), new a("content-location", ""), new a("content-range", ""), new a("content-type", ""), new a("cookie", ""), new a("date", ""), new a("etag", ""), new a("expect", ""), new a("expires", ""), new a("from", ""), new a("host", ""), new a("if-match", ""), new a("if-modified-since", ""), new a("if-none-match", ""), new a("if-range", ""), new a("if-unmodified-since", ""), new a("last-modified", ""), new a("link", ""), new a("location", ""), new a("max-forwards", ""), new a("proxy-authenticate", ""), new a("proxy-authorization", ""), new a("range", ""), new a("referer", ""), new a("refresh", ""), new a("retry-after", ""), new a("server", ""), new a("set-cookie", ""), new a("strict-transport-security", ""), new a("transfer-encoding", ""), new a("user-agent", ""), new a("vary", ""), new a("via", ""), new a("www-authenticate", "")};
        a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVarArr.length);
        while (true) {
            a[] aVarArr2 = a;
            if (i < aVarArr2.length) {
                if (!linkedHashMap.containsKey(aVarArr2[i].a)) {
                    linkedHashMap.put(aVarArr2[i].a, Integer.valueOf(i));
                }
                i++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    static ByteString a(ByteString byteString) {
        int x = byteString.x();
        for (int i = 0; i < x; i++) {
            byte n = byteString.n(i);
            if (n >= 65 && n <= 90) {
                StringBuilder V0 = je.V0("PROTOCOL_ERROR response malformed: mixed case name: ");
                V0.append(byteString.C());
                throw new IOException(V0.toString());
            }
        }
        return byteString;
    }
}
