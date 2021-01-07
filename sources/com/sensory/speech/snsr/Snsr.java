package com.sensory.speech.snsr;

import android.content.Context;
import android.content.res.AssetManager;

public class Snsr {
    public static final String ACCELERATION = "accel-info";
    public static final String ACCURACY = "accuracy";
    public static final String ADAPTED_EVENT = "^adapted";
    public static final String ADD_CONTEXT = "add-context";
    public static final String AUDIO_STREAM = "audio-stream";
    public static final String AUDIO_STREAM_FIRST = "audio-stream-first";
    public static final String AUDIO_STREAM_FROM = "audio-stream-from";
    public static final String AUDIO_STREAM_LAST = "audio-stream-last";
    public static final String AUDIO_STREAM_SIZE = "audio-stream-size";
    public static final String AUDIO_STREAM_TO = "audio-stream-to";
    public static final String AUTO_FLUSH = "auto-flush";
    public static final String BACKOFF = "backoff";
    public static final String BEGIN_EVENT = "^begin";
    public static final String CACHE_FILE = "cache-file";
    public static final String DEBUG_LOG_FILE = "debug-log-file";
    public static final String DELETE_USER = "delete-user";
    public static final String DONE_EVENT = "^done";
    public static final String DURATION_MS = "duration-ms";
    public static final String EMBEDDED_ACMODEL_STREAM = "dsp-acmodel-stream";
    public static final String EMBEDDED_HEADER_STREAM = "dsp-header-stream";
    public static final String EMBEDDED_SEARCH_STREAM = "dsp-search-stream";
    public static final String EMBEDDED_TARGET = "dsp-target";
    public static final String END_EVENT = "^end";
    public static final String ENROLL = "enroll";
    public static final String ENROLLED_EVENT = "^enrolled";
    public static final String ENROLLMENT_CONTEXT = "ctx-enroll";
    public static final String ENROLLMENT_LIST = "enrollment-iterator";
    public static final String ENROLLMENT_TARGET = "req-enroll";
    public static final String ENROLLMENT_TASK_INDEX = "enrollment-task-index";
    public static final String FAIL_EVENT = "^fail";
    public static final String GRAMMAR_STREAM = "grammar-stream.";
    public static final String HOLD_OVER = "hold-over";
    public static final String INCLUDE_LEADING_SILENCE = "include-leading-silence";
    public static final String INCLUDE_MODEL = "include-model";
    public static final String INTERACTIVE_MODE = "interactive";
    public static final int IS_TRULYHANDSFREE = 1;
    public static final int IS_TRULYNATURAL = 0;
    public static final String LEADING_SILENCE = "leading-silence";
    public static final String LIBRARY_INFO = "library-info";
    public static final String LICENSE_EXPDATE = "license-exp-date";
    public static final String LICENSE_EXPIRES = "license-exp-message";
    public static final String LICENSE_WARNING = "license-exp-warn";
    public static final String LIMIT_EVENT = "^limit";
    public static final String LISTEN_BEGIN_EVENT = "^listen-begin";
    public static final String LISTEN_END_EVENT = "^listen-end";
    public static final String LISTEN_WINDOW = "listen-window";
    public static final String LOW_FR_OPERATING_POINT = "low-fr-operating-point";
    public static final String LVCSR = "lvcsr";
    public static final String MAX_RECORDING = "max-recording";
    public static final String MODEL_LIST = "model-iterator";
    public static final String MODEL_NAME = "model-name";
    public static final String MODEL_STREAM = "model-stream";
    public static final String NAME = "TrulyHandsfree";
    public static final String NEXT_EVENT = "^next";
    public static final String NLU_SLOT_EVENT = "^nlu-slot";
    public static final String NLU_SLOT_LIST = "nlu-slot-iterator";
    public static final String OOV_REJECT = "search.frame-nota";
    public static final String OPERATING_POINT = "operating-point";
    public static final String OPERATING_POINT_LIST = "operating-point-iterator";
    public static final String PARTIAL_RESULT_EVENT = "^result-partial";
    public static final String PARTIAL_RESULT_INTERVAL = "partial-result-interval";
    public static final String PASS_EVENT = "^pass";
    public static final String PASS_THROUGH = "pass-through";
    public static final String PAUSE_EVENT = "^pause";
    public static final String PHONE_LIST = "phone-iterator";
    public static final String PHRASESPOT = "phrasespot";
    public static final String PHRASESPOT_VAD = "phrasespot-vad";
    public static final String PHRASES_STREAM = "phrases-stream.";
    public static final String PHRASE_LIST = "phrase-iterator";
    public static final String PREPARE_SUBSET_INIT = "model:ids";
    public static final String PROG_EVENT = "^progress";
    public static final String REASON_LIST = "reason-iterator";
    public static final String RESULT_EVENT = "^result";
    public static final String RESUME_EVENT = "^resume";
    public static final String RES_AVAILABLE_POINT = "available-point";
    public static final String RES_BEGIN_MS = "begin-ms";
    public static final String RES_BEGIN_SAMPLE = "begin-sample";
    public static final String RES_CONF_SCORE = "confidence-score";
    public static final String RES_END_MS = "end-ms";
    public static final String RES_END_SAMPLE = "end-sample";
    public static final String RES_ENROLLMENT_COUNT = "enrollment-count";
    public static final String RES_ENROLLMENT_ID = "enrollment-id";
    public static final String RES_GUIDANCE = "reason-guidance";
    public static final String RES_ID = "id";
    public static final String RES_NLU_SLOT_COUNT = "nlu-slot-count";
    public static final String RES_NLU_SLOT_NAME = "nlu-slot-name";
    public static final String RES_NLU_SLOT_VALUE = "nlu-slot-value.";
    public static final String RES_NOISE_ENERGY = "noise-energy";
    public static final String RES_PERCENT_DONE = "percent-done";
    public static final String RES_REASON = "reason";
    public static final String RES_REASON_PASS = "reason-pass";
    public static final String RES_REASON_THRESHOLD = "reason-threshold";
    public static final String RES_REASON_VALUE = "reason-value";
    public static final String RES_SAMPLES = "sample-count";
    public static final String RES_SIGNAL_ENERGY = "signal-energy";
    public static final String RES_SNR = "snr";
    public static final String RES_SV_SCORE = "sv-score";
    public static final String RES_TEXT = "text";
    public static final String RE_ADAPT = "re-adapt";
    public static final String SAMPLES_EVENT = "^sample-count";
    public static final String SAMPLE_RATE = "samples-per-second";
    public static final String SAVE_ENROLLMENT_AUDIO = "save-enroll-audio";
    public static final String SCORE_OFFSET = "score-offset";
    public static final String SHOW_SILENCE = "show-silence";
    public static final String SILENCE_EVENT = "^silence";
    public static final String SINK_AUDIO_PCM = "<-audio-pcm";
    public static final String SKIP_TO_MS = "skip-to-ms";
    public static final String SKIP_TO_SAMPLE = "skip-to-sample";
    public static final String SLOT = "slot";
    public static final String SLOT_0 = "0.";
    public static final String SLOT_1 = "1.";
    public static final String SOURCE_AUDIO_PCM = "->audio-pcm";
    public static final String SPOT_DELAY = "delay";
    public static final String SV_THRESHOLD = "sv-threshold";
    public static final String TAG_IDENTIFIER = "tag-identifier";
    public static final String TASK_NAME = "task-name";
    public static final String TASK_TYPE = "task-type";
    public static final String TASK_TYPE_AND_VERSION_LIST = "task-type-and-version-list";
    public static final String TASK_VERSION = "task-version";
    public static final String THRESHOLD = "threshold";
    public static final String TRAILING_SILENCE = "trailing-silence";
    public static final String USER = "user";
    public static final String USER_LIST = "user-iterator";
    public static final String VAD = "vad";
    public static final String VERSION = "6.13.1+1.ge705255";
    public static final String VERSION_BUILD = "1.ge705255";
    public static final String VERSION_DSP = "6.2.2";
    public static final int VERSION_ID = 54;
    public static final int VERSION_MAJOR = 6;
    public static final int VERSION_MINOR = 13;
    public static final int VERSION_PATCH = 1;
    public static final String VERSION_PRE = "\u0000";
    public static final String VOCAB_LIST = "vocab-iterator";
    public static final String WORD_LIST = "word-iterator";
    private static AssetManager sAssetManager;

