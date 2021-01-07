package com.spotify.music.features.entityselector.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class EntitySelector$CarePackageTrack extends GeneratedMessageLite<EntitySelector$CarePackageTrack, a> implements Object {
    private static final EntitySelector$CarePackageTrack s;
    private static volatile x<EntitySelector$CarePackageTrack> t;
    private int a;
    private String b = "";
    private o.i<EntitySelector$CarePackageTrackArtist> c = GeneratedMessageLite.emptyProtobufList();
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private boolean r;

    public static final class a extends GeneratedMessageLite.b<EntitySelector$CarePackageTrack, a> implements Object {
        private a() {
            super(EntitySelector$CarePackageTrack.s);
        }
    }

    static {
        EntitySelector$CarePackageTrack entitySelector$CarePackageTrack = new EntitySelector$CarePackageTrack();
        s = entitySelector$CarePackageTrack;
        entitySelector$CarePackageTrack.makeImmutable();
    }

    private EntitySelector$CarePackageTrack() {
    }

    public static x<EntitySelector$CarePackageTrack> parser() {
        return s.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EntitySelector$CarePackageTrack entitySelector$CarePackageTrack = (EntitySelector$CarePackageTrack) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !entitySelector$CarePackageTrack.b.isEmpty(), entitySelector$CarePackageTrack.b);
                this.c = hVar.q(this.c, entitySelector$CarePackageTrack.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !entitySelector$CarePackageTrack.f.isEmpty(), entitySelector$CarePackageTrack.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !entitySelector$CarePackageTrack.n.isEmpty(), entitySelector$CarePackageTrack.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !entitySelector$CarePackageTrack.o.isEmpty(), entitySelector$CarePackageTrack.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !entitySelector$CarePackageTrack.p.isEmpty(), entitySelector$CarePackageTrack.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, true ^ entitySelector$CarePackageTrack.q.isEmpty(), entitySelector$CarePackageTrack.q);
                boolean z = this.r;
                boolean z2 = entitySelector$CarePackageTrack.r;
                this.r = hVar.f(z, z, z2, z2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= entitySelector$CarePackageTrack.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.b = gVar.A();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(EntitySelector$CarePackageTrackArtist.parser(), kVar));
                            } else if (B == 26) {
                                this.f = gVar.A();
                            } else if (B == 34) {
                                this.n = gVar.A();
                            } else if (B == 42) {
                                this.o = gVar.A();
                            } else if (B == 50) {
                                this.p = gVar.A();
                            } else if (B == 58) {
                                this.q = gVar.A();
                            } else if (B == 64) {
                                this.r = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
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
                this.c.C();
                return null;
            case 4:
                return new EntitySelector$CarePackageTrack();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (EntitySelector$CarePackageTrack.class) {
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
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        if (!this.f.isEmpty()) {
            p2 += CodedOutputStream.p(3, this.f);
        }
        if (!this.n.isEmpty()) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        if (!this.p.isEmpty()) {
            p2 += CodedOutputStream.p(6, this.p);
        }
        if (!this.q.isEmpty()) {
            p2 += CodedOutputStream.p(7, this.q);
        }
        boolean z = this.r;
        if (z) {
            p2 += CodedOutputStream.d(8, z);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public List<EntitySelector$CarePackageTrackArtist> h() {
        return this.c;
    }

    public String i() {
        return this.f;
    }

    public String l() {
        return this.o;
    }

    public String m() {
        return this.b;
    }

    public String n() {
        return this.p;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(6, this.p);
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(7, this.q);
        }
        boolean z = this.r;
        if (z) {
            codedOutputStream.A(8, z);
        }
    }
}
