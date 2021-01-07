package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.corex.transcripts.metadata.proto.EpisodeTranscriptsMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodePlayState;
import com.spotify.podcastquotes.proto.v1.proto.PodcastQuotes;
import java.io.IOException;

public final class ShowShowRequest$ProtoShowRequestItem extends GeneratedMessageLite<ShowShowRequest$ProtoShowRequestItem, a> implements Object {
    private static final ShowShowRequest$ProtoShowRequestItem r;
    private static volatile x<ShowShowRequest$ProtoShowRequestItem> s;
    private int a;
    private String b = "";
    private EpisodeMetadata$ProtoEpisodeMetadata c;
    private EpisodeState$ProtoEpisodeCollectionState f;
    private EpisodeState$ProtoEpisodeOfflineState n;
    private EpisodeState$ProtoEpisodePlayState o;
    private PodcastQuotes p;
    private EpisodeTranscriptsMetadata q;

    public static final class a extends GeneratedMessageLite.b<ShowShowRequest$ProtoShowRequestItem, a> implements Object {
        private a() {
            super(ShowShowRequest$ProtoShowRequestItem.r);
        }
    }

    static {
        ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem = new ShowShowRequest$ProtoShowRequestItem();
        r = showShowRequest$ProtoShowRequestItem;
        showShowRequest$ProtoShowRequestItem.makeImmutable();
    }

    private ShowShowRequest$ProtoShowRequestItem() {
    }

    public static ShowShowRequest$ProtoShowRequestItem h() {
        return r;
    }

    public static x<ShowShowRequest$ProtoShowRequestItem> parser() {
        return r.getParserForType();
    }

    public EpisodeState$ProtoEpisodeOfflineState b() {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = this.n;
        return episodeState$ProtoEpisodeOfflineState == null ? EpisodeState$ProtoEpisodeOfflineState.h() : episodeState$ProtoEpisodeOfflineState;
    }

