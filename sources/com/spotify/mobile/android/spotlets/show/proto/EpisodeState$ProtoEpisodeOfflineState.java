package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EpisodeState$ProtoEpisodeOfflineState extends GeneratedMessageLite<EpisodeState$ProtoEpisodeOfflineState, a> implements Object {
    private static final EpisodeState$ProtoEpisodeOfflineState f;
    private static volatile x<EpisodeState$ProtoEpisodeOfflineState> n;
    private int a;
    private String b = "";
    private int c;

    public static final class a extends GeneratedMessageLite.b<EpisodeState$ProtoEpisodeOfflineState, a> implements Object {
        private a() {
            super(EpisodeState$ProtoEpisodeOfflineState.f);
        }
    }

    static {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = new EpisodeState$ProtoEpisodeOfflineState();
        f = episodeState$ProtoEpisodeOfflineState;
        episodeState$ProtoEpisodeOfflineState.makeImmutable();
    }

    private EpisodeState$ProtoEpisodeOfflineState() {
    }

    public static EpisodeState$ProtoEpisodeOfflineState h() {
        return f;
    }

    public static x<EpisodeState$ProtoEpisodeOfflineState> parser() {
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
                EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = (EpisodeState$ProtoEpisodeOfflineState) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (episodeState$ProtoEpisodeOfflineState.a & 1) == 1, episodeState$ProtoEpisodeOfflineState.b);
                boolean z2 = (this.a & 2) == 2;
                int i = this.c;
                if ((episodeState$ProtoEpisodeOfflineState.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, episodeState$ProtoEpisodeOfflineState.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= episodeState$ProtoEpisodeOfflineState.a;
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
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
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
                return new EpisodeState$ProtoEpisodeOfflineState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EpisodeState$ProtoEpisodeOfflineState.class) {
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
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String i() {
        return this.b;
    }

    public int l() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
