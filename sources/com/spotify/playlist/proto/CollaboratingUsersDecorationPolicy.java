package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.CollaboratorPolicy;
import java.io.IOException;

public final class CollaboratingUsersDecorationPolicy extends GeneratedMessageLite<CollaboratingUsersDecorationPolicy, b> implements Object {
    private static final CollaboratingUsersDecorationPolicy f;
    private static volatile x<CollaboratingUsersDecorationPolicy> n;
    private boolean a;
    private int b;
    private CollaboratorPolicy c;

    public static final class b extends GeneratedMessageLite.b<CollaboratingUsersDecorationPolicy, b> implements Object {
        private b() {
            super(CollaboratingUsersDecorationPolicy.f);
        }
    }

    static {
        CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = new CollaboratingUsersDecorationPolicy();
        f = collaboratingUsersDecorationPolicy;
        collaboratingUsersDecorationPolicy.makeImmutable();
    }

    private CollaboratingUsersDecorationPolicy() {
    }

    public static x<CollaboratingUsersDecorationPolicy> parser() {
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
                CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = (CollaboratingUsersDecorationPolicy) obj2;
                boolean z2 = this.a;
                boolean z3 = collaboratingUsersDecorationPolicy.a;
                this.a = hVar.f(z2, z2, z3, z3);
                int i = this.b;
                boolean z4 = i != 0;
                int i2 = collaboratingUsersDecorationPolicy.b;
                if (i2 != 0) {
                    z = true;
                }
                this.b = hVar.m(z4, i, z, i2);
                this.c = (CollaboratorPolicy) hVar.i(this.c, collaboratingUsersDecorationPolicy.c);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.h();
                            } else if (B == 16) {
                                this.b = gVar.u();
                            } else if (B == 26) {
                                CollaboratorPolicy collaboratorPolicy = this.c;
                                CollaboratorPolicy.b bVar = collaboratorPolicy != null ? (CollaboratorPolicy.b) collaboratorPolicy.toBuilder() : null;
                                CollaboratorPolicy collaboratorPolicy2 = (CollaboratorPolicy) gVar.o(CollaboratorPolicy.parser(), kVar);
                                this.c = collaboratorPolicy2;
                                if (bVar != null) {
                                    bVar.mergeFrom((CollaboratorPolicy.b) collaboratorPolicy2);
                                    this.c = (CollaboratorPolicy) bVar.buildPartial();
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
                return new CollaboratingUsersDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (CollaboratingUsersDecorationPolicy.class) {
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
        boolean z = this.a;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        int i3 = this.b;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(2, i3);
        }
        CollaboratorPolicy collaboratorPolicy = this.c;
        if (collaboratorPolicy != null) {
            i2 += CodedOutputStream.n(3, collaboratorPolicy);
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
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
        CollaboratorPolicy collaboratorPolicy = this.c;
        if (collaboratorPolicy != null) {
            codedOutputStream.M(3, collaboratorPolicy);
        }
    }
}