    public boolean d() {
        return (this.a & 2) == 2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem = (ShowShowRequest$ProtoShowRequestItem) obj2;
                this.b = hVar.n(o(), this.b, showShowRequest$ProtoShowRequestItem.o(), showShowRequest$ProtoShowRequestItem.b);
                this.c = (EpisodeMetadata$ProtoEpisodeMetadata) hVar.i(this.c, showShowRequest$ProtoShowRequestItem.c);
                this.f = (EpisodeState$ProtoEpisodeCollectionState) hVar.i(this.f, showShowRequest$ProtoShowRequestItem.f);
                this.n = (EpisodeState$ProtoEpisodeOfflineState) hVar.i(this.n, showShowRequest$ProtoShowRequestItem.n);
                this.o = (EpisodeState$ProtoEpisodePlayState) hVar.i(this.o, showShowRequest$ProtoShowRequestItem.o);
                this.p = (PodcastQuotes) hVar.i(this.p, showShowRequest$ProtoShowRequestItem.p);
                this.q = (EpisodeTranscriptsMetadata) hVar.i(this.q, showShowRequest$ProtoShowRequestItem.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showShowRequest$ProtoShowRequestItem.a;
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
                                String z2 = gVar.z();
                                this.a |= 1;
                                this.b = z2;
                            } else if (B == 18) {
                                EpisodeMetadata$ProtoEpisodeMetadata.a aVar = (this.a & 2) == 2 ? (EpisodeMetadata$ProtoEpisodeMetadata.a) this.c.toBuilder() : null;
                                EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = (EpisodeMetadata$ProtoEpisodeMetadata) gVar.o(EpisodeMetadata$ProtoEpisodeMetadata.parser(), kVar);
                                this.c = episodeMetadata$ProtoEpisodeMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((EpisodeMetadata$ProtoEpisodeMetadata.a) episodeMetadata$ProtoEpisodeMetadata);
                                    this.c = (EpisodeMetadata$ProtoEpisodeMetadata) aVar.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                EpisodeState$ProtoEpisodeCollectionState.a aVar2 = (this.a & 4) == 4 ? (EpisodeState$ProtoEpisodeCollectionState.a) this.f.toBuilder() : null;
                                EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = (EpisodeState$ProtoEpisodeCollectionState) gVar.o(EpisodeState$ProtoEpisodeCollectionState.parser(), kVar);
                                this.f = episodeState$ProtoEpisodeCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EpisodeState$ProtoEpisodeCollectionState.a) episodeState$ProtoEpisodeCollectionState);
                                    this.f = (EpisodeState$ProtoEpisodeCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 4;
                            } else if (B == 34) {
                                EpisodeState$ProtoEpisodeOfflineState.a aVar3 = (this.a & 8) == 8 ? (EpisodeState$ProtoEpisodeOfflineState.a) this.n.toBuilder() : null;
                                EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = (EpisodeState$ProtoEpisodeOfflineState) gVar.o(EpisodeState$ProtoEpisodeOfflineState.parser(), kVar);
                                this.n = episodeState$ProtoEpisodeOfflineState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EpisodeState$ProtoEpisodeOfflineState.a) episodeState$ProtoEpisodeOfflineState);
                                    this.n = (EpisodeState$ProtoEpisodeOfflineState) aVar3.buildPartial();
                                }
                                this.a |= 8;
                            } else if (B == 42) {
                                EpisodeState$ProtoEpisodePlayState.a aVar4 = (this.a & 16) == 16 ? (EpisodeState$ProtoEpisodePlayState.a) this.o.toBuilder() : null;
                                EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = (EpisodeState$ProtoEpisodePlayState) gVar.o(EpisodeState$ProtoEpisodePlayState.parser(), kVar);
                                this.o = episodeState$ProtoEpisodePlayState;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((EpisodeState$ProtoEpisodePlayState.a) episodeState$ProtoEpisodePlayState);
                                    this.o = (EpisodeState$ProtoEpisodePlayState) aVar4.buildPartial();
                                }
                                this.a |= 16;
                            } else if (B == 50) {
                                PodcastQuotes.b bVar = (this.a & 32) == 32 ? (PodcastQuotes.b) this.p.toBuilder() : null;
                                PodcastQuotes podcastQuotes = (PodcastQuotes) gVar.o(PodcastQuotes.parser(), kVar);
                                this.p = podcastQuotes;
                                if (bVar != null) {
                                    bVar.mergeFrom((PodcastQuotes.b) podcastQuotes);
                                    this.p = (PodcastQuotes) bVar.buildPartial();
                                }
                                this.a |= 32;
                            } else if (B == 58) {
                                EpisodeTranscriptsMetadata.b bVar2 = (this.a & 64) == 64 ? (EpisodeTranscriptsMetadata.b) this.q.toBuilder() : null;
                                EpisodeTranscriptsMetadata episodeTranscriptsMetadata = (EpisodeTranscriptsMetadata) gVar.o(EpisodeTranscriptsMetadata.parser(), kVar);
                                this.q = episodeTranscriptsMetadata;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((EpisodeTranscriptsMetadata.b) episodeTranscriptsMetadata);
                                    this.q = (EpisodeTranscriptsMetadata) bVar2.buildPartial();
                                }
                                this.a |= 64;
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
                return new ShowShowRequest$ProtoShowRequestItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (ShowShowRequest$ProtoShowRequestItem.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
    }

    public boolean e() {
        return (this.a & 8) == 8;
    }

    public EpisodeState$ProtoEpisodeCollectionState f() {
        EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = this.f;
        return episodeState$ProtoEpisodeCollectionState == null ? EpisodeState$ProtoEpisodeCollectionState.h() : episodeState$ProtoEpisodeCollectionState;
    }

    public String getHeader() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, k());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, f());
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(4, b());
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.n(5, i());
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.n(6, l());
        }
        if ((this.a & 64) == 64) {
            EpisodeTranscriptsMetadata episodeTranscriptsMetadata = this.q;
            if (episodeTranscriptsMetadata == null) {
                episodeTranscriptsMetadata = EpisodeTranscriptsMetadata.h();
            }
            i2 += CodedOutputStream.n(7, episodeTranscriptsMetadata);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public EpisodeState$ProtoEpisodePlayState i() {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = this.o;
        return episodeState$ProtoEpisodePlayState == null ? EpisodeState$ProtoEpisodePlayState.h() : episodeState$ProtoEpisodePlayState;
    }

    public boolean j() {
        return (this.a & 4) == 4;
    }

    public EpisodeMetadata$ProtoEpisodeMetadata k() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.c;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.i() : episodeMetadata$ProtoEpisodeMetadata;
    }

    public PodcastQuotes l() {
        PodcastQuotes podcastQuotes = this.p;
        return podcastQuotes == null ? PodcastQuotes.h() : podcastQuotes;
    }

    public boolean m() {
        return (this.a & 16) == 16;
    }

    public boolean n() {
        return (this.a & 32) == 32;
    }

    public boolean o() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, k());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, f());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(4, b());
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.M(5, i());
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.M(6, l());
        }
        if ((this.a & 64) == 64) {
            EpisodeTranscriptsMetadata episodeTranscriptsMetadata = this.q;
            if (episodeTranscriptsMetadata == null) {
                episodeTranscriptsMetadata = EpisodeTranscriptsMetadata.h();
            }
            codedOutputStream.M(7, episodeTranscriptsMetadata);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
