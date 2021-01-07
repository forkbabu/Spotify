package com.sensory.speech.snsr;

public class SnsrStream {
    public static int DEFAULT_SAMPLE_RATE = 16000;
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    /* renamed from: com.sensory.speech.snsr.SnsrStream$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$sensory$speech$snsr$SnsrStreamMode;

        static {
            SnsrStreamMode.values();
            int[] iArr = new int[2];
            $SwitchMap$com$sensory$speech$snsr$SnsrStreamMode = iArr;
            try {
                SnsrStreamMode snsrStreamMode = SnsrStreamMode.READ;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$sensory$speech$snsr$SnsrStreamMode;
                SnsrStreamMode snsrStreamMode2 = SnsrStreamMode.WRITE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface Provider {
        public static final long EOF = -1;
        public static final long ERROR = -5;
        public static final long INTERRUPTED = -2;
        public static final long INVALID_ARG = -3;
        public static final long NOT_IMPLEMENTED = -4;
        public static final long NOT_OPEN = -6;
        public static final long OK = 0;

        long onClose();

        long onOpen();

        long onRead(byte[] bArr);

        void onRelease();

        long onWrite(byte[] bArr);
    }

    public interface Raise {
        public static final long EOF = -1;
        public static final long ERROR = -5;
        public static final long INTERRUPTED = -2;
        public static final long INVALID_ARG = -3;
        public static final long NOT_IMPLEMENTED = -4;
        public static final long NOT_OPEN = -6;
        public static final long OK = 0;

        long onOpen();
    }

    protected SnsrStream(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static SnsrStream fromAsset(String str) {
        long SnsrStream_fromAsset = SnsrJNI.SnsrStream_fromAsset(str);
        if (SnsrStream_fromAsset == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromAsset, true);
    }

    public static SnsrStream fromAudioDevice(int i) {
        return fromProvider(new SnsrStreamAudioDevice(i), SnsrStreamMode.READ);
    }

    public static SnsrStream fromAudioFile(String str, String str2) {
        long SnsrStream_fromAudioFile = SnsrJNI.SnsrStream_fromAudioFile(str, str2);
        if (SnsrStream_fromAudioFile == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromAudioFile, true);
    }

    public static SnsrStream fromAudioStream(SnsrStream snsrStream, SnsrStreamAudioFormat snsrStreamAudioFormat) {
        long SnsrStream_fromAudioStream = SnsrJNI.SnsrStream_fromAudioStream(getCPtr(snsrStream), snsrStream, snsrStreamAudioFormat.swigValue());
        if (SnsrStream_fromAudioStream == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromAudioStream, true);
    }

    public static SnsrStream fromBuffer(long j, long j2) {
        long SnsrStream_fromBuffer = SnsrJNI.SnsrStream_fromBuffer(j, j2);
        if (SnsrStream_fromBuffer == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromBuffer, true);
    }

    public static SnsrStream fromFileName(String str, String str2) {
        long SnsrStream_fromFileName = SnsrJNI.SnsrStream_fromFileName(str, str2);
        if (SnsrStream_fromFileName == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromFileName, true);
    }

    public static SnsrStream fromMemory(byte[] bArr, SnsrStreamMode snsrStreamMode) {
        long SnsrStream_fromMemory = SnsrJNI.SnsrStream_fromMemory(bArr, snsrStreamMode.swigValue());
        if (SnsrStream_fromMemory == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromMemory, true);
    }

    public static SnsrStream fromOpenStream(SnsrStream snsrStream, long j) {
        long SnsrStream_fromOpenStream = SnsrJNI.SnsrStream_fromOpenStream(getCPtr(snsrStream), snsrStream, j);
        if (SnsrStream_fromOpenStream == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromOpenStream, true);
    }

    public static SnsrStream fromProvider(Provider provider, SnsrStreamMode snsrStreamMode) {
        SnsrStream snsrStream = new SnsrStream();
        int ordinal = snsrStreamMode.ordinal();
        if (ordinal == 0) {
            snsrStream.alloc(provider, 1, 0);
        } else if (ordinal == 1) {
            snsrStream.alloc(provider, 0, 1);
        }
        return snsrStream;
    }

    public static SnsrStream fromStreams(SnsrStream snsrStream, SnsrStream snsrStream2) {
        long SnsrStream_fromStreams = SnsrJNI.SnsrStream_fromStreams(getCPtr(snsrStream), snsrStream, getCPtr(snsrStream2), snsrStream2);
        if (SnsrStream_fromStreams == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromStreams, true);
    }

    public static SnsrStream fromString(String str) {
        long SnsrStream_fromString = SnsrJNI.SnsrStream_fromString(str);
        if (SnsrStream_fromString == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_fromString, true);
    }

    protected static long getCPtr(SnsrStream snsrStream) {
        if (snsrStream == null) {
            return 0;
        }
        return snsrStream.swigCPtr;
    }

    public static SnsrStream raise(Raise raise) {
        long SnsrStream_raise = SnsrJNI.SnsrStream_raise(raise);
        if (SnsrStream_raise == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_raise, true);
    }

    public void alloc(Provider provider, int i, int i2) {
        SnsrJNI.SnsrStream_alloc(this.swigCPtr, this, provider, i, i2);
    }

    public int atEnd() {
        return SnsrJNI.SnsrStream_atEnd(this.swigCPtr, this);
    }

    public SnsrRC close() {
        return SnsrRC.swigToEnum(SnsrJNI.SnsrStream_close(this.swigCPtr, this));
    }

    public SnsrStream concat(SnsrStream snsrStream) {
        long SnsrStream_concat__SWIG_0 = SnsrJNI.SnsrStream_concat__SWIG_0(this.swigCPtr, this, getCPtr(snsrStream), snsrStream);
        if (SnsrStream_concat__SWIG_0 == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_concat__SWIG_0, true);
    }

    public long copy(SnsrStream snsrStream, long j) {
        return SnsrJNI.SnsrStream_copy__SWIG_0(this.swigCPtr, this, getCPtr(snsrStream), snsrStream, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SnsrJNI.delete_SnsrStream(j);
            }
            this.swigCPtr = 0;
        }
    }

    public String errorDetail() {
        return SnsrJNI.SnsrStream_errorDetail(this.swigCPtr, this);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public long getDelim(byte[] bArr, int i) {
        return SnsrJNI.SnsrStream_getDelim(this.swigCPtr, this, bArr, i);
    }

    public long getMeta(SnsrStreamMeta snsrStreamMeta) {
        return SnsrJNI.SnsrStream_getMeta(this.swigCPtr, this, snsrStreamMeta.swigValue());
    }

    public long nativeStreamHandle() {
        return SnsrJNI.SnsrStream_nativeStreamHandle(this.swigCPtr, this);
    }

    public SnsrRC open() {
        return SnsrRC.swigToEnum(SnsrJNI.SnsrStream_open(this.swigCPtr, this));
    }

    public long print(String str, Object... objArr) {
        return SnsrJNI.snsrStreamPrint(nativeStreamHandle(), String.format(str, objArr));
    }

    public SnsrRC rC() {
        return SnsrRC.swigToEnum(SnsrJNI.SnsrStream_rC(this.swigCPtr, this));
    }

    public long read(byte[] bArr, long j, long j2) {
        return SnsrJNI.SnsrStream_read__SWIG_0(this.swigCPtr, this, bArr, j, j2);
    }

    public void release() {
        delete();
    }

    public void setDetail(String str) {
        SnsrJNI.SnsrStream_setDetail(this.swigCPtr, this, str);
    }

    public void setRC(SnsrRC snsrRC) {
        SnsrJNI.SnsrStream_setRC(this.swigCPtr, this, snsrRC.swigValue());
    }

    public long skip(long j, long j2) {
        return SnsrJNI.SnsrStream_skip__SWIG_0(this.swigCPtr, this, j, j2);
    }

    public long write(byte[] bArr, long j, long j2) {
        return SnsrJNI.SnsrStream_write__SWIG_0(this.swigCPtr, this, bArr, j, j2);
    }

    public static SnsrStream fromAudioDevice(int i, int i2) {
        return fromProvider(new SnsrStreamAudioDevice(i, i2), SnsrStreamMode.READ);
    }

    public long copy(SnsrStream snsrStream) {
        return SnsrJNI.SnsrStream_copy__SWIG_1(this.swigCPtr, this, getCPtr(snsrStream), snsrStream);
    }

    public long read(byte[] bArr) {
        return SnsrJNI.SnsrStream_read__SWIG_1(this.swigCPtr, this, bArr);
    }

    public long skip(long j) {
        return SnsrJNI.SnsrStream_skip__SWIG_1(this.swigCPtr, this, j);
    }

    public long write(byte[] bArr) {
        return SnsrJNI.SnsrStream_write__SWIG_1(this.swigCPtr, this, bArr);
    }

    public SnsrStream concat(String str) {
        long SnsrStream_concat__SWIG_1 = SnsrJNI.SnsrStream_concat__SWIG_1(this.swigCPtr, this, str);
        if (SnsrStream_concat__SWIG_1 == 0) {
            return null;
        }
        return new SnsrStream(SnsrStream_concat__SWIG_1, true);
    }

    public int read() {
        return SnsrJNI.SnsrStream_read__SWIG_2(this.swigCPtr, this);
    }

    public long write(int i) {
        return SnsrJNI.SnsrStream_write__SWIG_2(this.swigCPtr, this, i);
    }

    protected SnsrStream() {
        this(SnsrJNI.new_SnsrStream(), true);
    }

    public static SnsrStream fromAudioDevice() {
        return fromAudioDevice(DEFAULT_SAMPLE_RATE);
    }

    public static SnsrStream fromProvider(Provider provider) {
        SnsrStream snsrStream = new SnsrStream();
        snsrStream.alloc(provider, 1, 1);
        return snsrStream;
    }
}
