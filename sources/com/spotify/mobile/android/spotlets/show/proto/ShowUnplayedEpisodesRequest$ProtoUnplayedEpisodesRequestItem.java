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

public final class ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem extends GeneratedMessageLite<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem, a> implements Object {
    private static final ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem p;
    private static volatile x<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem> q;
    private int a;
    private String b = "";
    private EpisodeMetadata$ProtoEpisodeMetadata c;
    private EpisodeState$ProtoEpisodeCollectionState f;
    private EpisodeState$ProtoEpisodeOfflineState n;
    private EpisodeState$ProtoEpisodePlayState o;

    public static final class a extends GeneratedMessageLite.b<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem, a> implements Object {
        private a() {
            super(ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.p);
        }
    }

    static {
        ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem = new ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem();
        p = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem;
        showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.makeImmutable();
    }

    private ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem() {
    }

    public static x<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem> parser() {
        return p.getParserForType();
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
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem = (ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem) obj2;
                this.b = hVar.n(l(), this.b, showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.l(), showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.b);
                this.c = (EpisodeMetadata$ProtoEpisodeMetadata) hVar.i(this.c, showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.c);
                this.f = (EpisodeState$ProtoEpisodeCollectionState) hVar.i(this.f, showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.f);
                this.n = (EpisodeState$ProtoEpisodeOfflineState) hVar.i(this.n, showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.n);
                this.o = (EpisodeState$ProtoEpisodePlayState) hVar.i(this.o, showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.a;
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
                return new ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.class) {
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
            i2 += CodedOutputStream.n(5, h());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public EpisodeState$ProtoEpisodePlayState h() {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = this.o;
        return episodeState$ProtoEpisodePlayState == null ? EpisodeState$ProtoEpisodePlayState.h() : episodeState$ProtoEpisodePlayState;
    }

    public boolean i() {
        return (this.a & 16) == 16;
    }

    public boolean j() {
        return (this.a & 4) == 4;
    }

    public EpisodeMetadata$ProtoEpisodeMetadata k() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.c;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.i() : episodeMetadata$ProtoEpisodeMetadata;
    }

    public boolean l() {
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
            codedOutputStream.M(5, h());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
