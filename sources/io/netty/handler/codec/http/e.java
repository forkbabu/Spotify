package io.netty.handler.codec.http;

import io.netty.handler.codec.e;
import io.netty.handler.codec.f;
import io.netty.handler.codec.h;
import io.netty.util.g;
import io.netty.util.internal.PlatformDependent;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e extends r {
    private static final g b = new a();
    static final e.d<CharSequence> c = new b();
    private final io.netty.handler.codec.e<CharSequence, CharSequence, ?> a;

    static class a implements g {
        a() {
        }

        @Override // io.netty.util.g
        public boolean a(byte b) {
            if (!(b == 0 || b == 32 || b == 44 || b == 61 || b == 58 || b == 59)) {
                switch (b) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        if (b >= 0) {
                            return true;
                        }
                        throw new IllegalArgumentException(je.p0("a header name cannot contain non-ASCII character: ", b));
                }
            }
            throw new IllegalArgumentException(je.p0("a header name cannot contain the following prohibited characters: =,;: \\t\\r\\n\\v\\f: ", b));
        }
    }

    static class b implements e.d<CharSequence> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.netty.handler.codec.e.d
        public void a(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            if (charSequence2 == null || charSequence2.length() == 0) {
                throw new IllegalArgumentException("empty headers are not allowed [" + ((Object) charSequence2) + "]");
            } else if (charSequence2 instanceof io.netty.util.c) {
                try {
                    ((io.netty.util.c) charSequence2).m(e.b);
                } catch (Exception e) {
                    PlatformDependent.f0(e);
                }
            } else {
                for (int i = 0; i < charSequence2.length(); i++) {
                    char charAt = charSequence2.charAt(i);
                    if (!(charAt == 0 || charAt == ' ' || charAt == ',' || charAt == '=' || charAt == ':' || charAt == ';')) {
                        switch (charAt) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (charAt > 127) {
                                    throw new IllegalArgumentException(je.o0("a header name cannot contain non-ASCII character: ", charAt));
                                }
                        }
                    }
                    throw new IllegalArgumentException(je.o0("a header name cannot contain the following prohibited characters: =,;: \\t\\r\\n\\v\\f: ", charAt));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c extends io.netty.handler.codec.b {
        static final c a = new c();

        private c() {
        }

        /* renamed from: b */
        public CharSequence a(Object obj) {
            if (obj instanceof CharSequence) {
                return (CharSequence) obj;
            }
            if (obj instanceof Date) {
                return HttpHeaderDateFormat.b().format((Date) obj);
            }
            if (obj instanceof Calendar) {
                return HttpHeaderDateFormat.b().format(((Calendar) obj).getTime());
            }
            return obj.toString();
        }

        c(a aVar) {
        }
    }

    /* access modifiers changed from: private */
    public static final class d extends c {
        static final d b = new d();

        private d() {
            super(null);
        }

        @Override // io.netty.handler.codec.http.e.c
        /* renamed from: b */
        public CharSequence a(Object obj) {
            CharSequence b2 = super.a(obj);
            char c = 0;
            for (int i = 0; i < b2.length(); i++) {
                char charAt = b2.charAt(i);
                if ((charAt & 65520) == 0) {
                    if (charAt == 0) {
                        throw new IllegalArgumentException("a header value contains a prohibited character '\u0000': " + ((Object) b2));
                    } else if (charAt == 11) {
                        throw new IllegalArgumentException("a header value contains a prohibited character '\\v': " + ((Object) b2));
                    } else if (charAt == '\f') {
                        throw new IllegalArgumentException("a header value contains a prohibited character '\\f': " + ((Object) b2));
                    }
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            continue;
                        } else if (charAt == '\t' || charAt == ' ') {
                            c = 0;
                        } else {
                            throw new IllegalArgumentException("only ' ' and '\\t' are allowed after '\\n': " + ((Object) b2));
                        }
                    } else if (charAt != '\n') {
                        throw new IllegalArgumentException("only '\\n' is allowed after '\\r': " + ((Object) b2));
                    }
                } else if (charAt != '\n') {
                    if (charAt == '\r') {
                        c = 1;
                    }
                }
                c = 2;
            }
            if (c == 0) {
                return b2;
            }
            throw new IllegalArgumentException("a header value must not end with '\\r' or '\\n':" + ((Object) b2));
        }
    }

    public e() {
        this(true);
    }

    @Override // io.netty.handler.codec.http.r
    public r A(String str, Object obj) {
        this.a.t(str, obj);
        return this;
    }

    @Override // io.netty.handler.codec.http.r
    public r c(CharSequence charSequence, Object obj) {
        this.a.e(charSequence, obj);
        return this;
    }

    @Override // io.netty.handler.codec.http.r
    public r d(String str, Object obj) {
        this.a.e(str, obj);
        return this;
    }

    @Override // io.netty.handler.codec.http.r
    public boolean e(CharSequence charSequence) {
        return this.a.i(charSequence) != null;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.a.h(((e) obj).a, io.netty.util.c.q);
    }

    @Override // io.netty.handler.codec.http.r
    public boolean f(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return this.a.f(charSequence, charSequence2, z ? io.netty.util.c.p : io.netty.util.c.q);
    }

    @Override // io.netty.handler.codec.http.r
    public boolean h(String str) {
        return e(str);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.j(io.netty.util.c.q);
    }

    @Override // io.netty.handler.codec.http.r
    public boolean i(String str, String str2, boolean z) {
        return f(str, str2, z);
    }

    @Override // io.netty.handler.codec.http.r
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // io.netty.handler.codec.http.r, java.lang.Iterable
    @Deprecated
    public Iterator<Map.Entry<String, String>> iterator() {
        return h.b(this.a);
    }

    @Override // io.netty.handler.codec.http.r
    public String j(CharSequence charSequence) {
        CharSequence i = this.a.i(charSequence);
        if (i != null) {
            return i.toString();
        }
        return null;
    }

    @Override // io.netty.handler.codec.http.r
    public String k(String str) {
        CharSequence i = this.a.i(str);
        if (i != null) {
            return i.toString();
        }
        return null;
    }

    @Override // io.netty.handler.codec.http.r
    public List<String> l(CharSequence charSequence) {
        return h.a(this.a, charSequence);
    }

    @Override // io.netty.handler.codec.http.r
    public List<String> n(String str) {
        return h.a(this.a, str);
    }

    @Override // io.netty.handler.codec.http.r
    public Iterator<Map.Entry<CharSequence, CharSequence>> o() {
        return this.a.iterator();
    }

    @Override // io.netty.handler.codec.http.r
    public r t(CharSequence charSequence) {
        this.a.remove(charSequence);
        return this;
    }

    @Override // io.netty.handler.codec.http.r
    public r u(String str) {
        this.a.remove(str);
        return this;
    }

    @Override // io.netty.handler.codec.http.r
    public r x(CharSequence charSequence, Iterable<?> iterable) {
        this.a.o(charSequence, iterable);
        return this;
    }

    @Override // io.netty.handler.codec.http.r
    public r y(CharSequence charSequence, Object obj) {
        this.a.t(charSequence, obj);
        return this;
    }

    @Override // io.netty.handler.codec.http.r
    public r z(String str, Iterable<?> iterable) {
        this.a.o(str, iterable);
        return this;
    }

    protected e(boolean z, e.d<CharSequence> dVar) {
        this.a = new f(io.netty.util.c.p, z ? d.b : c.a, dVar);
    }

    protected e(io.netty.handler.codec.e<CharSequence, CharSequence, ?> eVar) {
        this.a = eVar;
    }

    public e(boolean z) {
        this.a = new f(io.netty.util.c.p, z ? d.b : c.a, z ? c : e.d.a);
    }
}
