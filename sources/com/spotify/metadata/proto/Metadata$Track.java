package com.spotify.metadata.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Licensor;
import java.io.IOException;

public final class Metadata$Track extends GeneratedMessageLite<Metadata$Track, a> implements Object {
    private static final Metadata$Track F;
    private static volatile x<Metadata$Track> G;
    private long A;
    private boolean B;
    private o.i<Metadata$Availability> C = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> D = GeneratedMessageLite.emptyProtobufList();
    private Metadata$Licensor E;
    private int a;
    private ByteString b = ByteString.a;
    private String c = "";
    private Metadata$Album f;
    private o.i<Metadata$Artist> n = GeneratedMessageLite.emptyProtobufList();
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private o.i<Metadata$ExternalId> t = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Restriction> u = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$AudioFile> v = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$Track> w = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$SalePeriod> x = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$AudioFile> y = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> z = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<Metadata$Track, a> implements Object {
        private a() {
            super(Metadata$Track.F);
        }
    }

    static {
        Metadata$Track metadata$Track = new Metadata$Track();
        F = metadata$Track;
        metadata$Track.makeImmutable();
    }

    private Metadata$Track() {
    }

    public static x<Metadata$Track> parser() {
        return F.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        boolean z3 = true;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return F;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Track metadata$Track = (Metadata$Track) obj2;
                this.b = hVar.r((this.a & 1) == 1, this.b, (metadata$Track.a & 1) == 1, metadata$Track.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (metadata$Track.a & 2) == 2, metadata$Track.c);
                this.f = (Metadata$Album) hVar.i(this.f, metadata$Track.f);
                this.n = hVar.q(this.n, metadata$Track.n);
                this.o = hVar.m((this.a & 8) == 8, this.o, (metadata$Track.a & 8) == 8, metadata$Track.o);
                this.p = hVar.m((this.a & 16) == 16, this.p, (metadata$Track.a & 16) == 16, metadata$Track.p);
                this.q = hVar.m((this.a & 32) == 32, this.q, (metadata$Track.a & 32) == 32, metadata$Track.q);
                this.r = hVar.m((this.a & 64) == 64, this.r, (metadata$Track.a & 64) == 64, metadata$Track.r);
                this.s = hVar.f((this.a & 128) == 128, this.s, (metadata$Track.a & 128) == 128, metadata$Track.s);
                this.t = hVar.q(this.t, metadata$Track.t);
                this.u = hVar.q(this.u, metadata$Track.u);
                this.v = hVar.q(this.v, metadata$Track.v);
                this.w = hVar.q(this.w, metadata$Track.w);
                this.x = hVar.q(this.x, metadata$Track.x);
                this.y = hVar.q(this.y, metadata$Track.y);
                this.z = hVar.q(this.z, metadata$Track.z);
                boolean z4 = (this.a & 256) == 256;
                long j = this.A;
                if ((metadata$Track.a & 256) != 256) {
                    z3 = false;
                }
                this.A = hVar.s(z4, j, z3, metadata$Track.A);
                this.B = hVar.f(m(), this.B, metadata$Track.m(), metadata$Track.B);
                this.C = hVar.q(this.C, metadata$Track.C);
                this.D = hVar.q(this.D, metadata$Track.D);
                this.E = (Metadata$Licensor) hVar.i(this.E, metadata$Track.E);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Track.a;
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
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.c = z5;
                                continue;
                            case 26:
                                Metadata$Album.a aVar = (this.a & 4) == 4 ? (Metadata$Album.a) this.f.toBuilder() : null;
                                Metadata$Album metadata$Album = (Metadata$Album) gVar.o(Metadata$Album.parser(), kVar);
                                this.f = metadata$Album;
                                if (aVar != null) {
                                    aVar.mergeFrom((Metadata$Album.a) metadata$Album);
                                    this.f = (Metadata$Album) aVar.buildPartial();
                                }
                                this.a |= 4;
                                continue;
                            case 34:
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(Metadata$Artist.parser(), kVar));
                                continue;
                            case 40:
                                this.a |= 8;
                                this.o = gVar.y();
                                continue;
                            case 48:
                                this.a |= 16;
                                this.p = gVar.y();
                                continue;
                            case 56:
                                this.a |= 32;
                                this.q = gVar.y();
                                continue;
                            case 64:
                                this.a |= 64;
                                this.r = gVar.y();
                                continue;
                            case 72:
                                this.a |= 128;
                                this.s = gVar.h();
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
                                this.u.add(gVar.o(Metadata$Restriction.parser(), kVar));
                                continue;
                            case 98:
                                if (!this.v.R0()) {
                                    this.v = GeneratedMessageLite.mutableCopy(this.v);
                                }
                                this.v.add(gVar.o(Metadata$AudioFile.parser(), kVar));
                                continue;
                            case 106:
                                if (!this.w.R0()) {
                                    this.w = GeneratedMessageLite.mutableCopy(this.w);
                                }
                                this.w.add(gVar.o(parser(), kVar));
                                continue;
                            case 114:
                                if (!this.x.R0()) {
                                    this.x = GeneratedMessageLite.mutableCopy(this.x);
                                }
                                this.x.add(gVar.o(Metadata$SalePeriod.parser(), kVar));
                                continue;
                            case 122:
                                if (!this.y.R0()) {
                                    this.y = GeneratedMessageLite.mutableCopy(this.y);
                                }
                                this.y.add(gVar.o(Metadata$AudioFile.parser(), kVar));
                                continue;
                            case 130:
                                String z6 = gVar.z();
                                if (!this.z.R0()) {
                                    this.z = GeneratedMessageLite.mutableCopy(this.z);
                                }
                                this.z.add(z6);
                                continue;
                            case 136:
                                this.a |= 256;
                                this.A = gVar.w();
                                continue;
                            case 144:
                                this.a |= 512;
                                this.B = gVar.h();
                                continue;
                            case 154:
                                if (!this.C.R0()) {
                                    this.C = GeneratedMessageLite.mutableCopy(this.C);
                                }
                                this.C.add(gVar.o(Metadata$Availability.parser(), kVar));
                                continue;
                            case 162:
                                String z7 = gVar.z();
                                if (!this.D.R0()) {
                                    this.D = GeneratedMessageLite.mutableCopy(this.D);
                                }
                                this.D.add(z7);
                                continue;
                            case 170:
                                Metadata$Licensor.a aVar2 = (this.a & 1024) == 1024 ? (Metadata$Licensor.a) this.E.toBuilder() : null;
                                Metadata$Licensor metadata$Licensor = (Metadata$Licensor) gVar.o(Metadata$Licensor.parser(), kVar);
                                this.E = metadata$Licensor;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((Metadata$Licensor.a) metadata$Licensor);
                                    this.E = (Metadata$Licensor) aVar2.buildPartial();
                                }
                                this.a |= 1024;
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
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                break;
            case 3:
                this.n.C();
                this.t.C();
                this.u.C();
                this.v.C();
                this.w.C();
                this.x.C();
                this.y.C();
                this.z.C();
                this.C.C();
                this.D.C();
                return null;
            case 4:
                return new Metadata$Track();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (G == null) {
                    synchronized (Metadata$Track.class) {
                        if (G == null) {
                            G = new GeneratedMessageLite.c(F);
                        }
                    }
                }
                return G;
            default:
                throw new UnsupportedOperationException();
        }
        return F;
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
            e += CodedOutputStream.n(3, h());
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            e += CodedOutputStream.n(4, this.n.get(i2));
        }
        if ((this.a & 8) == 8) {
            e += CodedOutputStream.o(5, this.o);
        }
        if ((this.a & 16) == 16) {
            e += CodedOutputStream.o(6, this.p);
        }
        if ((this.a & 32) == 32) {
            e += CodedOutputStream.o(7, this.q);
        }
        if ((this.a & 64) == 64) {
            e += CodedOutputStream.o(8, this.r);
        }
        if ((this.a & 128) == 128) {
            e += CodedOutputStream.d(9, this.s);
        }
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            e += CodedOutputStream.n(10, this.t.get(i3));
        }
        for (int i4 = 0; i4 < this.u.size(); i4++) {
            e += CodedOutputStream.n(11, this.u.get(i4));
        }
        for (int i5 = 0; i5 < this.v.size(); i5++) {
            e += CodedOutputStream.n(12, this.v.get(i5));
        }
        for (int i6 = 0; i6 < this.w.size(); i6++) {
            e += CodedOutputStream.n(13, this.w.get(i6));
        }
        for (int i7 = 0; i7 < this.x.size(); i7++) {
            e += CodedOutputStream.n(14, this.x.get(i7));
        }
        for (int i8 = 0; i8 < this.y.size(); i8++) {
            e += CodedOutputStream.n(15, this.y.get(i8));
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.z.size(); i10++) {
            i9 += CodedOutputStream.q(this.z.get(i10));
        }
        int C0 = je.C0(this.z, 2, e + i9);
        if ((this.a & 256) == 256) {
            C0 += CodedOutputStream.l(17, this.A);
        }
        if ((this.a & 512) == 512) {
            C0 += CodedOutputStream.d(18, this.B);
        }
        for (int i11 = 0; i11 < this.C.size(); i11++) {
            C0 += CodedOutputStream.n(19, this.C.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.D.size(); i13++) {
            i12 += CodedOutputStream.q(this.D.get(i13));
        }
        int C02 = je.C0(this.D, 2, C0 + i12);
        if ((this.a & 1024) == 1024) {
            Metadata$Licensor metadata$Licensor = this.E;
            if (metadata$Licensor == null) {
                metadata$Licensor = Metadata$Licensor.h();
            }
            C02 += CodedOutputStream.n(21, metadata$Licensor);
        }
        int c2 = this.unknownFields.c() + C02;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public Metadata$Album h() {
        Metadata$Album metadata$Album = this.f;
        return metadata$Album == null ? Metadata$Album.i() : metadata$Album;
    }

    public Metadata$Artist i(int i) {
        return this.n.get(i);
    }

    public ByteString l() {
        return this.b;
    }

    public boolean m() {
        return (this.a & 512) == 512;
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
            codedOutputStream.M(3, h());
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.M(4, this.n.get(i));
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.O(5, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.O(6, this.p);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.O(7, this.q);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.O(8, this.r);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.A(9, this.s);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            codedOutputStream.M(10, this.t.get(i2));
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            codedOutputStream.M(11, this.u.get(i3));
        }
        for (int i4 = 0; i4 < this.v.size(); i4++) {
            codedOutputStream.M(12, this.v.get(i4));
        }
        for (int i5 = 0; i5 < this.w.size(); i5++) {
            codedOutputStream.M(13, this.w.get(i5));
        }
        for (int i6 = 0; i6 < this.x.size(); i6++) {
            codedOutputStream.M(14, this.x.get(i6));
        }
        for (int i7 = 0; i7 < this.y.size(); i7++) {
            codedOutputStream.M(15, this.y.get(i7));
        }
        for (int i8 = 0; i8 < this.z.size(); i8++) {
            codedOutputStream.P(16, this.z.get(i8));
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.U(17, this.A);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.A(18, this.B);
        }
        for (int i9 = 0; i9 < this.C.size(); i9++) {
            codedOutputStream.M(19, this.C.get(i9));
        }
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            codedOutputStream.P(20, this.D.get(i10));
        }
        if ((this.a & 1024) == 1024) {
            Metadata$Licensor metadata$Licensor = this.E;
            if (metadata$Licensor == null) {
                metadata$Licensor = Metadata$Licensor.h();
            }
            codedOutputStream.M(21, metadata$Licensor);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
