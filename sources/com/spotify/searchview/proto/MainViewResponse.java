package com.spotify.searchview.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.searchview.proto.Recommendations;
import java.io.IOException;
import java.util.List;

public final class MainViewResponse extends GeneratedMessageLite<MainViewResponse, b> implements Object {
    private static final o.g.a<Integer, EntityType> n = new a();
    private static final MainViewResponse o;
    private static volatile x<MainViewResponse> p;
    private int a;
    private o.i<Entity> b = GeneratedMessageLite.emptyProtobufList();
    private Recommendations c;
    private o.f f = GeneratedMessageLite.emptyIntList();

    static class a implements o.g.a<Integer, EntityType> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.protobuf.o.g.a
        public EntityType convert(Integer num) {
            EntityType entityType;
            switch (num.intValue()) {
                case 0:
                    entityType = EntityType.ENTITY_TYPE_UNKNOWN;
                    break;
                case 1:
                    entityType = EntityType.ENTITY_TYPE_ARTIST;
                    break;
                case 2:
                    entityType = EntityType.ENTITY_TYPE_TRACK;
                    break;
                case 3:
                    entityType = EntityType.ENTITY_TYPE_ALBUM;
                    break;
                case 4:
                    entityType = EntityType.ENTITY_TYPE_PLAYLIST;
                    break;
                case 5:
                    entityType = EntityType.ENTITY_TYPE_GENRE;
                    break;
                case 6:
                    entityType = EntityType.ENTITY_TYPE_AUDIO_SHOW;
                    break;
                case 7:
                    entityType = EntityType.ENTITY_TYPE_AUDIO_EPISODE;
                    break;
                case 8:
                    entityType = EntityType.ENTITY_TYPE_PROFILE;
                    break;
                case 9:
                    entityType = EntityType.ENTITY_TYPE_TOPIC;
                    break;
                default:
                    entityType = null;
                    break;
            }
            return entityType == null ? EntityType.UNRECOGNIZED : entityType;
        }
    }

    public static final class b extends GeneratedMessageLite.b<MainViewResponse, b> implements Object {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(MainViewResponse.o);
        }
    }

    static {
        MainViewResponse mainViewResponse = new MainViewResponse();
        o = mainViewResponse;
        mainViewResponse.makeImmutable();
    }

    private MainViewResponse() {
    }

    public static MainViewResponse h() {
        return o;
    }

    public static MainViewResponse p(ByteString byteString) {
        return (MainViewResponse) GeneratedMessageLite.parseFrom(o, byteString);
    }

    public static x<MainViewResponse> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                MainViewResponse mainViewResponse = (MainViewResponse) obj2;
                this.b = hVar.q(this.b, mainViewResponse.b);
                this.c = (Recommendations) hVar.i(this.c, mainViewResponse.c);
                this.f = hVar.h(this.f, mainViewResponse.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= mainViewResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(Entity.parser(), kVar));
                            } else if (B == 18) {
                                Recommendations recommendations = this.c;
                                Recommendations.b bVar = recommendations != null ? (Recommendations.b) recommendations.toBuilder() : null;
                                Recommendations recommendations2 = (Recommendations) gVar.o(Recommendations.parser(), kVar);
                                this.c = recommendations2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Recommendations.b) recommendations2);
                                    this.c = (Recommendations) bVar.buildPartial();
                                }
                            } else if (B == 24) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.i1(gVar.u());
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                int g = gVar.g(gVar.u());
                                while (gVar.b() > 0) {
                                    this.f.i1(gVar.u());
                                }
                                gVar.f(g);
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
                this.b.C();
                this.f.C();
                return null;
            case 4:
                return new MainViewResponse();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (MainViewResponse.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        if (this.c != null) {
            i2 += CodedOutputStream.n(2, o());
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f.size(); i5++) {
            i4 += CodedOutputStream.k(this.f.T1(i5));
        }
        int size = (this.f.size() * 1) + i2 + i4;
        this.memoizedSerializedSize = size;
        return size;
    }

    public List<EntityType> i() {
        return new o.g(this.f, n);
    }

    public Entity l(int i) {
        return this.b.get(i);
    }

    public int m() {
        return this.b.size();
    }

    public List<Entity> n() {
        return this.b;
    }

    public Recommendations o() {
        Recommendations recommendations = this.c;
        return recommendations == null ? Recommendations.h() : recommendations;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if (this.c != null) {
            codedOutputStream.M(2, o());
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.K(3, this.f.T1(i2));
        }
    }
}
