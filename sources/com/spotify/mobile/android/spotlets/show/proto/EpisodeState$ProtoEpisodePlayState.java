package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import java.io.IOException;

public final class EpisodeState$ProtoEpisodePlayState extends GeneratedMessageLite<EpisodeState$ProtoEpisodePlayState, a> implements Object {
    private static final EpisodeState$ProtoEpisodePlayState p;
    private static volatile x<EpisodeState$ProtoEpisodePlayState> q;
    private int a;
    private int b;
    private boolean c;
    private boolean f;
    private long n;
    private int o;

    public static final class a extends GeneratedMessageLite.b<EpisodeState$ProtoEpisodePlayState, a> implements Object {
        private a() {
            super(EpisodeState$ProtoEpisodePlayState.p);
        }
    }

    static {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = new EpisodeState$ProtoEpisodePlayState();
        p = episodeState$ProtoEpisodePlayState;
        episodeState$ProtoEpisodePlayState.makeImmutable();
    }

    private EpisodeState$ProtoEpisodePlayState() {
    }

    public static EpisodeState$ProtoEpisodePlayState h() {
        return p;
    }

    public static x<EpisodeState$ProtoEpisodePlayState> parser() {
        return p.getParserForType();
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
                EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = (EpisodeState$ProtoEpisodePlayState) obj2;
                this.b = hVar.m(o(), this.b, episodeState$ProtoEpisodePlayState.o(), episodeState$ProtoEpisodePlayState.b);
                this.c = hVar.f((this.a & 2) == 2, this.c, (episodeState$ProtoEpisodePlayState.a & 2) == 2, episodeState$ProtoEpisodePlayState.c);
                this.f = hVar.f((this.a & 4) == 4, this.f, (episodeState$ProtoEpisodePlayState.a & 4) == 4, episodeState$ProtoEpisodePlayState.f);
                this.n = hVar.s((this.a & 8) == 8, this.n, (episodeState$ProtoEpisodePlayState.a & 8) == 8, episodeState$ProtoEpisodePlayState.n);
                boolean z2 = (this.a & 16) == 16;
                int i = this.o;
                if ((episodeState$ProtoEpisodePlayState.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.m(z2, i, z, episodeState$ProtoEpisodePlayState.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= episodeState$ProtoEpisodePlayState.a;
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
                                this.a |= 1;
                                this.b = gVar.u();
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.h();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.h();
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.w();
                            } else if (B == 40) {
                                int u = gVar.u();
                                if (PlayabilityRestriction.forNumber(u) == null) {
                                    super.mergeVarintField(5, u);
                                } else {
                                    this.a |= 16;
                                    this.o = u;
                                }
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
                return new EpisodeState$ProtoEpisodePlayState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (EpisodeState$ProtoEpisodePlayState.class) {
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

    public boolean getIsPlayed() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.s(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.d(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.d(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.u(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.h(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public boolean i() {
        return this.c;
    }

    public long l() {
        return this.n;
    }

    public PlayabilityRestriction m() {
        PlayabilityRestriction forNumber = PlayabilityRestriction.forNumber(this.o);
        return forNumber == null ? PlayabilityRestriction.UNKNOWN : forNumber;
    }

    public int n() {
        return this.b;
    }

    public boolean o() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.S(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.A(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.A(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.U(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.K(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
