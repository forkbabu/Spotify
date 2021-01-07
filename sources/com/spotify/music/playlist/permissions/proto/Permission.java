package com.spotify.music.playlist.permissions.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Permission extends GeneratedMessageLite<Permission, b> implements Object {
    private static final Permission f;
    private static volatile x<Permission> n;
    private int a;
    private ByteString b = ByteString.a;
    private int c;

    public static final class b extends GeneratedMessageLite.b<Permission, b> implements Object {
        public b m(PermissionLevel permissionLevel) {
            copyOnWrite();
            Permission.h((Permission) this.instance, permissionLevel);
            return this;
        }

        private b() {
            super(Permission.f);
        }
    }

    static {
        Permission permission = new Permission();
        f = permission;
        permission.makeImmutable();
    }

    private Permission() {
    }

    static void h(Permission permission, PermissionLevel permissionLevel) {
        permission.getClass();
        permissionLevel.getClass();
        permission.a |= 2;
        permission.c = permissionLevel.getNumber();
    }

    public static x<Permission> parser() {
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
                Permission permission = (Permission) obj2;
                this.b = hVar.r((this.a & 1) == 1, this.b, (permission.a & 1) == 1, permission.b);
                boolean z2 = (this.a & 2) == 2;
                int i = this.c;
                if ((permission.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, permission.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= permission.a;
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
                                this.a |= 1;
                                this.b = gVar.i();
                            } else if (B == 16) {
                                int u = gVar.u();
                                if (PermissionLevel.d(u) == null) {
                                    super.mergeVarintField(2, u);
                                } else {
                                    this.a |= 2;
                                    this.c = u;
                                }
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
                return new Permission();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Permission.class) {
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
            i2 = 0 + CodedOutputStream.e(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.h(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public PermissionLevel i() {
        PermissionLevel d = PermissionLevel.d(this.c);
        return d == null ? PermissionLevel.UNKNOWN : d;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.C(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.K(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
