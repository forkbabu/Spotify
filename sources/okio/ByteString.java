package okio;

import com.adjust.sdk.Constants;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class ByteString implements Serializable, Comparable<ByteString> {
    static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ByteString f = s(new byte[0]);
    private static final long serialVersionUID = 1;
    transient int a;
    transient String b;
    final byte[] data;

    ByteString(byte[] bArr) {
        this.data = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        r5 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okio.ByteString g(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.g(java.lang.String):okio.ByteString");
    }

    public static ByteString h(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((i(str.charAt(i2)) << 4) + i(str.charAt(i2 + 1)));
            }
            return s(bArr);
        }
        throw new IllegalArgumentException(je.x0("Unexpected hex string: ", str));
    }

    private static int i(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException(je.o0("Unexpected hex digit: ", c2));
            }
        }
        return (c2 - c3) + 10;
    }

    private ByteString k(String str) {
        try {
            return s(MessageDigest.getInstance(str).digest(this.data));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static ByteString l(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new ByteString(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public static ByteString m(String str) {
        if (str != null) {
            ByteString byteString = new ByteString(str.getBytes(y.a));
            byteString.b = str;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            ByteString byteString = new ByteString(bArr);
            try {
                Field declaredField = ByteString.class.getDeclaredField("data");
                declaredField.setAccessible(true);
                declaredField.set(this, byteString.data);
            } catch (NoSuchFieldException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        } else {
            throw new IllegalArgumentException(je.p0("byteCount < 0: ", readInt));
        }
    }

    public static ByteString s(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public ByteString A() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new ByteString(bArr2);
            }
        }
    }

    public byte[] B() {
        return (byte[]) this.data.clone();
    }

    public String C() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.data, y.a);
        this.b = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    public void D(e eVar) {
        byte[] bArr = this.data;
        eVar.I(bArr, 0, bArr.length);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029 A[RETURN, SYNTHETIC] */
    @Override // java.lang.Comparable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            okio.ByteString r10 = (okio.ByteString) r10
            int r0 = r9.x()
            int r1 = r10.x()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0010:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.n(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.n(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = -1
            goto L_0x0031
        L_0x0029:
            r3 = 1
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(java.lang.Object):int");
    }

    public String d() {
        return d.a(this.data);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int x = byteString.x();
            byte[] bArr = this.data;
            if (x == bArr.length && byteString.v(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.a = hashCode;
        return hashCode;
    }

    public byte n(int i) {
        return this.data[i];
    }

    public String p() {
        byte[] bArr = this.data;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = c;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* access modifiers changed from: package-private */
    public byte[] q() {
        return this.data;
    }

    public ByteString r() {
        return k(Constants.MD5);
    }

    @Override // java.lang.Object
    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String C = C();
        int length = C.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = C.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = C.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i != -1) {
            String replace = C.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i >= C.length()) {
                return je.y0("[text=", replace, "]");
            }
            StringBuilder V0 = je.V0("[size=");
            V0.append(this.data.length);
            V0.append(" text=");
            V0.append(replace);
            V0.append("…]");
            return V0.toString();
        } else if (this.data.length <= 64) {
            StringBuilder V02 = je.V0("[hex=");
            V02.append(p());
            V02.append("]");
            return V02.toString();
        } else {
            StringBuilder V03 = je.V0("[size=");
            V03.append(this.data.length);
            V03.append(" hex=");
            V03.append(z(0, 64).p());
            V03.append("…]");
            return V03.toString();
        }
    }

    public boolean u(int i, ByteString byteString, int i2, int i3) {
        return byteString.v(i2, this.data, i, i3);
    }

    public boolean v(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && y.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public ByteString w() {
        return k(Constants.SHA256);
    }

    public int x() {
        return this.data.length;
    }

    public ByteString z(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.data;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    return new ByteString(bArr2);
                }
            } else {
                throw new IllegalArgumentException(je.B0(je.V0("endIndex > length("), this.data.length, ")"));
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }
}
