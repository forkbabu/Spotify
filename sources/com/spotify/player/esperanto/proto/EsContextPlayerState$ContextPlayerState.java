package com.spotify.player.esperanto.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextIndex;
import com.spotify.player.esperanto.proto.EsContextPlayerState$PlaybackQuality;
import com.spotify.player.esperanto.proto.EsOptional$OptionalDouble;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class EsContextPlayerState$ContextPlayerState extends GeneratedMessageLite<EsContextPlayerState$ContextPlayerState, a> implements Object {
    private static final EsContextPlayerState$ContextPlayerState K;
    private static volatile x<EsContextPlayerState$ContextPlayerState> L;
    private EsContextPlayerOptions$ContextPlayerOptions A;
    private EsRestrictions$Restrictions B;
    private o.i<String> C = GeneratedMessageLite.emptyProtobufList();
    private o.i<EsProvidedTrack$ProvidedTrack> D = GeneratedMessageLite.emptyProtobufList();
    private o.i<EsProvidedTrack$ProvidedTrack> E = GeneratedMessageLite.emptyProtobufList();
    private MapFieldLite<String, String> F = MapFieldLite.d();
    private MapFieldLite<String, String> G = MapFieldLite.d();
    private String H = "";
    private long I;
    private int J;
    private int a;
    private long b;
    private String c = "";
    private String f = "";
    private EsRestrictions$Restrictions n;
    private EsPlayOrigin$PlayOrigin o;
    private EsContextPlayerState$ContextIndex p;
    private EsProvidedTrack$ProvidedTrack q;
    private ByteString r = ByteString.a;
    private EsContextPlayerState$PlaybackQuality s;
    private EsOptional$OptionalDouble t;
    private EsOptional$OptionalInt64 u;
    private EsOptional$OptionalInt64 v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public static final class a extends GeneratedMessageLite.b<EsContextPlayerState$ContextPlayerState, a> implements Object {
        private a() {
            super(EsContextPlayerState$ContextPlayerState.K);
        }
    }

    private static final class b {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    private static final class c {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState = new EsContextPlayerState$ContextPlayerState();
        K = esContextPlayerState$ContextPlayerState;
        esContextPlayerState$ContextPlayerState.makeImmutable();
    }

    private EsContextPlayerState$ContextPlayerState() {
    }

    private MapFieldLite<String, String> S() {
        return this.F;
    }

    private MapFieldLite<String, String> T() {
        return this.G;
    }

    public static EsContextPlayerState$ContextPlayerState U(byte[] bArr) {
        return (EsContextPlayerState$ContextPlayerState) GeneratedMessageLite.parseFrom(K, bArr);
    }

    public static x<EsContextPlayerState$ContextPlayerState> parser() {
        return K.getParserForType();
    }

    public EsContextPlayerState$PlaybackQuality A() {
        EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality = this.s;
        return esContextPlayerState$PlaybackQuality == null ? EsContextPlayerState$PlaybackQuality.i() : esContextPlayerState$PlaybackQuality;
    }

    public EsOptional$OptionalDouble B() {
        EsOptional$OptionalDouble esOptional$OptionalDouble = this.t;
        return esOptional$OptionalDouble == null ? EsOptional$OptionalDouble.h() : esOptional$OptionalDouble;
    }

    public EsOptional$OptionalInt64 C() {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.u;
        return esOptional$OptionalInt64 == null ? EsOptional$OptionalInt64.i() : esOptional$OptionalInt64;
    }

    public int D() {
        return this.D.size();
    }

    public List<EsProvidedTrack$ProvidedTrack> E() {
        return this.D;
    }

    public long F() {
        return this.I;
    }

    public EsRestrictions$Restrictions G() {
        EsRestrictions$Restrictions esRestrictions$Restrictions = this.B;
        return esRestrictions$Restrictions == null ? EsRestrictions$Restrictions.E() : esRestrictions$Restrictions;
    }

    public String H() {
        return this.H;
    }

    public int I() {
        return this.C.size();
    }

    public List<String> J() {
        return this.C;
    }

    public long K() {
        return this.b;
    }

    public EsProvidedTrack$ProvidedTrack L() {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = this.q;
        return esProvidedTrack$ProvidedTrack == null ? EsProvidedTrack$ProvidedTrack.m() : esProvidedTrack$ProvidedTrack;
    }

    public boolean M() {
        return this.v != null;
    }

    public boolean N() {
        return this.p != null;
    }

    public boolean O() {
        return this.s != null;
    }

    public boolean P() {
        return this.t != null;
    }

    public boolean Q() {
        return this.u != null;
    }

    public boolean R() {
        return this.q != null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return K;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState = (EsContextPlayerState$ContextPlayerState) obj2;
                long j = this.b;
                boolean z3 = j != 0;
                long j2 = esContextPlayerState$ContextPlayerState.b;
                this.b = hVar.s(z3, j, j2 != 0, j2);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !esContextPlayerState$ContextPlayerState.c.isEmpty(), esContextPlayerState$ContextPlayerState.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !esContextPlayerState$ContextPlayerState.f.isEmpty(), esContextPlayerState$ContextPlayerState.f);
                this.n = (EsRestrictions$Restrictions) hVar.i(this.n, esContextPlayerState$ContextPlayerState.n);
                this.o = (EsPlayOrigin$PlayOrigin) hVar.i(this.o, esContextPlayerState$ContextPlayerState.o);
                this.p = (EsContextPlayerState$ContextIndex) hVar.i(this.p, esContextPlayerState$ContextPlayerState.p);
                this.q = (EsProvidedTrack$ProvidedTrack) hVar.i(this.q, esContextPlayerState$ContextPlayerState.q);
                ByteString byteString = this.r;
                ByteString byteString2 = ByteString.a;
                boolean z4 = byteString != byteString2;
                ByteString byteString3 = esContextPlayerState$ContextPlayerState.r;
                this.r = hVar.r(z4, byteString, byteString3 != byteString2, byteString3);
                this.s = (EsContextPlayerState$PlaybackQuality) hVar.i(this.s, esContextPlayerState$ContextPlayerState.s);
                this.t = (EsOptional$OptionalDouble) hVar.i(this.t, esContextPlayerState$ContextPlayerState.t);
                this.u = (EsOptional$OptionalInt64) hVar.i(this.u, esContextPlayerState$ContextPlayerState.u);
                this.v = (EsOptional$OptionalInt64) hVar.i(this.v, esContextPlayerState$ContextPlayerState.v);
                boolean z5 = this.w;
                boolean z6 = esContextPlayerState$ContextPlayerState.w;
                this.w = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.x;
                boolean z8 = esContextPlayerState$ContextPlayerState.x;
                this.x = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.y;
                boolean z10 = esContextPlayerState$ContextPlayerState.y;
                this.y = hVar.f(z9, z9, z10, z10);
                boolean z11 = this.z;
                boolean z12 = esContextPlayerState$ContextPlayerState.z;
                this.z = hVar.f(z11, z11, z12, z12);
                this.A = (EsContextPlayerOptions$ContextPlayerOptions) hVar.i(this.A, esContextPlayerState$ContextPlayerState.A);
                this.B = (EsRestrictions$Restrictions) hVar.i(this.B, esContextPlayerState$ContextPlayerState.B);
                this.C = hVar.q(this.C, esContextPlayerState$ContextPlayerState.C);
                this.D = hVar.q(this.D, esContextPlayerState$ContextPlayerState.D);
                this.E = hVar.q(this.E, esContextPlayerState$ContextPlayerState.E);
                this.F = hVar.c(this.F, esContextPlayerState$ContextPlayerState.S());
                this.G = hVar.c(this.G, esContextPlayerState$ContextPlayerState.T());
                this.H = hVar.n(!this.H.isEmpty(), this.H, !esContextPlayerState$ContextPlayerState.H.isEmpty(), esContextPlayerState$ContextPlayerState.H);
                long j3 = this.I;
                boolean z13 = j3 != 0;
                long j4 = esContextPlayerState$ContextPlayerState.I;
                this.I = hVar.s(z13, j3, j4 != 0, j4);
                int i = this.J;
                boolean z14 = i != 0;
                int i2 = esContextPlayerState$ContextPlayerState.J;
                if (i2 != 0) {
                    z2 = true;
                }
                this.J = hVar.m(z14, i, z2, i2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esContextPlayerState$ContextPlayerState.a;
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
                            case 8:
                                this.b = gVar.C();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 26:
                                this.f = gVar.A();
                                continue;
                            case 34:
                                EsRestrictions$Restrictions esRestrictions$Restrictions = this.n;
                                EsRestrictions$Restrictions.a aVar = esRestrictions$Restrictions != null ? (EsRestrictions$Restrictions.a) esRestrictions$Restrictions.toBuilder() : null;
                                EsRestrictions$Restrictions esRestrictions$Restrictions2 = (EsRestrictions$Restrictions) gVar.o(EsRestrictions$Restrictions.parser(), kVar);
                                this.n = esRestrictions$Restrictions2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsRestrictions$Restrictions.a) esRestrictions$Restrictions2);
                                    this.n = (EsRestrictions$Restrictions) aVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = this.o;
                                EsPlayOrigin$PlayOrigin.a aVar2 = esPlayOrigin$PlayOrigin != null ? (EsPlayOrigin$PlayOrigin.a) esPlayOrigin$PlayOrigin.toBuilder() : null;
                                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin2 = (EsPlayOrigin$PlayOrigin) gVar.o(EsPlayOrigin$PlayOrigin.parser(), kVar);
                                this.o = esPlayOrigin$PlayOrigin2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsPlayOrigin$PlayOrigin.a) esPlayOrigin$PlayOrigin2);
                                    this.o = (EsPlayOrigin$PlayOrigin) aVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 50:
                                EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex = this.p;
                                EsContextPlayerState$ContextIndex.a aVar3 = esContextPlayerState$ContextIndex != null ? (EsContextPlayerState$ContextIndex.a) esContextPlayerState$ContextIndex.toBuilder() : null;
                                EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex2 = (EsContextPlayerState$ContextIndex) gVar.o(EsContextPlayerState$ContextIndex.parser(), kVar);
                                this.p = esContextPlayerState$ContextIndex2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsContextPlayerState$ContextIndex.a) esContextPlayerState$ContextIndex2);
                                    this.p = (EsContextPlayerState$ContextIndex) aVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = this.q;
                                EsProvidedTrack$ProvidedTrack.a aVar4 = esProvidedTrack$ProvidedTrack != null ? (EsProvidedTrack$ProvidedTrack.a) esProvidedTrack$ProvidedTrack.toBuilder() : null;
                                EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack2 = (EsProvidedTrack$ProvidedTrack) gVar.o(EsProvidedTrack$ProvidedTrack.parser(), kVar);
                                this.q = esProvidedTrack$ProvidedTrack2;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((EsProvidedTrack$ProvidedTrack.a) esProvidedTrack$ProvidedTrack2);
                                    this.q = (EsProvidedTrack$ProvidedTrack) aVar4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                this.r = gVar.i();
                                continue;
                            case 74:
                                EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality = this.s;
                                EsContextPlayerState$PlaybackQuality.a aVar5 = esContextPlayerState$PlaybackQuality != null ? (EsContextPlayerState$PlaybackQuality.a) esContextPlayerState$PlaybackQuality.toBuilder() : null;
                                EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality2 = (EsContextPlayerState$PlaybackQuality) gVar.o(EsContextPlayerState$PlaybackQuality.parser(), kVar);
                                this.s = esContextPlayerState$PlaybackQuality2;
                                if (aVar5 != null) {
                                    aVar5.mergeFrom((EsContextPlayerState$PlaybackQuality.a) esContextPlayerState$PlaybackQuality2);
                                    this.s = (EsContextPlayerState$PlaybackQuality) aVar5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 82:
                                EsOptional$OptionalDouble esOptional$OptionalDouble = this.t;
                                EsOptional$OptionalDouble.a aVar6 = esOptional$OptionalDouble != null ? (EsOptional$OptionalDouble.a) esOptional$OptionalDouble.toBuilder() : null;
                                EsOptional$OptionalDouble esOptional$OptionalDouble2 = (EsOptional$OptionalDouble) gVar.o(EsOptional$OptionalDouble.parser(), kVar);
                                this.t = esOptional$OptionalDouble2;
                                if (aVar6 != null) {
                                    aVar6.mergeFrom((EsOptional$OptionalDouble.a) esOptional$OptionalDouble2);
                                    this.t = (EsOptional$OptionalDouble) aVar6.buildPartial();
                                } else {
                                    continue;
                                }
                            case 90:
                                EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.u;
                                EsOptional$OptionalInt64.a aVar7 = esOptional$OptionalInt64 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt64.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt642 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.u = esOptional$OptionalInt642;
                                if (aVar7 != null) {
                                    aVar7.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt642);
                                    this.u = (EsOptional$OptionalInt64) aVar7.buildPartial();
                                } else {
                                    continue;
                                }
                            case 98:
                                EsOptional$OptionalInt64 esOptional$OptionalInt643 = this.v;
                                EsOptional$OptionalInt64.a aVar8 = esOptional$OptionalInt643 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt643.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt644 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.v = esOptional$OptionalInt644;
                                if (aVar8 != null) {
                                    aVar8.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt644);
                                    this.v = (EsOptional$OptionalInt64) aVar8.buildPartial();
                                } else {
                                    continue;
                                }
                            case 104:
                                this.w = gVar.h();
                                continue;
                            case 112:
                                this.x = gVar.h();
                                continue;
                            case 120:
                                this.y = gVar.h();
                                continue;
                            case 128:
                                this.z = gVar.h();
                                continue;
                            case 138:
                                EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions = this.A;
                                EsContextPlayerOptions$ContextPlayerOptions.a aVar9 = esContextPlayerOptions$ContextPlayerOptions != null ? (EsContextPlayerOptions$ContextPlayerOptions.a) esContextPlayerOptions$ContextPlayerOptions.toBuilder() : null;
                                EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions2 = (EsContextPlayerOptions$ContextPlayerOptions) gVar.o(EsContextPlayerOptions$ContextPlayerOptions.parser(), kVar);
                                this.A = esContextPlayerOptions$ContextPlayerOptions2;
                                if (aVar9 != null) {
                                    aVar9.mergeFrom((EsContextPlayerOptions$ContextPlayerOptions.a) esContextPlayerOptions$ContextPlayerOptions2);
                                    this.A = (EsContextPlayerOptions$ContextPlayerOptions) aVar9.buildPartial();
                                } else {
                                    continue;
                                }
                            case 146:
                                EsRestrictions$Restrictions esRestrictions$Restrictions3 = this.B;
                                EsRestrictions$Restrictions.a aVar10 = esRestrictions$Restrictions3 != null ? (EsRestrictions$Restrictions.a) esRestrictions$Restrictions3.toBuilder() : null;
                                EsRestrictions$Restrictions esRestrictions$Restrictions4 = (EsRestrictions$Restrictions) gVar.o(EsRestrictions$Restrictions.parser(), kVar);
                                this.B = esRestrictions$Restrictions4;
                                if (aVar10 != null) {
                                    aVar10.mergeFrom((EsRestrictions$Restrictions.a) esRestrictions$Restrictions4);
                                    this.B = (EsRestrictions$Restrictions) aVar10.buildPartial();
                                } else {
                                    continue;
                                }
                            case 154:
                                String A2 = gVar.A();
                                if (!this.C.R0()) {
                                    this.C = GeneratedMessageLite.mutableCopy(this.C);
                                }
                                this.C.add(A2);
                                continue;
                            case 162:
                                if (!this.D.R0()) {
                                    this.D = GeneratedMessageLite.mutableCopy(this.D);
                                }
                                this.D.add(gVar.o(EsProvidedTrack$ProvidedTrack.parser(), kVar));
                                continue;
                            case 170:
                                if (!this.E.R0()) {
                                    this.E = GeneratedMessageLite.mutableCopy(this.E);
                                }
                                this.E.add(gVar.o(EsProvidedTrack$ProvidedTrack.parser(), kVar));
                                continue;
                            case 178:
                                if (!this.F.f()) {
                                    this.F = this.F.k();
                                }
                                b.a.d(this.F, gVar, kVar);
                                continue;
                            case 186:
                                if (!this.G.f()) {
                                    this.G = this.G.k();
                                }
                                c.a.d(this.G, gVar, kVar);
                                continue;
                            case 194:
                                this.H = gVar.A();
                                continue;
                            case 200:
                                this.I = gVar.C();
                                continue;
                            case 208:
                                this.J = gVar.k();
                                continue;
                            default:
                                if (gVar.F(B2)) {
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
                this.C.C();
                this.D.C();
                this.E.C();
                this.F.g();
                this.G.g();
                return null;
            case 4:
                return new EsContextPlayerState$ContextPlayerState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (L == null) {
                    synchronized (EsContextPlayerState$ContextPlayerState.class) {
                        if (L == null) {
                            L = new GeneratedMessageLite.c(K);
                        }
                    }
                }
                return L;
            default:
                throw new UnsupportedOperationException();
        }
        return K;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.b;
        int u2 = j != 0 ? CodedOutputStream.u(1, j) + 0 : 0;
        if (!this.c.isEmpty()) {
            u2 += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            u2 += CodedOutputStream.p(3, this.f);
        }
        if (this.n != null) {
            u2 += CodedOutputStream.n(4, l());
        }
        if (this.o != null) {
            u2 += CodedOutputStream.n(5, y());
        }
        if (this.p != null) {
            u2 += CodedOutputStream.n(6, p());
        }
        if (this.q != null) {
            u2 += CodedOutputStream.n(7, L());
        }
        if (!this.r.isEmpty()) {
            u2 += CodedOutputStream.e(8, this.r);
        }
        if (this.s != null) {
            u2 += CodedOutputStream.n(9, A());
        }
        if (this.t != null) {
            u2 += CodedOutputStream.n(10, B());
        }
        if (this.u != null) {
            u2 += CodedOutputStream.n(11, C());
        }
        if (this.v != null) {
            u2 += CodedOutputStream.n(12, o());
        }
        boolean z2 = this.w;
        if (z2) {
            u2 += CodedOutputStream.d(13, z2);
        }
        boolean z3 = this.x;
        if (z3) {
            u2 += CodedOutputStream.d(14, z3);
        }
        boolean z4 = this.y;
        if (z4) {
            u2 += CodedOutputStream.d(15, z4);
        }
        boolean z5 = this.z;
        if (z5) {
            u2 += CodedOutputStream.d(16, z5);
        }
        if (this.A != null) {
            u2 += CodedOutputStream.n(17, w());
        }
        if (this.B != null) {
            u2 += CodedOutputStream.n(18, G());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.C.size(); i3++) {
            i2 += CodedOutputStream.q(this.C.get(i3));
        }
        int C0 = je.C0(this.C, 2, u2 + i2);
        for (int i4 = 0; i4 < this.D.size(); i4++) {
            C0 += CodedOutputStream.n(20, this.D.get(i4));
        }
        for (int i5 = 0; i5 < this.E.size(); i5++) {
            C0 += CodedOutputStream.n(21, this.E.get(i5));
        }
        for (Map.Entry<String, String> entry : this.F.entrySet()) {
            C0 = je.j1(entry, b.a, 22, entry.getKey(), C0);
        }
        for (Map.Entry<String, String> entry2 : this.G.entrySet()) {
            C0 = je.j1(entry2, c.a, 23, entry2.getKey(), C0);
        }
        if (!this.H.isEmpty()) {
            C0 += CodedOutputStream.p(24, this.H);
        }
        long j2 = this.I;
        if (j2 != 0) {
            C0 += CodedOutputStream.u(25, j2);
        }
        if (this.J != EsPreparePlayOptions$PreparePlayOptions.AudioStream.DEFAULT.getNumber()) {
            C0 += CodedOutputStream.h(26, this.J);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public EsPreparePlayOptions$PreparePlayOptions.AudioStream h() {
        EsPreparePlayOptions$PreparePlayOptions.AudioStream audioStream;
        int i = this.J;
        if (i == 0) {
            audioStream = EsPreparePlayOptions$PreparePlayOptions.AudioStream.DEFAULT;
        } else if (i != 1) {
            audioStream = null;
        } else {
            audioStream = EsPreparePlayOptions$PreparePlayOptions.AudioStream.ALARM;
        }
        return audioStream == null ? EsPreparePlayOptions$PreparePlayOptions.AudioStream.UNRECOGNIZED : audioStream;
    }

    public Map<String, String> i() {
        return Collections.unmodifiableMap(this.F);
    }

    public EsRestrictions$Restrictions l() {
        EsRestrictions$Restrictions esRestrictions$Restrictions = this.n;
        return esRestrictions$Restrictions == null ? EsRestrictions$Restrictions.E() : esRestrictions$Restrictions;
    }

    public String m() {
        return this.c;
    }

    public String n() {
        return this.f;
    }

    public EsOptional$OptionalInt64 o() {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.v;
        return esOptional$OptionalInt64 == null ? EsOptional$OptionalInt64.i() : esOptional$OptionalInt64;
    }

    public EsContextPlayerState$ContextIndex p() {
        EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex = this.p;
        return esContextPlayerState$ContextIndex == null ? EsContextPlayerState$ContextIndex.h() : esContextPlayerState$ContextIndex;
    }

    public boolean q() {
        return this.y;
    }

    public boolean r() {
        return this.x;
    }

    public boolean s() {
        return this.w;
    }

    public boolean t() {
        return this.z;
    }

    public int u() {
        return this.E.size();
    }

    public List<EsProvidedTrack$ProvidedTrack> v() {
        return this.E;
    }

    public EsContextPlayerOptions$ContextPlayerOptions w() {
        EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions = this.A;
        return esContextPlayerOptions$ContextPlayerOptions == null ? EsContextPlayerOptions$ContextPlayerOptions.h() : esContextPlayerOptions$ContextPlayerOptions;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        long j = this.b;
        if (j != 0) {
            codedOutputStream.U(1, j);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        if (this.n != null) {
            codedOutputStream.M(4, l());
        }
        if (this.o != null) {
            codedOutputStream.M(5, y());
        }
        if (this.p != null) {
            codedOutputStream.M(6, p());
        }
        if (this.q != null) {
            codedOutputStream.M(7, L());
        }
        if (!this.r.isEmpty()) {
            codedOutputStream.C(8, this.r);
        }
        if (this.s != null) {
            codedOutputStream.M(9, A());
        }
        if (this.t != null) {
            codedOutputStream.M(10, B());
        }
        if (this.u != null) {
            codedOutputStream.M(11, C());
        }
        if (this.v != null) {
            codedOutputStream.M(12, o());
        }
        boolean z2 = this.w;
        if (z2) {
            codedOutputStream.A(13, z2);
        }
        boolean z3 = this.x;
        if (z3) {
            codedOutputStream.A(14, z3);
        }
        boolean z4 = this.y;
        if (z4) {
            codedOutputStream.A(15, z4);
        }
        boolean z5 = this.z;
        if (z5) {
            codedOutputStream.A(16, z5);
        }
        if (this.A != null) {
            codedOutputStream.M(17, w());
        }
        if (this.B != null) {
            codedOutputStream.M(18, G());
        }
        for (int i = 0; i < this.C.size(); i++) {
            codedOutputStream.P(19, this.C.get(i));
        }
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            codedOutputStream.M(20, this.D.get(i2));
        }
        for (int i3 = 0; i3 < this.E.size(); i3++) {
            codedOutputStream.M(21, this.E.get(i3));
        }
        for (Map.Entry<String, String> entry : this.F.entrySet()) {
            b.a.e(codedOutputStream, 22, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.G.entrySet()) {
            c.a.e(codedOutputStream, 23, entry2.getKey(), entry2.getValue());
        }
        if (!this.H.isEmpty()) {
            codedOutputStream.P(24, this.H);
        }
        long j2 = this.I;
        if (j2 != 0) {
            codedOutputStream.U(25, j2);
        }
        if (this.J != EsPreparePlayOptions$PreparePlayOptions.AudioStream.DEFAULT.getNumber()) {
            codedOutputStream.K(26, this.J);
        }
    }

    public Map<String, String> x() {
        return Collections.unmodifiableMap(this.G);
    }

    public EsPlayOrigin$PlayOrigin y() {
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = this.o;
        return esPlayOrigin$PlayOrigin == null ? EsPlayOrigin$PlayOrigin.q() : esPlayOrigin$PlayOrigin;
    }

    public ByteString z() {
        return this.r;
    }
}
