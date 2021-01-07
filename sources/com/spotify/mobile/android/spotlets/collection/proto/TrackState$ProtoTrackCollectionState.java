package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class TrackState$ProtoTrackCollectionState extends GeneratedMessageLite<TrackState$ProtoTrackCollectionState, a> implements Object {
    private static final TrackState$ProtoTrackCollectionState o;
    private static volatile x<TrackState$ProtoTrackCollectionState> p;
    private int a;
    private boolean b;
    private boolean c;
    private boolean f;
    private boolean n;

    public static final class a extends GeneratedMessageLite.b<TrackState$ProtoTrackCollectionState, a> implements Object {
        private a() {
            super(TrackState$ProtoTrackCollectionState.o);
        }
    }

    static {
        TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = new TrackState$ProtoTrackCollectionState();
        o = trackState$ProtoTrackCollectionState;
        trackState$ProtoTrackCollectionState.makeImmutable();
    }

    private TrackState$ProtoTrackCollectionState() {
    }

    public static TrackState$ProtoTrackCollectionState l() {
        return o;
    }

    public static x<TrackState$ProtoTrackCollectionState> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = (TrackState$ProtoTrackCollectionState) obj2;
                this.b = hVar.f((this.a & 1) == 1, this.b, (trackState$ProtoTrackCollectionState.a & 1) == 1, trackState$ProtoTrackCollectionState.b);
                this.c = hVar.f((this.a & 2) == 2, this.c, (trackState$ProtoTrackCollectionState.a & 2) == 2, trackState$ProtoTrackCollectionState.c);
                this.f = hVar.f((this.a & 4) == 4, this.f, (trackState$ProtoTrackCollectionState.a & 4) == 4, trackState$ProtoTrackCollectionState.f);
                boolean z2 = (this.a & 8) == 8;
                boolean z3 = this.n;
                if ((trackState$ProtoTrackCollectionState.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.f(z2, z3, z, trackState$ProtoTrackCollectionState.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= trackState$ProtoTrackCollectionState.a;
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
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.h();
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
                return new TrackState$ProtoTrackCollectionState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (TrackState$ProtoTrackCollectionState.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
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
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.d(4, this.n);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public boolean h() {
        return this.c;
    }

    public boolean i() {
        return this.n;
    }

    public boolean m() {
        return this.f;
    }

    public boolean n() {
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
        if ((this.a & 8) == 8) {
            codedOutputStream.A(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
