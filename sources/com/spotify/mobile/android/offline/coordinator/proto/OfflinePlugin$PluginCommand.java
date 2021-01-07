package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$DownloadCommand;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$IdentifyCommand;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$RemoveCommand;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$StopDownloadCommand;
import java.io.IOException;

public final class OfflinePlugin$PluginCommand extends GeneratedMessageLite<OfflinePlugin$PluginCommand, a> implements Object {
    private static final OfflinePlugin$PluginCommand f;
    private static volatile x<OfflinePlugin$PluginCommand> n;
    private int a = 0;
    private Object b;
    private String c = "";

    public enum CommandCase implements o.c {
        IDENTIFY(2),
        DOWNLOAD(3),
        REMOVE(4),
        STOP_DOWNLOAD(5),
        COMMAND_NOT_SET(0);
        
        private final int value;

        private CommandCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<OfflinePlugin$PluginCommand, a> implements Object {
        private a() {
            super(OfflinePlugin$PluginCommand.f);
        }
    }

    static {
        OfflinePlugin$PluginCommand offlinePlugin$PluginCommand = new OfflinePlugin$PluginCommand();
        f = offlinePlugin$PluginCommand;
        offlinePlugin$PluginCommand.makeImmutable();
    }

    private OfflinePlugin$PluginCommand() {
    }

    public static x<OfflinePlugin$PluginCommand> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                OfflinePlugin$PluginCommand offlinePlugin$PluginCommand = (OfflinePlugin$PluginCommand) obj2;
                this.c = hVar.n(!this.c.isEmpty(), this.c, !offlinePlugin$PluginCommand.c.isEmpty(), offlinePlugin$PluginCommand.c);
                int ordinal = offlinePlugin$PluginCommand.h().ordinal();
                if (ordinal == 0) {
                    if (this.a != 2) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, offlinePlugin$PluginCommand.b);
                } else if (ordinal == 1) {
                    if (this.a != 3) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, offlinePlugin$PluginCommand.b);
                } else if (ordinal == 2) {
                    if (this.a != 4) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, offlinePlugin$PluginCommand.b);
                } else if (ordinal == 3) {
                    if (this.a != 5) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, offlinePlugin$PluginCommand.b);
                } else if (ordinal == 4) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = offlinePlugin$PluginCommand.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.c = gVar.A();
                            } else if (B == 18) {
                                OfflinePlugin$IdentifyCommand.a aVar = this.a == 2 ? (OfflinePlugin$IdentifyCommand.a) ((OfflinePlugin$IdentifyCommand) this.b).toBuilder() : null;
                                u o = gVar.o(OfflinePlugin$IdentifyCommand.parser(), kVar);
                                this.b = o;
                                if (aVar != null) {
                                    aVar.mergeFrom((OfflinePlugin$IdentifyCommand.a) ((OfflinePlugin$IdentifyCommand) o));
                                    this.b = aVar.buildPartial();
                                }
                                this.a = 2;
                            } else if (B == 26) {
                                OfflinePlugin$DownloadCommand.a aVar2 = this.a == 3 ? (OfflinePlugin$DownloadCommand.a) ((OfflinePlugin$DownloadCommand) this.b).toBuilder() : null;
                                u o2 = gVar.o(OfflinePlugin$DownloadCommand.parser(), kVar);
                                this.b = o2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((OfflinePlugin$DownloadCommand.a) ((OfflinePlugin$DownloadCommand) o2));
                                    this.b = aVar2.buildPartial();
                                }
                                this.a = 3;
                            } else if (B == 34) {
                                OfflinePlugin$RemoveCommand.a aVar3 = this.a == 4 ? (OfflinePlugin$RemoveCommand.a) ((OfflinePlugin$RemoveCommand) this.b).toBuilder() : null;
                                u o3 = gVar.o(OfflinePlugin$RemoveCommand.parser(), kVar);
                                this.b = o3;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((OfflinePlugin$RemoveCommand.a) ((OfflinePlugin$RemoveCommand) o3));
                                    this.b = aVar3.buildPartial();
                                }
                                this.a = 4;
                            } else if (B == 42) {
                                OfflinePlugin$StopDownloadCommand.a aVar4 = this.a == 5 ? (OfflinePlugin$StopDownloadCommand.a) ((OfflinePlugin$StopDownloadCommand) this.b).toBuilder() : null;
                                u o4 = gVar.o(OfflinePlugin$StopDownloadCommand.parser(), kVar);
                                this.b = o4;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((OfflinePlugin$StopDownloadCommand.a) ((OfflinePlugin$StopDownloadCommand) o4));
                                    this.b = aVar4.buildPartial();
                                }
                                this.a = 5;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
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
                return new OfflinePlugin$PluginCommand();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (OfflinePlugin$PluginCommand.class) {
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
        if (!this.c.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.c);
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (OfflinePlugin$IdentifyCommand) this.b);
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.n(3, (OfflinePlugin$DownloadCommand) this.b);
        }
        if (this.a == 4) {
            i2 += CodedOutputStream.n(4, (OfflinePlugin$RemoveCommand) this.b);
        }
        if (this.a == 5) {
            i2 += CodedOutputStream.n(5, (OfflinePlugin$StopDownloadCommand) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public CommandCase h() {
        int i = this.a;
        if (i == 0) {
            return CommandCase.COMMAND_NOT_SET;
        }
        if (i == 2) {
            return CommandCase.IDENTIFY;
        }
        if (i == 3) {
            return CommandCase.DOWNLOAD;
        }
        if (i == 4) {
            return CommandCase.REMOVE;
        }
        if (i != 5) {
            return null;
        }
        return CommandCase.STOP_DOWNLOAD;
    }

    public OfflinePlugin$DownloadCommand i() {
        if (this.a == 3) {
            return (OfflinePlugin$DownloadCommand) this.b;
        }
        return OfflinePlugin$DownloadCommand.h();
    }

    public OfflinePlugin$IdentifyCommand l() {
        if (this.a == 2) {
            return (OfflinePlugin$IdentifyCommand) this.b;
        }
        return OfflinePlugin$IdentifyCommand.h();
    }

    public OfflinePlugin$RemoveCommand m() {
        if (this.a == 4) {
            return (OfflinePlugin$RemoveCommand) this.b;
        }
        return OfflinePlugin$RemoveCommand.h();
    }

    public OfflinePlugin$StopDownloadCommand n() {
        if (this.a == 5) {
            return (OfflinePlugin$StopDownloadCommand) this.b;
        }
        return OfflinePlugin$StopDownloadCommand.h();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c.isEmpty()) {
            codedOutputStream.P(1, this.c);
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (OfflinePlugin$IdentifyCommand) this.b);
        }
        if (this.a == 3) {
            codedOutputStream.M(3, (OfflinePlugin$DownloadCommand) this.b);
        }
        if (this.a == 4) {
            codedOutputStream.M(4, (OfflinePlugin$RemoveCommand) this.b);
        }
        if (this.a == 5) {
            codedOutputStream.M(5, (OfflinePlugin$StopDownloadCommand) this.b);
        }
    }
}
