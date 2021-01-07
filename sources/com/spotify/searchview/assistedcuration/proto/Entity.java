package com.spotify.searchview.assistedcuration.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.searchview.assistedcuration.proto.Album;
import com.spotify.searchview.assistedcuration.proto.Artist;
import com.spotify.searchview.assistedcuration.proto.Track;
import java.io.IOException;

public final class Entity extends GeneratedMessageLite<Entity, b> implements Object {
    private static final Entity o;
    private static volatile x<Entity> p;
    private int a = 0;
    private Object b;
    private String c = "";
    private String f = "";
    private String n = "";

    public enum EntityCase implements o.c {
        ARTIST(4),
        TRACK(5),
        ALBUM(6),
        ENTITY_NOT_SET(0);
        
        private final int value;

        private EntityCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Entity, b> implements Object {
        private b() {
            super(Entity.o);
        }
    }

    static {
        Entity entity = new Entity();
        o = entity;
        entity.makeImmutable();
    }

    private Entity() {
    }

    public static x<Entity> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Entity entity = (Entity) obj2;
                this.c = hVar.n(!this.c.isEmpty(), this.c, !entity.c.isEmpty(), entity.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !entity.f.isEmpty(), entity.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !entity.n.isEmpty(), entity.n);
                int ordinal = entity.i().ordinal();
                if (ordinal == 0) {
                    if (this.a != 4) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, entity.b);
                } else if (ordinal == 1) {
                    if (this.a != 5) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, entity.b);
                } else if (ordinal == 2) {
                    if (this.a != 6) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, entity.b);
                } else if (ordinal == 3) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = entity.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.c = gVar.A();
                            } else if (B == 18) {
                                this.f = gVar.A();
                            } else if (B == 26) {
                                this.n = gVar.A();
                            } else if (B == 34) {
                                Artist.b bVar = this.a == 4 ? (Artist.b) ((Artist) this.b).toBuilder() : null;
                                u o2 = gVar.o(Artist.parser(), kVar);
                                this.b = o2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Artist.b) ((Artist) o2));
                                    this.b = bVar.buildPartial();
                                }
                                this.a = 4;
                            } else if (B == 42) {
                                Track.b bVar2 = this.a == 5 ? (Track.b) ((Track) this.b).toBuilder() : null;
                                u o3 = gVar.o(Track.parser(), kVar);
                                this.b = o3;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Track.b) ((Track) o3));
                                    this.b = bVar2.buildPartial();
                                }
                                this.a = 5;
                            } else if (B == 50) {
                                Album.b bVar3 = this.a == 6 ? (Album.b) ((Album) this.b).toBuilder() : null;
                                u o4 = gVar.o(Album.parser(), kVar);
                                this.b = o4;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((Album.b) ((Album) o4));
                                    this.b = bVar3.buildPartial();
                                }
                                this.a = 6;
                            } else if (!gVar.F(B)) {
                            }
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
                return null;
            case 4:
                return new Entity();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Entity.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.c.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.n);
        }
        if (this.a == 4) {
            i2 += CodedOutputStream.n(4, (Artist) this.b);
        }
        if (this.a == 5) {
            i2 += CodedOutputStream.n(5, (Track) this.b);
        }
        if (this.a == 6) {
            i2 += CodedOutputStream.n(6, (Album) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Album h() {
        if (this.a == 6) {
            return (Album) this.b;
        }
        return Album.l();
    }

    public EntityCase i() {
        int i = this.a;
        if (i == 0) {
            return EntityCase.ENTITY_NOT_SET;
        }
        if (i == 4) {
            return EntityCase.ARTIST;
        }
        if (i == 5) {
            return EntityCase.TRACK;
        }
        if (i != 6) {
            return null;
        }
        return EntityCase.ALBUM;
    }

    public String l() {
        return this.n;
    }

    public String m() {
        return this.f;
    }

    public Track n() {
        if (this.a == 5) {
            return (Track) this.b;
        }
        return Track.h();
    }

    public String o() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c.isEmpty()) {
            codedOutputStream.P(1, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(2, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(3, this.n);
        }
        if (this.a == 4) {
            codedOutputStream.M(4, (Artist) this.b);
        }
        if (this.a == 5) {
            codedOutputStream.M(5, (Track) this.b);
        }
        if (this.a == 6) {
            codedOutputStream.M(6, (Album) this.b);
        }
    }
}
