package com.spotify.music.features.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class ProfilemodelRequest$Profile extends GeneratedMessageLite<ProfilemodelRequest$Profile, a> implements Object {
    private static volatile x<ProfilemodelRequest$Profile> A;
    private static final ProfilemodelRequest$Profile z;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private int n;
    private int o;
    private boolean p;
    private o.i<ArtistlistResponse$Artist> q = GeneratedMessageLite.emptyProtobufList();
    private o.i<PlaylistlistResponse$Playlist> r = GeneratedMessageLite.emptyProtobufList();
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;

    public static final class a extends GeneratedMessageLite.b<ProfilemodelRequest$Profile, a> implements Object {
        private a() {
            super(ProfilemodelRequest$Profile.z);
        }
    }

    static {
        ProfilemodelRequest$Profile profilemodelRequest$Profile = new ProfilemodelRequest$Profile();
        z = profilemodelRequest$Profile;
        profilemodelRequest$Profile.makeImmutable();
    }

    private ProfilemodelRequest$Profile() {
    }

    public static x<ProfilemodelRequest$Profile> parser() {
        return z.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return z;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ProfilemodelRequest$Profile profilemodelRequest$Profile = (ProfilemodelRequest$Profile) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !profilemodelRequest$Profile.b.isEmpty(), profilemodelRequest$Profile.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !profilemodelRequest$Profile.c.isEmpty(), profilemodelRequest$Profile.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !profilemodelRequest$Profile.f.isEmpty(), profilemodelRequest$Profile.f);
                int i = this.n;
                boolean z3 = i != 0;
                int i2 = profilemodelRequest$Profile.n;
                this.n = hVar.m(z3, i, i2 != 0, i2);
                int i3 = this.o;
                boolean z4 = i3 != 0;
                int i4 = profilemodelRequest$Profile.o;
                this.o = hVar.m(z4, i3, i4 != 0, i4);
                boolean z5 = this.p;
                boolean z6 = profilemodelRequest$Profile.p;
                this.p = hVar.f(z5, z5, z6, z6);
                this.q = hVar.q(this.q, profilemodelRequest$Profile.q);
                this.r = hVar.q(this.r, profilemodelRequest$Profile.r);
                int i5 = this.s;
                boolean z7 = i5 != 0;
                int i6 = profilemodelRequest$Profile.s;
                this.s = hVar.m(z7, i5, i6 != 0, i6);
                boolean z8 = this.t;
                boolean z9 = profilemodelRequest$Profile.t;
                this.t = hVar.f(z8, z8, z9, z9);
                boolean z10 = this.u;
                boolean z11 = profilemodelRequest$Profile.u;
                this.u = hVar.f(z10, z10, z11, z11);
                boolean z12 = this.v;
                boolean z13 = profilemodelRequest$Profile.v;
                this.v = hVar.f(z12, z12, z13, z13);
                boolean z14 = this.w;
                boolean z15 = profilemodelRequest$Profile.w;
                this.w = hVar.f(z14, z14, z15, z15);
                boolean z16 = this.x;
                boolean z17 = profilemodelRequest$Profile.x;
                this.x = hVar.f(z16, z16, z17, z17);
                int i7 = this.y;
                boolean z18 = i7 != 0;
                int i8 = profilemodelRequest$Profile.y;
                if (i8 != 0) {
                    z2 = true;
                }
                this.y = hVar.m(z18, i7, z2, i8);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= profilemodelRequest$Profile.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.b = gVar.A();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 26:
                                this.f = gVar.A();
                                continue;
                            case 32:
                                this.n = gVar.u();
                                continue;
                            case 40:
                                this.o = gVar.u();
                                continue;
                            case 48:
                                this.p = gVar.h();
                                continue;
                            case 58:
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(gVar.o(ArtistlistResponse$Artist.parser(), kVar));
                                continue;
                            case 66:
                                if (!this.r.R0()) {
                                    this.r = GeneratedMessageLite.mutableCopy(this.r);
                                }
                                this.r.add(gVar.o(PlaylistlistResponse$Playlist.parser(), kVar));
                                continue;
                            case 72:
                                this.s = gVar.u();
                                continue;
                            case 80:
                                this.t = gVar.h();
                                continue;
                            case 88:
                                this.u = gVar.h();
                                continue;
                            case 96:
                                this.v = gVar.h();
                                continue;
                            case 104:
                                this.w = gVar.h();
                                continue;
                            case 120:
                                this.x = gVar.h();
                                continue;
                            case 128:
                                this.y = gVar.u();
                                continue;
                            default:
                                if (gVar.F(B)) {
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
                this.q.C();
                this.r.C();
                return null;
            case 4:
                return new ProfilemodelRequest$Profile();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (A == null) {
                    synchronized (ProfilemodelRequest$Profile.class) {
                        if (A == null) {
                            A = new GeneratedMessageLite.c(z);
                        }
                    }
                }
                return A;
            default:
                throw new UnsupportedOperationException();
        }
        return z;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            p2 += CodedOutputStream.p(3, this.f);
        }
        int i2 = this.n;
        if (i2 != 0) {
            p2 += CodedOutputStream.j(4, i2);
        }
        int i3 = this.o;
        if (i3 != 0) {
            p2 += CodedOutputStream.j(5, i3);
        }
        boolean z2 = this.p;
        if (z2) {
            p2 += CodedOutputStream.d(6, z2);
        }
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            p2 += CodedOutputStream.n(7, this.q.get(i4));
        }
        for (int i5 = 0; i5 < this.r.size(); i5++) {
            p2 += CodedOutputStream.n(8, this.r.get(i5));
        }
        int i6 = this.s;
        if (i6 != 0) {
            p2 += CodedOutputStream.j(9, i6);
        }
        boolean z3 = this.t;
        if (z3) {
            p2 += CodedOutputStream.d(10, z3);
        }
        boolean z4 = this.u;
        if (z4) {
            p2 += CodedOutputStream.d(11, z4);
        }
        boolean z5 = this.v;
        if (z5) {
            p2 += CodedOutputStream.d(12, z5);
        }
        boolean z6 = this.w;
        if (z6) {
            p2 += CodedOutputStream.d(13, z6);
        }
        boolean z7 = this.x;
        if (z7) {
            p2 += CodedOutputStream.d(15, z7);
        }
        int i7 = this.y;
        if (i7 != 0) {
            p2 += CodedOutputStream.j(16, i7);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public int h() {
        return this.y;
    }

    public boolean i() {
        return this.v;
    }

    public int l() {
        return this.n;
    }

    public int m() {
        return this.o;
    }

    public boolean n() {
        return this.x;
    }

    public String o() {
        return this.f;
    }

    public boolean p() {
        return this.p;
    }

    public boolean q() {
        return this.u;
    }

    public String r() {
        return this.c;
    }

    public List<PlaylistlistResponse$Playlist> s() {
        return this.r;
    }

    public List<ArtistlistResponse$Artist> t() {
        return this.q;
    }

    public boolean u() {
        return this.w;
    }

    public int v() {
        return this.s;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        int i = this.n;
        if (i != 0) {
            codedOutputStream.K(4, i);
        }
        int i2 = this.o;
        if (i2 != 0) {
            codedOutputStream.K(5, i2);
        }
        boolean z2 = this.p;
        if (z2) {
            codedOutputStream.A(6, z2);
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            codedOutputStream.M(7, this.q.get(i3));
        }
        for (int i4 = 0; i4 < this.r.size(); i4++) {
            codedOutputStream.M(8, this.r.get(i4));
        }
        int i5 = this.s;
        if (i5 != 0) {
            codedOutputStream.K(9, i5);
        }
        boolean z3 = this.t;
        if (z3) {
            codedOutputStream.A(10, z3);
        }
        boolean z4 = this.u;
        if (z4) {
            codedOutputStream.A(11, z4);
        }
        boolean z5 = this.v;
        if (z5) {
            codedOutputStream.A(12, z5);
        }
        boolean z6 = this.w;
        if (z6) {
            codedOutputStream.A(13, z6);
        }
        boolean z7 = this.x;
        if (z7) {
            codedOutputStream.A(15, z7);
        }
        int i6 = this.y;
        if (i6 != 0) {
            codedOutputStream.K(16, i6);
        }
    }
}
