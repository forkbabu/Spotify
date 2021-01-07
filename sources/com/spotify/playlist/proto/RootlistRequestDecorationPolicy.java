package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.RootlistFolderDecorationPolicy;
import com.spotify.playlist.proto.RootlistPlaylistDecorationPolicy;
import java.io.IOException;

public final class RootlistRequestDecorationPolicy extends GeneratedMessageLite<RootlistRequestDecorationPolicy, b> implements Object {
    private static final RootlistRequestDecorationPolicy o;
    private static volatile x<RootlistRequestDecorationPolicy> p;
    private boolean a;
    private boolean b;
    private boolean c;
    private RootlistPlaylistDecorationPolicy f;
    private RootlistFolderDecorationPolicy n;

    public static final class b extends GeneratedMessageLite.b<RootlistRequestDecorationPolicy, b> implements Object {
        private b() {
            super(RootlistRequestDecorationPolicy.o);
        }
    }

    static {
        RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = new RootlistRequestDecorationPolicy();
        o = rootlistRequestDecorationPolicy;
        rootlistRequestDecorationPolicy.makeImmutable();
    }

    private RootlistRequestDecorationPolicy() {
    }

    public static x<RootlistRequestDecorationPolicy> parser() {
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
                RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = (RootlistRequestDecorationPolicy) obj2;
                boolean z = this.a;
                boolean z2 = rootlistRequestDecorationPolicy.a;
                this.a = hVar.f(z, z, z2, z2);
                boolean z3 = this.b;
                boolean z4 = rootlistRequestDecorationPolicy.b;
                this.b = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.c;
                boolean z6 = rootlistRequestDecorationPolicy.c;
                this.c = hVar.f(z5, z5, z6, z6);
                this.f = (RootlistPlaylistDecorationPolicy) hVar.i(this.f, rootlistRequestDecorationPolicy.f);
                this.n = (RootlistFolderDecorationPolicy) hVar.i(this.n, rootlistRequestDecorationPolicy.n);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z7 = false;
                while (!z7) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.h();
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (B == 24) {
                                this.c = gVar.h();
                            } else if (B == 34) {
                                RootlistPlaylistDecorationPolicy rootlistPlaylistDecorationPolicy = this.f;
                                RootlistPlaylistDecorationPolicy.b bVar = rootlistPlaylistDecorationPolicy != null ? (RootlistPlaylistDecorationPolicy.b) rootlistPlaylistDecorationPolicy.toBuilder() : null;
                                RootlistPlaylistDecorationPolicy rootlistPlaylistDecorationPolicy2 = (RootlistPlaylistDecorationPolicy) gVar.o(RootlistPlaylistDecorationPolicy.parser(), kVar);
                                this.f = rootlistPlaylistDecorationPolicy2;
                                if (bVar != null) {
                                    bVar.mergeFrom((RootlistPlaylistDecorationPolicy.b) rootlistPlaylistDecorationPolicy2);
                                    this.f = (RootlistPlaylistDecorationPolicy) bVar.buildPartial();
                                }
                            } else if (B == 42) {
                                RootlistFolderDecorationPolicy rootlistFolderDecorationPolicy = this.n;
                                RootlistFolderDecorationPolicy.b bVar2 = rootlistFolderDecorationPolicy != null ? (RootlistFolderDecorationPolicy.b) rootlistFolderDecorationPolicy.toBuilder() : null;
                                RootlistFolderDecorationPolicy rootlistFolderDecorationPolicy2 = (RootlistFolderDecorationPolicy) gVar.o(RootlistFolderDecorationPolicy.parser(), kVar);
                                this.n = rootlistFolderDecorationPolicy2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((RootlistFolderDecorationPolicy.b) rootlistFolderDecorationPolicy2);
                                    this.n = (RootlistFolderDecorationPolicy) bVar2.buildPartial();
                                }
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z7 = true;
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
                return new RootlistRequestDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (RootlistRequestDecorationPolicy.class) {
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
        boolean z = this.a;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.b;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.c;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        RootlistPlaylistDecorationPolicy rootlistPlaylistDecorationPolicy = this.f;
        if (rootlistPlaylistDecorationPolicy != null) {
            i2 += CodedOutputStream.n(4, rootlistPlaylistDecorationPolicy);
        }
        RootlistFolderDecorationPolicy rootlistFolderDecorationPolicy = this.n;
        if (rootlistFolderDecorationPolicy != null) {
            i2 += CodedOutputStream.n(5, rootlistFolderDecorationPolicy);
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
        boolean z3 = this.c;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        RootlistPlaylistDecorationPolicy rootlistPlaylistDecorationPolicy = this.f;
        if (rootlistPlaylistDecorationPolicy != null) {
            codedOutputStream.M(4, rootlistPlaylistDecorationPolicy);
        }
        RootlistFolderDecorationPolicy rootlistFolderDecorationPolicy = this.n;
        if (rootlistFolderDecorationPolicy != null) {
            codedOutputStream.M(5, rootlistFolderDecorationPolicy);
        }
    }
}
