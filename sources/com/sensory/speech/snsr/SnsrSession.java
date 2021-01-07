package com.sensory.speech.snsr;

public class SnsrSession {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public interface Listener {
        SnsrRC onEvent(SnsrSession snsrSession, String str);
    }

    protected SnsrSession(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(SnsrSession snsrSession) {
        if (snsrSession == null) {
            return 0;
        }
        return snsrSession.swigCPtr;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SnsrJNI.delete_SnsrSession(j);
            }
            this.swigCPtr = 0;
        }
    }

    public void describeError(String str, Object... objArr) {
        SnsrJNI.snsrDescribeError(this.swigCPtr, String.format(str, objArr));
    }

    public SnsrSession dup() {
        long SnsrSession_dup = SnsrJNI.SnsrSession_dup(this.swigCPtr, this);
        if (SnsrSession_dup == 0) {
            return null;
        }
        return new SnsrSession(SnsrSession_dup, true);
    }

    public String errorDetail() {
        return SnsrJNI.SnsrSession_errorDetail(this.swigCPtr, this);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public SnsrSession forEach(String str, Listener listener) {
        SnsrJNI.SnsrSession_forEach(this.swigCPtr, this, str, listener);
        return this;
    }

    public double getDouble(String str) {
        return SnsrJNI.SnsrSession_getDouble(this.swigCPtr, this, str);
    }

    public int getInt(String str) {
        return SnsrJNI.SnsrSession_getInt(this.swigCPtr, this, str);
    }

    public SnsrStream getStream(String str) {
        long SnsrSession_getStream = SnsrJNI.SnsrSession_getStream(this.swigCPtr, this, str);
        if (SnsrSession_getStream == 0) {
            return null;
        }
        return new SnsrStream(SnsrSession_getStream, true);
    }

    public String getString(String str) {
        return SnsrJNI.SnsrSession_getString(this.swigCPtr, this, str);
    }

    public SnsrSession load(SnsrStream snsrStream) {
        SnsrJNI.SnsrSession_load__SWIG_0(this.swigCPtr, this, SnsrStream.getCPtr(snsrStream), snsrStream);
        return this;
    }

    public SnsrRC rC() {
        return SnsrRC.swigToEnum(SnsrJNI.SnsrSession_rC(this.swigCPtr, this));
    }

    public void release() {
        delete();
    }

    public SnsrSession require(String str, String str2) {
        SnsrJNI.SnsrSession_require(this.swigCPtr, this, str, str2);
        return this;
    }

    public SnsrSession reset() {
        SnsrJNI.SnsrSession_reset(this.swigCPtr, this);
        return this;
    }

    public SnsrSession run() {
        SnsrJNI.SnsrSession_run(this.swigCPtr, this);
        return this;
    }

    public SnsrSession save(SnsrDataFormat snsrDataFormat, SnsrStream snsrStream) {
        SnsrJNI.SnsrSession_save__SWIG_0(this.swigCPtr, this, snsrDataFormat.swigValue(), SnsrStream.getCPtr(snsrStream), snsrStream);
        return this;
    }

    public SnsrSession set(String str) {
        SnsrJNI.SnsrSession_set__SWIG_0(this.swigCPtr, this, str);
        return this;
    }

    public SnsrSession setDouble(String str, double d) {
        SnsrJNI.SnsrSession_setDouble(this.swigCPtr, this, str, d);
        return this;
    }

    public SnsrSession setHandler(String str, Listener listener) {
        SnsrJNI.SnsrSession_setHandler(this.swigCPtr, this, str, listener);
        return this;
    }

    public SnsrSession setInt(String str, int i) {
        SnsrJNI.SnsrSession_setInt(this.swigCPtr, this, str, i);
        return this;
    }

    public SnsrSession setStream(String str, SnsrStream snsrStream) {
        SnsrJNI.SnsrSession_setStream(this.swigCPtr, this, str, SnsrStream.getCPtr(snsrStream), snsrStream);
        return this;
    }

    public SnsrSession setString(String str, String str2) {
        SnsrJNI.SnsrSession_setString(this.swigCPtr, this, str, str2);
        return this;
    }

    public SnsrSession load(String str) {
        SnsrJNI.SnsrSession_load__SWIG_1(this.swigCPtr, this, str);
        return this;
    }

    public SnsrSession save(SnsrDataFormat snsrDataFormat, String str) {
        SnsrJNI.SnsrSession_save__SWIG_1(this.swigCPtr, this, snsrDataFormat.swigValue(), str);
        return this;
    }

    public SnsrSession set(String str, double d) {
        SnsrJNI.SnsrSession_set__SWIG_1(this.swigCPtr, this, str, d);
        return this;
    }

    public SnsrSession set(String str, int i) {
        SnsrJNI.SnsrSession_set__SWIG_2(this.swigCPtr, this, str, i);
        return this;
    }

    public SnsrSession() {
        this(SnsrJNI.new_SnsrSession(), true);
    }

    public SnsrSession set(String str, String str2) {
        SnsrJNI.SnsrSession_set__SWIG_3(this.swigCPtr, this, str, str2);
        return this;
    }

    public SnsrSession set(String str, SnsrStream snsrStream) {
        SnsrJNI.SnsrSession_set__SWIG_4(this.swigCPtr, this, str, SnsrStream.getCPtr(snsrStream), snsrStream);
        return this;
    }
}
