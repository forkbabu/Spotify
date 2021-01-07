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

public final class EpisodeCollectionDecorationPolicy extends GeneratedMessageLite<EpisodeCollectionDecorationPolicy, Builder> implements EpisodeCollectionDecorationPolicyOrBuilder {
    private static final EpisodeCollectionDecorationPolicy DEFAULT_INSTANCE;
    public static final int IN_COLLECTION_FIELD_NUMBER = 1;
    public static final int IS_IN_LISTEN_LATER_FIELD_NUMBER = 2;
    public static final int IS_NEW_FIELD_NUMBER = 3;
    private static volatile x<EpisodeCollectionDecorationPolicy> PARSER;
    private boolean inCollection_;
    private boolean isInListenLater_;
    private boolean isNew_;

    /* renamed from: com.spotify.cosmos.util.proto.EpisodeCollectionDecorationPolicy$1  reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.b<EpisodeCollectionDecorationPolicy, Builder> implements EpisodeCollectionDecorationPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearInCollection() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).clearInCollection();
            return this;
        }

        public Builder clearIsInListenLater() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).clearIsInListenLater();
            return this;
        }

        public Builder clearIsNew() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).clearIsNew();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getInCollection() {
            return ((EpisodeCollectionDecorationPolicy) this.instance).getInCollection();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getIsInListenLater() {
            return ((EpisodeCollectionDecorationPolicy) this.instance).getIsInListenLater();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getIsNew() {
            return ((EpisodeCollectionDecorationPolicy) this.instance).getIsNew();
        }

        public Builder setInCollection(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).setInCollection(z);
            return this;
        }

        public Builder setIsInListenLater(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).setIsInListenLater(z);
            return this;
        }

        public Builder setIsNew(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).setIsNew(z);
            return this;
        }

        private Builder() {
            super(EpisodeCollectionDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = new EpisodeCollectionDecorationPolicy();
        DEFAULT_INSTANCE = episodeCollectionDecorationPolicy;
        episodeCollectionDecorationPolicy.makeImmutable();
    }

    private EpisodeCollectionDecorationPolicy() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearInCollection() {
        this.inCollection_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsInListenLater() {
        this.isInListenLater_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsNew() {
        this.isNew_ = false;
    }

    public static EpisodeCollectionDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static EpisodeCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(ByteString byteString) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<EpisodeCollectionDecorationPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setInCollection(boolean z) {
        this.inCollection_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsInListenLater(boolean z) {
        this.isInListenLater_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsNew(boolean z) {
        this.isNew_ = z;
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
                EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = (EpisodeCollectionDecorationPolicy) obj2;
                boolean z = this.inCollection_;
                boolean z2 = episodeCollectionDecorationPolicy.inCollection_;
                this.inCollection_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.isInListenLater_;
                boolean z4 = episodeCollectionDecorationPolicy.isInListenLater_;
                this.isInListenLater_ = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.isNew_;
                boolean z6 = episodeCollectionDecorationPolicy.isNew_;
                this.isNew_ = hVar.f(z5, z5, z6, z6);
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
                                this.inCollection_ = gVar.h();
                            } else if (B == 16) {
                                this.isInListenLater_ = gVar.h();
                            } else if (B == 24) {
                                this.isNew_ = gVar.h();
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
                return new EpisodeCollectionDecorationPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (EpisodeCollectionDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getInCollection() {
        return this.inCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getIsInListenLater() {
        return this.isInListenLater_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getIsNew() {
        return this.isNew_;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.inCollection_;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.isInListenLater_;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.isNew_;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.inCollection_;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.isInListenLater_;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        boolean z3 = this.isNew_;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
    }

    public static Builder newBuilder(EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) episodeCollectionDecorationPolicy);
    }

    public static EpisodeCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(ByteString byteString, k kVar) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(byte[] bArr, k kVar) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(InputStream inputStream, k kVar) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(g gVar) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(g gVar, k kVar) {
        return (EpisodeCollectionDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
