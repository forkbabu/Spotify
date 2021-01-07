package com.spotify.pses.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Screen extends GeneratedMessageLite<Screen, b> implements Object {
    private static final Screen f;
    private static volatile x<Screen> n;
    private int a;
    private int b;
    private float c;

    public static final class b extends GeneratedMessageLite.b<Screen, b> implements Object {
        public b m(int i) {
            copyOnWrite();
            Screen.i((Screen) this.instance, i);
            return this;
        }

        public b n(float f) {
            copyOnWrite();
            Screen.l((Screen) this.instance, f);
            return this;
        }

        public b o(int i) {
            copyOnWrite();
            Screen.h((Screen) this.instance, i);
            return this;
        }

        private b() {
            super(Screen.f);
        }
    }

    static {
        Screen screen = new Screen();
        f = screen;
        screen.makeImmutable();
    }

    private Screen() {
    }

    static void h(Screen screen, int i) {
        screen.a = i;
    }

    static void i(Screen screen, int i) {
        screen.b = i;
    }

    static void l(Screen screen, float f2) {
        screen.c = f2;
    }

    public static b m() {
        return (b) f.toBuilder();
    }

    public static x<Screen> parser() {
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
                Screen screen = (Screen) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = screen.a;
                this.a = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.b;
                boolean z3 = i3 != 0;
                int i4 = screen.b;
                this.b = hVar.m(z3, i3, i4 != 0, i4);
                float f2 = this.c;
                boolean z4 = f2 != 0.0f;
                float f3 = screen.c;
                if (f3 != 0.0f) {
                    z = true;
                }
                this.c = hVar.o(z4, f2, z, f3);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
                            } else if (B == 16) {
                                this.b = gVar.u();
                            } else if (B == 37) {
                                this.c = gVar.l();
                            } else if (!gVar.F(B)) {
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
                return new Screen();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Screen.class) {
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
        int i3 = this.a;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.j(1, i3);
        }
        int i4 = this.b;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(2, i4);
        }
        float f2 = this.c;
        if (f2 != 0.0f) {
            i2 += CodedOutputStream.i(4, f2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        int i = this.a;
        if (i != 0) {
            codedOutputStream.K(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputStream.K(2, i2);
        }
        float f2 = this.c;
        if (f2 != 0.0f) {
            codedOutputStream.J(4, f2);
        }
    }
}
