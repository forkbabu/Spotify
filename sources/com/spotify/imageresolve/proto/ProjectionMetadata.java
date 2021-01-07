package com.spotify.imageresolve.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ProjectionMetadata extends GeneratedMessageLite<ProjectionMetadata, b> implements Object {
    private static final ProjectionMetadata n;
    private static volatile x<ProjectionMetadata> o;
    private int a;
    private int b;
    private boolean c;
    private boolean f;

    public static final class b extends GeneratedMessageLite.b<ProjectionMetadata, b> implements Object {
        private b() {
            super(ProjectionMetadata.n);
        }
    }

    static {
        ProjectionMetadata projectionMetadata = new ProjectionMetadata();
        n = projectionMetadata;
        projectionMetadata.makeImmutable();
    }

    private ProjectionMetadata() {
    }

    public static x<ProjectionMetadata> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ProjectionMetadata projectionMetadata = (ProjectionMetadata) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = projectionMetadata.a;
                this.a = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.b;
                boolean z3 = i3 != 0;
                int i4 = projectionMetadata.b;
                if (i4 != 0) {
                    z = true;
                }
                this.b = hVar.m(z3, i3, z, i4);
                boolean z4 = this.c;
                boolean z5 = projectionMetadata.c;
                this.c = hVar.f(z4, z4, z5, z5);
                boolean z6 = this.f;
                boolean z7 = projectionMetadata.f;
                this.f = hVar.f(z6, z6, z7, z7);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 16) {
                                this.a = gVar.u();
                            } else if (B == 24) {
                                this.b = gVar.u();
                            } else if (B == 32) {
                                this.c = gVar.h();
                            } else if (B == 40) {
                                this.f = gVar.h();
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
                return new ProjectionMetadata();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (ProjectionMetadata.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
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
            i2 = 0 + CodedOutputStream.j(2, i3);
        }
        int i4 = this.b;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(3, i4);
        }
        boolean z = this.c;
        if (z) {
            i2 += CodedOutputStream.d(4, z);
        }
        boolean z2 = this.f;
        if (z2) {
            i2 += CodedOutputStream.d(5, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.c;
    }

    public int l() {
        return this.b;
    }

    public int m() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        int i = this.a;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputStream.K(3, i2);
        }
        boolean z = this.c;
        if (z) {
            codedOutputStream.A(4, z);
        }
        boolean z2 = this.f;
        if (z2) {
            codedOutputStream.A(5, z2);
        }
    }
}
