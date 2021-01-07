package com.spotify.metadata.proto;

import com.comscore.streaming.ContentDeliverySubscriptionType;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.metadata.proto.Metadata$Date;
import com.spotify.metadata.proto.Metadata$ImageGroup;
import com.spotify.metadata.proto.Metadata$Show;
import java.io.IOException;

public final class Metadata$Episode extends GeneratedMessageLite<Metadata$Episode, a> implements Object {
    private static final Metadata$Episode H;
    private static volatile x<Metadata$Episode> I;
    private Metadata$ImageGroup A;
    private o.i<String> B = GeneratedMessageLite.emptyProtobufList();
    private boolean C;
    private boolean D;
    private o.i<Metadata$SalePeriod> E = GeneratedMessageLite.emptyProtobufList();
    private boolean F;
    private o.i<Metadata$Availability> G = GeneratedMessageLite.emptyProtobufList();
    private int a;
    private ByteString b = ByteString.a;
    private String c = "";
    private int f;
    private o.i<Metadata$AudioFile> n = GeneratedMessageLite.emptyProtobufList();
    private String o = "";
    private int p;
    private Metadata$Date q;
    private int r;
    private Metadata$ImageGroup s;
    private String t = "";
    private boolean u;
    private Metadata$Show v;
    private o.i<Metadata$VideoFile> w = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$VideoFile> x = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$AudioFile> y = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Restriction> z = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<Metadata$Episode, a> implements Object {
        private a() {
            super(Metadata$Episode.H);
        }
    }

    static {
        Metadata$Episode metadata$Episode = new Metadata$Episode();
        H = metadata$Episode;
        metadata$Episode.makeImmutable();
    }

    private Metadata$Episode() {
    }

