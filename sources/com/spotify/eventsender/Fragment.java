package com.spotify.eventsender;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Fragment extends GeneratedMessageLite<Fragment, b> implements Object {
    private static final Fragment f;
    private static volatile x<Fragment> n;
    private int a;
    private String b = "";
    private ByteString c = ByteString.a;

    public static final class b extends GeneratedMessageLite.b<Fragment, b> implements Object {
        public b m(ByteString byteString) {
            copyOnWrite();
            Fragment.i((Fragment) this.instance, byteString);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            Fragment.h((Fragment) this.instance, str);
            return this;
        }

        private b() {
            super(Fragment.f);
        }
    }

    static {
        Fragment fragment = new Fragment();
        f = fragment;
        fragment.makeImmutable();
    }

    private Fragment() {
    }

    static void h(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        fragment.a |= 1;
        fragment.b = str;
    }

    static void i(Fragment fragment, ByteString byteString) {
        fragment.getClass();
        byteString.getClass();
        fragment.a |= 2;
        fragment.c = byteString;
    }

    public static b n() {
        return (b) f.toBuilder();
    }

    public static x<Fragment> parser() {
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
                Fragment fragment = (Fragment) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (fragment.a & 1) == 1, fragment.b);
                boolean z2 = (this.a & 2) == 2;
                ByteString byteString = this.c;
                if ((fragment.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.r(z2, byteString, z, fragment.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= fragment.a;
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
                            } else if (B == 18) {
                                this.a |= 2;
                                this.c = gVar.i();
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
                return new Fragment();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Fragment.class) {
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
            i2 += CodedOutputStream.e(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ByteString l() {
        return this.c;
    }

    public String m() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.C(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
