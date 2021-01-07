package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.cosmos.util.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.proto.ShowDecorationPolicy;
import com.spotify.playlist.proto.UserDecorationPolicy;
import java.io.IOException;

public final class PlaylistEpisodeDecorationPolicy extends GeneratedMessageLite<PlaylistEpisodeDecorationPolicy, b> implements Object {
    private static final PlaylistEpisodeDecorationPolicy s;
    private static volatile x<PlaylistEpisodeDecorationPolicy> t;
    private EpisodeDecorationPolicy a;
    private boolean b;
    private boolean c;
    private boolean f;
    private EpisodeCollectionDecorationPolicy n;
    private EpisodeSyncDecorationPolicy o;
    private EpisodePlayedStateDecorationPolicy p;
    private UserDecorationPolicy q;
    private ShowDecorationPolicy r;

    public static final class b extends GeneratedMessageLite.b<PlaylistEpisodeDecorationPolicy, b> implements Object {
        private b() {
            super(PlaylistEpisodeDecorationPolicy.s);
        }
    }

    static {
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = new PlaylistEpisodeDecorationPolicy();
        s = playlistEpisodeDecorationPolicy;
        playlistEpisodeDecorationPolicy.makeImmutable();
    }

    private PlaylistEpisodeDecorationPolicy() {
    }

