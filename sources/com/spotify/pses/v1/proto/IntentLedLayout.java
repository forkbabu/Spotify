package com.spotify.pses.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.pses.v1.proto.Authentication;
import com.spotify.pses.v1.proto.Header;
import java.io.IOException;

public final class IntentLedLayout extends GeneratedMessageLite<IntentLedLayout, b> implements Object {
    private static final IntentLedLayout f;
    private static volatile x<IntentLedLayout> n;
    private Header a;
    private String b = "";
    private Authentication c;

    public static final class b extends GeneratedMessageLite.b<IntentLedLayout, b> implements Object {
        private b() {
            super(IntentLedLayout.f);
        }
    }

    static {
        IntentLedLayout intentLedLayout = new IntentLedLayout();
        f = intentLedLayout;
        intentLedLayout.makeImmutable();
    }

    private IntentLedLayout() {
    }

    public static IntentLedLayout i() {
        return f;
    }

    public static x<IntentLedLayout> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                IntentLedLayout intentLedLayout = (IntentLedLayout) obj2;
                this.a = (Header) hVar.i(this.a, intentLedLayout.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ intentLedLayout.b.isEmpty(), intentLedLayout.b);
                this.c = (Authentication) hVar.i(this.c, intentLedLayout.c);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                Header header = this.a;
                                Header.b bVar = header != null ? (Header.b) header.toBuilder() : null;
                                Header header2 = (Header) gVar.o(Header.parser(), kVar);
                                this.a = header2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Header.b) header2);
                                    this.a = (Header) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                Authentication authentication = this.c;
                                Authentication.b bVar2 = authentication != null ? (Authentication.b) authentication.toBuilder() : null;
                                Authentication authentication2 = (Authentication) gVar.o(Authentication.parser(), kVar);
                                this.c = authentication2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Authentication.b) authentication2);
                                    this.c = (Authentication) bVar2.buildPartial();
                                }
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
                return new IntentLedLayout();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (IntentLedLayout.class) {
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
        if (this.a != null) {
            i2 = 0 + CodedOutputStream.n(1, l());
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (this.c != null) {
            i2 += CodedOutputStream.n(3, h());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Authentication h() {
        Authentication authentication = this.c;
        return authentication == null ? Authentication.m() : authentication;
    }

    public Header l() {
        Header header = this.a;
        return header == null ? Header.h() : header;
    }

    public String m() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, l());
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (this.c != null) {
            codedOutputStream.M(3, h());
        }
    }
}
