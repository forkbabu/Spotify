package com.spotify.topic.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.topic.proto.AudioEpisode;
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
        AUDIO_EPISODE(4),
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
        EntityCase entityCase = null;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Entity entity = (Entity) obj2;
                this.c = hVar.n(!this.c.isEmpty(), this.c, !entity.c.isEmpty(), entity.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !entity.f.isEmpty(), entity.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !entity.n.isEmpty(), entity.n);
                int i2 = entity.a;
                if (i2 == 0) {
                    entityCase = EntityCase.ENTITY_NOT_SET;
                } else if (i2 == 4) {
                    entityCase = EntityCase.AUDIO_EPISODE;
                }
                int ordinal = entityCase.ordinal();
                if (ordinal == 0) {
                    if (this.a != 4) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, entity.b);
                } else if (ordinal == 1) {
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
                                AudioEpisode.b bVar = this.a == 4 ? (AudioEpisode.b) ((AudioEpisode) this.b).toBuilder() : null;
                                u o2 = gVar.o(AudioEpisode.parser(), kVar);
                                this.b = o2;
                                if (bVar != null) {
                                    bVar.mergeFrom((AudioEpisode.b) ((AudioEpisode) o2));
                                    this.b = bVar.buildPartial();
                                }
                                this.a = 4;
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
            i2 += CodedOutputStream.n(4, (AudioEpisode) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public AudioEpisode h() {
        if (this.a == 4) {
            return (AudioEpisode) this.b;
        }
        return AudioEpisode.h();
    }

    public String i() {
        return this.n;
    }

    public String l() {
        return this.f;
    }

    public String m() {
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
            codedOutputStream.M(4, (AudioEpisode) this.b);
        }
    }
}
