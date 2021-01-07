package com.spotify.player.sub;

import com.spotify.player.esperanto.proto.EsContextPlayerError$ContextPlayerError;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.player.proto.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class EsperantoPlayerSubscriptions$error$1 extends FunctionReferenceImpl implements nmf<EsContextPlayerError$ContextPlayerError, PlayerError> {
    public static final EsperantoPlayerSubscriptions$error$1 a = new EsperantoPlayerSubscriptions$error$1();

    EsperantoPlayerSubscriptions$error$1() {
        super(1, c.class, "playerErrorFromProto", "playerErrorFromProto(Lcom/spotify/player/esperanto/proto/EsContextPlayerError$ContextPlayerError;)Lcom/spotify/player/model/PlayerError;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public PlayerError invoke(EsContextPlayerError$ContextPlayerError esContextPlayerError$ContextPlayerError) {
        ErrorType errorType;
        EsContextPlayerError$ContextPlayerError esContextPlayerError$ContextPlayerError2 = esContextPlayerError$ContextPlayerError;
        h.e(esContextPlayerError$ContextPlayerError2, "p1");
        h.e(esContextPlayerError$ContextPlayerError2, "protoError");
        EsContextPlayerError$ContextPlayerError.ErrorCode h = esContextPlayerError$ContextPlayerError2.h();
        h.d(h, "protoError.code");
        h.e(h, "protoErrorCode");
        switch (h.ordinal()) {
            case 0:
                errorType = ErrorType.SUCCESS;
                break;
            case 1:
                errorType = ErrorType.PLAYBACK_STUCK;
                break;
            case 2:
                errorType = ErrorType.PLAYBACK_ERROR;
                break;
            case 3:
                errorType = ErrorType.UNKNOWN;
                break;
            case 4:
                errorType = ErrorType.PLAY_RESTRICTED;
                break;
            case 5:
                errorType = ErrorType.STOP_RESTRICTED;
                break;
            case 6:
                errorType = ErrorType.UPDATE_RESTRICTED;
                break;
            case 7:
                errorType = ErrorType.PAUSE_RESTRICTED;
                break;
            case 8:
                errorType = ErrorType.RESUME_RESTRICTED;
                break;
            case 9:
                errorType = ErrorType.SKIP_TO_PREV_RESTRICTED;
                break;
            case 10:
                errorType = ErrorType.SKIP_TO_NEXT_RESTRICTED;
                break;
            case 11:
                errorType = ErrorType.SKIP_TO_NON_EXISTENT_TRACK;
                break;
            case 12:
                errorType = ErrorType.SEEK_TO_RESTRICTED;
                break;
            case 13:
                errorType = ErrorType.TOGGLE_REPEAT_CONTEXT_RESTRICTED;
                break;
            case 14:
                errorType = ErrorType.TOGGLE_REPEAT_TRACK_RESTRICTED;
                break;
            case 15:
                errorType = ErrorType.UNKNOWN;
                break;
            case 16:
                errorType = ErrorType.TOGGLE_SHUFFLE_RESTRICTED;
                break;
            case 17:
                errorType = ErrorType.SET_QUEUE_RESTRICTED;
                break;
            case 18:
                errorType = ErrorType.INTERRUPT_PLAYBACK_RESTRICTED;
                break;
            case 19:
                errorType = ErrorType.ONE_TRACK_UNPLAYABLE;
                break;
            case 20:
                errorType = ErrorType.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED;
                break;
            case 21:
                errorType = ErrorType.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED;
                break;
            case 22:
                errorType = ErrorType.UNKNOWN;
                break;
            case 23:
                errorType = ErrorType.QUEUE_REVISION_MISMATCH;
                break;
            case 24:
                errorType = ErrorType.VIDEO_PLAYBACK_ERROR;
                break;
            case 25:
                errorType = ErrorType.VIDEO_GEORESTRICTED;
                break;
            case 26:
                errorType = ErrorType.VIDEO_UNSUPPORTED_PLATFORM_VERSION;
                break;
            case 27:
                errorType = ErrorType.VIDEO_UNSUPPORTED_CLIENT_VERSION;
                break;
            case 28:
                errorType = ErrorType.VIDEO_UNSUPPORTED_KEY_VERSION;
                break;
            case 29:
                errorType = ErrorType.VIDEO_MANIFEST_DELETED;
                break;
            case 30:
                errorType = ErrorType.VIDEO_COUNTRY_RESTRICTED;
                break;
            case 31:
                errorType = ErrorType.VIDEO_UNAVAILABLE;
                break;
            case 32:
                errorType = ErrorType.VIDEO_CATALOGUE_RESTRICTED;
                break;
            case 33:
                errorType = ErrorType.INVALID;
                break;
            case 34:
                errorType = ErrorType.UNKNOWN;
                break;
            case 35:
                errorType = ErrorType.PLAYBACK_REPORTING_ERROR;
                break;
            case 36:
                errorType = ErrorType.UNKNOWN;
                break;
            case 37:
                errorType = ErrorType.UNKNOWN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        PlayerError.Builder builder = PlayerError.builder(errorType);
        String str = esContextPlayerError$ContextPlayerError2.i().get(com.spotify.mobile.android.video.model.PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY);
        if (str != null) {
            builder.trackUri(str);
        }
        String str2 = esContextPlayerError$ContextPlayerError2.i().get("context_uri");
        if (str2 != null) {
            builder.contextUri(str2);
        }
        String str3 = esContextPlayerError$ContextPlayerError2.i().get(com.spotify.mobile.android.video.model.PlayerError.CONTEXT_PLAYER_ERROR_REASON_KEY);
        if (str3 != null) {
            builder.reasons(str3);
        }
        PlayerError build = builder.build();
        h.d(build, "PlayerError.builder(erro…(::reasons)\n    }.build()");
        return build;
    }
}