    public static SnsrRC configSecurityChip(long j) {
        return SnsrRC.swigToEnum(SnsrJNI.configSecurityChip(j));
    }

    public static void init(Context context) {
        AssetManager assets = context.getApplicationContext().getAssets();
        sAssetManager = assets;
        setAssetManager(assets);
    }

    public static void setAssetManager(AssetManager assetManager) {
        SnsrJNI.setAssetManager(assetManager);
    }

    public static SWIGTYPE_p_SnsrCallback_ snsrCallback(SWIGTYPE_p_f_p_struct_SnsrSession__p_q_const__char_p_void__SnsrRC sWIGTYPE_p_f_p_struct_SnsrSession__p_q_const__char_p_void__SnsrRC, SWIGTYPE_p_f_p_q_const__void__void sWIGTYPE_p_f_p_q_const__void__void, SWIGTYPE_p_void sWIGTYPE_p_void) {
        long snsrCallback = SnsrJNI.snsrCallback(SWIGTYPE_p_f_p_struct_SnsrSession__p_q_const__char_p_void__SnsrRC.getCPtr(sWIGTYPE_p_f_p_struct_SnsrSession__p_q_const__char_p_void__SnsrRC), SWIGTYPE_p_f_p_q_const__void__void.getCPtr(sWIGTYPE_p_f_p_q_const__void__void), SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void));
        if (snsrCallback == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrCallback_(snsrCallback, false);
    }

