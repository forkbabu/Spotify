package com.spotify.playlist.proto;

import com.comscore.streaming.AdvertisementType;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.proto.PlaylistAllowsDecorationPolicy;
import com.spotify.playlist.proto.UserDecorationPolicy;
import java.io.IOException;

public final class PlaylistDecorationPolicy extends GeneratedMessageLite<PlaylistDecorationPolicy, b> implements Object {
    private static final PlaylistDecorationPolicy X;
    private static volatile x<PlaylistDecorationPolicy> Y;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private UserDecorationPolicy P;
    private UserDecorationPolicy Q;
    private PlaylistAllowsDecorationPolicy R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private CollaboratingUsersDecorationPolicy W;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean f;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public static final class b extends GeneratedMessageLite.b<PlaylistDecorationPolicy, b> implements Object {
        private b() {
            super(PlaylistDecorationPolicy.X);
        }
    }

    static {
        PlaylistDecorationPolicy playlistDecorationPolicy = new PlaylistDecorationPolicy();
        X = playlistDecorationPolicy;
        playlistDecorationPolicy.makeImmutable();
    }

    private PlaylistDecorationPolicy() {
    }

    public static x<PlaylistDecorationPolicy> parser() {
        return X.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return X;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistDecorationPolicy playlistDecorationPolicy = (PlaylistDecorationPolicy) obj2;
                boolean z2 = this.a;
                boolean z3 = playlistDecorationPolicy.a;
                this.a = hVar.f(z2, z2, z3, z3);
                boolean z4 = this.b;
                boolean z5 = playlistDecorationPolicy.b;
                this.b = hVar.f(z4, z4, z5, z5);
                boolean z6 = this.c;
                boolean z7 = playlistDecorationPolicy.c;
                this.c = hVar.f(z6, z6, z7, z7);
                boolean z8 = this.f;
                boolean z9 = playlistDecorationPolicy.f;
                this.f = hVar.f(z8, z8, z9, z9);
                boolean z10 = this.n;
                boolean z11 = playlistDecorationPolicy.n;
                this.n = hVar.f(z10, z10, z11, z11);
                boolean z12 = this.o;
                boolean z13 = playlistDecorationPolicy.o;
                this.o = hVar.f(z12, z12, z13, z13);
                boolean z14 = this.p;
                boolean z15 = playlistDecorationPolicy.p;
                this.p = hVar.f(z14, z14, z15, z15);
                boolean z16 = this.q;
                boolean z17 = playlistDecorationPolicy.q;
                this.q = hVar.f(z16, z16, z17, z17);
                boolean z18 = this.r;
                boolean z19 = playlistDecorationPolicy.r;
                this.r = hVar.f(z18, z18, z19, z19);
                boolean z20 = this.s;
                boolean z21 = playlistDecorationPolicy.s;
                this.s = hVar.f(z20, z20, z21, z21);
                boolean z22 = this.t;
                boolean z23 = playlistDecorationPolicy.t;
                this.t = hVar.f(z22, z22, z23, z23);
                boolean z24 = this.u;
                boolean z25 = playlistDecorationPolicy.u;
                this.u = hVar.f(z24, z24, z25, z25);
                boolean z26 = this.v;
                boolean z27 = playlistDecorationPolicy.v;
                this.v = hVar.f(z26, z26, z27, z27);
                boolean z28 = this.w;
                boolean z29 = playlistDecorationPolicy.w;
                this.w = hVar.f(z28, z28, z29, z29);
                boolean z30 = this.x;
                boolean z31 = playlistDecorationPolicy.x;
                this.x = hVar.f(z30, z30, z31, z31);
                boolean z32 = this.y;
                boolean z33 = playlistDecorationPolicy.y;
                this.y = hVar.f(z32, z32, z33, z33);
                boolean z34 = this.z;
                boolean z35 = playlistDecorationPolicy.z;
                this.z = hVar.f(z34, z34, z35, z35);
                boolean z36 = this.A;
                boolean z37 = playlistDecorationPolicy.A;
                this.A = hVar.f(z36, z36, z37, z37);
                boolean z38 = this.B;
                boolean z39 = playlistDecorationPolicy.B;
                this.B = hVar.f(z38, z38, z39, z39);
                boolean z40 = this.C;
                boolean z41 = playlistDecorationPolicy.C;
                this.C = hVar.f(z40, z40, z41, z41);
                boolean z42 = this.D;
                boolean z43 = playlistDecorationPolicy.D;
                this.D = hVar.f(z42, z42, z43, z43);
                boolean z44 = this.E;
                boolean z45 = playlistDecorationPolicy.E;
                this.E = hVar.f(z44, z44, z45, z45);
                boolean z46 = this.F;
                boolean z47 = playlistDecorationPolicy.F;
                this.F = hVar.f(z46, z46, z47, z47);
                boolean z48 = this.G;
                boolean z49 = playlistDecorationPolicy.G;
                this.G = hVar.f(z48, z48, z49, z49);
                boolean z50 = this.H;
                boolean z51 = playlistDecorationPolicy.H;
                this.H = hVar.f(z50, z50, z51, z51);
                boolean z52 = this.I;
                boolean z53 = playlistDecorationPolicy.I;
                this.I = hVar.f(z52, z52, z53, z53);
                boolean z54 = this.J;
                boolean z55 = playlistDecorationPolicy.J;
                this.J = hVar.f(z54, z54, z55, z55);
                boolean z56 = this.K;
                boolean z57 = playlistDecorationPolicy.K;
                this.K = hVar.f(z56, z56, z57, z57);
                boolean z58 = this.L;
                boolean z59 = playlistDecorationPolicy.L;
                this.L = hVar.f(z58, z58, z59, z59);
                boolean z60 = this.M;
                boolean z61 = playlistDecorationPolicy.M;
                this.M = hVar.f(z60, z60, z61, z61);
                boolean z62 = this.N;
                boolean z63 = playlistDecorationPolicy.N;
                this.N = hVar.f(z62, z62, z63, z63);
                boolean z64 = this.O;
                boolean z65 = playlistDecorationPolicy.O;
                this.O = hVar.f(z64, z64, z65, z65);
                this.P = (UserDecorationPolicy) hVar.i(this.P, playlistDecorationPolicy.P);
                this.Q = (UserDecorationPolicy) hVar.i(this.Q, playlistDecorationPolicy.Q);
                this.R = (PlaylistAllowsDecorationPolicy) hVar.i(this.R, playlistDecorationPolicy.R);
                boolean z66 = this.S;
                boolean z67 = playlistDecorationPolicy.S;
                this.S = hVar.f(z66, z66, z67, z67);
                boolean z68 = this.T;
                boolean z69 = playlistDecorationPolicy.T;
                this.T = hVar.f(z68, z68, z69, z69);
                boolean z70 = this.U;
                boolean z71 = playlistDecorationPolicy.U;
                this.U = hVar.f(z70, z70, z71, z71);
                boolean z72 = this.V;
                boolean z73 = playlistDecorationPolicy.V;
                this.V = hVar.f(z72, z72, z73, z73);
                this.W = (CollaboratingUsersDecorationPolicy) hVar.i(this.W, playlistDecorationPolicy.W);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z74 = false;
                while (!z74) {
                    try {
                        int B2 = gVar.B();
                        switch (B2) {
                            case 0:
                                break;
                            case 8:
                                this.a = gVar.h();
                                continue;
                            case 16:
                                this.b = gVar.h();
                                continue;
                            case 24:
                                this.c = gVar.h();
                                continue;
                            case 32:
                                this.f = gVar.h();
                                continue;
                            case 40:
                                this.n = gVar.h();
                                continue;
                            case 48:
                                this.o = gVar.h();
                                continue;
                            case 56:
                                this.p = gVar.h();
                                continue;
                            case 64:
                                this.q = gVar.h();
                                continue;
                            case 72:
                                this.r = gVar.h();
                                continue;
                            case 80:
                                this.s = gVar.h();
                                continue;
                            case 88:
                                this.t = gVar.h();
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
                            case 128:
                                this.y = gVar.h();
                                continue;
                            case 136:
                                this.z = gVar.h();
                                continue;
                            case 144:
                                this.A = gVar.h();
                                continue;
                            case 152:
                                this.B = gVar.h();
                                continue;
                            case 160:
                                this.C = gVar.h();
                                continue;
                            case 168:
                                this.D = gVar.h();
                                continue;
                            case 176:
                                this.E = gVar.h();
                                continue;
                            case 184:
                                this.F = gVar.h();
                                continue;
                            case 192:
                                this.G = gVar.h();
                                continue;
                            case 200:
                                this.H = gVar.h();
                                continue;
                            case 208:
                                this.I = gVar.h();
                                continue;
                            case 216:
                                this.J = gVar.h();
                                continue;
                            case 224:
                                this.K = gVar.h();
                                continue;
                            case AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL /* 232 */:
                                this.L = gVar.h();
                                continue;
                            case 240:
                                this.M = gVar.h();
                                continue;
                            case 248:
                                this.N = gVar.h();
                                continue;
                            case 256:
                                this.O = gVar.h();
                                continue;
                            case 266:
                                UserDecorationPolicy userDecorationPolicy = this.P;
                                UserDecorationPolicy.b bVar = userDecorationPolicy != null ? (UserDecorationPolicy.b) userDecorationPolicy.toBuilder() : null;
                                UserDecorationPolicy userDecorationPolicy2 = (UserDecorationPolicy) gVar.o(UserDecorationPolicy.parser(), kVar);
                                this.P = userDecorationPolicy2;
                                if (bVar != null) {
                                    bVar.mergeFrom((UserDecorationPolicy.b) userDecorationPolicy2);
                                    this.P = (UserDecorationPolicy) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 274:
                                UserDecorationPolicy userDecorationPolicy3 = this.Q;
                                UserDecorationPolicy.b bVar2 = userDecorationPolicy3 != null ? (UserDecorationPolicy.b) userDecorationPolicy3.toBuilder() : null;
                                UserDecorationPolicy userDecorationPolicy4 = (UserDecorationPolicy) gVar.o(UserDecorationPolicy.parser(), kVar);
                                this.Q = userDecorationPolicy4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((UserDecorationPolicy.b) userDecorationPolicy4);
                                    this.Q = (UserDecorationPolicy) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 282:
                                PlaylistAllowsDecorationPolicy playlistAllowsDecorationPolicy = this.R;
                                PlaylistAllowsDecorationPolicy.b bVar3 = playlistAllowsDecorationPolicy != null ? (PlaylistAllowsDecorationPolicy.b) playlistAllowsDecorationPolicy.toBuilder() : null;
                                PlaylistAllowsDecorationPolicy playlistAllowsDecorationPolicy2 = (PlaylistAllowsDecorationPolicy) gVar.o(PlaylistAllowsDecorationPolicy.parser(), kVar);
                                this.R = playlistAllowsDecorationPolicy2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((PlaylistAllowsDecorationPolicy.b) playlistAllowsDecorationPolicy2);
                                    this.R = (PlaylistAllowsDecorationPolicy) bVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 288:
                                this.S = gVar.h();
                                continue;
                            case 296:
                                this.T = gVar.h();
                                continue;
                            case 304:
                                this.U = gVar.h();
                                continue;
                            case 312:
                                this.V = gVar.h();
                                continue;
                            case 322:
                                CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = this.W;
                                CollaboratingUsersDecorationPolicy.b bVar4 = collaboratingUsersDecorationPolicy != null ? (CollaboratingUsersDecorationPolicy.b) collaboratingUsersDecorationPolicy.toBuilder() : null;
                                CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy2 = (CollaboratingUsersDecorationPolicy) gVar.o(CollaboratingUsersDecorationPolicy.parser(), kVar);
                                this.W = collaboratingUsersDecorationPolicy2;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((CollaboratingUsersDecorationPolicy.b) collaboratingUsersDecorationPolicy2);
                                    this.W = (CollaboratingUsersDecorationPolicy) bVar4.buildPartial();
                                } else {
                                    continue;
                                }
                            default:
                                if (gVar.F(B2)) {
                                    continue;
                                }
                                break;
                        }
                        z74 = true;
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
                return new PlaylistDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (Y == null) {
                    synchronized (PlaylistDecorationPolicy.class) {
                        if (Y == null) {
                            Y = new GeneratedMessageLite.c(X);
                        }
                    }
                }
                return Y;
            default:
                throw new UnsupportedOperationException();
        }
        return X;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z2 = this.a;
        if (z2) {
            i2 = 0 + CodedOutputStream.d(1, z2);
        }
        boolean z3 = this.b;
        if (z3) {
            i2 += CodedOutputStream.d(2, z3);
        }
        boolean z4 = this.c;
        if (z4) {
            i2 += CodedOutputStream.d(3, z4);
        }
        boolean z5 = this.f;
        if (z5) {
            i2 += CodedOutputStream.d(4, z5);
        }
        boolean z6 = this.n;
        if (z6) {
            i2 += CodedOutputStream.d(5, z6);
        }
        boolean z7 = this.o;
        if (z7) {
            i2 += CodedOutputStream.d(6, z7);
        }
        boolean z8 = this.p;
        if (z8) {
            i2 += CodedOutputStream.d(7, z8);
        }
        boolean z9 = this.q;
        if (z9) {
            i2 += CodedOutputStream.d(8, z9);
        }
        boolean z10 = this.r;
        if (z10) {
            i2 += CodedOutputStream.d(9, z10);
        }
        boolean z11 = this.s;
        if (z11) {
            i2 += CodedOutputStream.d(10, z11);
        }
        boolean z12 = this.t;
        if (z12) {
            i2 += CodedOutputStream.d(11, z12);
        }
        boolean z13 = this.u;
        if (z13) {
            i2 += CodedOutputStream.d(12, z13);
        }
        boolean z14 = this.v;
        if (z14) {
            i2 += CodedOutputStream.d(13, z14);
        }
        boolean z15 = this.w;
        if (z15) {
            i2 += CodedOutputStream.d(14, z15);
        }
        boolean z16 = this.x;
        if (z16) {
            i2 += CodedOutputStream.d(15, z16);
        }
        boolean z17 = this.y;
        if (z17) {
            i2 += CodedOutputStream.d(16, z17);
        }
        boolean z18 = this.z;
        if (z18) {
            i2 += CodedOutputStream.d(17, z18);
        }
        boolean z19 = this.A;
        if (z19) {
            i2 += CodedOutputStream.d(18, z19);
        }
        boolean z20 = this.B;
        if (z20) {
            i2 += CodedOutputStream.d(19, z20);
        }
        boolean z21 = this.C;
        if (z21) {
            i2 += CodedOutputStream.d(20, z21);
        }
        boolean z22 = this.D;
        if (z22) {
            i2 += CodedOutputStream.d(21, z22);
        }
        boolean z23 = this.E;
        if (z23) {
            i2 += CodedOutputStream.d(22, z23);
        }
        boolean z24 = this.F;
        if (z24) {
            i2 += CodedOutputStream.d(23, z24);
        }
        boolean z25 = this.G;
        if (z25) {
            i2 += CodedOutputStream.d(24, z25);
        }
        boolean z26 = this.H;
        if (z26) {
            i2 += CodedOutputStream.d(25, z26);
        }
        boolean z27 = this.I;
        if (z27) {
            i2 += CodedOutputStream.d(26, z27);
        }
        boolean z28 = this.J;
        if (z28) {
            i2 += CodedOutputStream.d(27, z28);
        }
        boolean z29 = this.K;
        if (z29) {
            i2 += CodedOutputStream.d(28, z29);
        }
        boolean z30 = this.L;
        if (z30) {
            i2 += CodedOutputStream.d(29, z30);
        }
        boolean z31 = this.M;
        if (z31) {
            i2 += CodedOutputStream.d(30, z31);
        }
        boolean z32 = this.N;
        if (z32) {
            i2 += CodedOutputStream.d(31, z32);
        }
        boolean z33 = this.O;
        if (z33) {
            i2 += CodedOutputStream.d(32, z33);
        }
        UserDecorationPolicy userDecorationPolicy = this.P;
        if (userDecorationPolicy != null) {
            i2 += CodedOutputStream.n(33, userDecorationPolicy);
        }
        UserDecorationPolicy userDecorationPolicy2 = this.Q;
        if (userDecorationPolicy2 != null) {
            i2 += CodedOutputStream.n(34, userDecorationPolicy2);
        }
        PlaylistAllowsDecorationPolicy playlistAllowsDecorationPolicy = this.R;
        if (playlistAllowsDecorationPolicy != null) {
            i2 += CodedOutputStream.n(35, playlistAllowsDecorationPolicy);
        }
        boolean z34 = this.S;
        if (z34) {
            i2 += CodedOutputStream.d(36, z34);
        }
        boolean z35 = this.T;
        if (z35) {
            i2 += CodedOutputStream.d(37, z35);
        }
        boolean z36 = this.U;
        if (z36) {
            i2 += CodedOutputStream.d(38, z36);
        }
        boolean z37 = this.V;
        if (z37) {
            i2 += CodedOutputStream.d(39, z37);
        }
        CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = this.W;
        if (collaboratingUsersDecorationPolicy != null) {
            i2 += CodedOutputStream.n(40, collaboratingUsersDecorationPolicy);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z2 = this.a;
        if (z2) {
            codedOutputStream.A(1, z2);
        }
        boolean z3 = this.b;
        if (z3) {
            codedOutputStream.A(2, z3);
        }
        boolean z4 = this.c;
        if (z4) {
            codedOutputStream.A(3, z4);
        }
        boolean z5 = this.f;
        if (z5) {
            codedOutputStream.A(4, z5);
        }
        boolean z6 = this.n;
        if (z6) {
            codedOutputStream.A(5, z6);
        }
        boolean z7 = this.o;
        if (z7) {
            codedOutputStream.A(6, z7);
        }
        boolean z8 = this.p;
        if (z8) {
            codedOutputStream.A(7, z8);
        }
        boolean z9 = this.q;
        if (z9) {
            codedOutputStream.A(8, z9);
        }
        boolean z10 = this.r;
        if (z10) {
            codedOutputStream.A(9, z10);
        }
        boolean z11 = this.s;
        if (z11) {
            codedOutputStream.A(10, z11);
        }
        boolean z12 = this.t;
        if (z12) {
            codedOutputStream.A(11, z12);
        }
        boolean z13 = this.u;
        if (z13) {
            codedOutputStream.A(12, z13);
        }
        boolean z14 = this.v;
        if (z14) {
            codedOutputStream.A(13, z14);
        }
        boolean z15 = this.w;
        if (z15) {
            codedOutputStream.A(14, z15);
        }
        boolean z16 = this.x;
        if (z16) {
            codedOutputStream.A(15, z16);
        }
        boolean z17 = this.y;
        if (z17) {
            codedOutputStream.A(16, z17);
        }
        boolean z18 = this.z;
        if (z18) {
            codedOutputStream.A(17, z18);
        }
        boolean z19 = this.A;
        if (z19) {
            codedOutputStream.A(18, z19);
        }
        boolean z20 = this.B;
        if (z20) {
            codedOutputStream.A(19, z20);
        }
        boolean z21 = this.C;
        if (z21) {
            codedOutputStream.A(20, z21);
        }
        boolean z22 = this.D;
        if (z22) {
            codedOutputStream.A(21, z22);
        }
        boolean z23 = this.E;
        if (z23) {
            codedOutputStream.A(22, z23);
        }
        boolean z24 = this.F;
        if (z24) {
            codedOutputStream.A(23, z24);
        }
        boolean z25 = this.G;
        if (z25) {
            codedOutputStream.A(24, z25);
        }
        boolean z26 = this.H;
        if (z26) {
            codedOutputStream.A(25, z26);
        }
        boolean z27 = this.I;
        if (z27) {
            codedOutputStream.A(26, z27);
        }
        boolean z28 = this.J;
        if (z28) {
            codedOutputStream.A(27, z28);
        }
        boolean z29 = this.K;
        if (z29) {
            codedOutputStream.A(28, z29);
        }
        boolean z30 = this.L;
        if (z30) {
            codedOutputStream.A(29, z30);
        }
        boolean z31 = this.M;
        if (z31) {
            codedOutputStream.A(30, z31);
        }
        boolean z32 = this.N;
        if (z32) {
            codedOutputStream.A(31, z32);
        }
        boolean z33 = this.O;
        if (z33) {
            codedOutputStream.A(32, z33);
        }
        UserDecorationPolicy userDecorationPolicy = this.P;
        if (userDecorationPolicy != null) {
            codedOutputStream.M(33, userDecorationPolicy);
        }
        UserDecorationPolicy userDecorationPolicy2 = this.Q;
        if (userDecorationPolicy2 != null) {
            codedOutputStream.M(34, userDecorationPolicy2);
        }
        PlaylistAllowsDecorationPolicy playlistAllowsDecorationPolicy = this.R;
        if (playlistAllowsDecorationPolicy != null) {
            codedOutputStream.M(35, playlistAllowsDecorationPolicy);
        }
        boolean z34 = this.S;
        if (z34) {
            codedOutputStream.A(36, z34);
        }
        boolean z35 = this.T;
        if (z35) {
            codedOutputStream.A(37, z35);
        }
        boolean z36 = this.U;
        if (z36) {
            codedOutputStream.A(38, z36);
        }
        boolean z37 = this.V;
        if (z37) {
            codedOutputStream.A(39, z37);
        }
        CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = this.W;
        if (collaboratingUsersDecorationPolicy != null) {
            codedOutputStream.M(40, collaboratingUsersDecorationPolicy);
        }
    }
}
