package com.spotify.imageresolve.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class Collection extends GeneratedMessageLite<Collection, b> implements Object {
    private static final Collection f;
    private static volatile x<Collection> n;
    private int a;
    private ByteString b = ByteString.a;
    private o.i<Projection> c = GeneratedMessageLite.emptyProtobufList();

    public static final class Projection extends GeneratedMessageLite<Projection, a> implements Object {
        private static final Projection f;
        private static volatile x<Projection> n;
        private ByteString a = ByteString.a;
        private int b;
        private int c;

        public static final class a extends GeneratedMessageLite.b<Projection, a> implements Object {
            private a() {
                super(Projection.f);
            }
        }

        static {
            Projection projection = new Projection();
            f = projection;
            projection.makeImmutable();
        }

        private Projection() {
        }

        public static x<Projection> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Projection projection = (Projection) obj2;
                    ByteString byteString = this.a;
                    ByteString byteString2 = ByteString.a;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = projection.a;
                    this.a = hVar.r(z2, byteString, byteString3 != byteString2, byteString3);
                    int i = this.b;
                    boolean z3 = i != 0;
                    int i2 = projection.b;
                    this.b = hVar.m(z3, i, i2 != 0, i2);
                    int i3 = this.c;
                    boolean z4 = i3 != 0;
                    int i4 = projection.c;
                    if (i4 != 0) {
                        z = true;
                    }
                    this.c = hVar.m(z4, i3, z, i4);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 18) {
                                    this.a = gVar.i();
                                } else if (B == 24) {
                                    this.b = gVar.u();
                                } else if (B == 32) {
                                    this.c = gVar.u();
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new Projection();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (Projection.class) {
                            if (n == null) {
                                n = new GeneratedMessageLite.c(f);
                            }
                        }
                    }
                    return n;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.a.isEmpty()) {
                i2 = 0 + CodedOutputStream.e(2, this.a);
            }
            int i3 = this.b;
            if (i3 != 0) {
                i2 += CodedOutputStream.j(3, i3);
            }
            int i4 = this.c;
            if (i4 != 0) {
                i2 += CodedOutputStream.j(4, i4);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ByteString h() {
            return this.a;
        }

        public int i() {
            return this.b;
        }

        public int l() {
            return this.c;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.C(2, this.a);
            }
            int i = this.b;
            if (i != 0) {
                codedOutputStream.K(3, i);
            }
            int i2 = this.c;
            if (i2 != 0) {
                codedOutputStream.K(4, i2);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Collection, b> implements Object {
        private b() {
            super(Collection.f);
        }
    }

    static {
        Collection collection = new Collection();
        f = collection;
        collection.makeImmutable();
    }

    private Collection() {
    }

    public static x<Collection> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Collection collection = (Collection) obj2;
                ByteString byteString = this.b;
                ByteString byteString2 = ByteString.a;
                boolean z2 = byteString != byteString2;
                ByteString byteString3 = collection.b;
                if (byteString3 != byteString2) {
                    z = true;
                }
                this.b = hVar.r(z2, byteString, z, byteString3);
                this.c = hVar.q(this.c, collection.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collection.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.b = gVar.i();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(Projection.parser(), kVar));
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                this.c.C();
                return null;
            case 4:
                return new Collection();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Collection.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int e = !this.b.isEmpty() ? CodedOutputStream.e(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            e += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = e;
        return e;
    }

    public ByteString h() {
        return this.b;
    }

    public List<Projection> i() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.C(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}
