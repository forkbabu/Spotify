package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.i;
import java.util.Arrays;

public final class c implements CharSequence, Comparable<CharSequence> {
    public static final c o = new c("");
    public static final k<CharSequence> p = new a();
    public static final k<CharSequence> q = new b();
    private final byte[] a;
    private final int b;
    private final int c;
    private int f;
    private String n;

    static class a implements k<CharSequence> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.netty.util.k
        public int a(CharSequence charSequence) {
            return c.n(charSequence);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.netty.util.k
        public boolean b(CharSequence charSequence, CharSequence charSequence2) {
            return c.k(charSequence, charSequence2);
        }
    }

    static class b implements k<CharSequence> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.netty.util.k
        public int a(CharSequence charSequence) {
            return c.n(charSequence);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.netty.util.k
        public boolean b(CharSequence charSequence, CharSequence charSequence2) {
            CharSequence charSequence3 = charSequence;
            CharSequence charSequence4 = charSequence2;
            if (charSequence3 == null || charSequence4 == null) {
                if (charSequence3 != charSequence4) {
                    return false;
                }
            } else if (charSequence3.getClass() == c.class) {
                return ((c) charSequence3).h(charSequence4);
            } else {
                if (charSequence4.getClass() == c.class) {
                    return ((c) charSequence4).h(charSequence3);
                }
                if (charSequence3.length() != charSequence4.length()) {
                    return false;
                }
                for (int i = 0; i < charSequence3.length(); i++) {
                    if (charSequence3.charAt(i) != charSequence4.charAt(i)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public c(byte[] bArr, int i, int i2, boolean z) {
        if (z) {
            this.a = Arrays.copyOfRange(bArr, i, i + i2);
            this.b = 0;
        } else if (!i.a(i, i2, bArr.length)) {
            this.a = bArr;
            this.b = i;
        } else {
            StringBuilder X0 = je.X0("expected: 0 <= start(", i, ") <= start + length(", i2, ") <= ");
            X0.append("value.length(");
            throw new IndexOutOfBoundsException(je.A0(X0, bArr.length, ')'));
        }
        this.c = i2;
    }

    public static boolean k(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence.getClass() == c.class) {
            return ((c) charSequence).i(charSequence2);
        } else {
            if (charSequence2.getClass() == c.class) {
                return ((c) charSequence2).i(charSequence);
            }
            if (charSequence.length() != charSequence2.length()) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                if (!l(charSequence.charAt(i), charSequence2.charAt(i2))) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
    }

    private static boolean l(char c2, char c3) {
        return c2 == c3 || q(c2) == q(c3);
    }

    public static int n(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        if (charSequence.getClass() == c.class) {
            return charSequence.hashCode();
        }
        return PlatformDependent.A(charSequence);
    }

    private static byte p(byte b2) {
        return b2 >= 65 && b2 <= 90 ? (byte) (b2 + 32) : b2;
    }

    private static char q(char c2) {
        return c2 >= 'A' && c2 <= 'Z' ? (char) (c2 + ' ') : c2;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        byte b2;
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(je.B0(je.W0("index: ", i, " must be in the range [0,"), this.c, ")"));
        }
        if (PlatformDependent.z()) {
            b2 = PlatformDependent.n(this.a, i + this.b);
        } else {
            b2 = this.a[i + this.b];
        }
        return (char) (b2 & 255);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        int i = 0;
        if (this == charSequence2) {
            return 0;
        }
        int i2 = this.c;
        int length = charSequence2.length();
        int min = Math.min(i2, length);
        int i3 = this.b;
        while (i < min) {
            int charAt = ((char) (this.a[i3] & 255)) - charSequence2.charAt(i);
            if (charAt != 0) {
                return charAt;
            }
            i++;
            i3++;
        }
        return i2 - length;
    }

    public byte[] d() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != c.class) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        c cVar = (c) obj;
        if (this.c == cVar.c && hashCode() == cVar.hashCode() && PlatformDependent.j(this.a, this.b, cVar.a, cVar.b, this.c)) {
            return true;
        }
        return false;
    }

    public int g() {
        return this.b;
    }

    public boolean h(CharSequence charSequence) {
        if (charSequence.length() != this.c) {
            return false;
        }
        if (charSequence.getClass() == c.class) {
            return equals(charSequence);
        }
        int i = this.b;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (((char) (this.a[i] & 255)) != charSequence.charAt(i2)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (this.f == 0) {
            this.f = PlatformDependent.B(this.a, this.b, this.c);
        }
        return this.f;
    }

    public boolean i(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() != this.c) {
            return false;
        }
        if (charSequence.getClass() == c.class) {
            c cVar = (c) charSequence;
            int i = this.b;
            int i2 = cVar.b;
            while (i < this.c) {
                byte b2 = this.a[i];
                byte b3 = cVar.a[i2];
                if (!(b2 == b3 || p(b2) == p(b3))) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
        int i3 = this.b;
        int i4 = 0;
        while (i3 < this.c) {
            if (!l((char) (this.a[i3] & 255), charSequence.charAt(i4))) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.c;
    }

    public int m(g gVar) {
        int i = this.c;
        int i2 = this.b + 0;
        int i3 = i + i2;
        while (i2 < i3) {
            if (!gVar.a(this.a[i2])) {
                return i2 - this.b;
            }
            i2++;
        }
        return -1;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        int i3 = i2 - i;
        if (i.a(i, i3, this.c)) {
            throw new IndexOutOfBoundsException(je.A0(je.X0("expected: 0 <= start(", i, ") <= end (", i2, ") <= length("), this.c, ')'));
        } else if (i == 0 && i2 == this.c) {
            return this;
        } else {
            if (i2 == i) {
                return o;
            }
            return new c(this.a, i + this.b, i3, true);
        }
    }

    @Override // java.lang.CharSequence, java.lang.Object
    public String toString() {
        String str;
        String str2 = this.n;
        if (str2 != null) {
            return str2;
        }
        int i = this.c;
        int i2 = i + 0;
        if (i2 == 0) {
            str = "";
        } else if (!i.a(0, i2, i)) {
            str = new String(this.a, 0, this.b + 0, i2);
        } else {
            throw new IndexOutOfBoundsException(je.A0(je.X0("expected: 0 <= start(", 0, ") <= srcIdx + length(", i2, ") <= srcLen("), this.c, ')'));
        }
        this.n = str;
        return str;
    }

    public c(CharSequence charSequence) {
        int length = charSequence.length();
        if (!i.a(0, length, charSequence.length())) {
            this.a = new byte[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr = this.a;
                char charAt = charSequence.charAt(i2);
                if (charAt > 255) {
                    charAt = '?';
                }
                bArr[i] = (byte) charAt;
                i++;
                i2++;
            }
            this.b = 0;
            this.c = length;
            return;
        }
        StringBuilder X0 = je.X0("expected: 0 <= start(", 0, ") <= start + length(", length, ") <= ");
        X0.append("value.length(");
        X0.append(charSequence.length());
        X0.append(')');
        throw new IndexOutOfBoundsException(X0.toString());
    }
}
