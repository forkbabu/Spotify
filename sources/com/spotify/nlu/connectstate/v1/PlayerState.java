package com.spotify.nlu.connectstate.v1;

import com.comscore.streaming.AdvertisementType;
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
import com.spotify.nlu.connectstate.v1.ContextPlayerOptions;
import com.spotify.nlu.connectstate.v1.PlayOrigin;
import com.spotify.nlu.connectstate.v1.ProvidedTrack;
import com.spotify.nlu.connectstate.v1.Restrictions;
import com.spotify.nlu.connectstate.v1.Suppressions;
import java.io.IOException;
import java.util.Map;

public final class PlayerState extends GeneratedMessageLite<PlayerState, b> implements Object {
    private static final PlayerState N;
    private static volatile x<PlayerState> O;
    private Suppressions A;
    private o.i<ProvidedTrack> B = GeneratedMessageLite.emptyProtobufList();
    private o.i<ProvidedTrack> C = GeneratedMessageLite.emptyProtobufList();
    private MapFieldLite<String, String> D = MapFieldLite.d();
    private MapFieldLite<String, String> E = MapFieldLite.d();
    private String F = "";
    private String G = "";
    private long H;
    private String I = "";
    private o.i<ProvidedTrack> J = GeneratedMessageLite.emptyProtobufList();
    private o.i<ProvidedTrack> K = GeneratedMessageLite.emptyProtobufList();
    private String L = "";
    private boolean M;
    private int a;
    private long b;
    private String c = "";
    private String f = "";
    private Restrictions n;
    private PlayOrigin o;
    private ProvidedTrack p;
    private String q = "";
    private double r;
    private long s;
    private long t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private ContextPlayerOptions y;
    private Restrictions z;

    public static final class b extends GeneratedMessageLite.b<PlayerState, b> implements Object {
        private b() {
            super(PlayerState.N);
        }
    }

    private static final class c {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    private static final class d {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        PlayerState playerState = new PlayerState();
        N = playerState;
        playerState.makeImmutable();
    }

    private PlayerState() {
    }

    private MapFieldLite<String, String> h() {
        return this.D;
    }

    private MapFieldLite<String, String> i() {
        return this.E;
    }

