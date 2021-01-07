package com.spotify.metadata.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Metadata$Image extends GeneratedMessageLite<Metadata$Image, a> implements Object {
    private static final Metadata$Image o;
    private static volatile x<Metadata$Image> p;
    private int a;
    private ByteString b = ByteString.a;
    private int c;
    private int f;
    private int n;

    public enum Size implements o.c {
        DEFAULT(0),
        SMALL(1),
        LARGE(2),
        XLARGE(3);
        
        private final int value;

        private Size(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Metadata$Image, a> implements Object {
        private a() {
            super(Metadata$Image.o);
        }
    }

    static {
        Metadata$Image metadata$Image = new Metadata$Image();
        o = metadata$Image;
        metadata$Image.makeImmutable();
    }

    private Metadata$Image() {
    }

    public static x<Metadata$Image> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Size size;
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Image metadata$Image = (Metadata$Image) obj2;
                this.b = hVar.r((this.a & 1) == 1, this.b, (metadata$Image.a & 1) == 1, metadata$Image.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (metadata$Image.a & 2) == 2, metadata$Image.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (metadata$Image.a & 4) == 4, metadata$Image.f);
                boolean z2 = (this.a & 8) == 8;
                int i = this.n;
                if ((metadata$Image.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.m(z2, i, z, metadata$Image.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Image.a;
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
                                this.a |= 1;
                                this.b = gVar.i();
                            } else if (B == 16) {
                                int u = gVar.u();
                                if (u == 0) {
                                    size = Size.DEFAULT;
                                } else if (u == 1) {
                                    size = Size.SMALL;
                                } else if (u == 2) {
                                    size = Size.LARGE;
                                } else if (u != 3) {
                                    size = null;
                                } else {
                                    size = Size.XLARGE;
                                }
                                if (size == null) {
                                    super.mergeVarintField(2, u);
                                } else {
                                    this.a |= 2;
                                    this.c = u;
                                }
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.y();
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.y();
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new Metadata$Image();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Metadata$Image.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.e(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.h(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.o(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.o(4, this.n);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ByteString h() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.C(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.K(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.O(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.O(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
