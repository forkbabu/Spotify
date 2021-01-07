package com.spotify.metadata.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.metadata.proto.Metadata$ImageGroup;
import java.io.IOException;

public final class Metadata$Show extends GeneratedMessageLite<Metadata$Show, a> implements Object {
    private static final Metadata$Show B;
    private static volatile x<Metadata$Show> C;
    private o.i<Metadata$Availability> A = GeneratedMessageLite.emptyProtobufList();
    private int a;
    private ByteString b = ByteString.a;
    private String c = "";
    private String f = "";
    private int n;
    private String o = "";
    private String p = "";
    private boolean q;
    private Metadata$ImageGroup r;
    private o.i<Metadata$Episode> s = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Copyright> t = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Restriction> u = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> v = GeneratedMessageLite.emptyProtobufList();
    private int w;
    private int x = 1;
    private boolean y;
    private o.i<Metadata$SalePeriod> z = GeneratedMessageLite.emptyProtobufList();

    public enum ConsumptionOrder implements o.c {
        SEQUENTIAL(1),
        EPISODIC(2),
        RECENT(3);
        
        private final int value;

        private ConsumptionOrder(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public enum MediaType implements o.c {
        MIXED(0),
        AUDIO(1),
        VIDEO(2);
        
        private final int value;

        private MediaType(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Metadata$Show, a> implements Object {
        private a() {
            super(Metadata$Show.B);
        }
    }

    static {
        Metadata$Show metadata$Show = new Metadata$Show();
        B = metadata$Show;
        metadata$Show.makeImmutable();
    }

    private Metadata$Show() {
    }

    public static Metadata$Show h() {
        return B;
    }

    public static x<Metadata$Show> parser() {
        return B.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        MediaType mediaType;
        ConsumptionOrder consumptionOrder;
        int i = 1024;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return B;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Show metadata$Show = (Metadata$Show) obj2;
                this.b = hVar.r((this.a & 1) == 1, this.b, (metadata$Show.a & 1) == 1, metadata$Show.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (metadata$Show.a & 2) == 2, metadata$Show.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (metadata$Show.a & 4) == 4, metadata$Show.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (metadata$Show.a & 8) == 8, metadata$Show.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (metadata$Show.a & 16) == 16, metadata$Show.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (metadata$Show.a & 32) == 32, metadata$Show.p);
                this.q = hVar.f((this.a & 64) == 64, this.q, (metadata$Show.a & 64) == 64, metadata$Show.q);
                this.r = (Metadata$ImageGroup) hVar.i(this.r, metadata$Show.r);
                this.s = hVar.q(this.s, metadata$Show.s);
                this.t = hVar.q(this.t, metadata$Show.t);
                this.u = hVar.q(this.u, metadata$Show.u);
                this.v = hVar.q(this.v, metadata$Show.v);
                this.w = hVar.m((this.a & 256) == 256, this.w, (metadata$Show.a & 256) == 256, metadata$Show.w);
                this.x = hVar.m((this.a & 512) == 512, this.x, (metadata$Show.a & 512) == 512, metadata$Show.x);
                this.y = hVar.f((this.a & 1024) == 1024, this.y, (metadata$Show.a & 1024) == 1024, metadata$Show.y);
                this.z = hVar.q(this.z, metadata$Show.z);
                this.A = hVar.q(this.A, metadata$Show.A);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Show.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z2 = false;
                while (!z2) {
                    try {
                        int B2 = gVar.B();
                        switch (B2) {
                            case 0:
                                break;
                            case 10:
                                this.a |= 1;
                                this.b = gVar.i();
                                continue;
                                i = 1024;
                            case 18:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                                continue;
                                i = 1024;
                            case 514:
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                                continue;
                                i = 1024;
                            case 520:
                                this.a |= 8;
                                this.n = gVar.y();
                                continue;
                                i = 1024;
                            case 530:
                                String z5 = gVar.z();
                                this.a |= 16;
                                this.o = z5;
                                continue;
                                i = 1024;
                            case 538:
                                String z6 = gVar.z();
                                this.a |= 32;
                                this.p = z6;
                                continue;
                                i = 1024;
                            case 544:
                                this.a |= 64;
                                this.q = gVar.h();
                                continue;
                                i = 1024;
                            case 554:
                                Metadata$ImageGroup.a aVar = (this.a & 128) == 128 ? (Metadata$ImageGroup.a) this.r.toBuilder() : null;
                                Metadata$ImageGroup metadata$ImageGroup = (Metadata$ImageGroup) gVar.o(Metadata$ImageGroup.parser(), kVar);
                                this.r = metadata$ImageGroup;
                                if (aVar != null) {
                                    aVar.mergeFrom((Metadata$ImageGroup.a) metadata$ImageGroup);
                                    this.r = (Metadata$ImageGroup) aVar.buildPartial();
                                }
                                this.a |= 128;
                                continue;
                                i = 1024;
                            case 562:
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(gVar.o(Metadata$Episode.parser(), kVar));
                                continue;
                                i = 1024;
                            case 570:
                                if (!this.t.R0()) {
                                    this.t = GeneratedMessageLite.mutableCopy(this.t);
                                }
                                this.t.add(gVar.o(Metadata$Copyright.parser(), kVar));
                                continue;
                                i = 1024;
                            case 578:
                                if (!this.u.R0()) {
                                    this.u = GeneratedMessageLite.mutableCopy(this.u);
                                }
                                this.u.add(gVar.o(Metadata$Restriction.parser(), kVar));
                                continue;
                                i = 1024;
                            case 586:
                                String z7 = gVar.z();
                                if (!this.v.R0()) {
                                    this.v = GeneratedMessageLite.mutableCopy(this.v);
                                }
                                this.v.add(z7);
                                continue;
                                i = 1024;
                            case 592:
                                int u2 = gVar.u();
                                if (u2 == 0) {
                                    mediaType = MediaType.MIXED;
                                } else if (u2 == 1) {
                                    mediaType = MediaType.AUDIO;
                                } else if (u2 != 2) {
                                    mediaType = null;
                                } else {
                                    mediaType = MediaType.VIDEO;
                                }
                                if (mediaType == null) {
                                    super.mergeVarintField(74, u2);
                                    continue;
                                } else {
                                    this.a |= 256;
                                    this.w = u2;
                                }
                                i = 1024;
                            case 600:
                                int u3 = gVar.u();
                                if (u3 == 1) {
                                    consumptionOrder = ConsumptionOrder.SEQUENTIAL;
                                } else if (u3 == 2) {
                                    consumptionOrder = ConsumptionOrder.EPISODIC;
                                } else if (u3 != 3) {
                                    consumptionOrder = null;
                                } else {
                                    consumptionOrder = ConsumptionOrder.RECENT;
                                }
                                if (consumptionOrder == null) {
                                    super.mergeVarintField(75, u3);
                                    continue;
                                } else {
                                    this.a |= 512;
                                    this.x = u3;
                                }
                                i = 1024;
                            case 608:
                                this.a |= i;
                                this.y = gVar.h();
                                continue;
                                i = 1024;
                            case 618:
                                if (!this.z.R0()) {
                                    this.z = GeneratedMessageLite.mutableCopy(this.z);
                                }
                                this.z.add(gVar.o(Metadata$SalePeriod.parser(), kVar));
                                continue;
                                i = 1024;
                            case 626:
                                if (!this.A.R0()) {
                                    this.A = GeneratedMessageLite.mutableCopy(this.A);
                                }
                                this.A.add(gVar.o(Metadata$Availability.parser(), kVar));
                                continue;
                                i = 1024;
                            default:
                                if (parseUnknownField(B2, gVar)) {
                                    continue;
                                    i = 1024;
                                }
                                break;
                        }
                        z2 = true;
                        i = 1024;
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
                this.s.C();
                this.t.C();
                this.u.C();
                this.v.C();
                this.z.C();
                this.A.C();
                return null;
            case 4:
                return new Metadata$Show();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (C == null) {
                    synchronized (Metadata$Show.class) {
                        if (C == null) {
                            C = new GeneratedMessageLite.c(B);
                        }
                    }
                }
                return C;
            default:
                throw new UnsupportedOperationException();
        }
        return B;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int e = (this.a & 1) == 1 ? CodedOutputStream.e(1, this.b) + 0 : 0;
        if ((this.a & 2) == 2) {
            e += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            e += CodedOutputStream.p(64, this.f);
        }
        if ((this.a & 8) == 8) {
            e += CodedOutputStream.o(65, this.n);
        }
        if ((this.a & 16) == 16) {
            e += CodedOutputStream.p(66, this.o);
        }
        if ((this.a & 32) == 32) {
            e += CodedOutputStream.p(67, this.p);
        }
        if ((this.a & 64) == 64) {
            e += CodedOutputStream.d(68, this.q);
        }
        if ((this.a & 128) == 128) {
            Metadata$ImageGroup metadata$ImageGroup = this.r;
            if (metadata$ImageGroup == null) {
                metadata$ImageGroup = Metadata$ImageGroup.h();
            }
            e += CodedOutputStream.n(69, metadata$ImageGroup);
        }
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            e += CodedOutputStream.n(70, this.s.get(i2));
        }
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            e += CodedOutputStream.n(71, this.t.get(i3));
        }
        for (int i4 = 0; i4 < this.u.size(); i4++) {
            e += CodedOutputStream.n(72, this.u.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.v.size(); i6++) {
            i5 += CodedOutputStream.q(this.v.get(i6));
        }
        int C0 = je.C0(this.v, 2, e + i5);
        if ((this.a & 256) == 256) {
            C0 += CodedOutputStream.h(74, this.w);
        }
        if ((this.a & 512) == 512) {
            C0 += CodedOutputStream.h(75, this.x);
        }
        if ((this.a & 1024) == 1024) {
            C0 += CodedOutputStream.d(76, this.y);
        }
        for (int i7 = 0; i7 < this.z.size(); i7++) {
            C0 += CodedOutputStream.n(77, this.z.get(i7));
        }
        for (int i8 = 0; i8 < this.A.size(); i8++) {
            C0 += CodedOutputStream.n(78, this.A.get(i8));
        }
        int c2 = this.unknownFields.c() + C0;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String i() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.C(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(64, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.O(65, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(66, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(67, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.A(68, this.q);
        }
        if ((this.a & 128) == 128) {
            Metadata$ImageGroup metadata$ImageGroup = this.r;
            if (metadata$ImageGroup == null) {
                metadata$ImageGroup = Metadata$ImageGroup.h();
            }
            codedOutputStream.M(69, metadata$ImageGroup);
        }
        for (int i = 0; i < this.s.size(); i++) {
            codedOutputStream.M(70, this.s.get(i));
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            codedOutputStream.M(71, this.t.get(i2));
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            codedOutputStream.M(72, this.u.get(i3));
        }
        for (int i4 = 0; i4 < this.v.size(); i4++) {
            codedOutputStream.P(73, this.v.get(i4));
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.K(74, this.w);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.K(75, this.x);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.A(76, this.y);
        }
        for (int i5 = 0; i5 < this.z.size(); i5++) {
            codedOutputStream.M(77, this.z.get(i5));
        }
        for (int i6 = 0; i6 < this.A.size(); i6++) {
            codedOutputStream.M(78, this.A.get(i6));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
