package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.searchview.proto.OnDemand;
import com.spotify.searchview.proto.RelatedEntity;
import java.io.IOException;
import java.util.List;

public final class Track extends GeneratedMessageLite<Track, b> implements Object {
    private static final Track s;
    private static volatile x<Track> t;
    private int a;
    private boolean b;
    private boolean c;
    private RelatedEntity f;
    private o.i<RelatedEntity> n = GeneratedMessageLite.emptyProtobufList();
    private String o = "";
    private boolean p;
    private boolean q;
    private OnDemand r;

    public static final class b extends GeneratedMessageLite.b<Track, b> implements Object {
        private b() {
            super(Track.s);
        }
    }

    static {
        Track track = new Track();
        s = track;
        track.makeImmutable();
    }

    private Track() {
    }

    public static Track h() {
        return s;
    }

    public static x<Track> parser() {
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
                Track track = (Track) obj2;
                boolean z = this.b;
                boolean z2 = track.b;
                this.b = hVar.f(z, z, z2, z2);
                boolean z3 = this.c;
                boolean z4 = track.c;
                this.c = hVar.f(z3, z3, z4, z4);
                this.f = (RelatedEntity) hVar.i(this.f, track.f);
                this.n = hVar.q(this.n, track.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, true ^ track.o.isEmpty(), track.o);
                boolean z5 = this.p;
                boolean z6 = track.p;
                this.p = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.q;
                boolean z8 = track.q;
                this.q = hVar.f(z7, z7, z8, z8);
                this.r = (OnDemand) hVar.i(this.r, track.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= track.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z9 = false;
                while (!z9) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.b = gVar.h();
                            } else if (B == 16) {
                                this.c = gVar.h();
                            } else if (B == 26) {
                                RelatedEntity relatedEntity = this.f;
                                RelatedEntity.b bVar = relatedEntity != null ? (RelatedEntity.b) relatedEntity.toBuilder() : null;
                                RelatedEntity relatedEntity2 = (RelatedEntity) gVar.o(RelatedEntity.parser(), kVar);
                                this.f = relatedEntity2;
                                if (bVar != null) {
                                    bVar.mergeFrom((RelatedEntity.b) relatedEntity2);
                                    this.f = (RelatedEntity) bVar.buildPartial();
                                }
                            } else if (B == 34) {
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(RelatedEntity.parser(), kVar));
                            } else if (B == 42) {
                                this.o = gVar.A();
                            } else if (B == 48) {
                                this.p = gVar.h();
                            } else if (B == 56) {
                                this.q = gVar.h();
                            } else if (B == 66) {
                                OnDemand onDemand = this.r;
                                OnDemand.b bVar2 = onDemand != null ? (OnDemand.b) onDemand.toBuilder() : null;
                                OnDemand onDemand2 = (OnDemand) gVar.o(OnDemand.parser(), kVar);
                                this.r = onDemand2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((OnDemand.b) onDemand2);
                                    this.r = (OnDemand) bVar2.buildPartial();
                                }
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z9 = true;
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
                return null;
            case 4:
                return new Track();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (Track.class) {
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
        boolean z = this.b;
        int d = z ? CodedOutputStream.d(1, z) + 0 : 0;
        boolean z2 = this.c;
        if (z2) {
            d += CodedOutputStream.d(2, z2);
        }
        if (this.f != null) {
            d += CodedOutputStream.n(3, o());
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            d += CodedOutputStream.n(4, this.n.get(i2));
        }
        if (!this.o.isEmpty()) {
            d += CodedOutputStream.p(5, this.o);
        }
        boolean z3 = this.p;
        if (z3) {
            d += CodedOutputStream.d(6, z3);
        }
        boolean z4 = this.q;
        if (z4) {
            d += CodedOutputStream.d(7, z4);
        }
        if (this.r != null) {
            d += CodedOutputStream.n(8, n());
        }
        this.memoizedSerializedSize = d;
        return d;
    }

    public boolean i() {
        return this.b;
    }

    public boolean l() {
        return this.q;
    }

    public boolean m() {
        return this.p;
    }

    public OnDemand n() {
        OnDemand onDemand = this.r;
        return onDemand == null ? OnDemand.h() : onDemand;
    }

    public RelatedEntity o() {
        RelatedEntity relatedEntity = this.f;
        return relatedEntity == null ? RelatedEntity.h() : relatedEntity;
    }

    public List<RelatedEntity> p() {
        return this.n;
    }

    public boolean q() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.c;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        if (this.f != null) {
            codedOutputStream.M(3, o());
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.M(4, this.n.get(i));
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
        boolean z3 = this.p;
        if (z3) {
            codedOutputStream.A(6, z3);
        }
        boolean z4 = this.q;
        if (z4) {
            codedOutputStream.A(7, z4);
        }
        if (this.r != null) {
            codedOutputStream.M(8, n());
        }
    }
}