    public static x<PlaylistEpisodeDecorationPolicy> parser() {
        return s.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) obj2;
                this.a = (EpisodeDecorationPolicy) hVar.i(this.a, playlistEpisodeDecorationPolicy.a);
                boolean z = this.b;
                boolean z2 = playlistEpisodeDecorationPolicy.b;
                this.b = hVar.f(z, z, z2, z2);
                boolean z3 = this.c;
                boolean z4 = playlistEpisodeDecorationPolicy.c;
                this.c = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.f;
                boolean z6 = playlistEpisodeDecorationPolicy.f;
                this.f = hVar.f(z5, z5, z6, z6);
                this.n = (EpisodeCollectionDecorationPolicy) hVar.i(this.n, playlistEpisodeDecorationPolicy.n);
                this.o = (EpisodeSyncDecorationPolicy) hVar.i(this.o, playlistEpisodeDecorationPolicy.o);
                this.p = (EpisodePlayedStateDecorationPolicy) hVar.i(this.p, playlistEpisodeDecorationPolicy.p);
                this.q = (UserDecorationPolicy) hVar.i(this.q, playlistEpisodeDecorationPolicy.q);
                this.r = (ShowDecorationPolicy) hVar.i(this.r, playlistEpisodeDecorationPolicy.r);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z7 = false;
                while (!z7) {
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
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (B == 24) {
                                this.c = gVar.h();
                            } else if (B == 32) {
                                this.f = gVar.h();
                            } else if (B == 42) {
                                EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = this.n;
                                EpisodeCollectionDecorationPolicy.Builder builder2 = episodeCollectionDecorationPolicy != null ? (EpisodeCollectionDecorationPolicy.Builder) episodeCollectionDecorationPolicy.toBuilder() : null;
                                EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy2 = (EpisodeCollectionDecorationPolicy) gVar.o(EpisodeCollectionDecorationPolicy.parser(), kVar);
                                this.n = episodeCollectionDecorationPolicy2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((EpisodeCollectionDecorationPolicy.Builder) episodeCollectionDecorationPolicy2);
                                    this.n = (EpisodeCollectionDecorationPolicy) builder2.buildPartial();
                                }
                            } else if (B == 50) {
                                EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy = this.o;
                                EpisodeSyncDecorationPolicy.Builder builder3 = episodeSyncDecorationPolicy != null ? (EpisodeSyncDecorationPolicy.Builder) episodeSyncDecorationPolicy.toBuilder() : null;
                                EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy2 = (EpisodeSyncDecorationPolicy) gVar.o(EpisodeSyncDecorationPolicy.parser(), kVar);
                                this.o = episodeSyncDecorationPolicy2;
                                if (builder3 != null) {
                                    builder3.mergeFrom((EpisodeSyncDecorationPolicy.Builder) episodeSyncDecorationPolicy2);
                                    this.o = (EpisodeSyncDecorationPolicy) builder3.buildPartial();
                                }
                            } else if (B == 58) {
                                EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy = this.p;
                                EpisodePlayedStateDecorationPolicy.Builder builder4 = episodePlayedStateDecorationPolicy != null ? (EpisodePlayedStateDecorationPolicy.Builder) episodePlayedStateDecorationPolicy.toBuilder() : null;
                                EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy2 = (EpisodePlayedStateDecorationPolicy) gVar.o(EpisodePlayedStateDecorationPolicy.parser(), kVar);
                                this.p = episodePlayedStateDecorationPolicy2;
                                if (builder4 != null) {
                                    builder4.mergeFrom((EpisodePlayedStateDecorationPolicy.Builder) episodePlayedStateDecorationPolicy2);
                                    this.p = (EpisodePlayedStateDecorationPolicy) builder4.buildPartial();
                                }
                            } else if (B == 66) {
                                UserDecorationPolicy userDecorationPolicy = this.q;
                                UserDecorationPolicy.b bVar = userDecorationPolicy != null ? (UserDecorationPolicy.b) userDecorationPolicy.toBuilder() : null;
                                UserDecorationPolicy userDecorationPolicy2 = (UserDecorationPolicy) gVar.o(UserDecorationPolicy.parser(), kVar);
                                this.q = userDecorationPolicy2;
                                if (bVar != null) {
                                    bVar.mergeFrom((UserDecorationPolicy.b) userDecorationPolicy2);
                                    this.q = (UserDecorationPolicy) bVar.buildPartial();
                                }
                            } else if (B == 74) {
                                ShowDecorationPolicy showDecorationPolicy = this.r;
                                ShowDecorationPolicy.Builder builder5 = showDecorationPolicy != null ? (ShowDecorationPolicy.Builder) showDecorationPolicy.toBuilder() : null;
                                ShowDecorationPolicy showDecorationPolicy2 = (ShowDecorationPolicy) gVar.o(ShowDecorationPolicy.parser(), kVar);
                                this.r = showDecorationPolicy2;
                                if (builder5 != null) {
                                    builder5.mergeFrom((ShowDecorationPolicy.Builder) showDecorationPolicy2);
                                    this.r = (ShowDecorationPolicy) builder5.buildPartial();
                                }
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z7 = true;
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
                return new PlaylistEpisodeDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (PlaylistEpisodeDecorationPolicy.class) {
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
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        boolean z2 = this.c;
        if (z2) {
            i2 += CodedOutputStream.d(3, z2);
        }
        boolean z3 = this.f;
        if (z3) {
            i2 += CodedOutputStream.d(4, z3);
        }
        EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = this.n;
        if (episodeCollectionDecorationPolicy != null) {
            i2 += CodedOutputStream.n(5, episodeCollectionDecorationPolicy);
        }
        EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy = this.o;
        if (episodeSyncDecorationPolicy != null) {
            i2 += CodedOutputStream.n(6, episodeSyncDecorationPolicy);
        }
        EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy = this.p;
        if (episodePlayedStateDecorationPolicy != null) {
            i2 += CodedOutputStream.n(7, episodePlayedStateDecorationPolicy);
        }
        UserDecorationPolicy userDecorationPolicy = this.q;
        if (userDecorationPolicy != null) {
            i2 += CodedOutputStream.n(8, userDecorationPolicy);
        }
        ShowDecorationPolicy showDecorationPolicy = this.r;
        if (showDecorationPolicy != null) {
            i2 += CodedOutputStream.n(9, showDecorationPolicy);
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
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(2, z);
        }
        boolean z2 = this.c;
        if (z2) {
            codedOutputStream.A(3, z2);
        }
        boolean z3 = this.f;
        if (z3) {
            codedOutputStream.A(4, z3);
        }
        EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = this.n;
        if (episodeCollectionDecorationPolicy != null) {
            codedOutputStream.M(5, episodeCollectionDecorationPolicy);
        }
        EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy = this.o;
        if (episodeSyncDecorationPolicy != null) {
            codedOutputStream.M(6, episodeSyncDecorationPolicy);
        }
        EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy = this.p;
        if (episodePlayedStateDecorationPolicy != null) {
            codedOutputStream.M(7, episodePlayedStateDecorationPolicy);
        }
        UserDecorationPolicy userDecorationPolicy = this.q;
        if (userDecorationPolicy != null) {
            codedOutputStream.M(8, userDecorationPolicy);
        }
        ShowDecorationPolicy showDecorationPolicy = this.r;
        if (showDecorationPolicy != null) {
            codedOutputStream.M(9, showDecorationPolicy);
        }
    }
}
