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

public final class ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem extends GeneratedMessageLite<ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem, a> implements e {
    private static final ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem p;
    private static volatile x<ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem> q;
    private int a;
    private String b = "";
    private EpisodeMetadata$ProtoEpisodeMetadata c;
    private EpisodeState$ProtoEpisodeCollectionState f;
    private EpisodeState$ProtoEpisodeOfflineState n;
    private EpisodeState$ProtoEpisodePlayState o;

    public static final class a extends GeneratedMessageLite.b<ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem, a> implements e {
        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public EpisodeState$ProtoEpisodeOfflineState b() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).b();
        }

        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public boolean c() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).c();
        }

        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public boolean d() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).d();
        }

        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public boolean e() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).e();
        }

        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public EpisodeState$ProtoEpisodeCollectionState f() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).f();
        }

        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public EpisodeState$ProtoEpisodePlayState g() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).g();
        }

        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public String getHeader() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).getHeader();
        }

        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public boolean j() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).j();
        }

        @Override // com.spotify.mobile.android.spotlets.show.proto.e
        public EpisodeMetadata$ProtoEpisodeMetadata k() {
            return ((ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) this.instance).k();
        }

        private a() {
            super(ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem.p);
        }
    }

    static {
        ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem listenLaterCosmosResponse$ProtoListenLaterEpisodeItem = new ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem();
        p = listenLaterCosmosResponse$ProtoListenLaterEpisodeItem;
        listenLaterCosmosResponse$ProtoListenLaterEpisodeItem.makeImmutable();
    }

    private ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem() {
    }

    public static x<ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem> parser() {
        return p.getParserForType();
    }

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
    public EpisodeState$ProtoEpisodeOfflineState b() {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = this.n;
        return episodeState$ProtoEpisodeOfflineState == null ? EpisodeState$ProtoEpisodeOfflineState.h() : episodeState$ProtoEpisodeOfflineState;
    }

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
    public boolean c() {
        return (this.a & 16) == 16;
    }

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
    public boolean d() {
        return (this.a & 2) == 2;
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
                ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem listenLaterCosmosResponse$ProtoListenLaterEpisodeItem = (ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem) obj2;
                boolean z2 = (this.a & 1) == 1;
                String str = this.b;
                if ((listenLaterCosmosResponse$ProtoListenLaterEpisodeItem.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.n(z2, str, z, listenLaterCosmosResponse$ProtoListenLaterEpisodeItem.b);
                this.c = (EpisodeMetadata$ProtoEpisodeMetadata) hVar.i(this.c, listenLaterCosmosResponse$ProtoListenLaterEpisodeItem.c);
                this.f = (EpisodeState$ProtoEpisodeCollectionState) hVar.i(this.f, listenLaterCosmosResponse$ProtoListenLaterEpisodeItem.f);
                this.n = (EpisodeState$ProtoEpisodeOfflineState) hVar.i(this.n, listenLaterCosmosResponse$ProtoListenLaterEpisodeItem.n);
                this.o = (EpisodeState$ProtoEpisodePlayState) hVar.i(this.o, listenLaterCosmosResponse$ProtoListenLaterEpisodeItem.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= listenLaterCosmosResponse$ProtoListenLaterEpisodeItem.a;
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
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
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
                return new ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (ListenLaterCosmosResponse$ProtoListenLaterEpisodeItem.class) {
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

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
    public boolean e() {
        return (this.a & 8) == 8;
    }

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
    public EpisodeState$ProtoEpisodeCollectionState f() {
        EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = this.f;
        return episodeState$ProtoEpisodeCollectionState == null ? EpisodeState$ProtoEpisodeCollectionState.h() : episodeState$ProtoEpisodeCollectionState;
    }

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
    public EpisodeState$ProtoEpisodePlayState g() {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = this.o;
        return episodeState$ProtoEpisodePlayState == null ? EpisodeState$ProtoEpisodePlayState.h() : episodeState$ProtoEpisodePlayState;
    }

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
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
            i2 += CodedOutputStream.n(5, g());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
    public boolean j() {
        return (this.a & 4) == 4;
    }

    @Override // com.spotify.mobile.android.spotlets.show.proto.e
    public EpisodeMetadata$ProtoEpisodeMetadata k() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.c;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.i() : episodeMetadata$ProtoEpisodeMetadata;
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
            codedOutputStream.M(5, g());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
