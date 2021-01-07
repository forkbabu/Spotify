package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaylistAllowsDecorationPolicy extends GeneratedMessageLite<PlaylistAllowsDecorationPolicy, b> implements Object {
    private static final PlaylistAllowsDecorationPolicy c;
    private static volatile x<PlaylistAllowsDecorationPolicy> f;
    private boolean a;
    private boolean b;

    public static final class b extends GeneratedMessageLite.b<PlaylistAllowsDecorationPolicy, b> implements Object {
        private b() {
            super(PlaylistAllowsDecorationPolicy.c);
        }
    }

    static {
        PlaylistAllowsDecorationPolicy playlistAllowsDecorationPolicy = new PlaylistAllowsDecorationPolicy();
        c = playlistAllowsDecorationPolicy;
        playlistAllowsDecorationPolicy.makeImmutable();
    }

    private PlaylistAllowsDecorationPolicy() {
    }

    public static x<PlaylistAllowsDecorationPolicy> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistAllowsDecorationPolicy playlistAllowsDecorationPolicy = (PlaylistAllowsDecorationPolicy) obj2;
                boolean z = this.a;
                boolean z2 = playlistAllowsDecorationPolicy.a;
                this.a = hVar.f(z, z, z2, z2);
                boolean z3 = this.b;
                boolean z4 = playlistAllowsDecorationPolicy.b;
                this.b = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.h();
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z5 = true;
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
                return new PlaylistAllowsDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (PlaylistAllowsDecorationPolicy.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.a;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.b;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.a;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.b;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
    }
}
