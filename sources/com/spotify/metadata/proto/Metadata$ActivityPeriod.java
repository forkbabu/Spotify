package com.spotify.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Metadata$ActivityPeriod extends GeneratedMessageLite<Metadata$ActivityPeriod, a> implements Object {
    private static final Metadata$ActivityPeriod n;
    private static volatile x<Metadata$ActivityPeriod> o;
    private int a;
    private int b;
    private int c;
    private int f;

    public static final class a extends GeneratedMessageLite.b<Metadata$ActivityPeriod, a> implements Object {
        private a() {
            super(Metadata$ActivityPeriod.n);
        }
    }

    static {
        Metadata$ActivityPeriod metadata$ActivityPeriod = new Metadata$ActivityPeriod();
        n = metadata$ActivityPeriod;
        metadata$ActivityPeriod.makeImmutable();
    }

    private Metadata$ActivityPeriod() {
    }

    public static x<Metadata$ActivityPeriod> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$ActivityPeriod metadata$ActivityPeriod = (Metadata$ActivityPeriod) obj2;
                this.b = hVar.m((this.a & 1) == 1, this.b, (metadata$ActivityPeriod.a & 1) == 1, metadata$ActivityPeriod.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (metadata$ActivityPeriod.a & 2) == 2, metadata$ActivityPeriod.c);
                boolean z2 = (this.a & 4) == 4;
                int i = this.f;
                if ((metadata$ActivityPeriod.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, metadata$ActivityPeriod.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$ActivityPeriod.a;
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
                return new Metadata$ActivityPeriod();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (Metadata$ActivityPeriod.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
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
        this.unknownFields.l(codedOutputStream);
    }
}
