package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$TargetFormat;
import java.io.IOException;

public final class OfflinePlugin$DownloadCommand extends GeneratedMessageLite<OfflinePlugin$DownloadCommand, a> implements Object {
    private static final OfflinePlugin$DownloadCommand c;
    private static volatile x<OfflinePlugin$DownloadCommand> f;
    private String a = "";
    private OfflinePlugin$TargetFormat b;

    public static final class a extends GeneratedMessageLite.b<OfflinePlugin$DownloadCommand, a> implements Object {
        private a() {
            super(OfflinePlugin$DownloadCommand.c);
        }
    }

    static {
        OfflinePlugin$DownloadCommand offlinePlugin$DownloadCommand = new OfflinePlugin$DownloadCommand();
        c = offlinePlugin$DownloadCommand;
        offlinePlugin$DownloadCommand.makeImmutable();
    }

    private OfflinePlugin$DownloadCommand() {
    }

    public static OfflinePlugin$DownloadCommand h() {
        return c;
    }

    public static x<OfflinePlugin$DownloadCommand> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                OfflinePlugin$DownloadCommand offlinePlugin$DownloadCommand = (OfflinePlugin$DownloadCommand) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, true ^ offlinePlugin$DownloadCommand.a.isEmpty(), offlinePlugin$DownloadCommand.a);
                this.b = (OfflinePlugin$TargetFormat) hVar.i(this.b, offlinePlugin$DownloadCommand.b);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                OfflinePlugin$TargetFormat offlinePlugin$TargetFormat = this.b;
                                OfflinePlugin$TargetFormat.a aVar = offlinePlugin$TargetFormat != null ? (OfflinePlugin$TargetFormat.a) offlinePlugin$TargetFormat.toBuilder() : null;
                                OfflinePlugin$TargetFormat offlinePlugin$TargetFormat2 = (OfflinePlugin$TargetFormat) gVar.o(OfflinePlugin$TargetFormat.parser(), kVar);
                                this.b = offlinePlugin$TargetFormat2;
                                if (aVar != null) {
                                    aVar.mergeFrom((OfflinePlugin$TargetFormat.a) offlinePlugin$TargetFormat2);
                                    this.b = (OfflinePlugin$TargetFormat) aVar.buildPartial();
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
                return new OfflinePlugin$DownloadCommand();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (OfflinePlugin$DownloadCommand.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        OfflinePlugin$TargetFormat offlinePlugin$TargetFormat = this.b;
        if (offlinePlugin$TargetFormat != null) {
            i2 += CodedOutputStream.n(2, offlinePlugin$TargetFormat);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        OfflinePlugin$TargetFormat offlinePlugin$TargetFormat = this.b;
        if (offlinePlugin$TargetFormat != null) {
            codedOutputStream.M(2, offlinePlugin$TargetFormat);
        }
    }
}
