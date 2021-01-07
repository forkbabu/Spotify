package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString a = new LiteralByteString(o.b);
    private static final b b;
    private int hash = 0;

    /* access modifiers changed from: private */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.e(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString.LiteralByteString
        public int I() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte c(int i) {
            ByteString.d(i, this.bytesLength);
            return this.bytes[this.bytesOffset + i];
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public void k(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, this.bytesOffset + i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new LiteralByteString(A());
        }
    }

    static abstract class LeafByteString extends ByteString {
        LeafByteString() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean H(ByteString byteString, int i, int i2);

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public Iterator<Byte> iterator() {
            return new f(this);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final int l() {
            return 0;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final boolean n() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] bArr) {
            this.bytes = bArr;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.ByteString
        public final void E(e eVar) {
            eVar.a(this.bytes, I(), size());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.ByteString.LeafByteString
        public final boolean H(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 > byteString.size()) {
                    StringBuilder X0 = je.X0("Ran off end of other: ", i, ", ", i2, ", ");
                    X0.append(byteString.size());
                    throw new IllegalArgumentException(X0.toString());
                } else if (!(byteString instanceof LiteralByteString)) {
                    return byteString.z(i, i3).equals(z(0, i2));
                } else {
                    LiteralByteString literalByteString = (LiteralByteString) byteString;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = literalByteString.bytes;
                    int I = I() + i2;
                    int I2 = I();
                    int I3 = literalByteString.I() + i;
                    while (I2 < I) {
                        if (bArr[I2] != bArr2[I3]) {
                            return false;
                        }
                        I2++;
                        I3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int I() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public byte c(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString, java.lang.Object
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int y = y();
            int y2 = literalByteString.y();
            if (y == 0 || y2 == 0 || y == y2) {
                return H(literalByteString, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public void k(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean o() {
            int I = I();
            return Utf8.g(this.bytes, I, size() + I);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.ByteString
        public final g t() {
            return g.e(this.bytes, I(), size(), true);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final int u(int i, int i2, int i3) {
            byte[] bArr = this.bytes;
            int I = I() + i2;
            Charset charset = o.a;
            for (int i4 = I; i4 < I + i3; i4++) {
                i = (i * 31) + bArr[i4];
            }
            return i;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final int x(int i, int i2, int i3) {
            int I = I() + i2;
            return Utf8.h(i, this.bytes, I, i3 + I);
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString z(int i, int i2) {
            int e = ByteString.e(i, i2, size());
            if (e == 0) {
                return ByteString.a;
            }
            return new BoundedByteString(this.bytes, I() + i, e);
        }
    }

    private static final class a implements b {
        a(f fVar) {
        }

        @Override // com.google.protobuf.ByteString.b
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    private interface b {
        byte[] a(byte[] bArr, int i, int i2);
    }

    static final class c {
        private final CodedOutputStream a;
        private final byte[] b;

        c(int i, f fVar) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            int i2 = CodedOutputStream.d;
            this.a = new CodedOutputStream.c(bArr, 0, i);
        }

        public ByteString a() {
            if (this.a.y() == 0) {
                return new LiteralByteString(this.b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }

        public CodedOutputStream b() {
            return this.a;
        }
    }

    private static final class d implements b {
        d(f fVar) {
        }

        @Override // com.google.protobuf.ByteString.b
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        b = z ? new d(null) : new a(null);
    }

    ByteString() {
    }

    static void d(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(je.p0("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(je.s0("Index > length: ", i, ", ", i2));
    }

    static int e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(je.q0("Beginning index: ", i, " < 0"));
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(je.s0("Beginning index larger than ending index: ", i, ", ", i2));
        } else {
            throw new IndexOutOfBoundsException(je.s0("End index: ", i2, " >= ", i3));
        }
    }

    public static ByteString h(byte[] bArr) {
        return new LiteralByteString(b.a(bArr, 0, bArr.length));
    }

    public static ByteString i(byte[] bArr, int i, int i2) {
        return new LiteralByteString(b.a(bArr, i, i2));
    }

    public final byte[] A() {
        int size = size();
        if (size == 0) {
            return o.b;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public abstract void E(e eVar);

    public abstract byte c(int i);

    @Override // java.lang.Object
    public abstract boolean equals(Object obj);

    public final ByteString f(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.K(this, byteString);
        }
        StringBuilder V0 = je.V0("ByteString would be too long: ");
        V0.append(size());
        V0.append("+");
        V0.append(byteString.size());
        throw new IllegalArgumentException(V0.toString());
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = u(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new f(this);
    }

    public final void j(byte[] bArr, int i, int i2, int i3) {
        e(i, i + i3, size());
        e(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            k(bArr, i, i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void k(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int l();

    /* access modifiers changed from: protected */
    public abstract boolean n();

    public abstract boolean o();

    public abstract int size();

    public abstract g t();

    @Override // java.lang.Object
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* access modifiers changed from: protected */
    public abstract int u(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int x(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public final int y() {
        return this.hash;
    }

    public abstract ByteString z(int i, int i2);
}
