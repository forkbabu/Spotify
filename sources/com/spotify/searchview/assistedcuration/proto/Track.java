package com.spotify.searchview.assistedcuration.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.searchview.assistedcuration.proto.RelatedEntity;
import java.io.IOException;
import java.util.List;

public final class Track extends GeneratedMessageLite<Track, b> implements Object {
    private static final Track q;
    private static volatile x<Track> r;
    private int a;
    private boolean b;
    private boolean c;
    private RelatedEntity f;
    private o.i<RelatedEntity> n = GeneratedMessageLite.emptyProtobufList();
    private String o = "";
    private boolean p;

    public static final class b extends GeneratedMessageLite.b<Track, b> implements Object {
        private b() {
            super(Track.q);
        }
    }

    static {
        Track track = new Track();
        q = track;
        track.makeImmutable();
    }

    private Track() {
    }

    public static Track h() {
        return q;
    }

    public static x<Track> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
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
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= track.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z7 = false;
                while (!z7) {
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
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z7 = true;
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
                if (r == null) {
                    synchronized (Track.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
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
            d += CodedOutputStream.n(3, n());
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
        this.memoizedSerializedSize = d;
        return d;
    }

    public boolean i() {
        return this.b;
    }

    public boolean l() {
        return this.p;
    }

    public String m() {
        return this.o;
    }

    public RelatedEntity n() {
        RelatedEntity relatedEntity = this.f;
        return relatedEntity == null ? RelatedEntity.h() : relatedEntity;
    }

    public List<RelatedEntity> o() {
        return this.n;
    }

    public boolean p() {
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
            codedOutputStream.M(3, n());
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
    }
}
