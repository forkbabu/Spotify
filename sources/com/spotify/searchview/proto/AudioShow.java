package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class AudioShow extends GeneratedMessageLite<AudioShow, b> implements Object {
    private static final AudioShow c;
    private static volatile x<AudioShow> f;
    private String a = "";
    private boolean b;

    public static final class b extends GeneratedMessageLite.b<AudioShow, b> implements Object {
        private b() {
            super(AudioShow.c);
        }
    }

    static {
        AudioShow audioShow = new AudioShow();
        c = audioShow;
        audioShow.makeImmutable();
    }

    private AudioShow() {
    }

    public static AudioShow h() {
        return c;
    }

    public static x<AudioShow> parser() {
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
                AudioShow audioShow = (AudioShow) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, true ^ audioShow.a.isEmpty(), audioShow.a);
                boolean z = this.b;
                boolean z2 = audioShow.b;
                this.b = hVar.f(z, z, z2, z2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 24) {
                                this.b = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
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
                return new AudioShow();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (AudioShow.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(3, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean i() {
        return this.b;
    }

    public String l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(3, z);
        }
    }
}
