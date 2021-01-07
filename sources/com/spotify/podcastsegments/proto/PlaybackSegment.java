package com.spotify.podcastsegments.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaybackSegment extends GeneratedMessageLite<PlaybackSegment, b> implements Object {
    private static final PlaybackSegment t;
    private static volatile x<PlaybackSegment> u;
    private String a = "";
    private int b;
    private int c;
    private int f;
    private int n;
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private boolean s;

    public static final class b extends GeneratedMessageLite.b<PlaybackSegment, b> implements Object {
        private b() {
            super(PlaybackSegment.t);
        }
    }

    static {
        PlaybackSegment playbackSegment = new PlaybackSegment();
        t = playbackSegment;
        playbackSegment.makeImmutable();
    }

    private PlaybackSegment() {
    }

    public static x<PlaybackSegment> parser() {
        return t.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return t;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaybackSegment playbackSegment = (PlaybackSegment) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !playbackSegment.a.isEmpty(), playbackSegment.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = playbackSegment.b;
                this.b = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.c;
                boolean z3 = i3 != 0;
                int i4 = playbackSegment.c;
                this.c = hVar.m(z3, i3, i4 != 0, i4);
                int i5 = this.f;
                boolean z4 = i5 != 0;
                int i6 = playbackSegment.f;
                this.f = hVar.m(z4, i5, i6 != 0, i6);
                int i7 = this.n;
                boolean z5 = i7 != 0;
                int i8 = playbackSegment.n;
                if (i8 != 0) {
                    z = true;
                }
                this.n = hVar.m(z5, i7, z, i8);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !playbackSegment.o.isEmpty(), playbackSegment.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !playbackSegment.p.isEmpty(), playbackSegment.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !playbackSegment.q.isEmpty(), playbackSegment.q);
                this.r = hVar.n(!this.r.isEmpty(), this.r, true ^ playbackSegment.r.isEmpty(), playbackSegment.r);
                boolean z6 = this.s;
                boolean z7 = playbackSegment.s;
                this.s = hVar.f(z6, z6, z7, z7);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.a = gVar.A();
                                continue;
                            case 16:
                                this.b = gVar.u();
                                continue;
                            case 24:
                                this.c = gVar.u();
                                continue;
                            case 32:
                                this.f = gVar.u();
                                continue;
                            case 40:
                                this.n = gVar.u();
                                continue;
                            case 50:
                                this.o = gVar.A();
                                continue;
                            case 58:
                                this.p = gVar.A();
                                continue;
                            case 66:
                                this.q = gVar.A();
                                continue;
                            case 74:
                                this.r = gVar.A();
                                continue;
                            case 80:
                                this.s = gVar.h();
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
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
                return new PlaybackSegment();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (PlaybackSegment.class) {
                        if (u == null) {
                            u = new GeneratedMessageLite.c(t);
                        }
                    }
                }
                return u;
            default:
                throw new UnsupportedOperationException();
        }
        return t;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        int i3 = this.b;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(3, i4);
        }
        int i5 = this.f;
        if (i5 != 0) {
            i2 += CodedOutputStream.j(4, i5);
        }
        if (this.n != SegmentType.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.h(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        if (!this.p.isEmpty()) {
            i2 += CodedOutputStream.p(7, this.p);
        }
        if (!this.q.isEmpty()) {
            i2 += CodedOutputStream.p(8, this.q);
        }
        if (!this.r.isEmpty()) {
            i2 += CodedOutputStream.p(9, this.r);
        }
        boolean z = this.s;
        if (z) {
            i2 += CodedOutputStream.d(10, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            codedOutputStream.K(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputStream.K(4, i3);
        }
        if (this.n != SegmentType.UNKNOWN.getNumber()) {
            codedOutputStream.K(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(7, this.p);
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(8, this.q);
        }
        if (!this.r.isEmpty()) {
            codedOutputStream.P(9, this.r);
        }
        boolean z = this.s;
        if (z) {
            codedOutputStream.A(10, z);
        }
    }
}
