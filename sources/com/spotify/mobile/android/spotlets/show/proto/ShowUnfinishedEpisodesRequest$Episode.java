package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodePlayState;
import java.io.IOException;

public final class ShowUnfinishedEpisodesRequest$Episode extends GeneratedMessageLite<ShowUnfinishedEpisodesRequest$Episode, a> implements Object {
    private static final ShowUnfinishedEpisodesRequest$Episode p;
    private static volatile x<ShowUnfinishedEpisodesRequest$Episode> q;
    private int a;
    private EpisodeMetadata$ProtoEpisodeMetadata b;
    private EpisodeState$ProtoEpisodeCollectionState c;
    private EpisodeState$ProtoEpisodeOfflineState f;
    private EpisodeState$ProtoEpisodePlayState n;
    private String o = "";

    public static final class a extends GeneratedMessageLite.b<ShowUnfinishedEpisodesRequest$Episode, a> implements Object {
        private a() {
            super(ShowUnfinishedEpisodesRequest$Episode.p);
        }
    }

    static {
        ShowUnfinishedEpisodesRequest$Episode showUnfinishedEpisodesRequest$Episode = new ShowUnfinishedEpisodesRequest$Episode();
        p = showUnfinishedEpisodesRequest$Episode;
        showUnfinishedEpisodesRequest$Episode.makeImmutable();
    }

    private ShowUnfinishedEpisodesRequest$Episode() {
    }

    public static x<ShowUnfinishedEpisodesRequest$Episode> parser() {
        return p.getParserForType();
    }

    public EpisodeState$ProtoEpisodeOfflineState b() {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = this.f;
        return episodeState$ProtoEpisodeOfflineState == null ? EpisodeState$ProtoEpisodeOfflineState.h() : episodeState$ProtoEpisodeOfflineState;
    }

    public boolean d() {
        return (this.a & 1) == 1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowUnfinishedEpisodesRequest$Episode showUnfinishedEpisodesRequest$Episode = (ShowUnfinishedEpisodesRequest$Episode) obj2;
                this.b = (EpisodeMetadata$ProtoEpisodeMetadata) hVar.i(this.b, showUnfinishedEpisodesRequest$Episode.b);
                this.c = (EpisodeState$ProtoEpisodeCollectionState) hVar.i(this.c, showUnfinishedEpisodesRequest$Episode.c);
                this.f = (EpisodeState$ProtoEpisodeOfflineState) hVar.i(this.f, showUnfinishedEpisodesRequest$Episode.f);
                this.n = (EpisodeState$ProtoEpisodePlayState) hVar.i(this.n, showUnfinishedEpisodesRequest$Episode.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((showUnfinishedEpisodesRequest$Episode.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, showUnfinishedEpisodesRequest$Episode.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showUnfinishedEpisodesRequest$Episode.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                EpisodeMetadata$ProtoEpisodeMetadata.a aVar = (this.a & 1) == 1 ? (EpisodeMetadata$ProtoEpisodeMetadata.a) this.b.toBuilder() : null;
                                EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = (EpisodeMetadata$ProtoEpisodeMetadata) gVar.o(EpisodeMetadata$ProtoEpisodeMetadata.parser(), kVar);
                                this.b = episodeMetadata$ProtoEpisodeMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((EpisodeMetadata$ProtoEpisodeMetadata.a) episodeMetadata$ProtoEpisodeMetadata);
                                    this.b = (EpisodeMetadata$ProtoEpisodeMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                EpisodeState$ProtoEpisodeCollectionState.a aVar2 = (this.a & 2) == 2 ? (EpisodeState$ProtoEpisodeCollectionState.a) this.c.toBuilder() : null;
                                EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = (EpisodeState$ProtoEpisodeCollectionState) gVar.o(EpisodeState$ProtoEpisodeCollectionState.parser(), kVar);
                                this.c = episodeState$ProtoEpisodeCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EpisodeState$ProtoEpisodeCollectionState.a) episodeState$ProtoEpisodeCollectionState);
                                    this.c = (EpisodeState$ProtoEpisodeCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                EpisodeState$ProtoEpisodeOfflineState.a aVar3 = (this.a & 4) == 4 ? (EpisodeState$ProtoEpisodeOfflineState.a) this.f.toBuilder() : null;
                                EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = (EpisodeState$ProtoEpisodeOfflineState) gVar.o(EpisodeState$ProtoEpisodeOfflineState.parser(), kVar);
                                this.f = episodeState$ProtoEpisodeOfflineState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EpisodeState$ProtoEpisodeOfflineState.a) episodeState$ProtoEpisodeOfflineState);
                                    this.f = (EpisodeState$ProtoEpisodeOfflineState) aVar3.buildPartial();
                                }
                                this.a |= 4;
                            } else if (B == 34) {
                                EpisodeState$ProtoEpisodePlayState.a aVar4 = (this.a & 8) == 8 ? (EpisodeState$ProtoEpisodePlayState.a) this.n.toBuilder() : null;
                                EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = (EpisodeState$ProtoEpisodePlayState) gVar.o(EpisodeState$ProtoEpisodePlayState.parser(), kVar);
                                this.n = episodeState$ProtoEpisodePlayState;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((EpisodeState$ProtoEpisodePlayState.a) episodeState$ProtoEpisodePlayState);
                                    this.n = (EpisodeState$ProtoEpisodePlayState) aVar4.buildPartial();
                                }
                                this.a |= 8;
                            } else if (B == 42) {
                                String z3 = gVar.z();
                                this.a |= 16;
                                this.o = z3;
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new ShowUnfinishedEpisodesRequest$Episode();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (ShowUnfinishedEpisodesRequest$Episode.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    public boolean e() {
        return (this.a & 4) == 4;
    }

    public EpisodeState$ProtoEpisodeCollectionState f() {
        EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = this.c;
        return episodeState$ProtoEpisodeCollectionState == null ? EpisodeState$ProtoEpisodeCollectionState.h() : episodeState$ProtoEpisodeCollectionState;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.n(1, k());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, f());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, b());
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(4, h());
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public EpisodeState$ProtoEpisodePlayState h() {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = this.n;
        return episodeState$ProtoEpisodePlayState == null ? EpisodeState$ProtoEpisodePlayState.h() : episodeState$ProtoEpisodePlayState;
    }

    public boolean i() {
        return (this.a & 8) == 8;
    }

    public boolean j() {
        return (this.a & 2) == 2;
    }

    public EpisodeMetadata$ProtoEpisodeMetadata k() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.b;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.i() : episodeMetadata$ProtoEpisodeMetadata;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, k());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, f());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, b());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(4, h());
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