    public static void snsrClearRC(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_) {
        SnsrJNI.snsrClearRC(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_));
    }

    public static void snsrDescribeError(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str) {
        SnsrJNI.snsrDescribeError(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str);
    }

    public static SnsrRC snsrDup(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, SWIGTYPE_p_p_SnsrSession_ sWIGTYPE_p_p_SnsrSession_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrDup(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), SWIGTYPE_p_p_SnsrSession_.getCPtr(sWIGTYPE_p_p_SnsrSession_)));
    }

    public static String snsrErrorDetail(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_) {
        return SnsrJNI.snsrErrorDetail(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_));
    }

    public static SnsrRC snsrForEach(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, SWIGTYPE_p_SnsrCallback_ sWIGTYPE_p_SnsrCallback_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrForEach(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, SWIGTYPE_p_SnsrCallback_.getCPtr(sWIGTYPE_p_SnsrCallback_)));
    }

    public static SnsrRC snsrGetDouble(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, SWIGTYPE_p_double sWIGTYPE_p_double) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrGetDouble(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, SWIGTYPE_p_double.getCPtr(sWIGTYPE_p_double)));
    }

    public static SnsrRC snsrGetInt(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, SWIGTYPE_p_int sWIGTYPE_p_int) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrGetInt(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int)));
    }

    public static SnsrRC snsrGetStream(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, SWIGTYPE_p_p_SnsrStream_ sWIGTYPE_p_p_SnsrStream_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrGetStream(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, SWIGTYPE_p_p_SnsrStream_.getCPtr(sWIGTYPE_p_p_SnsrStream_)));
    }

    public static SnsrRC snsrGetString(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrGetString(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char)));
    }

    public static SnsrRC snsrLoad(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrLoad(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_)));
    }

    public static SnsrRC snsrNewValidateVersion(SWIGTYPE_p_p_SnsrSession_ sWIGTYPE_p_p_SnsrSession_, String str) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrNewValidateVersion(SWIGTYPE_p_p_SnsrSession_.getCPtr(sWIGTYPE_p_p_SnsrSession_), str));
    }

    public static SnsrRC snsrRC(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrRC(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_)));
    }

    public static String snsrRCMessage(SnsrRC snsrRC) {
        return SnsrJNI.snsrRCMessage(snsrRC.swigValue());
    }

    public static void snsrRelease(SWIGTYPE_p_void sWIGTYPE_p_void) {
        SnsrJNI.snsrRelease(SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void));
    }

    public static SnsrRC snsrRequire(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, String str2) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrRequire(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, str2));
    }

    public static SnsrRC snsrReset(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrReset(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_)));
    }

    public static void snsrRetain(SWIGTYPE_p_void sWIGTYPE_p_void) {
        SnsrJNI.snsrRetain(SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void));
    }

    public static SnsrRC snsrRun(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrRun(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_)));
    }

    public static SnsrRC snsrSave(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, SnsrDataFormat snsrDataFormat, SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrSave(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), snsrDataFormat.swigValue(), SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_)));
    }

    public static SnsrRC snsrSet(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrSet(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str));
    }

    public static SnsrRC snsrSetDouble(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, double d) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrSetDouble(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, d));
    }

    public static SnsrRC snsrSetHandler(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, SWIGTYPE_p_SnsrCallback_ sWIGTYPE_p_SnsrCallback_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrSetHandler(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, SWIGTYPE_p_SnsrCallback_.getCPtr(sWIGTYPE_p_SnsrCallback_)));
    }

    public static SnsrRC snsrSetInt(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, int i) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrSetInt(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, i));
    }

    public static SnsrRC snsrSetStream(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrSetStream(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_)));
    }

    public static SnsrRC snsrSetString(SWIGTYPE_p_SnsrSession_ sWIGTYPE_p_SnsrSession_, String str, String str2) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrSetString(SWIGTYPE_p_SnsrSession_.getCPtr(sWIGTYPE_p_SnsrSession_), str, str2));
    }

    public static int snsrStreamAtEnd(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        return SnsrJNI.snsrStreamAtEnd(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_));
    }

    public static SnsrRC snsrStreamClose(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrStreamClose(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_)));
    }

    public static long snsrStreamCopy(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_2, long j) {
        return SnsrJNI.snsrStreamCopy(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_2), j);
    }

    public static String snsrStreamErrorDetail(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        return SnsrJNI.snsrStreamErrorDetail(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_));
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromAudioDevice(SnsrStreamAudioFormat snsrStreamAudioFormat) {
        long snsrStreamFromAudioDevice = SnsrJNI.snsrStreamFromAudioDevice(snsrStreamAudioFormat.swigValue());
        if (snsrStreamFromAudioDevice == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromAudioDevice, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromAudioStream(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, SnsrStreamAudioFormat snsrStreamAudioFormat) {
        long snsrStreamFromAudioStream = SnsrJNI.snsrStreamFromAudioStream(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), snsrStreamAudioFormat.swigValue());
        if (snsrStreamFromAudioStream == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromAudioStream, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromBuffer(long j, long j2) {
        long snsrStreamFromBuffer = SnsrJNI.snsrStreamFromBuffer(j, j2);
        if (snsrStreamFromBuffer == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromBuffer, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromCode(SWIGTYPE_p_SnsrCodeModel_ sWIGTYPE_p_SnsrCodeModel_) {
        long snsrStreamFromCode = SnsrJNI.snsrStreamFromCode(SWIGTYPE_p_SnsrCodeModel_.getCPtr(sWIGTYPE_p_SnsrCodeModel_));
        if (snsrStreamFromCode == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromCode, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromFILE(SWIGTYPE_p_FILE sWIGTYPE_p_FILE, SnsrStreamMode snsrStreamMode) {
        long snsrStreamFromFILE = SnsrJNI.snsrStreamFromFILE(SWIGTYPE_p_FILE.getCPtr(sWIGTYPE_p_FILE), snsrStreamMode.swigValue());
        if (snsrStreamFromFILE == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromFILE, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromFileName(String str, String str2) {
        long snsrStreamFromFileName = SnsrJNI.snsrStreamFromFileName(str, str2);
        if (snsrStreamFromFileName == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromFileName, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromMemory(byte[] bArr, SnsrStreamMode snsrStreamMode) {
        long snsrStreamFromMemory = SnsrJNI.snsrStreamFromMemory(bArr, snsrStreamMode.swigValue());
        if (snsrStreamFromMemory == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromMemory, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromOpenStream(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, long j) {
        long snsrStreamFromOpenStream = SnsrJNI.snsrStreamFromOpenStream(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), j);
        if (snsrStreamFromOpenStream == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromOpenStream, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromStreams(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_2) {
        long snsrStreamFromStreams = SnsrJNI.snsrStreamFromStreams(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_2));
        if (snsrStreamFromStreams == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromStreams, false);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamFromString(String str) {
        long snsrStreamFromString = SnsrJNI.snsrStreamFromString(str);
        if (snsrStreamFromString == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamFromString, false);
    }

    public static long snsrStreamGetDelim(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, byte[] bArr, int i) {
        return SnsrJNI.snsrStreamGetDelim(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), bArr, i);
    }

    public static long snsrStreamGetMeta(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, SnsrStreamMeta snsrStreamMeta) {
        return SnsrJNI.snsrStreamGetMeta(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), snsrStreamMeta.swigValue());
    }

    public static SnsrRC snsrStreamOpen(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrStreamOpen(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_)));
    }

    public static long snsrStreamPrint(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, String str) {
        return SnsrJNI.snsrStreamPrint(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), str);
    }

    public static SnsrRC snsrStreamRC(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        return SnsrRC.swigToEnum(SnsrJNI.snsrStreamRC(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_)));
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStreamRaise(SWIGTYPE_p_f_p_struct_SnsrStream__p_void__SnsrRC sWIGTYPE_p_f_p_struct_SnsrStream__p_void__SnsrRC, SWIGTYPE_p_f_p_q_const__void__void sWIGTYPE_p_f_p_q_const__void__void, SWIGTYPE_p_void sWIGTYPE_p_void) {
        long snsrStreamRaise = SnsrJNI.snsrStreamRaise(SWIGTYPE_p_f_p_struct_SnsrStream__p_void__SnsrRC.getCPtr(sWIGTYPE_p_f_p_struct_SnsrStream__p_void__SnsrRC), SWIGTYPE_p_f_p_q_const__void__void.getCPtr(sWIGTYPE_p_f_p_q_const__void__void), SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void));
        if (snsrStreamRaise == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStreamRaise, false);
    }

    public static long snsrStreamRead(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, SWIGTYPE_p_void sWIGTYPE_p_void, long j, long j2) {
        return SnsrJNI.snsrStreamRead(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), j, j2);
    }

    public static long snsrStreamSkip(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, long j, long j2) {
        return SnsrJNI.snsrStreamSkip(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), j, j2);
    }

    public static long snsrStreamWrite(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, SWIGTYPE_p_void sWIGTYPE_p_void, long j, long j2) {
        return SnsrJNI.snsrStreamWrite(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), j, j2);
    }

    public static SWIGTYPE_p_SnsrStream_ snsrStream_alloc(SWIGTYPE_p_SnsrStream_Vmt sWIGTYPE_p_SnsrStream_Vmt, SWIGTYPE_p_void sWIGTYPE_p_void, int i, int i2) {
        long snsrStream_alloc = SnsrJNI.snsrStream_alloc(SWIGTYPE_p_SnsrStream_Vmt.getCPtr(sWIGTYPE_p_SnsrStream_Vmt), SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), i, i2);
        if (snsrStream_alloc == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_(snsrStream_alloc, false);
    }

    public static SWIGTYPE_p_void snsrStream_getData(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        long snsrStream_getData = SnsrJNI.snsrStream_getData(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_));
        if (snsrStream_getData == 0) {
            return null;
        }
        return new SWIGTYPE_p_void(snsrStream_getData, false);
    }

    public static SWIGTYPE_p_SnsrStream_Vmt snsrStream_getVmt(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_) {
        long snsrStream_getVmt = SnsrJNI.snsrStream_getVmt(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_));
        if (snsrStream_getVmt == 0) {
            return null;
        }
        return new SWIGTYPE_p_SnsrStream_Vmt(snsrStream_getVmt, false);
    }

    public static void snsrStream_setDetail(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, String str) {
        SnsrJNI.snsrStream_setDetail(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), str);
    }

    public static void snsrStream_setRC(SWIGTYPE_p_SnsrStream_ sWIGTYPE_p_SnsrStream_, SnsrRC snsrRC) {
        SnsrJNI.snsrStream_setRC(SWIGTYPE_p_SnsrStream_.getCPtr(sWIGTYPE_p_SnsrStream_), snsrRC.swigValue());
    }

    public static SnsrRC snsrTearDown() {
        return SnsrRC.swigToEnum(SnsrJNI.snsrTearDown());
    }
}
