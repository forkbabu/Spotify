package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EpisodeState$ProtoEpisodeCollectionState extends GeneratedMessageLite<EpisodeState$ProtoEpisodeCollectionState, a> implements Object {
    private static final EpisodeState$ProtoEpisodeCollectionState n;
    private static volatile x<EpisodeState$ProtoEpisodeCollectionState> o;
    private int a;
    private boolean b;
    private boolean c;
    private boolean f;

    public static final class a extends GeneratedMessageLite.b<EpisodeState$ProtoEpisodeCollectionState, a> implements Object {
        private a() {
            super(EpisodeState$ProtoEpisodeCollectionState.n);
        }
    }

    static {
        EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = new EpisodeState$ProtoEpisodeCollectionState();
        n = episodeState$ProtoEpisodeCollectionState;
        episodeState$ProtoEpisodeCollectionState.makeImmutable();
    }

    private EpisodeState$ProtoEpisodeCollectionState() {
    }

    public static EpisodeState$ProtoEpisodeCollectionState h() {
        return n;
    }

    public static x<EpisodeState$ProtoEpisodeCollectionState> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = (EpisodeState$ProtoEpisodeCollectionState) obj2;
                this.b = hVar.f((this.a & 1) == 1, this.b, (episodeState$ProtoEpisodeCollectionState.a & 1) == 1, episodeState$ProtoEpisodeCollectionState.b);
                this.c = hVar.f((this.a & 2) == 2, this.c, (episodeState$ProtoEpisodeCollectionState.a & 2) == 2, episodeState$ProtoEpisodeCollectionState.c);
                boolean z2 = (this.a & 4) == 4;
                boolean z3 = this.f;
                if ((episodeState$ProtoEpisodeCollectionState.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.f(z2, z3, z, episodeState$ProtoEpisodeCollectionState.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= episodeState$ProtoEpisodeCollectionState.a;
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
                                this.b = gVar.h();
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.h();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.h();
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
                return new EpisodeState$ProtoEpisodeCollectionState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (EpisodeState$ProtoEpisodeCollectionState.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    public boolean getIsInListenLater() {
        return this.f;
    }

    public boolean getIsNew() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.d(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.d(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.d(3, this.f);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public boolean i() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.A(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.A(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.A(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
