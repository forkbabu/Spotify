package com.spotify.mobile.android.music.podcast.segments.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.cosmos.util.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.proto.ShowDecorationPolicy;
import java.io.IOException;

public final class PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy extends GeneratedMessageLite<PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy, a> implements Object {
    private static final PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy c;
    private static volatile x<PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy> f;
    private EpisodeDecorationPolicy a;
    private ShowDecorationPolicy b;

    public static final class a extends GeneratedMessageLite.b<PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy, a> implements Object {
        public a m(EpisodeDecorationPolicy episodeDecorationPolicy) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.h((PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy) this.instance, episodeDecorationPolicy);
            return this;
        }

        public a n(ShowDecorationPolicy showDecorationPolicy) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.i((PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy) this.instance, showDecorationPolicy);
            return this;
        }

        private a() {
            super(PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.c);
        }
    }

    static {
        PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy podcastSegmentsCosmosRequest$EpisodeDecorationPolicy = new PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy();
        c = podcastSegmentsCosmosRequest$EpisodeDecorationPolicy;
        podcastSegmentsCosmosRequest$EpisodeDecorationPolicy.makeImmutable();
    }

    private PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy() {
    }

    static void h(PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy podcastSegmentsCosmosRequest$EpisodeDecorationPolicy, EpisodeDecorationPolicy episodeDecorationPolicy) {
        podcastSegmentsCosmosRequest$EpisodeDecorationPolicy.getClass();
        episodeDecorationPolicy.getClass();
        podcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a = episodeDecorationPolicy;
    }

    static void i(PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy podcastSegmentsCosmosRequest$EpisodeDecorationPolicy, ShowDecorationPolicy showDecorationPolicy) {
        podcastSegmentsCosmosRequest$EpisodeDecorationPolicy.getClass();
        showDecorationPolicy.getClass();
        podcastSegmentsCosmosRequest$EpisodeDecorationPolicy.b = showDecorationPolicy;
    }

    public static a l() {
        return (a) c.toBuilder();
    }

    public static x<PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy podcastSegmentsCosmosRequest$EpisodeDecorationPolicy = (PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy) obj2;
                this.a = (EpisodeDecorationPolicy) hVar.i(this.a, podcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a);
                this.b = (ShowDecorationPolicy) hVar.i(this.b, podcastSegmentsCosmosRequest$EpisodeDecorationPolicy.b);
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
                                EpisodeDecorationPolicy episodeDecorationPolicy = this.a;
                                EpisodeDecorationPolicy.Builder builder = episodeDecorationPolicy != null ? (EpisodeDecorationPolicy.Builder) episodeDecorationPolicy.toBuilder() : null;
                                EpisodeDecorationPolicy episodeDecorationPolicy2 = (EpisodeDecorationPolicy) gVar.o(EpisodeDecorationPolicy.parser(), kVar);
                                this.a = episodeDecorationPolicy2;
                                if (builder != null) {
                                    builder.mergeFrom((EpisodeDecorationPolicy.Builder) episodeDecorationPolicy2);
                                    this.a = (EpisodeDecorationPolicy) builder.buildPartial();
                                }
                            } else if (B == 18) {
                                ShowDecorationPolicy showDecorationPolicy = this.b;
                                ShowDecorationPolicy.Builder builder2 = showDecorationPolicy != null ? (ShowDecorationPolicy.Builder) showDecorationPolicy.toBuilder() : null;
                                ShowDecorationPolicy showDecorationPolicy2 = (ShowDecorationPolicy) gVar.o(ShowDecorationPolicy.parser(), kVar);
                                this.b = showDecorationPolicy2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((ShowDecorationPolicy.Builder) showDecorationPolicy2);
                                    this.b = (ShowDecorationPolicy) builder2.buildPartial();
                                }
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
                return new PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        EpisodeDecorationPolicy episodeDecorationPolicy = this.a;
        if (episodeDecorationPolicy != null) {
            i2 = 0 + CodedOutputStream.n(1, episodeDecorationPolicy);
        }
        ShowDecorationPolicy showDecorationPolicy = this.b;
        if (showDecorationPolicy != null) {
            i2 += CodedOutputStream.n(2, showDecorationPolicy);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EpisodeDecorationPolicy episodeDecorationPolicy = this.a;
        if (episodeDecorationPolicy != null) {
            codedOutputStream.M(1, episodeDecorationPolicy);
        }
        ShowDecorationPolicy showDecorationPolicy = this.b;
        if (showDecorationPolicy != null) {
            codedOutputStream.M(2, showDecorationPolicy);
        }
    }
}
