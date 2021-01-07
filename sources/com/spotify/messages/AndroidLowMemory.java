package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class AndroidLowMemory extends GeneratedMessageLite<AndroidLowMemory, b> implements Object {
    private static final AndroidLowMemory c;
    private static volatile x<AndroidLowMemory> f;
    private int a;
    private int b;

    public static final class b extends GeneratedMessageLite.b<AndroidLowMemory, b> implements Object {
        public b m(int i) {
            copyOnWrite();
            AndroidLowMemory.h((AndroidLowMemory) this.instance, i);
            return this;
        }

        private b() {
            super(AndroidLowMemory.c);
        }
    }

    static {
        AndroidLowMemory androidLowMemory = new AndroidLowMemory();
        c = androidLowMemory;
        androidLowMemory.makeImmutable();
    }

    private AndroidLowMemory() {
    }

    static void h(AndroidLowMemory androidLowMemory, int i) {
        androidLowMemory.a |= 1;
        androidLowMemory.b = i;
    }

    public static b i() {
        return (b) c.toBuilder();
    }

    public static x<AndroidLowMemory> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                AndroidLowMemory androidLowMemory = (AndroidLowMemory) obj2;
                boolean z2 = (this.a & 1) == 1;
                int i = this.b;
                if ((androidLowMemory.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, androidLowMemory.b);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= androidLowMemory.a;
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
                return new AndroidLowMemory();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (AndroidLowMemory.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.j(1, this.b);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.K(1, this.b);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
