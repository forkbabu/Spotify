package com.spotify.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Metadata$Date extends GeneratedMessageLite<Metadata$Date, a> implements Object {
    private static final Metadata$Date p;
    private static volatile x<Metadata$Date> q;
    private int a;
    private int b;
    private int c;
    private int f;
    private int n;
    private int o;

    public static final class a extends GeneratedMessageLite.b<Metadata$Date, a> implements Object {
        private a() {
            super(Metadata$Date.p);
        }
    }

    static {
        Metadata$Date metadata$Date = new Metadata$Date();
        p = metadata$Date;
        metadata$Date.makeImmutable();
    }

    private Metadata$Date() {
    }

    public static Metadata$Date h() {
        return p;
    }

    public static x<Metadata$Date> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Date metadata$Date = (Metadata$Date) obj2;
                this.b = hVar.m((this.a & 1) == 1, this.b, (metadata$Date.a & 1) == 1, metadata$Date.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (metadata$Date.a & 2) == 2, metadata$Date.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (metadata$Date.a & 4) == 4, metadata$Date.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (metadata$Date.a & 8) == 8, metadata$Date.n);
                boolean z2 = (this.a & 16) == 16;
                int i = this.o;
                if ((metadata$Date.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.m(z2, i, z, metadata$Date.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Date.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.y();
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.y();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.y();
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.y();
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.y();
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
                return new Metadata$Date();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (Metadata$Date.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.o(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.o(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.o(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.o(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.o(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.O(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.O(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.O(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.O(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.O(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
