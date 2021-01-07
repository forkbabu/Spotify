package com.spotify.metadata.proto;

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
import com.spotify.metadata.proto.Metadata$Licensor;
import java.io.IOException;
import java.util.List;

public final class Metadata$Album extends GeneratedMessageLite<Metadata$Album, a> implements Object {
    private static final Metadata$Album J;
    private static volatile x<Metadata$Album> K;
    private Metadata$ImageGroup A;
    private String B = "";
    private String C = "";
    private String D = "";
    private o.i<Metadata$Block> E = GeneratedMessageLite.emptyProtobufList();
    private long F;
    private o.i<Metadata$Availability> G = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Track> H = GeneratedMessageLite.emptyProtobufList();
    private Metadata$Licensor I;
    private int a;
    private ByteString b = ByteString.a;
    private String c = "";
    private o.i<Metadata$Artist> f = GeneratedMessageLite.emptyProtobufList();
    private int n = 1;
    private String o = "";
    private Metadata$Date p;
    private int q;
    private o.i<String> r = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Image> s = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$ExternalId> t = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Disc> u = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> v = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Copyright> w = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Restriction> x = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Album> y = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$SalePeriod> z = GeneratedMessageLite.emptyProtobufList();

    public enum Type implements o.c {
        ALBUM(1),
        SINGLE(2),
        COMPILATION(3),
        EP(4),
        AUDIOBOOK(5),
        PODCAST(6);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        public static Type d(int i) {
            switch (i) {
                case 1:
                    return ALBUM;
                case 2:
                    return SINGLE;
                case 3:
                    return COMPILATION;
                case 4:
                    return EP;
                case 5:
                    return AUDIOBOOK;
                case 6:
                    return PODCAST;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Metadata$Album, a> implements Object {
        private a() {
            super(Metadata$Album.J);
        }
    }

    static {
        Metadata$Album metadata$Album = new Metadata$Album();
        J = metadata$Album;
        metadata$Album.makeImmutable();
    }

    private Metadata$Album() {
    }

    public static Metadata$Album i() {
        return J;
    }

    public static x<Metadata$Album> parser() {
        return J.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return J;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Album metadata$Album = (Metadata$Album) obj2;
                this.b = hVar.r(p(), this.b, metadata$Album.p(), metadata$Album.b);
                this.c = hVar.n(r(), this.c, metadata$Album.r(), metadata$Album.c);
                this.f = hVar.q(this.f, metadata$Album.f);
                this.n = hVar.m(u(), this.n, metadata$Album.u(), metadata$Album.n);
                this.o = hVar.n(q(), this.o, metadata$Album.q(), metadata$Album.o);
                this.p = (Metadata$Date) hVar.i(this.p, metadata$Album.p);
                this.q = hVar.m(t(), this.q, metadata$Album.t(), metadata$Album.q);
                this.r = hVar.q(this.r, metadata$Album.r);
                this.s = hVar.q(this.s, metadata$Album.s);
                this.t = hVar.q(this.t, metadata$Album.t);
                this.u = hVar.q(this.u, metadata$Album.u);
                this.v = hVar.q(this.v, metadata$Album.v);
                this.w = hVar.q(this.w, metadata$Album.w);
                this.x = hVar.q(this.x, metadata$Album.x);
                this.y = hVar.q(this.y, metadata$Album.y);
                this.z = hVar.q(this.z, metadata$Album.z);
                this.A = (Metadata$ImageGroup) hVar.i(this.A, metadata$Album.A);
                this.B = hVar.n(s(), this.B, metadata$Album.s(), metadata$Album.B);
                this.C = hVar.n(w(), this.C, metadata$Album.w(), metadata$Album.C);
                this.D = hVar.n(v(), this.D, metadata$Album.v(), metadata$Album.D);
                this.E = hVar.q(this.E, metadata$Album.E);
                this.F = hVar.s(o(), this.F, metadata$Album.o(), metadata$Album.F);
                this.G = hVar.q(this.G, metadata$Album.G);
                this.H = hVar.q(this.H, metadata$Album.H);
                this.I = (Metadata$Licensor) hVar.i(this.I, metadata$Album.I);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Album.a;
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
                            case 26:
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(Metadata$Artist.parser(), kVar));
                                continue;
                            case 32:
                                int k = gVar.k();
                                if (Type.d(k) == null) {
                                    super.mergeVarintField(4, k);
                                    continue;
                                } else {
                                    this.a |= 4;
                                    this.n = k;
                                }
                            case 42:
                                String z4 = gVar.z();
                                this.a |= 8;
                                this.o = z4;
                                continue;
                            case 50:
                                Metadata$Date.a aVar = (this.a & 16) == 16 ? (Metadata$Date.a) this.p.toBuilder() : null;
                                Metadata$Date metadata$Date = (Metadata$Date) gVar.o(Metadata$Date.parser(), kVar);
                                this.p = metadata$Date;
                                if (aVar != null) {
                                    aVar.mergeFrom((Metadata$Date.a) metadata$Date);
                                    this.p = (Metadata$Date) aVar.buildPartial();
                                }
                                this.a |= 16;
                                continue;
                            case 56:
                                this.a |= 32;
                                this.q = gVar.y();
                                continue;
                            case 66:
                                String z5 = gVar.z();
                                if (!this.r.R0()) {
                                    this.r = GeneratedMessageLite.mutableCopy(this.r);
                                }
                                this.r.add(z5);
                                continue;
                            case 74:
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(gVar.o(Metadata$Image.parser(), kVar));
                                continue;
                            case 82:
                                if (!this.t.R0()) {
                                    this.t = GeneratedMessageLite.mutableCopy(this.t);
                                }
                                this.t.add(gVar.o(Metadata$ExternalId.parser(), kVar));
                                continue;
                            case 90:
                                if (!this.u.R0()) {
                                    this.u = GeneratedMessageLite.mutableCopy(this.u);
                                }
                                this.u.add(gVar.o(Metadata$Disc.parser(), kVar));
                                continue;
                            case 98:
                                String z6 = gVar.z();
                                if (!this.v.R0()) {
                                    this.v = GeneratedMessageLite.mutableCopy(this.v);
                                }
                                this.v.add(z6);
                                continue;
                            case 106:
                                if (!this.w.R0()) {
                                    this.w = GeneratedMessageLite.mutableCopy(this.w);
                                }
                                this.w.add(gVar.o(Metadata$Copyright.parser(), kVar));
                                continue;
                            case 114:
                                if (!this.x.R0()) {
                                    this.x = GeneratedMessageLite.mutableCopy(this.x);
                                }
                                this.x.add(gVar.o(Metadata$Restriction.parser(), kVar));
                                continue;
                            case 122:
                                if (!this.y.R0()) {
                                    this.y = GeneratedMessageLite.mutableCopy(this.y);
                                }
                                this.y.add(gVar.o(parser(), kVar));
                                continue;
                            case 130:
                                if (!this.z.R0()) {
                                    this.z = GeneratedMessageLite.mutableCopy(this.z);
                                }
                                this.z.add(gVar.o(Metadata$SalePeriod.parser(), kVar));
                                continue;
                            case 138:
                                Metadata$ImageGroup.a aVar2 = (this.a & 64) == 64 ? (Metadata$ImageGroup.a) this.A.toBuilder() : null;
                                Metadata$ImageGroup metadata$ImageGroup = (Metadata$ImageGroup) gVar.o(Metadata$ImageGroup.parser(), kVar);
                                this.A = metadata$ImageGroup;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((Metadata$ImageGroup.a) metadata$ImageGroup);
                                    this.A = (Metadata$ImageGroup) aVar2.buildPartial();
                                }
                                this.a |= 64;
                                continue;
                            case 146:
                                String z7 = gVar.z();
                                this.a |= 128;
                                this.B = z7;
                                continue;
                            case 154:
                                String z8 = gVar.z();
                                this.a |= 256;
                                this.C = z8;
                                continue;
                            case 162:
                                String z9 = gVar.z();
                                this.a |= 512;
                                this.D = z9;
                                continue;
                            case 170:
                                if (!this.E.R0()) {
                                    this.E = GeneratedMessageLite.mutableCopy(this.E);
                                }
                                this.E.add(gVar.o(Metadata$Block.parser(), kVar));
                                continue;
                            case 176:
                                this.a |= 1024;
                                this.F = gVar.n();
                                continue;
                            case 186:
                                if (!this.G.R0()) {
                                    this.G = GeneratedMessageLite.mutableCopy(this.G);
                                }
                                this.G.add(gVar.o(Metadata$Availability.parser(), kVar));
                                continue;
                            case 194:
                                if (!this.H.R0()) {
                                    this.H = GeneratedMessageLite.mutableCopy(this.H);
                                }
                                this.H.add(gVar.o(Metadata$Track.parser(), kVar));
                                continue;
                            case 202:
                                Metadata$Licensor.a aVar3 = (this.a & 2048) == 2048 ? (Metadata$Licensor.a) this.I.toBuilder() : null;
                                Metadata$Licensor metadata$Licensor = (Metadata$Licensor) gVar.o(Metadata$Licensor.parser(), kVar);
                                this.I = metadata$Licensor;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((Metadata$Licensor.a) metadata$Licensor);
                                    this.I = (Metadata$Licensor) aVar3.buildPartial();
                                }
                                this.a |= 2048;
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
                this.f.C();
                this.r.C();
                this.s.C();
                this.t.C();
                this.u.C();
                this.v.C();
                this.w.C();
                this.x.C();
                this.y.C();
                this.z.C();
                this.E.C();
                this.G.C();
                this.H.C();
                return null;
            case 4:
                return new Metadata$Album();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (K == null) {
                    synchronized (Metadata$Album.class) {
                        if (K == null) {
                            K = new GeneratedMessageLite.c(J);
                        }
                    }
                }
                return K;
            default:
                throw new UnsupportedOperationException();
        }
        return J;
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
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            e += CodedOutputStream.n(3, this.f.get(i2));
        }
        if ((this.a & 4) == 4) {
            e += CodedOutputStream.h(4, this.n);
        }
        if ((this.a & 8) == 8) {
            e += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 16) == 16) {
            Metadata$Date metadata$Date = this.p;
            if (metadata$Date == null) {
                metadata$Date = Metadata$Date.h();
            }
            e += CodedOutputStream.n(6, metadata$Date);
        }
        if ((this.a & 32) == 32) {
            e += CodedOutputStream.o(7, this.q);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.r.size(); i4++) {
            i3 += CodedOutputStream.q(this.r.get(i4));
        }
        int C0 = je.C0(this.r, 1, e + i3);
        for (int i5 = 0; i5 < this.s.size(); i5++) {
            C0 += CodedOutputStream.n(9, this.s.get(i5));
        }
        for (int i6 = 0; i6 < this.t.size(); i6++) {
            C0 += CodedOutputStream.n(10, this.t.get(i6));
        }
        for (int i7 = 0; i7 < this.u.size(); i7++) {
            C0 += CodedOutputStream.n(11, this.u.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.v.size(); i9++) {
            i8 += CodedOutputStream.q(this.v.get(i9));
        }
        int C02 = je.C0(this.v, 1, C0 + i8);
        for (int i10 = 0; i10 < this.w.size(); i10++) {
            C02 += CodedOutputStream.n(13, this.w.get(i10));
        }
        for (int i11 = 0; i11 < this.x.size(); i11++) {
            C02 += CodedOutputStream.n(14, this.x.get(i11));
        }
        for (int i12 = 0; i12 < this.y.size(); i12++) {
            C02 += CodedOutputStream.n(15, this.y.get(i12));
        }
        for (int i13 = 0; i13 < this.z.size(); i13++) {
            C02 += CodedOutputStream.n(16, this.z.get(i13));
        }
        if ((this.a & 64) == 64) {
            C02 += CodedOutputStream.n(17, h());
        }
        if ((this.a & 128) == 128) {
            C02 += CodedOutputStream.p(18, this.B);
        }
        if ((this.a & 256) == 256) {
            C02 += CodedOutputStream.p(19, this.C);
        }
        if ((this.a & 512) == 512) {
            C02 += CodedOutputStream.p(20, this.D);
        }
        for (int i14 = 0; i14 < this.E.size(); i14++) {
            C02 += CodedOutputStream.n(21, this.E.get(i14));
        }
        if ((this.a & 1024) == 1024) {
            C02 += CodedOutputStream.l(22, this.F);
        }
        for (int i15 = 0; i15 < this.G.size(); i15++) {
            C02 += CodedOutputStream.n(23, this.G.get(i15));
        }
        for (int i16 = 0; i16 < this.H.size(); i16++) {
            C02 += CodedOutputStream.n(24, this.H.get(i16));
        }
        if ((this.a & 2048) == 2048) {
            Metadata$Licensor metadata$Licensor = this.I;
            if (metadata$Licensor == null) {
                metadata$Licensor = Metadata$Licensor.h();
            }
            C02 += CodedOutputStream.n(25, metadata$Licensor);
        }
        int c2 = this.unknownFields.c() + C02;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public Metadata$ImageGroup h() {
        Metadata$ImageGroup metadata$ImageGroup = this.A;
        return metadata$ImageGroup == null ? Metadata$ImageGroup.h() : metadata$ImageGroup;
    }

    public List<Metadata$Disc> l() {
        return this.u;
    }

    public ByteString m() {
        return this.b;
    }

    public String n() {
        return this.c;
    }

    public boolean o() {
        return (this.a & 1024) == 1024;
    }

    public boolean p() {
        return (this.a & 1) == 1;
    }

    public boolean q() {
        return (this.a & 8) == 8;
    }

    public boolean r() {
        return (this.a & 2) == 2;
    }

    public boolean s() {
        return (this.a & 128) == 128;
    }

    public boolean t() {
        return (this.a & 32) == 32;
    }

    public boolean u() {
        return (this.a & 4) == 4;
    }

    public boolean v() {
        return (this.a & 512) == 512;
    }

    public boolean w() {
        return (this.a & 256) == 256;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.C(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.K(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 16) == 16) {
            Metadata$Date metadata$Date = this.p;
            if (metadata$Date == null) {
                metadata$Date = Metadata$Date.h();
            }
            codedOutputStream.M(6, metadata$Date);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.O(7, this.q);
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            codedOutputStream.P(8, this.r.get(i2));
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            codedOutputStream.M(9, this.s.get(i3));
        }
        for (int i4 = 0; i4 < this.t.size(); i4++) {
            codedOutputStream.M(10, this.t.get(i4));
        }
        for (int i5 = 0; i5 < this.u.size(); i5++) {
            codedOutputStream.M(11, this.u.get(i5));
        }
        for (int i6 = 0; i6 < this.v.size(); i6++) {
            codedOutputStream.P(12, this.v.get(i6));
        }
        for (int i7 = 0; i7 < this.w.size(); i7++) {
            codedOutputStream.M(13, this.w.get(i7));
        }
        for (int i8 = 0; i8 < this.x.size(); i8++) {
            codedOutputStream.M(14, this.x.get(i8));
        }
        for (int i9 = 0; i9 < this.y.size(); i9++) {
            codedOutputStream.M(15, this.y.get(i9));
        }
        for (int i10 = 0; i10 < this.z.size(); i10++) {
            codedOutputStream.M(16, this.z.get(i10));
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.M(17, h());
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(18, this.B);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(19, this.C);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.P(20, this.D);
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            codedOutputStream.M(21, this.E.get(i11));
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.U(22, this.F);
        }
        for (int i12 = 0; i12 < this.G.size(); i12++) {
            codedOutputStream.M(23, this.G.get(i12));
        }
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            codedOutputStream.M(24, this.H.get(i13));
        }
        if ((this.a & 2048) == 2048) {
            Metadata$Licensor metadata$Licensor = this.I;
            if (metadata$Licensor == null) {
                metadata$Licensor = Metadata$Licensor.h();
            }
            codedOutputStream.M(25, metadata$Licensor);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
