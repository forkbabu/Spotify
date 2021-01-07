package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.UserDecorationPolicy;
import java.io.IOException;

public final class CollaboratorPolicy extends GeneratedMessageLite<CollaboratorPolicy, b> implements Object {
    private static final CollaboratorPolicy o;
    private static volatile x<CollaboratorPolicy> p;
    private UserDecorationPolicy a;
    private boolean b;
    private boolean c;
    private boolean f;
    private boolean n;

    public static final class b extends GeneratedMessageLite.b<CollaboratorPolicy, b> implements Object {
        private b() {
            super(CollaboratorPolicy.o);
        }
    }

    static {
        CollaboratorPolicy collaboratorPolicy = new CollaboratorPolicy();
        o = collaboratorPolicy;
        collaboratorPolicy.makeImmutable();
    }

    private CollaboratorPolicy() {
    }

    public static x<CollaboratorPolicy> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CollaboratorPolicy collaboratorPolicy = (CollaboratorPolicy) obj2;
                this.a = (UserDecorationPolicy) hVar.i(this.a, collaboratorPolicy.a);
                boolean z = this.b;
                boolean z2 = collaboratorPolicy.b;
                this.b = hVar.f(z, z, z2, z2);
                boolean z3 = this.c;
                boolean z4 = collaboratorPolicy.c;
                this.c = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.f;
                boolean z6 = collaboratorPolicy.f;
                this.f = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.n;
                boolean z8 = collaboratorPolicy.n;
                this.n = hVar.f(z7, z7, z8, z8);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z9 = false;
                while (!z9) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                UserDecorationPolicy userDecorationPolicy = this.a;
                                UserDecorationPolicy.b bVar = userDecorationPolicy != null ? (UserDecorationPolicy.b) userDecorationPolicy.toBuilder() : null;
                                UserDecorationPolicy userDecorationPolicy2 = (UserDecorationPolicy) gVar.o(UserDecorationPolicy.parser(), kVar);
                                this.a = userDecorationPolicy2;
                                if (bVar != null) {
                                    bVar.mergeFrom((UserDecorationPolicy.b) userDecorationPolicy2);
                                    this.a = (UserDecorationPolicy) bVar.buildPartial();
                                }
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (B == 24) {
                                this.c = gVar.h();
                            } else if (B == 32) {
                                this.f = gVar.h();
                            } else if (B == 40) {
                                this.n = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z9 = true;
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
                return new CollaboratorPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (CollaboratorPolicy.class) {
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
        UserDecorationPolicy userDecorationPolicy = this.a;
        if (userDecorationPolicy != null) {
            i2 = 0 + CodedOutputStream.n(1, userDecorationPolicy);
        }
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        boolean z2 = this.c;
        if (z2) {
            i2 += CodedOutputStream.d(3, z2);
        }
        boolean z3 = this.f;
        if (z3) {
            i2 += CodedOutputStream.d(4, z3);
        }
        boolean z4 = this.n;
        if (z4) {
            i2 += CodedOutputStream.d(5, z4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        UserDecorationPolicy userDecorationPolicy = this.a;
        if (userDecorationPolicy != null) {
            codedOutputStream.M(1, userDecorationPolicy);
        }
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(2, z);
        }
        boolean z2 = this.c;
        if (z2) {
            codedOutputStream.A(3, z2);
        }
        boolean z3 = this.f;
        if (z3) {
            codedOutputStream.A(4, z3);
        }
        boolean z4 = this.n;
        if (z4) {
            codedOutputStream.A(5, z4);
        }
    }
}