    public static x<Metadata$Episode> parser() {
        return H.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return H;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Episode metadata$Episode = (Metadata$Episode) obj2;
                this.b = hVar.r(o(), this.b, metadata$Episode.o(), metadata$Episode.b);
                this.c = hVar.n(r(), this.c, metadata$Episode.r(), metadata$Episode.c);
                this.f = hVar.m(m(), this.f, metadata$Episode.m(), metadata$Episode.f);
                this.n = hVar.q(this.n, metadata$Episode.n);
                this.o = hVar.n(l(), this.o, metadata$Episode.l(), metadata$Episode.o);
                this.p = hVar.m(s(), this.p, metadata$Episode.s(), metadata$Episode.p);
                this.q = (Metadata$Date) hVar.i(this.q, metadata$Episode.q);
                this.r = hVar.m(i(), this.r, metadata$Episode.i(), metadata$Episode.r);
                this.s = (Metadata$ImageGroup) hVar.i(this.s, metadata$Episode.s);
                this.t = hVar.n(q(), this.t, metadata$Episode.q(), metadata$Episode.t);
                this.u = hVar.f(n(), this.u, metadata$Episode.n(), metadata$Episode.u);
                this.v = (Metadata$Show) hVar.i(this.v, metadata$Episode.v);
                this.w = hVar.q(this.w, metadata$Episode.w);
                this.x = hVar.q(this.x, metadata$Episode.x);
                this.y = hVar.q(this.y, metadata$Episode.y);
                this.z = hVar.q(this.z, metadata$Episode.z);
                this.A = (Metadata$ImageGroup) hVar.i(this.A, metadata$Episode.A);
                this.B = hVar.q(this.B, metadata$Episode.B);
                this.C = hVar.f(p(), this.C, metadata$Episode.p(), metadata$Episode.C);
                this.D = hVar.f(t(), this.D, metadata$Episode.t(), metadata$Episode.D);
                this.E = hVar.q(this.E, metadata$Episode.E);
                this.F = hVar.f(h(), this.F, metadata$Episode.h(), metadata$Episode.F);
                this.G = hVar.q(this.G, metadata$Episode.G);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Episode.a;
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
                            case 18:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                                continue;
                            case 56:
                                this.a |= 4;
                                this.f = gVar.y();
                                continue;
                            case 98:
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(Metadata$AudioFile.parser(), kVar));
                                continue;
                            case 514:
                                String z4 = gVar.z();
                                this.a |= 8;
                                this.o = z4;
                                continue;
                            case 520:
                                this.a |= 16;
                                this.p = gVar.y();
                                continue;
                            case 530:
                                Metadata$Date.a aVar = (this.a & 32) == 32 ? (Metadata$Date.a) this.q.toBuilder() : null;
                                Metadata$Date metadata$Date = (Metadata$Date) gVar.o(Metadata$Date.parser(), kVar);
                                this.q = metadata$Date;
                                if (aVar != null) {
                                    aVar.mergeFrom((Metadata$Date.a) metadata$Date);
                                    this.q = (Metadata$Date) aVar.buildPartial();
                                }
                                this.a |= 32;
                                continue;
                            case 536:
                                this.a |= 64;
                                this.r = gVar.y();
                                continue;
                            case 546:
                                Metadata$ImageGroup.a aVar2 = (this.a & 128) == 128 ? (Metadata$ImageGroup.a) this.s.toBuilder() : null;
                                Metadata$ImageGroup metadata$ImageGroup = (Metadata$ImageGroup) gVar.o(Metadata$ImageGroup.parser(), kVar);
                                this.s = metadata$ImageGroup;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((Metadata$ImageGroup.a) metadata$ImageGroup);
                                    this.s = (Metadata$ImageGroup) aVar2.buildPartial();
                                }
                                this.a |= 128;
                                continue;
                            case 554:
                                String z5 = gVar.z();
                                this.a |= 256;
                                this.t = z5;
                                continue;
                            case 560:
                                this.a |= 512;
                                this.u = gVar.h();
                                continue;
                            case 570:
                                Metadata$Show.a aVar3 = (this.a & 1024) == 1024 ? (Metadata$Show.a) this.v.toBuilder() : null;
                                Metadata$Show metadata$Show = (Metadata$Show) gVar.o(Metadata$Show.parser(), kVar);
                                this.v = metadata$Show;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((Metadata$Show.a) metadata$Show);
                                    this.v = (Metadata$Show) aVar3.buildPartial();
                                }
                                this.a |= 1024;
                                continue;
                            case 578:
                                if (!this.w.R0()) {
                                    this.w = GeneratedMessageLite.mutableCopy(this.w);
                                }
                                this.w.add(gVar.o(Metadata$VideoFile.parser(), kVar));
                                continue;
                            case 586:
                                if (!this.x.R0()) {
                                    this.x = GeneratedMessageLite.mutableCopy(this.x);
                                }
                                this.x.add(gVar.o(Metadata$VideoFile.parser(), kVar));
                                continue;
                            case 594:
                                if (!this.y.R0()) {
                                    this.y = GeneratedMessageLite.mutableCopy(this.y);
                                }
                                this.y.add(gVar.o(Metadata$AudioFile.parser(), kVar));
                                continue;
                            case ContentDeliverySubscriptionType.VIRTUAL_MVPD /* 602 */:
                                if (!this.z.R0()) {
                                    this.z = GeneratedMessageLite.mutableCopy(this.z);
                                }
                                this.z.add(gVar.o(Metadata$Restriction.parser(), kVar));
                                continue;
                            case 610:
                                Metadata$ImageGroup.a aVar4 = (this.a & 2048) == 2048 ? (Metadata$ImageGroup.a) this.A.toBuilder() : null;
                                Metadata$ImageGroup metadata$ImageGroup2 = (Metadata$ImageGroup) gVar.o(Metadata$ImageGroup.parser(), kVar);
                                this.A = metadata$ImageGroup2;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((Metadata$ImageGroup.a) metadata$ImageGroup2);
                                    this.A = (Metadata$ImageGroup) aVar4.buildPartial();
                                }
                                this.a |= 2048;
                                continue;
                            case 618:
                                String z6 = gVar.z();
                                if (!this.B.R0()) {
                                    this.B = GeneratedMessageLite.mutableCopy(this.B);
                                }
                                this.B.add(z6);
                                continue;
                            case 624:
                                this.a |= 4096;
                                this.C = gVar.h();
                                continue;
                            case 632:
                                this.a |= 8192;
                                this.D = gVar.h();
                                continue;
                            case 642:
                                if (!this.E.R0()) {
                                    this.E = GeneratedMessageLite.mutableCopy(this.E);
                                }
                                this.E.add(gVar.o(Metadata$SalePeriod.parser(), kVar));
                                continue;
                            case 648:
                                this.a |= 16384;
                                this.F = gVar.h();
                                continue;
                            case 658:
                                if (!this.G.R0()) {
                                    this.G = GeneratedMessageLite.mutableCopy(this.G);
                                }
                                this.G.add(gVar.o(Metadata$Availability.parser(), kVar));
                                continue;
                            default:
                                if (parseUnknownField(B2, gVar)) {
                                    continue;
                                }
                                break;
                        }
                        z2 = true;
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
                this.n.C();
                this.w.C();
                this.x.C();
                this.y.C();
                this.z.C();
                this.B.C();
                this.E.C();
                this.G.C();
                return null;
            case 4:
                return new Metadata$Episode();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (I == null) {
                    synchronized (Metadata$Episode.class) {
                        if (I == null) {
                            I = new GeneratedMessageLite.c(H);
                        }
                    }
                }
                return I;
            default:
                throw new UnsupportedOperationException();
        }
        return H;
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
            e += CodedOutputStream.o(7, this.f);
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            e += CodedOutputStream.n(12, this.n.get(i2));
        }
        if ((this.a & 8) == 8) {
            e += CodedOutputStream.p(64, this.o);
        }
        if ((this.a & 16) == 16) {
            e += CodedOutputStream.o(65, this.p);
        }
        if ((this.a & 32) == 32) {
            Metadata$Date metadata$Date = this.q;
            if (metadata$Date == null) {
                metadata$Date = Metadata$Date.h();
            }
            e += CodedOutputStream.n(66, metadata$Date);
        }
        if ((this.a & 64) == 64) {
            e += CodedOutputStream.o(67, this.r);
        }
        if ((this.a & 128) == 128) {
            Metadata$ImageGroup metadata$ImageGroup = this.s;
            if (metadata$ImageGroup == null) {
                metadata$ImageGroup = Metadata$ImageGroup.h();
            }
            e += CodedOutputStream.n(68, metadata$ImageGroup);
        }
        if ((this.a & 256) == 256) {
            e += CodedOutputStream.p(69, this.t);
        }
        if ((this.a & 512) == 512) {
            e += CodedOutputStream.d(70, this.u);
        }
        if ((this.a & 1024) == 1024) {
            Metadata$Show metadata$Show = this.v;
            if (metadata$Show == null) {
                metadata$Show = Metadata$Show.h();
            }
            e += CodedOutputStream.n(71, metadata$Show);
        }
        for (int i3 = 0; i3 < this.w.size(); i3++) {
            e += CodedOutputStream.n(72, this.w.get(i3));
        }
        for (int i4 = 0; i4 < this.x.size(); i4++) {
            e += CodedOutputStream.n(73, this.x.get(i4));
        }
        for (int i5 = 0; i5 < this.y.size(); i5++) {
            e += CodedOutputStream.n(74, this.y.get(i5));
        }
        for (int i6 = 0; i6 < this.z.size(); i6++) {
            e += CodedOutputStream.n(75, this.z.get(i6));
        }
        if ((this.a & 2048) == 2048) {
            Metadata$ImageGroup metadata$ImageGroup2 = this.A;
            if (metadata$ImageGroup2 == null) {
                metadata$ImageGroup2 = Metadata$ImageGroup.h();
            }
            e += CodedOutputStream.n(76, metadata$ImageGroup2);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.B.size(); i8++) {
            i7 += CodedOutputStream.q(this.B.get(i8));
        }
        int C0 = je.C0(this.B, 2, e + i7);
        if ((this.a & 4096) == 4096) {
            C0 += CodedOutputStream.d(78, this.C);
        }
        if ((this.a & 8192) == 8192) {
            C0 += CodedOutputStream.d(79, this.D);
        }
        for (int i9 = 0; i9 < this.E.size(); i9++) {
            C0 += CodedOutputStream.n(80, this.E.get(i9));
        }
        if ((this.a & 16384) == 16384) {
            C0 += CodedOutputStream.d(81, this.F);
        }
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            C0 += CodedOutputStream.n(82, this.G.get(i10));
        }
        int c2 = this.unknownFields.c() + C0;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public boolean h() {
        return (this.a & 16384) == 16384;
    }

    @Deprecated
    public boolean i() {
        return (this.a & 64) == 64;
    }

    public boolean l() {
        return (this.a & 8) == 8;
    }

    public boolean m() {
        return (this.a & 4) == 4;
    }

    public boolean n() {
        return (this.a & 512) == 512;
    }

    public boolean o() {
        return (this.a & 1) == 1;
    }

    public boolean p() {
        return (this.a & 4096) == 4096;
    }

    public boolean q() {
        return (this.a & 256) == 256;
    }

    public boolean r() {
        return (this.a & 2) == 2;
    }

    public boolean s() {
        return (this.a & 16) == 16;
    }

    public boolean t() {
        return (this.a & 8192) == 8192;
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
            codedOutputStream.O(7, this.f);
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.M(12, this.n.get(i));
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(64, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.O(65, this.p);
        }
        if ((this.a & 32) == 32) {
            Metadata$Date metadata$Date = this.q;
            if (metadata$Date == null) {
                metadata$Date = Metadata$Date.h();
            }
            codedOutputStream.M(66, metadata$Date);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.O(67, this.r);
        }
        if ((this.a & 128) == 128) {
            Metadata$ImageGroup metadata$ImageGroup = this.s;
            if (metadata$ImageGroup == null) {
                metadata$ImageGroup = Metadata$ImageGroup.h();
            }
            codedOutputStream.M(68, metadata$ImageGroup);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(69, this.t);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.A(70, this.u);
        }
        if ((this.a & 1024) == 1024) {
            Metadata$Show metadata$Show = this.v;
            if (metadata$Show == null) {
                metadata$Show = Metadata$Show.h();
            }
            codedOutputStream.M(71, metadata$Show);
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            codedOutputStream.M(72, this.w.get(i2));
        }
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            codedOutputStream.M(73, this.x.get(i3));
        }
        for (int i4 = 0; i4 < this.y.size(); i4++) {
            codedOutputStream.M(74, this.y.get(i4));
        }
        for (int i5 = 0; i5 < this.z.size(); i5++) {
            codedOutputStream.M(75, this.z.get(i5));
        }
        if ((this.a & 2048) == 2048) {
            Metadata$ImageGroup metadata$ImageGroup2 = this.A;
            if (metadata$ImageGroup2 == null) {
                metadata$ImageGroup2 = Metadata$ImageGroup.h();
            }
            codedOutputStream.M(76, metadata$ImageGroup2);
        }
        for (int i6 = 0; i6 < this.B.size(); i6++) {
            codedOutputStream.P(77, this.B.get(i6));
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.A(78, this.C);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.A(79, this.D);
        }
        for (int i7 = 0; i7 < this.E.size(); i7++) {
            codedOutputStream.M(80, this.E.get(i7));
        }
        if ((this.a & 16384) == 16384) {
            codedOutputStream.A(81, this.F);
        }
        for (int i8 = 0; i8 < this.G.size(); i8++) {
            codedOutputStream.M(82, this.G.get(i8));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
