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
import java.util.List;

public final class Metadata$Artist extends GeneratedMessageLite<Metadata$Artist, a> implements Object {
    private static final Metadata$Artist E;
    private static volatile x<Metadata$Artist> F;
    private Metadata$ImageGroup A;
    private o.i<Metadata$SalePeriod> B = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$LocalizedString> C = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Availability> D = GeneratedMessageLite.emptyProtobufList();
    private int a;
    private ByteString b = ByteString.a;
    private String c = "";
    private int f;
    private o.i<Metadata$TopTracks> n = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$AlbumGroup> o = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$AlbumGroup> p = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$AlbumGroup> q = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$AlbumGroup> r = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> s = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$ExternalId> t = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Image> u = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Biography> v = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$ActivityPeriod> w = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Restriction> x = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Artist> y = GeneratedMessageLite.emptyProtobufList();
    private boolean z;

    public static final class a extends GeneratedMessageLite.b<Metadata$Artist, a> implements Object {
        private a() {
            super(Metadata$Artist.E);
        }
    }

    static {
        Metadata$Artist metadata$Artist = new Metadata$Artist();
        E = metadata$Artist;
        metadata$Artist.makeImmutable();
    }

    private Metadata$Artist() {
    }

    public static x<Metadata$Artist> parser() {
        return E.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return E;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Artist metadata$Artist = (Metadata$Artist) obj2;
                this.b = hVar.r((this.a & 1) == 1, this.b, (metadata$Artist.a & 1) == 1, metadata$Artist.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (metadata$Artist.a & 2) == 2, metadata$Artist.c);
                if ((this.a & 4) == 4) {
                    z2 = true;
                }
                this.f = hVar.m(z2, this.f, metadata$Artist.o(), metadata$Artist.f);
                this.n = hVar.q(this.n, metadata$Artist.n);
                this.o = hVar.q(this.o, metadata$Artist.o);
                this.p = hVar.q(this.p, metadata$Artist.p);
                this.q = hVar.q(this.q, metadata$Artist.q);
                this.r = hVar.q(this.r, metadata$Artist.r);
                this.s = hVar.q(this.s, metadata$Artist.s);
                this.t = hVar.q(this.t, metadata$Artist.t);
                this.u = hVar.q(this.u, metadata$Artist.u);
                this.v = hVar.q(this.v, metadata$Artist.v);
                this.w = hVar.q(this.w, metadata$Artist.w);
                this.x = hVar.q(this.x, metadata$Artist.x);
                this.y = hVar.q(this.y, metadata$Artist.y);
                this.z = hVar.f(n(), this.z, metadata$Artist.n(), metadata$Artist.z);
                this.A = (Metadata$ImageGroup) hVar.i(this.A, metadata$Artist.A);
                this.B = hVar.q(this.B, metadata$Artist.B);
                this.C = hVar.q(this.C, metadata$Artist.C);
                this.D = hVar.q(this.D, metadata$Artist.D);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Artist.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
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
                            case 24:
                                this.a |= 4;
                                this.f = gVar.y();
                                continue;
                            case 34:
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(Metadata$TopTracks.parser(), kVar));
                                continue;
                            case 42:
                                if (!this.o.R0()) {
                                    this.o = GeneratedMessageLite.mutableCopy(this.o);
                                }
                                this.o.add(gVar.o(Metadata$AlbumGroup.parser(), kVar));
                                continue;
                            case 50:
                                if (!this.p.R0()) {
                                    this.p = GeneratedMessageLite.mutableCopy(this.p);
                                }
                                this.p.add(gVar.o(Metadata$AlbumGroup.parser(), kVar));
                                continue;
                            case 58:
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(gVar.o(Metadata$AlbumGroup.parser(), kVar));
                                continue;
                            case 66:
                                if (!this.r.R0()) {
                                    this.r = GeneratedMessageLite.mutableCopy(this.r);
                                }
                                this.r.add(gVar.o(Metadata$AlbumGroup.parser(), kVar));
                                continue;
                            case 74:
                                String z4 = gVar.z();
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(z4);
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
                                this.u.add(gVar.o(Metadata$Image.parser(), kVar));
                                continue;
                            case 98:
                                if (!this.v.R0()) {
                                    this.v = GeneratedMessageLite.mutableCopy(this.v);
                                }
                                this.v.add(gVar.o(Metadata$Biography.parser(), kVar));
                                continue;
                            case 106:
                                if (!this.w.R0()) {
                                    this.w = GeneratedMessageLite.mutableCopy(this.w);
                                }
                                this.w.add(gVar.o(Metadata$ActivityPeriod.parser(), kVar));
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
                            case 128:
                                this.a |= 8;
                                this.z = gVar.h();
                                continue;
                            case 138:
                                Metadata$ImageGroup.a aVar = (this.a & 16) == 16 ? (Metadata$ImageGroup.a) this.A.toBuilder() : null;
                                Metadata$ImageGroup metadata$ImageGroup = (Metadata$ImageGroup) gVar.o(Metadata$ImageGroup.parser(), kVar);
                                this.A = metadata$ImageGroup;
                                if (aVar != null) {
                                    aVar.mergeFrom((Metadata$ImageGroup.a) metadata$ImageGroup);
                                    this.A = (Metadata$ImageGroup) aVar.buildPartial();
                                }
                                this.a |= 16;
                                continue;
                            case 146:
                                if (!this.B.R0()) {
                                    this.B = GeneratedMessageLite.mutableCopy(this.B);
                                }
                                this.B.add(gVar.o(Metadata$SalePeriod.parser(), kVar));
                                continue;
                            case 154:
                                if (!this.C.R0()) {
                                    this.C = GeneratedMessageLite.mutableCopy(this.C);
                                }
                                this.C.add(gVar.o(Metadata$LocalizedString.parser(), kVar));
                                continue;
                            case 162:
                                if (!this.D.R0()) {
                                    this.D = GeneratedMessageLite.mutableCopy(this.D);
                                }
                                this.D.add(gVar.o(Metadata$Availability.parser(), kVar));
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
                this.o.C();
                this.p.C();
                this.q.C();
                this.r.C();
                this.s.C();
                this.t.C();
                this.u.C();
                this.v.C();
                this.w.C();
                this.x.C();
                this.y.C();
                this.B.C();
                this.C.C();
                this.D.C();
                return null;
            case 4:
                return new Metadata$Artist();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (F == null) {
                    synchronized (Metadata$Artist.class) {
                        if (F == null) {
                            F = new GeneratedMessageLite.c(E);
                        }
                    }
                }
                return F;
            default:
                throw new UnsupportedOperationException();
        }
        return E;
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
            e += CodedOutputStream.o(3, this.f);
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            e += CodedOutputStream.n(4, this.n.get(i2));
        }
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            e += CodedOutputStream.n(5, this.o.get(i3));
        }
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            e += CodedOutputStream.n(6, this.p.get(i4));
        }
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            e += CodedOutputStream.n(7, this.q.get(i5));
        }
        for (int i6 = 0; i6 < this.r.size(); i6++) {
            e += CodedOutputStream.n(8, this.r.get(i6));
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.s.size(); i8++) {
            i7 += CodedOutputStream.q(this.s.get(i8));
        }
        int C0 = je.C0(this.s, 1, e + i7);
        for (int i9 = 0; i9 < this.t.size(); i9++) {
            C0 += CodedOutputStream.n(10, this.t.get(i9));
        }
        for (int i10 = 0; i10 < this.u.size(); i10++) {
            C0 += CodedOutputStream.n(11, this.u.get(i10));
        }
        for (int i11 = 0; i11 < this.v.size(); i11++) {
            C0 += CodedOutputStream.n(12, this.v.get(i11));
        }
        for (int i12 = 0; i12 < this.w.size(); i12++) {
            C0 += CodedOutputStream.n(13, this.w.get(i12));
        }
        for (int i13 = 0; i13 < this.x.size(); i13++) {
            C0 += CodedOutputStream.n(14, this.x.get(i13));
        }
        for (int i14 = 0; i14 < this.y.size(); i14++) {
            C0 += CodedOutputStream.n(15, this.y.get(i14));
        }
        if ((this.a & 8) == 8) {
            C0 += CodedOutputStream.d(16, this.z);
        }
        if ((this.a & 16) == 16) {
            C0 += CodedOutputStream.n(17, l());
        }
        for (int i15 = 0; i15 < this.B.size(); i15++) {
            C0 += CodedOutputStream.n(18, this.B.get(i15));
        }
        for (int i16 = 0; i16 < this.C.size(); i16++) {
            C0 += CodedOutputStream.n(19, this.C.get(i16));
        }
        for (int i17 = 0; i17 < this.D.size(); i17++) {
            C0 += CodedOutputStream.n(20, this.D.get(i17));
        }
        int c2 = this.unknownFields.c() + C0;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ByteString h() {
        return this.b;
    }

    public String i() {
        return this.c;
    }

    public Metadata$ImageGroup l() {
        Metadata$ImageGroup metadata$ImageGroup = this.A;
        return metadata$ImageGroup == null ? Metadata$ImageGroup.h() : metadata$ImageGroup;
    }

    public List<Metadata$TopTracks> m() {
        return this.n;
    }

    public boolean n() {
        return (this.a & 8) == 8;
    }

    public boolean o() {
        return (this.a & 4) == 4;
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
            codedOutputStream.O(3, this.f);
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.M(4, this.n.get(i));
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            codedOutputStream.M(5, this.o.get(i2));
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            codedOutputStream.M(6, this.p.get(i3));
        }
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            codedOutputStream.M(7, this.q.get(i4));
        }
        for (int i5 = 0; i5 < this.r.size(); i5++) {
            codedOutputStream.M(8, this.r.get(i5));
        }
        for (int i6 = 0; i6 < this.s.size(); i6++) {
            codedOutputStream.P(9, this.s.get(i6));
        }
        for (int i7 = 0; i7 < this.t.size(); i7++) {
            codedOutputStream.M(10, this.t.get(i7));
        }
        for (int i8 = 0; i8 < this.u.size(); i8++) {
            codedOutputStream.M(11, this.u.get(i8));
        }
        for (int i9 = 0; i9 < this.v.size(); i9++) {
            codedOutputStream.M(12, this.v.get(i9));
        }
        for (int i10 = 0; i10 < this.w.size(); i10++) {
            codedOutputStream.M(13, this.w.get(i10));
        }
        for (int i11 = 0; i11 < this.x.size(); i11++) {
            codedOutputStream.M(14, this.x.get(i11));
        }
        for (int i12 = 0; i12 < this.y.size(); i12++) {
            codedOutputStream.M(15, this.y.get(i12));
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(16, this.z);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.M(17, l());
        }
        for (int i13 = 0; i13 < this.B.size(); i13++) {
            codedOutputStream.M(18, this.B.get(i13));
        }
        for (int i14 = 0; i14 < this.C.size(); i14++) {
            codedOutputStream.M(19, this.C.get(i14));
        }
        for (int i15 = 0; i15 < this.D.size(); i15++) {
            codedOutputStream.M(20, this.D.get(i15));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
