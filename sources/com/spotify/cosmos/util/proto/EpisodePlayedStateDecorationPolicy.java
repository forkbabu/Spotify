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

public final class EpisodePlayedStateDecorationPolicy extends GeneratedMessageLite<EpisodePlayedStateDecorationPolicy, Builder> implements EpisodePlayedStateDecorationPolicyOrBuilder {
    private static final EpisodePlayedStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_PLAYED_FIELD_NUMBER = 2;
    private static volatile x<EpisodePlayedStateDecorationPolicy> PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 4;
    public static final int PLAYABLE_FIELD_NUMBER = 3;
    public static final int TIME_LEFT_FIELD_NUMBER = 1;
    private boolean isPlayed_;
    private boolean playabilityRestriction_;
    private boolean playable_;
    private boolean timeLeft_;

    /* renamed from: com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicy$1  reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.b<EpisodePlayedStateDecorationPolicy, Builder> implements EpisodePlayedStateDecorationPolicyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder clearIsPlayed() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearIsPlayed();
            return this;
        }

        public Builder clearPlayabilityRestriction() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearPlayabilityRestriction();
            return this;
        }

        public Builder clearPlayable() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearPlayable();
            return this;
        }

        public Builder clearTimeLeft() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearTimeLeft();
            return this;
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getIsPlayed() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getIsPlayed();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getPlayabilityRestriction() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getPlayable() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getTimeLeft() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getTimeLeft();
        }

        public Builder setIsPlayed(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setIsPlayed(z);
            return this;
        }

        public Builder setPlayabilityRestriction(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setPlayabilityRestriction(z);
            return this;
        }

        public Builder setPlayable(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setPlayable(z);
            return this;
        }

        public Builder setTimeLeft(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setTimeLeft(z);
            return this;
        }

        private Builder() {
            super(EpisodePlayedStateDecorationPolicy.DEFAULT_INSTANCE);
        }
    }

    static {
        EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy = new EpisodePlayedStateDecorationPolicy();
        DEFAULT_INSTANCE = episodePlayedStateDecorationPolicy;
        episodePlayedStateDecorationPolicy.makeImmutable();
    }

    private EpisodePlayedStateDecorationPolicy() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearIsPlayed() {
        this.isPlayed_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPlayabilityRestriction() {
        this.playabilityRestriction_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearPlayable() {
        this.playable_ = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearTimeLeft() {
        this.timeLeft_ = false;
    }

    public static EpisodePlayedStateDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static EpisodePlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(ByteString byteString) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static x<EpisodePlayedStateDecorationPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIsPlayed(boolean z) {
        this.isPlayed_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPlayabilityRestriction(boolean z) {
        this.playabilityRestriction_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPlayable(boolean z) {
        this.playable_ = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTimeLeft(boolean z) {
        this.timeLeft_ = z;
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
                EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy = (EpisodePlayedStateDecorationPolicy) obj2;
                boolean z = this.timeLeft_;
                boolean z2 = episodePlayedStateDecorationPolicy.timeLeft_;
                this.timeLeft_ = hVar.f(z, z, z2, z2);
                boolean z3 = this.isPlayed_;
                boolean z4 = episodePlayedStateDecorationPolicy.isPlayed_;
                this.isPlayed_ = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.playable_;
                boolean z6 = episodePlayedStateDecorationPolicy.playable_;
                this.playable_ = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.playabilityRestriction_;
                boolean z8 = episodePlayedStateDecorationPolicy.playabilityRestriction_;
                this.playabilityRestriction_ = hVar.f(z7, z7, z8, z8);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z9 = false;
                while (!z9) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.timeLeft_ = gVar.h();
                            } else if (B == 16) {
                                this.isPlayed_ = gVar.h();
                            } else if (B == 24) {
                                this.playable_ = gVar.h();
                            } else if (B == 32) {
                                this.playabilityRestriction_ = gVar.h();
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
                return new EpisodePlayedStateDecorationPolicy();
            case 5:
                return new Builder(null);
            case 6:
                break;
            case 7:
                if (PARSER == null) {
                    synchronized (EpisodePlayedStateDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getIsPlayed() {
        return this.isPlayed_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getPlayabilityRestriction() {
        return this.playabilityRestriction_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getPlayable() {
        return this.playable_;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.timeLeft_;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.isPlayed_;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.playable_;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        boolean z4 = this.playabilityRestriction_;
        if (z4) {
            i2 += CodedOutputStream.d(4, z4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getTimeLeft() {
        return this.timeLeft_;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.timeLeft_;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.isPlayed_;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        boolean z3 = this.playable_;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        boolean z4 = this.playabilityRestriction_;
        if (z4) {
            codedOutputStream.A(4, z4);
        }
    }

    public static Builder newBuilder(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom((Builder) episodePlayedStateDecorationPolicy);
    }

    public static EpisodePlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream, k kVar) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(ByteString byteString, k kVar) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, kVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(byte[] bArr, k kVar) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, kVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(InputStream inputStream, k kVar) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, kVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(g gVar) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(g gVar, k kVar) {
        return (EpisodePlayedStateDecorationPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, kVar);
    }
}
