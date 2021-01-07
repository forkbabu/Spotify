package com.spotify.music.features.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ProfilelistResponse$SmallProfile extends GeneratedMessageLite<ProfilelistResponse$SmallProfile, a> implements Object {
    private static final ProfilelistResponse$SmallProfile s;
    private static volatile x<ProfilelistResponse$SmallProfile> t;
    private String a = "";
    private String b = "";
    private String c = "";
    private int f;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;

    public static final class a extends GeneratedMessageLite.b<ProfilelistResponse$SmallProfile, a> implements Object {
        private a() {
            super(ProfilelistResponse$SmallProfile.s);
        }
    }

    static {
        ProfilelistResponse$SmallProfile profilelistResponse$SmallProfile = new ProfilelistResponse$SmallProfile();
        s = profilelistResponse$SmallProfile;
        profilelistResponse$SmallProfile.makeImmutable();
    }

    private ProfilelistResponse$SmallProfile() {
    }

    public static x<ProfilelistResponse$SmallProfile> parser() {
        return s.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ProfilelistResponse$SmallProfile profilelistResponse$SmallProfile = (ProfilelistResponse$SmallProfile) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !profilelistResponse$SmallProfile.a.isEmpty(), profilelistResponse$SmallProfile.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !profilelistResponse$SmallProfile.b.isEmpty(), profilelistResponse$SmallProfile.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !profilelistResponse$SmallProfile.c.isEmpty(), profilelistResponse$SmallProfile.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = profilelistResponse$SmallProfile.f;
                this.f = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.n;
                boolean z3 = i3 != 0;
                int i4 = profilelistResponse$SmallProfile.n;
                if (i4 != 0) {
                    z = true;
                }
                this.n = hVar.m(z3, i3, z, i4);
                boolean z4 = this.o;
                boolean z5 = profilelistResponse$SmallProfile.o;
                this.o = hVar.f(z4, z4, z5, z5);
                boolean z6 = this.p;
                boolean z7 = profilelistResponse$SmallProfile.p;
                this.p = hVar.f(z6, z6, z7, z7);
                boolean z8 = this.q;
                boolean z9 = profilelistResponse$SmallProfile.q;
                this.q = hVar.f(z8, z8, z9, z9);
                boolean z10 = this.r;
                boolean z11 = profilelistResponse$SmallProfile.r;
                this.r = hVar.f(z10, z10, z11, z11);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 32) {
                                this.f = gVar.u();
                            } else if (B == 40) {
                                this.n = gVar.u();
                            } else if (B == 48) {
                                this.o = gVar.h();
                            } else if (B == 56) {
                                this.p = gVar.h();
                            } else if (B == 64) {
                                this.q = gVar.h();
                            } else if (B == 72) {
                                this.r = gVar.h();
                            } else if (!gVar.F(B)) {
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
                return null;
            case 4:
                return new ProfilelistResponse$SmallProfile();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (ProfilelistResponse$SmallProfile.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        int i3 = this.f;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(4, i3);
        }
        int i4 = this.n;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(5, i4);
        }
        boolean z = this.o;
        if (z) {
            i2 += CodedOutputStream.d(6, z);
        }
        boolean z2 = this.p;
        if (z2) {
            i2 += CodedOutputStream.d(7, z2);
        }
        boolean z3 = this.q;
        if (z3) {
            i2 += CodedOutputStream.d(8, z3);
        }
        boolean z4 = this.r;
        if (z4) {
            i2 += CodedOutputStream.d(9, z4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.n;
    }

    public String l() {
        return this.c;
    }

    public boolean m() {
        return this.p;
    }

    public String n() {
        return this.b;
    }

    public String o() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputStream.K(4, i);
        }
        int i2 = this.n;
        if (i2 != 0) {
            codedOutputStream.K(5, i2);
        }
        boolean z = this.o;
        if (z) {
            codedOutputStream.A(6, z);
        }
        boolean z2 = this.p;
        if (z2) {
            codedOutputStream.A(7, z2);
        }
        boolean z3 = this.q;
        if (z3) {
            codedOutputStream.A(8, z3);
        }
        boolean z4 = this.r;
        if (z4) {
            codedOutputStream.A(9, z4);
        }
    }
}
