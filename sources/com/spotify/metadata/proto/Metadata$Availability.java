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

public final class Metadata$Availability extends GeneratedMessageLite<Metadata$Availability, a> implements Object {
    private static final Metadata$Availability f;
    private static volatile x<Metadata$Availability> n;
    private int a;
    private o.i<String> b = GeneratedMessageLite.emptyProtobufList();
    private Metadata$Date c;

    public static final class a extends GeneratedMessageLite.b<Metadata$Availability, a> implements Object {
        private a() {
            super(Metadata$Availability.f);
        }
    }

    static {
        Metadata$Availability metadata$Availability = new Metadata$Availability();
        f = metadata$Availability;
        metadata$Availability.makeImmutable();
    }

    private Metadata$Availability() {
    }

    public static x<Metadata$Availability> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Availability metadata$Availability = (Metadata$Availability) obj2;
                this.b = hVar.q(this.b, metadata$Availability.b);
                this.c = (Metadata$Date) hVar.i(this.c, metadata$Availability.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Availability.a;
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
                                String z2 = gVar.z();
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(z2);
                            } else if (B == 18) {
                                Metadata$Date.a aVar = (this.a & 1) == 1 ? (Metadata$Date.a) this.c.toBuilder() : null;
                                Metadata$Date metadata$Date = (Metadata$Date) gVar.o(Metadata$Date.parser(), kVar);
                                this.c = metadata$Date;
                                if (aVar != null) {
                                    aVar.mergeFrom((Metadata$Date.a) metadata$Date);
                                    this.c = (Metadata$Date) aVar.buildPartial();
                                }
                                this.a |= 1;
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
                return new Metadata$Availability();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Metadata$Availability.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.q(this.b.get(i3));
        }
        int C0 = je.C0(this.b, 1, 0 + i2);
        if ((this.a & 1) == 1) {
            Metadata$Date metadata$Date = this.c;
            if (metadata$Date == null) {
                metadata$Date = Metadata$Date.h();
            }
            C0 += CodedOutputStream.n(2, metadata$Date);
        }
        int c2 = this.unknownFields.c() + C0;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.P(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            Metadata$Date metadata$Date = this.c;
            if (metadata$Date == null) {
                metadata$Date = Metadata$Date.h();
            }
            codedOutputStream.M(2, metadata$Date);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
