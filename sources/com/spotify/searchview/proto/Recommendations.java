package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class Recommendations extends GeneratedMessageLite<Recommendations, b> implements Object {
    private static final Recommendations f;
    private static volatile x<Recommendations> n;
    private int a;
    private int b;
    private o.i<Entity> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<Recommendations, b> implements Object {
        private b() {
            super(Recommendations.f);
        }
    }

    static {
        Recommendations recommendations = new Recommendations();
        f = recommendations;
        recommendations.makeImmutable();
    }

    private Recommendations() {
    }

    public static Recommendations h() {
        return f;
    }

    public static x<Recommendations> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Recommendations recommendations = (Recommendations) obj2;
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = recommendations.b;
                if (i2 != 0) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, i2);
                this.c = hVar.q(this.c, recommendations.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= recommendations.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.b = gVar.u();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(Entity.parser(), kVar));
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
                this.c.C();
                return null;
            case 4:
                return new Recommendations();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Recommendations.class) {
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
        int h = this.b != RecommendationsType.RECOMMENDATIONS_TYPE_UNKNOWN.getNumber() ? CodedOutputStream.h(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            h += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = h;
        return h;
    }

    public int i() {
        return this.c.size();
    }

    public List<Entity> l() {
        return this.c;
    }

    public RecommendationsType m() {
        RecommendationsType recommendationsType;
        int i = this.b;
        if (i == 0) {
            recommendationsType = RecommendationsType.RECOMMENDATIONS_TYPE_UNKNOWN;
        } else if (i == 1) {
            recommendationsType = RecommendationsType.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST;
        } else if (i == 2) {
            recommendationsType = RecommendationsType.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE;
        } else if (i == 3) {
            recommendationsType = RecommendationsType.RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY;
        } else if (i == 4) {
            recommendationsType = RecommendationsType.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK;
        } else if (i != 5) {
            recommendationsType = null;
        } else {
            recommendationsType = RecommendationsType.RECOMMENDATIONS_TYPE_TOPICS_WITH_EPISODE;
        }
        return recommendationsType == null ? RecommendationsType.UNRECOGNIZED : recommendationsType;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != RecommendationsType.RECOMMENDATIONS_TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.K(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}
