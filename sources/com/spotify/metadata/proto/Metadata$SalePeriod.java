package com.spotify.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.metadata.proto.Metadata$Date;
import java.io.IOException;

public final class Metadata$SalePeriod extends GeneratedMessageLite<Metadata$SalePeriod, a> implements Object {
    private static final Metadata$SalePeriod n;
    private static volatile x<Metadata$SalePeriod> o;
    private int a;
    private o.i<Metadata$Restriction> b = GeneratedMessageLite.emptyProtobufList();
    private Metadata$Date c;
    private Metadata$Date f;

    public static final class a extends GeneratedMessageLite.b<Metadata$SalePeriod, a> implements Object {
        private a() {
            super(Metadata$SalePeriod.n);
        }
    }

    static {
        Metadata$SalePeriod metadata$SalePeriod = new Metadata$SalePeriod();
        n = metadata$SalePeriod;
        metadata$SalePeriod.makeImmutable();
    }

    private Metadata$SalePeriod() {
    }

    public static x<Metadata$SalePeriod> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$SalePeriod metadata$SalePeriod = (Metadata$SalePeriod) obj2;
                this.b = hVar.q(this.b, metadata$SalePeriod.b);
                this.c = (Metadata$Date) hVar.i(this.c, metadata$SalePeriod.c);
                this.f = (Metadata$Date) hVar.i(this.f, metadata$SalePeriod.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$SalePeriod.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(Metadata$Restriction.parser(), kVar));
                            } else if (B == 18) {
                                Metadata$Date.a aVar = (this.a & 1) == 1 ? (Metadata$Date.a) this.c.toBuilder() : null;
                                Metadata$Date metadata$Date = (Metadata$Date) gVar.o(Metadata$Date.parser(), kVar);
                                this.c = metadata$Date;
                                if (aVar != null) {
                                    aVar.mergeFrom((Metadata$Date.a) metadata$Date);
                                    this.c = (Metadata$Date) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 26) {
                                Metadata$Date.a aVar2 = (this.a & 2) == 2 ? (Metadata$Date.a) this.f.toBuilder() : null;
                                Metadata$Date metadata$Date2 = (Metadata$Date) gVar.o(Metadata$Date.parser(), kVar);
                                this.f = metadata$Date2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((Metadata$Date.a) metadata$Date2);
                                    this.f = (Metadata$Date) aVar2.buildPartial();
                                }
                                this.a |= 2;
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
                this.b.C();
                return null;
            case 4:
                return new Metadata$SalePeriod();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (Metadata$SalePeriod.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        if ((this.a & 1) == 1) {
            Metadata$Date metadata$Date = this.c;
            if (metadata$Date == null) {
                metadata$Date = Metadata$Date.h();
            }
            i2 += CodedOutputStream.n(2, metadata$Date);
        }
        if ((this.a & 2) == 2) {
            Metadata$Date metadata$Date2 = this.f;
            if (metadata$Date2 == null) {
                metadata$Date2 = Metadata$Date.h();
            }
            i2 += CodedOutputStream.n(3, metadata$Date2);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            Metadata$Date metadata$Date = this.c;
            if (metadata$Date == null) {
                metadata$Date = Metadata$Date.h();
            }
            codedOutputStream.M(2, metadata$Date);
        }
        if ((this.a & 2) == 2) {
            Metadata$Date metadata$Date2 = this.f;
            if (metadata$Date2 == null) {
                metadata$Date2 = Metadata$Date.h();
            }
            codedOutputStream.M(3, metadata$Date2);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
