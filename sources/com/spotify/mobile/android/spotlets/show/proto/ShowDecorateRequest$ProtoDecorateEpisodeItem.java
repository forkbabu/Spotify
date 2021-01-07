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
import com.spotify.podcastextensions.proto.Podcastextensions$PodcastHtmlDescription;
import com.spotify.podcastquotes.proto.v1.proto.PodcastQuotes;
import java.io.IOException;

public final class ShowDecorateRequest$ProtoDecorateEpisodeItem extends GeneratedMessageLite<ShowDecorateRequest$ProtoDecorateEpisodeItem, a> implements Object {
    private static final ShowDecorateRequest$ProtoDecorateEpisodeItem s;
    private static volatile x<ShowDecorateRequest$ProtoDecorateEpisodeItem> t;
    private int a;
    private EpisodeMetadata$ProtoEpisodeMetadata b;
    private EpisodeState$ProtoEpisodeCollectionState c;
    private EpisodeState$ProtoEpisodeOfflineState f;
    private EpisodeState$ProtoEpisodePlayState n;
    private String o = "";
    private Podcastextensions$PodcastHtmlDescription p;
    private PodcastQuotes q;
    private EpisodeTranscriptsMetadata r;

    public static final class a extends GeneratedMessageLite.b<ShowDecorateRequest$ProtoDecorateEpisodeItem, a> implements Object {
        private a() {
            super(ShowDecorateRequest$ProtoDecorateEpisodeItem.s);
        }
    }

    static {
        ShowDecorateRequest$ProtoDecorateEpisodeItem showDecorateRequest$ProtoDecorateEpisodeItem = new ShowDecorateRequest$ProtoDecorateEpisodeItem();
        s = showDecorateRequest$ProtoDecorateEpisodeItem;
        showDecorateRequest$ProtoDecorateEpisodeItem.makeImmutable();
    }

    private ShowDecorateRequest$ProtoDecorateEpisodeItem() {
    }

    public static x<ShowDecorateRequest$ProtoDecorateEpisodeItem> parser() {
        return s.getParserForType();
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
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowDecorateRequest$ProtoDecorateEpisodeItem showDecorateRequest$ProtoDecorateEpisodeItem = (ShowDecorateRequest$ProtoDecorateEpisodeItem) obj2;
                this.b = (EpisodeMetadata$ProtoEpisodeMetadata) hVar.i(this.b, showDecorateRequest$ProtoDecorateEpisodeItem.b);
                this.c = (EpisodeState$ProtoEpisodeCollectionState) hVar.i(this.c, showDecorateRequest$ProtoDecorateEpisodeItem.c);
                this.f = (EpisodeState$ProtoEpisodeOfflineState) hVar.i(this.f, showDecorateRequest$ProtoDecorateEpisodeItem.f);
                this.n = (EpisodeState$ProtoEpisodePlayState) hVar.i(this.n, showDecorateRequest$ProtoDecorateEpisodeItem.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((showDecorateRequest$ProtoDecorateEpisodeItem.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, showDecorateRequest$ProtoDecorateEpisodeItem.o);
                this.p = (Podcastextensions$PodcastHtmlDescription) hVar.i(this.p, showDecorateRequest$ProtoDecorateEpisodeItem.p);
                this.q = (PodcastQuotes) hVar.i(this.q, showDecorateRequest$ProtoDecorateEpisodeItem.q);
                this.r = (EpisodeTranscriptsMetadata) hVar.i(this.r, showDecorateRequest$ProtoDecorateEpisodeItem.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showDecorateRequest$ProtoDecorateEpisodeItem.a;
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
                            } else if (B == 58) {
                                Podcastextensions$PodcastHtmlDescription.a aVar5 = (this.a & 32) == 32 ? (Podcastextensions$PodcastHtmlDescription.a) this.p.toBuilder() : null;
                                Podcastextensions$PodcastHtmlDescription podcastextensions$PodcastHtmlDescription = (Podcastextensions$PodcastHtmlDescription) gVar.o(Podcastextensions$PodcastHtmlDescription.parser(), kVar);
                                this.p = podcastextensions$PodcastHtmlDescription;
                                if (aVar5 != null) {
                                    aVar5.mergeFrom((Podcastextensions$PodcastHtmlDescription.a) podcastextensions$PodcastHtmlDescription);
                                    this.p = (Podcastextensions$PodcastHtmlDescription) aVar5.buildPartial();
                                }
                                this.a |= 32;
                            } else if (B == 66) {
                                PodcastQuotes.b bVar = (this.a & 64) == 64 ? (PodcastQuotes.b) this.q.toBuilder() : null;
                                PodcastQuotes podcastQuotes = (PodcastQuotes) gVar.o(PodcastQuotes.parser(), kVar);
                                this.q = podcastQuotes;
                                if (bVar != null) {
                                    bVar.mergeFrom((PodcastQuotes.b) podcastQuotes);
                                    this.q = (PodcastQuotes) bVar.buildPartial();
                                }
                                this.a |= 64;
                            } else if (B == 74) {
                                EpisodeTranscriptsMetadata.b bVar2 = (this.a & 128) == 128 ? (EpisodeTranscriptsMetadata.b) this.r.toBuilder() : null;
                                EpisodeTranscriptsMetadata episodeTranscriptsMetadata = (EpisodeTranscriptsMetadata) gVar.o(EpisodeTranscriptsMetadata.parser(), kVar);
                                this.r = episodeTranscriptsMetadata;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((EpisodeTranscriptsMetadata.b) episodeTranscriptsMetadata);
                                    this.r = (EpisodeTranscriptsMetadata) bVar2.buildPartial();
                                }
                                this.a |= 128;
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
                return new ShowDecorateRequest$ProtoDecorateEpisodeItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (ShowDecorateRequest$ProtoDecorateEpisodeItem.class) {
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
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.n(7, m());
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.n(8, i());
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.n(9, l());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public EpisodeState$ProtoEpisodePlayState h() {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = this.n;
        return episodeState$ProtoEpisodePlayState == null ? EpisodeState$ProtoEpisodePlayState.h() : episodeState$ProtoEpisodePlayState;
    }

    public PodcastQuotes i() {
        PodcastQuotes podcastQuotes = this.q;
        return podcastQuotes == null ? PodcastQuotes.h() : podcastQuotes;
    }

    public boolean j() {
        return (this.a & 2) == 2;
    }

    public EpisodeMetadata$ProtoEpisodeMetadata k() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.b;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.i() : episodeMetadata$ProtoEpisodeMetadata;
    }

    public EpisodeTranscriptsMetadata l() {
        EpisodeTranscriptsMetadata episodeTranscriptsMetadata = this.r;
        return episodeTranscriptsMetadata == null ? EpisodeTranscriptsMetadata.h() : episodeTranscriptsMetadata;
    }

    public Podcastextensions$PodcastHtmlDescription m() {
        Podcastextensions$PodcastHtmlDescription podcastextensions$PodcastHtmlDescription = this.p;
        return podcastextensions$PodcastHtmlDescription == null ? Podcastextensions$PodcastHtmlDescription.h() : podcastextensions$PodcastHtmlDescription;
    }

    public String n() {
        return this.o;
    }

    public boolean o() {
        return (this.a & 8) == 8;
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
        if ((this.a & 32) == 32) {
            codedOutputStream.M(7, m());
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.M(8, i());
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.M(9, l());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
