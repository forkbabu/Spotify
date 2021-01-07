package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import java.io.IOException;

public final class TrackState$ProtoTrackPlayState extends GeneratedMessageLite<TrackState$ProtoTrackPlayState, a> implements Object {
    private static final TrackState$ProtoTrackPlayState f;
    private static volatile x<TrackState$ProtoTrackPlayState> n;
    private int a;
    private boolean b;
    private int c;

    public static final class a extends GeneratedMessageLite.b<TrackState$ProtoTrackPlayState, a> implements Object {
        private a() {
            super(TrackState$ProtoTrackPlayState.f);
        }
    }

    static {
        TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = new TrackState$ProtoTrackPlayState();
        f = trackState$ProtoTrackPlayState;
        trackState$ProtoTrackPlayState.makeImmutable();
    }

    private TrackState$ProtoTrackPlayState() {
    }

    public static TrackState$ProtoTrackPlayState h() {
        return f;
    }

    public static x<TrackState$ProtoTrackPlayState> parser() {
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
                TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = (TrackState$ProtoTrackPlayState) obj2;
                this.b = hVar.f(m(), this.b, trackState$ProtoTrackPlayState.m(), trackState$ProtoTrackPlayState.b);
                boolean z2 = (this.a & 2) == 2;
                int i = this.c;
                if ((trackState$ProtoTrackPlayState.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, trackState$ProtoTrackPlayState.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= trackState$ProtoTrackPlayState.a;
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
                                int u = gVar.u();
                                if (PlayabilityRestriction.forNumber(u) == null) {
                                    super.mergeVarintField(2, u);
                                } else {
                                    this.a |= 2;
                                    this.c = u;
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
                return new TrackState$ProtoTrackPlayState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (TrackState$ProtoTrackPlayState.class) {
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
            i2 = 0 + CodedOutputStream.d(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.h(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public boolean i() {
        return this.b;
    }

    public PlayabilityRestriction l() {
        PlayabilityRestriction forNumber = PlayabilityRestriction.forNumber(this.c);
        return forNumber == null ? PlayabilityRestriction.UNKNOWN : forNumber;
    }

    public boolean m() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.A(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.K(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
