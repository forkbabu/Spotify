package com.spotify.cosmos.util.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;
import java.io.InputStream;

public final class EpisodeSyncDecorationPolicy extends GeneratedMessageLite<EpisodeSyncDecorationPolicy, Builder> implements EpisodeSyncDecorationPolicyOrBuilder {
    private static final EpisodeSyncDecorationPolicy DEFAULT_INSTANCE;
    public static final int OFFLINE_FIELD_NUMBER = 1;
    private static volatile x<EpisodeSyncDecorationPolicy> PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private boolean offline_;
    private boolean syncProgress_;

    /* renamed from: com.spotify.cosmos.util.proto.EpisodeSyncDecorationPolicy$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            GeneratedMessageLite.MethodToInvoke.values();
            int[] iArr = new int[8];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.b<EpisodeSyncDecorationPolicy, Builder> implements EpisodeSyncDecorationPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearOffline() {
            copyOnWrite();
            ((EpisodeSyncDecorationPolicy) this.instance).clearOffline();
            return this;
        }

        public Builder clearSyncProgress() {
            copyOnWrite();
            ((EpisodeSyncDecorationPolicy) this.instance).clearSyncProgress();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeSyncDecorationPolicyOrBuilder
        public boolean getOffline() {
            return ((EpisodeSyncDecorationPolicy) this.instance).getOffline();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeSyncDecorationPolicyOrBuilder
        public boolean getSyncProgress() {
            return ((EpisodeSyncDecorationPolicy) this.instance).getSyncProgress();
        }

        public Builder setOffline(boolean z) {
            copyOnWrite();
            ((EpisodeSyncDecorationPolicy) this.instance).setOffline(z);
            return this;
        }

        public Builder setSyncProgress(boolean z) {
            copyOnWrite();
            ((EpisodeSyncDecorationPolicy) this.instance).setSyncProgress(z);
            return this;
        }

        private Builder() {
            super(EpisodeSyncDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy = new EpisodeSyncDecorationPolicy();
        DEFAULT_INSTANCE = episodeSyncDecorationPolicy;
        episodeSyncDecorationPolicy.makeImmutable();
    }

    private EpisodeSyncDecorationPolicy() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearOffline() {
        this.offline_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearSyncProgress() {
        this.syncProgress_ = false;
    }

    public static EpisodeSyncDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static EpisodeSyncDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeSyncDecorationPolicy parseFrom(ByteString byteString) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<EpisodeSyncDecorationPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setOffline(boolean z) {
        this.offline_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setSyncProgress(boolean z) {
        this.syncProgress_ = z;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return DEFAULT_INSTANCE;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy = (EpisodeSyncDecorationPolicy) obj2;
                boolean z = this.offline_;
                boolean z2 = episodeSyncDecorationPolicy.offline_;
                this.offline_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.syncProgress_;
                boolean z4 = episodeSyncDecorationPolicy.syncProgress_;
                this.syncProgress_ = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.offline_ = gVar.h();
                            } else if (B == 16) {
                                this.syncProgress_ = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z5 = true;
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
                return new EpisodeSyncDecorationPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (EpisodeSyncDecorationPolicy.class) {
                        if (PARSER == null) {
                            PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            default:
                throw new UnsupportedOperationException();
        }
        return DEFAULT_INSTANCE;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeSyncDecorationPolicyOrBuilder
    public boolean getOffline() {
        return this.offline_;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.offline_;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.syncProgress_;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeSyncDecorationPolicyOrBuilder
    public boolean getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.offline_;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.syncProgress_;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
    }

    public static Builder newBuilder(EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) episodeSyncDecorationPolicy);
    }

    public static EpisodeSyncDecorationPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static EpisodeSyncDecorationPolicy parseFrom(ByteString byteString, k kVar) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static EpisodeSyncDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeSyncDecorationPolicy parseFrom(byte[] bArr, k kVar) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static EpisodeSyncDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeSyncDecorationPolicy parseFrom(InputStream inputStream, k kVar) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static EpisodeSyncDecorationPolicy parseFrom(g gVar) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static EpisodeSyncDecorationPolicy parseFrom(g gVar, k kVar) {
        return (EpisodeSyncDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