    public static x<PlayerState> parser() {
        return N.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return N;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlayerState playerState = (PlayerState) obj2;
                long j = this.b;
                boolean z3 = j != 0;
                long j2 = playerState.b;
                this.b = hVar.s(z3, j, j2 != 0, j2);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !playerState.c.isEmpty(), playerState.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !playerState.f.isEmpty(), playerState.f);
                this.n = (Restrictions) hVar.i(this.n, playerState.n);
                this.o = (PlayOrigin) hVar.i(this.o, playerState.o);
                this.p = (ProvidedTrack) hVar.i(this.p, playerState.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !playerState.q.isEmpty(), playerState.q);
                double d2 = this.r;
                boolean z4 = d2 != 0.0d;
                double d3 = playerState.r;
                this.r = hVar.t(z4, d2, d3 != 0.0d, d3);
                long j3 = this.s;
                boolean z5 = j3 != 0;
                long j4 = playerState.s;
                this.s = hVar.s(z5, j3, j4 != 0, j4);
                long j5 = this.t;
                boolean z6 = j5 != 0;
                long j6 = playerState.t;
                this.t = hVar.s(z6, j5, j6 != 0, j6);
                boolean z7 = this.u;
                boolean z8 = playerState.u;
                this.u = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.v;
                boolean z10 = playerState.v;
                this.v = hVar.f(z9, z9, z10, z10);
                boolean z11 = this.w;
                boolean z12 = playerState.w;
                this.w = hVar.f(z11, z11, z12, z12);
                boolean z13 = this.x;
                boolean z14 = playerState.x;
                this.x = hVar.f(z13, z13, z14, z14);
                this.y = (ContextPlayerOptions) hVar.i(this.y, playerState.y);
                this.z = (Restrictions) hVar.i(this.z, playerState.z);
                this.A = (Suppressions) hVar.i(this.A, playerState.A);
                this.B = hVar.q(this.B, playerState.B);
                this.C = hVar.q(this.C, playerState.C);
                this.D = hVar.c(this.D, playerState.h());
                this.E = hVar.c(this.E, playerState.i());
                this.F = hVar.n(!this.F.isEmpty(), this.F, !playerState.F.isEmpty(), playerState.F);
                this.G = hVar.n(!this.G.isEmpty(), this.G, !playerState.G.isEmpty(), playerState.G);
                long j7 = this.H;
                boolean z15 = j7 != 0;
                long j8 = playerState.H;
                this.H = hVar.s(z15, j7, j8 != 0, j8);
                this.I = hVar.n(!this.I.isEmpty(), this.I, !playerState.I.isEmpty(), playerState.I);
                this.J = hVar.q(this.J, playerState.J);
                this.K = hVar.q(this.K, playerState.K);
                this.L = hVar.n(!this.L.isEmpty(), this.L, !playerState.L.isEmpty(), playerState.L);
                boolean z16 = this.M;
                boolean z17 = playerState.M;
                this.M = hVar.f(z16, z16, z17, z17);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playerState.a;
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
                                this.b = gVar.n();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 26:
                                this.f = gVar.A();
                                continue;
                            case 34:
                                Restrictions restrictions = this.n;
                                Restrictions.b bVar = restrictions != null ? (Restrictions.b) restrictions.toBuilder() : null;
                                Restrictions restrictions2 = (Restrictions) gVar.o(Restrictions.parser(), kVar);
                                this.n = restrictions2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Restrictions.b) restrictions2);
                                    this.n = (Restrictions) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                PlayOrigin playOrigin = this.o;
                                PlayOrigin.b bVar2 = playOrigin != null ? (PlayOrigin.b) playOrigin.toBuilder() : null;
                                PlayOrigin playOrigin2 = (PlayOrigin) gVar.o(PlayOrigin.parser(), kVar);
                                this.o = playOrigin2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((PlayOrigin.b) playOrigin2);
                                    this.o = (PlayOrigin) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                ProvidedTrack providedTrack = this.p;
                                ProvidedTrack.b bVar3 = providedTrack != null ? (ProvidedTrack.b) providedTrack.toBuilder() : null;
                                ProvidedTrack providedTrack2 = (ProvidedTrack) gVar.o(ProvidedTrack.parser(), kVar);
                                this.p = providedTrack2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((ProvidedTrack.b) providedTrack2);
                                    this.p = (ProvidedTrack) bVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                this.q = gVar.A();
                                continue;
                            case 73:
                                this.r = gVar.j();
                                continue;
                            case 80:
                                this.s = gVar.n();
                                continue;
                            case 88:
                                this.t = gVar.n();
                                continue;
                            case 96:
                                this.u = gVar.h();
                                continue;
                            case 104:
                                this.v = gVar.h();
                                continue;
                            case 112:
                                this.w = gVar.h();
                                continue;
                            case 120:
                                this.x = gVar.h();
                                continue;
                            case 130:
                                ContextPlayerOptions contextPlayerOptions = this.y;
                                ContextPlayerOptions.b bVar4 = contextPlayerOptions != null ? (ContextPlayerOptions.b) contextPlayerOptions.toBuilder() : null;
                                ContextPlayerOptions contextPlayerOptions2 = (ContextPlayerOptions) gVar.o(ContextPlayerOptions.parser(), kVar);
                                this.y = contextPlayerOptions2;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((ContextPlayerOptions.b) contextPlayerOptions2);
                                    this.y = (ContextPlayerOptions) bVar4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 138:
                                Restrictions restrictions3 = this.z;
                                Restrictions.b bVar5 = restrictions3 != null ? (Restrictions.b) restrictions3.toBuilder() : null;
                                Restrictions restrictions4 = (Restrictions) gVar.o(Restrictions.parser(), kVar);
                                this.z = restrictions4;
                                if (bVar5 != null) {
                                    bVar5.mergeFrom((Restrictions.b) restrictions4);
                                    this.z = (Restrictions) bVar5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 146:
                                Suppressions suppressions = this.A;
                                Suppressions.b bVar6 = suppressions != null ? (Suppressions.b) suppressions.toBuilder() : null;
                                Suppressions suppressions2 = (Suppressions) gVar.o(Suppressions.parser(), kVar);
                                this.A = suppressions2;
                                if (bVar6 != null) {
                                    bVar6.mergeFrom((Suppressions.b) suppressions2);
                                    this.A = (Suppressions) bVar6.buildPartial();
                                } else {
                                    continue;
                                }
                            case 154:
                                if (!this.B.R0()) {
                                    this.B = GeneratedMessageLite.mutableCopy(this.B);
                                }
                                this.B.add(gVar.o(ProvidedTrack.parser(), kVar));
                                continue;
                            case 162:
                                if (!this.C.R0()) {
                                    this.C = GeneratedMessageLite.mutableCopy(this.C);
                                }
                                this.C.add(gVar.o(ProvidedTrack.parser(), kVar));
                                continue;
                            case 170:
                                if (!this.D.f()) {
                                    this.D = this.D.k();
                                }
                                c.a.d(this.D, gVar, kVar);
                                continue;
                            case 178:
                                if (!this.E.f()) {
                                    this.E = this.E.k();
                                }
                                d.a.d(this.E, gVar, kVar);
                                continue;
                            case 186:
                                this.F = gVar.A();
                                continue;
                            case 194:
                                this.G = gVar.A();
                                continue;
                            case 200:
                                this.H = gVar.n();
                                continue;
                            case 210:
                                this.I = gVar.A();
                                continue;
                            case 218:
                                if (!this.J.R0()) {
                                    this.J = GeneratedMessageLite.mutableCopy(this.J);
                                }
                                this.J.add(gVar.o(ProvidedTrack.parser(), kVar));
                                continue;
                            case 226:
                                if (!this.K.R0()) {
                                    this.K = GeneratedMessageLite.mutableCopy(this.K);
                                }
                                this.K.add(gVar.o(ProvidedTrack.parser(), kVar));
                                continue;
                            case AdvertisementType.BRANDED_AS_CONTENT /* 234 */:
                                this.L = gVar.A();
                                continue;
                            case 240:
                                this.M = gVar.h();
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
                this.B.C();
                this.C.C();
                this.D.g();
                this.E.g();
                this.J.C();
                this.K.C();
                return null;
            case 4:
                return new PlayerState();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (O == null) {
                    synchronized (PlayerState.class) {
                        if (O == null) {
                            O = new GeneratedMessageLite.c(N);
                        }
                    }
                }
                return O;
            default:
                throw new UnsupportedOperationException();
        }
        return N;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.b;
        int l = j != 0 ? CodedOutputStream.l(1, j) + 0 : 0;
        if (!this.c.isEmpty()) {
            l += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            l += CodedOutputStream.p(3, this.f);
        }
        Restrictions restrictions = this.n;
        if (restrictions != null) {
            l += CodedOutputStream.n(4, restrictions);
        }
        PlayOrigin playOrigin = this.o;
        if (playOrigin != null) {
            l += CodedOutputStream.n(5, playOrigin);
        }
        ProvidedTrack providedTrack = this.p;
        if (providedTrack != null) {
            l += CodedOutputStream.n(7, providedTrack);
        }
        if (!this.q.isEmpty()) {
            l += CodedOutputStream.p(8, this.q);
        }
        double d2 = this.r;
        if (d2 != 0.0d) {
            l += CodedOutputStream.g(9, d2);
        }
        long j2 = this.s;
        if (j2 != 0) {
            l += CodedOutputStream.l(10, j2);
        }
        long j3 = this.t;
        if (j3 != 0) {
            l += CodedOutputStream.l(11, j3);
        }
        boolean z2 = this.u;
        if (z2) {
            l += CodedOutputStream.d(12, z2);
        }
        boolean z3 = this.v;
        if (z3) {
            l += CodedOutputStream.d(13, z3);
        }
        boolean z4 = this.w;
        if (z4) {
            l += CodedOutputStream.d(14, z4);
        }
        boolean z5 = this.x;
        if (z5) {
            l += CodedOutputStream.d(15, z5);
        }
        ContextPlayerOptions contextPlayerOptions = this.y;
        if (contextPlayerOptions != null) {
            l += CodedOutputStream.n(16, contextPlayerOptions);
        }
        Restrictions restrictions2 = this.z;
        if (restrictions2 != null) {
            l += CodedOutputStream.n(17, restrictions2);
        }
        Suppressions suppressions = this.A;
        if (suppressions != null) {
            l += CodedOutputStream.n(18, suppressions);
        }
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            l += CodedOutputStream.n(19, this.B.get(i2));
        }
        for (int i3 = 0; i3 < this.C.size(); i3++) {
            l += CodedOutputStream.n(20, this.C.get(i3));
        }
        for (Map.Entry<String, String> entry : this.D.entrySet()) {
            l = je.j1(entry, c.a, 21, entry.getKey(), l);
        }
        for (Map.Entry<String, String> entry2 : this.E.entrySet()) {
            l = je.j1(entry2, d.a, 22, entry2.getKey(), l);
        }
        if (!this.F.isEmpty()) {
            l += CodedOutputStream.p(23, this.F);
        }
        if (!this.G.isEmpty()) {
            l += CodedOutputStream.p(24, this.G);
        }
        long j4 = this.H;
        if (j4 != 0) {
            l += CodedOutputStream.l(25, j4);
        }
        if (!this.I.isEmpty()) {
            l += CodedOutputStream.p(26, this.I);
        }
        for (int i4 = 0; i4 < this.J.size(); i4++) {
            l += CodedOutputStream.n(27, this.J.get(i4));
        }
        for (int i5 = 0; i5 < this.K.size(); i5++) {
            l += CodedOutputStream.n(28, this.K.get(i5));
        }
        if (!this.L.isEmpty()) {
            l += CodedOutputStream.p(29, this.L);
        }
        boolean z6 = this.M;
        if (z6) {
            l += CodedOutputStream.d(30, z6);
        }
        this.memoizedSerializedSize = l;
        return l;
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
        Restrictions restrictions = this.n;
        if (restrictions != null) {
            codedOutputStream.M(4, restrictions);
        }
        PlayOrigin playOrigin = this.o;
        if (playOrigin != null) {
            codedOutputStream.M(5, playOrigin);
        }
        ProvidedTrack providedTrack = this.p;
        if (providedTrack != null) {
            codedOutputStream.M(7, providedTrack);
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(8, this.q);
        }
        double d2 = this.r;
        if (d2 != 0.0d) {
            codedOutputStream.E(9, d2);
        }
        long j2 = this.s;
        if (j2 != 0) {
            codedOutputStream.U(10, j2);
        }
        long j3 = this.t;
        if (j3 != 0) {
            codedOutputStream.U(11, j3);
        }
        boolean z2 = this.u;
        if (z2) {
            codedOutputStream.A(12, z2);
        }
        boolean z3 = this.v;
        if (z3) {
            codedOutputStream.A(13, z3);
        }
        boolean z4 = this.w;
        if (z4) {
            codedOutputStream.A(14, z4);
        }
        boolean z5 = this.x;
        if (z5) {
            codedOutputStream.A(15, z5);
        }
        ContextPlayerOptions contextPlayerOptions = this.y;
        if (contextPlayerOptions != null) {
            codedOutputStream.M(16, contextPlayerOptions);
        }
        Restrictions restrictions2 = this.z;
        if (restrictions2 != null) {
            codedOutputStream.M(17, restrictions2);
        }
        Suppressions suppressions = this.A;
        if (suppressions != null) {
            codedOutputStream.M(18, suppressions);
        }
        for (int i = 0; i < this.B.size(); i++) {
            codedOutputStream.M(19, this.B.get(i));
        }
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            codedOutputStream.M(20, this.C.get(i2));
        }
        for (Map.Entry<String, String> entry : this.D.entrySet()) {
            c.a.e(codedOutputStream, 21, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.E.entrySet()) {
            d.a.e(codedOutputStream, 22, entry2.getKey(), entry2.getValue());
        }
        if (!this.F.isEmpty()) {
            codedOutputStream.P(23, this.F);
        }
        if (!this.G.isEmpty()) {
            codedOutputStream.P(24, this.G);
        }
        long j4 = this.H;
        if (j4 != 0) {
            codedOutputStream.U(25, j4);
        }
        if (!this.I.isEmpty()) {
            codedOutputStream.P(26, this.I);
        }
        for (int i3 = 0; i3 < this.J.size(); i3++) {
            codedOutputStream.M(27, this.J.get(i3));
        }
        for (int i4 = 0; i4 < this.K.size(); i4++) {
            codedOutputStream.M(28, this.K.get(i4));
        }
        if (!this.L.isEmpty()) {
            codedOutputStream.P(29, this.L);
        }
        boolean z6 = this.M;
        if (z6) {
            codedOutputStream.A(30, z6);
        }
    }
}
