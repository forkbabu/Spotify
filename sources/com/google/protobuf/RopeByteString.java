package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* access modifiers changed from: package-private */
public final class RopeByteString extends ByteString {
    private static final int[] c;
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* access modifiers changed from: private */
    public static class b {
        private final Stack<ByteString> a = new Stack<>();

        b(a aVar) {
        }

        static ByteString a(b bVar, ByteString byteString, ByteString byteString2) {
            bVar.b(byteString);
            bVar.b(byteString2);
            ByteString pop = bVar.a.pop();
            while (!bVar.a.isEmpty()) {
                pop = new RopeByteString(bVar.a.pop(), pop);
            }
            return pop;
        }

        private void b(ByteString byteString) {
            if (byteString.n()) {
                int binarySearch = Arrays.binarySearch(RopeByteString.c, byteString.size());
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i = RopeByteString.c[binarySearch + 1];
                if (this.a.isEmpty() || this.a.peek().size() >= i) {
                    this.a.push(byteString);
                    return;
                }
                int i2 = RopeByteString.c[binarySearch];
                ByteString pop = this.a.pop();
                while (!this.a.isEmpty() && this.a.peek().size() < i2) {
                    pop = new RopeByteString(this.a.pop(), pop);
                }
                RopeByteString ropeByteString = new RopeByteString(pop, byteString);
                while (!this.a.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(RopeByteString.c, ropeByteString.size());
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.a.peek().size() >= RopeByteString.c[binarySearch2 + 1]) {
                        break;
                    }
                    ropeByteString = new RopeByteString(this.a.pop(), ropeByteString);
                }
                this.a.push(ropeByteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString;
                b(ropeByteString2.left);
                b(ropeByteString2.right);
            } else {
                StringBuilder V0 = je.V0("Has a new type of ByteString been created? Found ");
                V0.append(byteString.getClass());
                throw new IllegalArgumentException(V0.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c implements Iterator<ByteString.LeafByteString> {
        private final Stack<RopeByteString> a = new Stack<>();
        private ByteString.LeafByteString b;

        c(ByteString byteString, a aVar) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            this.b = (ByteString.LeafByteString) byteString;
        }

        /* renamed from: a */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.b;
            if (leafByteString2 != null) {
                while (true) {
                    if (!this.a.isEmpty()) {
                        ByteString byteString = this.a.pop().right;
                        while (byteString instanceof RopeByteString) {
                            RopeByteString ropeByteString = (RopeByteString) byteString;
                            this.a.push(ropeByteString);
                            byteString = ropeByteString.left;
                        }
                        leafByteString = (ByteString.LeafByteString) byteString;
                        if (!leafByteString.isEmpty()) {
                            break;
                        }
                    } else {
                        leafByteString = null;
                        break;
                    }
                }
                this.b = leafByteString;
                return leafByteString2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        c = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = c;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    static ByteString K(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString2.size() + byteString.size();
        if (size < 128) {
            return L(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (byteString2.size() + ropeByteString.right.size() < 128) {
                return new RopeByteString(ropeByteString.left, L(ropeByteString.right, byteString2));
            } else if (ropeByteString.left.l() > ropeByteString.right.l() && ropeByteString.treeDepth > byteString2.l()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= c[Math.max(byteString.l(), byteString2.l()) + 1]) {
            return new RopeByteString(byteString, byteString2);
        }
        return b.a(new b(null), byteString, byteString2);
    }

    private static ByteString L(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.j(bArr, 0, 0, size);
        byteString2.j(bArr, 0, size, size2);
        return new ByteString.LiteralByteString(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public void E(e eVar) {
        this.left.E(eVar);
        this.right.E(eVar);
    }

    @Override // com.google.protobuf.ByteString
    public byte c(int i) {
        ByteString.d(i, this.totalLength);
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.c(i);
        }
        return this.right.c(i - i2);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Object
    public boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int y = y();
        int y2 = byteString.y();
        if (y != 0 && y2 != 0 && y != y2) {
            return false;
        }
        c cVar = new c(this, null);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) cVar.next();
        c cVar2 = new c(byteString, null);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = leafByteString.size() - i;
            int size2 = leafByteString2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = leafByteString.H(leafByteString2, i2, min);
            } else {
                z = leafByteString2.H(leafByteString, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 < i4) {
                if (min == size) {
                    leafByteString = (ByteString.LeafByteString) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    leafByteString2 = (ByteString.LeafByteString) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public void k(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.k(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.k(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.k(bArr, i, i2, i6);
            this.right.k(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int l() {
        return this.treeDepth;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public boolean n() {
        return this.totalLength >= c[this.treeDepth];
    }

    @Override // com.google.protobuf.ByteString
    public boolean o() {
        int x = this.left.x(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.x(x, 0, byteString.size()) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString
    public g t() {
        return g.c(new d());
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int u(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.u(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.u(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.u(this.left.u(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new ByteString.LiteralByteString(A());
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int x(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.x(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.x(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.x(this.left.x(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public ByteString z(int i, int i2) {
        int e = ByteString.e(i, i2, this.totalLength);
        if (e == 0) {
            return ByteString.a;
        }
        if (e == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.z(i, i2);
        }
        if (i >= i3) {
            return this.right.z(i - i3, i2 - i3);
        }
        ByteString byteString = this.left;
        return new RopeByteString(byteString.z(i, byteString.size()), this.right.z(0, i2 - this.leftLength));
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = byteString2.size() + size;
        this.treeDepth = Math.max(byteString.l(), byteString2.l()) + 1;
    }

    private class d extends InputStream {
        private c a;
        private ByteString.LeafByteString b;
        private int c;
        private int f;
        private int n;
        private int o;

        public d() {
            b();
        }

        private void a() {
            int i;
            if (this.b != null && this.f == (i = this.c)) {
                this.n += i;
                this.f = 0;
                if (this.a.hasNext()) {
                    ByteString.LeafByteString a2 = this.a.next();
                    this.b = a2;
                    this.c = a2.size();
                    return;
                }
                this.b = null;
                this.c = 0;
            }
        }

        private void b() {
            c cVar = new c(RopeByteString.this, null);
            this.a = cVar;
            ByteString.LeafByteString a2 = cVar.next();
            this.b = a2;
            this.c = a2.size();
            this.f = 0;
            this.n = 0;
        }

        private int d(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                a();
                if (this.b != null) {
                    int min = Math.min(this.c - this.f, i3);
                    if (bArr != null) {
                        this.b.j(bArr, this.f, i, min);
                        i += min;
                    }
                    this.f += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int available() {
            return RopeByteString.this.size() - (this.n + this.f);
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.o = this.n + this.f;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return d(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            b();
            d(null, 0, this.o);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) d(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() {
            a();
            ByteString.LeafByteString leafByteString = this.b;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f;
            this.f = i + 1;
            return leafByteString.c(i) & 255;
        }
    }
}
