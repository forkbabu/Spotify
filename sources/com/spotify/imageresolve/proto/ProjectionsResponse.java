package com.spotify.imageresolve.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.imageresolve.proto.ProjectionMap;
import java.io.IOException;

public final class ProjectionsResponse extends GeneratedMessageLite<ProjectionsResponse, b> implements Object {
    private static final ProjectionsResponse b;
    private static volatile x<ProjectionsResponse> c;
    private ProjectionMap a;

    public static final class b extends GeneratedMessageLite.b<ProjectionsResponse, b> implements Object {
        private b() {
            super(ProjectionsResponse.b);
        }
    }

    static {
        ProjectionsResponse projectionsResponse = new ProjectionsResponse();
        b = projectionsResponse;
        projectionsResponse.makeImmutable();
    }

    private ProjectionsResponse() {
    }

    public static x<ProjectionsResponse> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = (ProjectionMap) ((GeneratedMessageLite.h) obj).i(this.a, ((ProjectionsResponse) obj2).a);
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
                                ProjectionMap projectionMap = this.a;
                                ProjectionMap.b bVar = projectionMap != null ? (ProjectionMap.b) projectionMap.toBuilder() : null;
                                ProjectionMap projectionMap2 = (ProjectionMap) gVar.o(ProjectionMap.parser(), kVar);
                                this.a = projectionMap2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ProjectionMap.b) projectionMap2);
                                    this.a = (ProjectionMap) bVar.buildPartial();
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
                return new ProjectionsResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (ProjectionsResponse.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.a != null) {
            i2 = 0 + CodedOutputStream.n(1, h());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public ProjectionMap h() {
        ProjectionMap projectionMap = this.a;
        return projectionMap == null ? ProjectionMap.i() : projectionMap;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, h());
        }
    }
}
