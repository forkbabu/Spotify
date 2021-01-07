package com.spotify.searchview.assistedcuration.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class MainViewResponse extends GeneratedMessageLite<MainViewResponse, b> implements Object {
    private static final o.g.a<Integer, EntityType> c = new a();
    private static final MainViewResponse f;
    private static volatile x<MainViewResponse> n;
    private o.i<Entity> a = GeneratedMessageLite.emptyProtobufList();
    private o.f b = GeneratedMessageLite.emptyIntList();

    static class a implements o.g.a<Integer, EntityType> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.protobuf.o.g.a
        public EntityType convert(Integer num) {
            EntityType entityType;
            int intValue = num.intValue();
            if (intValue == 0) {
                entityType = EntityType.ENTITY_TYPE_UNKNOWN;
            } else if (intValue == 1) {
                entityType = EntityType.ENTITY_TYPE_ARTIST;
            } else if (intValue == 2) {
                entityType = EntityType.ENTITY_TYPE_TRACK;
            } else if (intValue != 3) {
                entityType = null;
            } else {
                entityType = EntityType.ENTITY_TYPE_ALBUM;
            }
            return entityType == null ? EntityType.UNRECOGNIZED : entityType;
        }
    }

    public static final class b extends GeneratedMessageLite.b<MainViewResponse, b> implements Object {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(MainViewResponse.f);
        }
    }

    static {
        MainViewResponse mainViewResponse = new MainViewResponse();
        f = mainViewResponse;
        mainViewResponse.makeImmutable();
    }

    private MainViewResponse() {
    }

    public static x<MainViewResponse> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                MainViewResponse mainViewResponse = (MainViewResponse) obj2;
                this.a = hVar.q(this.a, mainViewResponse.a);
                this.b = hVar.h(this.b, mainViewResponse.b);
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
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(Entity.parser(), kVar));
                            } else if (B == 16) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.i1(gVar.u());
                            } else if (B == 18) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                int g = gVar.g(gVar.u());
                                while (gVar.b() > 0) {
                                    this.b.i1(gVar.u());
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
                this.a.C();
                this.b.C();
                return null;
            case 4:
                return new MainViewResponse();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (MainViewResponse.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.a.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.b.size(); i5++) {
            i4 += CodedOutputStream.k(this.b.T1(i5));
        }
        int size = (this.b.size() * 1) + i2 + i4;
        this.memoizedSerializedSize = size;
        return size;
    }

    public List<EntityType> h() {
        return new o.g(this.b, c);
    }

    public Entity i(int i) {
        return this.a.get(i);
    }

    public List<Entity> l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        getSerializedSize();
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            codedOutputStream.K(2, this.b.T1(i2));
        }
    }
}
