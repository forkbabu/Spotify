package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public final class EsContextPlayerError$ContextPlayerError extends GeneratedMessageLite<EsContextPlayerError$ContextPlayerError, a> implements Object {
    private static final EsContextPlayerError$ContextPlayerError n;
    private static volatile x<EsContextPlayerError$ContextPlayerError> o;
    private int a;
    private int b;
    private String c = "";
    private MapFieldLite<String, String> f = MapFieldLite.d();

    public enum ErrorCode implements o.c {
        SUCCESS(0),
        PLAYBACK_STUCK(1),
        PLAYBACK_ERROR(2),
        LICENSE_CHANGE(3),
        PLAY_RESTRICTED(4),
        STOP_RESTRICTED(5),
        UPDATE_RESTRICTED(6),
        PAUSE_RESTRICTED(7),
        RESUME_RESTRICTED(8),
        SKIP_TO_PREV_RESTRICTED(9),
        SKIP_TO_NEXT_RESTRICTED(10),
        SKIP_TO_NON_EXISTENT_TRACK(11),
        SEEK_TO_RESTRICTED(12),
        TOGGLE_REPEAT_CONTEXT_RESTRICTED(13),
        TOGGLE_REPEAT_TRACK_RESTRICTED(14),
        SET_OPTIONS_RESTRICTED(15),
        TOGGLE_SHUFFLE_RESTRICTED(16),
        SET_QUEUE_RESTRICTED(17),
        INTERRUPT_PLAYBACK_RESTRICTED(18),
        ONE_TRACK_UNPLAYABLE(19),
        ONE_TRACK_UNPLAYABLE_AUTO_STOPPED(20),
        ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED(21),
        SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED(22),
        QUEUE_REVISION_MISMATCH(23),
        VIDEO_PLAYBACK_ERROR(24),
        VIDEO_GEOGRAPHICALLY_RESTRICTED(25),
        VIDEO_UNSUPPORTED_PLATFORM_VERSION(26),
        VIDEO_UNSUPPORTED_CLIENT_VERSION(27),
        VIDEO_UNSUPPORTED_KEY_SYSTEM(28),
        VIDEO_MANIFEST_DELETED(29),
        VIDEO_COUNTRY_RESTRICTED(30),
        VIDEO_UNAVAILABLE(31),
        VIDEO_CATALOGUE_RESTRICTED(32),
        INVALID(33),
        TIMEOUT(34),
        PLAYBACK_REPORTING_ERROR(35),
        UNKNOWN(36),
        UNRECOGNIZED(-1);
        
        private final int value;

        private ErrorCode(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<EsContextPlayerError$ContextPlayerError, a> implements Object {
        private a() {
            super(EsContextPlayerError$ContextPlayerError.n);
        }
    }

    private static final class b {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        EsContextPlayerError$ContextPlayerError esContextPlayerError$ContextPlayerError = new EsContextPlayerError$ContextPlayerError();
        n = esContextPlayerError$ContextPlayerError;
        esContextPlayerError$ContextPlayerError.makeImmutable();
    }

    private EsContextPlayerError$ContextPlayerError() {
    }

    public static EsContextPlayerError$ContextPlayerError l(byte[] bArr) {
        return (EsContextPlayerError$ContextPlayerError) GeneratedMessageLite.parseFrom(n, bArr);
    }

    public static x<EsContextPlayerError$ContextPlayerError> parser() {
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
                EsContextPlayerError$ContextPlayerError esContextPlayerError$ContextPlayerError = (EsContextPlayerError$ContextPlayerError) obj2;
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = esContextPlayerError$ContextPlayerError.b;
                if (i2 != 0) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, i2);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ esContextPlayerError$ContextPlayerError.c.isEmpty(), esContextPlayerError$ContextPlayerError.c);
                this.f = hVar.c(this.f, esContextPlayerError$ContextPlayerError.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esContextPlayerError$ContextPlayerError.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.b = gVar.u();
                            } else if (B == 18) {
                                this.c = gVar.A();
                            } else if (B == 26) {
                                if (!this.f.f()) {
                                    this.f = this.f.k();
                                }
                                b.a.d(this.f, gVar, kVar);
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
                this.f.g();
                return null;
            case 4:
                return new EsContextPlayerError$ContextPlayerError();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (EsContextPlayerError$ContextPlayerError.class) {
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
        if (this.b != ErrorCode.SUCCESS.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            i2 = je.j1(entry, b.a, 3, entry.getKey(), i2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public ErrorCode h() {
        ErrorCode errorCode;
        switch (this.b) {
            case 0:
                errorCode = ErrorCode.SUCCESS;
                break;
            case 1:
                errorCode = ErrorCode.PLAYBACK_STUCK;
                break;
            case 2:
                errorCode = ErrorCode.PLAYBACK_ERROR;
                break;
            case 3:
                errorCode = ErrorCode.LICENSE_CHANGE;
                break;
            case 4:
                errorCode = ErrorCode.PLAY_RESTRICTED;
                break;
            case 5:
                errorCode = ErrorCode.STOP_RESTRICTED;
                break;
            case 6:
                errorCode = ErrorCode.UPDATE_RESTRICTED;
                break;
            case 7:
                errorCode = ErrorCode.PAUSE_RESTRICTED;
                break;
            case 8:
                errorCode = ErrorCode.RESUME_RESTRICTED;
                break;
            case 9:
                errorCode = ErrorCode.SKIP_TO_PREV_RESTRICTED;
                break;
            case 10:
                errorCode = ErrorCode.SKIP_TO_NEXT_RESTRICTED;
                break;
            case 11:
                errorCode = ErrorCode.SKIP_TO_NON_EXISTENT_TRACK;
                break;
            case 12:
                errorCode = ErrorCode.SEEK_TO_RESTRICTED;
                break;
            case 13:
                errorCode = ErrorCode.TOGGLE_REPEAT_CONTEXT_RESTRICTED;
                break;
            case 14:
                errorCode = ErrorCode.TOGGLE_REPEAT_TRACK_RESTRICTED;
                break;
            case 15:
                errorCode = ErrorCode.SET_OPTIONS_RESTRICTED;
                break;
            case 16:
                errorCode = ErrorCode.TOGGLE_SHUFFLE_RESTRICTED;
                break;
            case 17:
                errorCode = ErrorCode.SET_QUEUE_RESTRICTED;
                break;
            case 18:
                errorCode = ErrorCode.INTERRUPT_PLAYBACK_RESTRICTED;
                break;
            case 19:
                errorCode = ErrorCode.ONE_TRACK_UNPLAYABLE;
                break;
            case 20:
                errorCode = ErrorCode.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED;
                break;
            case 21:
                errorCode = ErrorCode.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED;
                break;
            case 22:
                errorCode = ErrorCode.SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED;
                break;
            case 23:
                errorCode = ErrorCode.QUEUE_REVISION_MISMATCH;
                break;
            case 24:
                errorCode = ErrorCode.VIDEO_PLAYBACK_ERROR;
                break;
            case 25:
                errorCode = ErrorCode.VIDEO_GEOGRAPHICALLY_RESTRICTED;
                break;
            case 26:
                errorCode = ErrorCode.VIDEO_UNSUPPORTED_PLATFORM_VERSION;
                break;
            case 27:
                errorCode = ErrorCode.VIDEO_UNSUPPORTED_CLIENT_VERSION;
                break;
            case 28:
                errorCode = ErrorCode.VIDEO_UNSUPPORTED_KEY_SYSTEM;
                break;
            case 29:
                errorCode = ErrorCode.VIDEO_MANIFEST_DELETED;
                break;
            case 30:
                errorCode = ErrorCode.VIDEO_COUNTRY_RESTRICTED;
                break;
            case 31:
                errorCode = ErrorCode.VIDEO_UNAVAILABLE;
                break;
            case 32:
                errorCode = ErrorCode.VIDEO_CATALOGUE_RESTRICTED;
                break;
            case 33:
                errorCode = ErrorCode.INVALID;
                break;
            case 34:
                errorCode = ErrorCode.TIMEOUT;
                break;
            case 35:
                errorCode = ErrorCode.PLAYBACK_REPORTING_ERROR;
                break;
            case 36:
                errorCode = ErrorCode.UNKNOWN;
                break;
            default:
                errorCode = null;
                break;
        }
        return errorCode == null ? ErrorCode.UNRECOGNIZED : errorCode;
    }

    public Map<String, String> i() {
        return Collections.unmodifiableMap(this.f);
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != ErrorCode.SUCCESS.getNumber()) {
            codedOutputStream.K(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            b.a.e(codedOutputStream, 3, entry.getKey(), entry.getValue());
        }
    }
}
