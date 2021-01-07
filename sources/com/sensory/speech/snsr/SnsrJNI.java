package com.sensory.speech.snsr;

import android.content.res.AssetManager;
import java.io.PrintStream;

public class SnsrJNI {
    static {
        try {
            System.loadLibrary("Snsr");
        } catch (UnsatisfiedLinkError e) {
            PrintStream printStream = System.err;
            printStream.println("Native code library failed to load.\n" + e);
            throw e;
        }
    }

    public static final native long SnsrSession_dup(long j, SnsrSession snsrSession);

    public static final native String SnsrSession_errorDetail(long j, SnsrSession snsrSession);

    public static final native long SnsrSession_forEach(long j, SnsrSession snsrSession, String str, Object obj);

    public static final native double SnsrSession_getDouble(long j, SnsrSession snsrSession, String str);

    public static final native int SnsrSession_getInt(long j, SnsrSession snsrSession, String str);

    public static final native long SnsrSession_getStream(long j, SnsrSession snsrSession, String str);

    public static final native String SnsrSession_getString(long j, SnsrSession snsrSession, String str);

    public static final native long SnsrSession_load__SWIG_0(long j, SnsrSession snsrSession, long j2, SnsrStream snsrStream);

    public static final native long SnsrSession_load__SWIG_1(long j, SnsrSession snsrSession, String str);

    public static final native int SnsrSession_rC(long j, SnsrSession snsrSession);

    public static final native long SnsrSession_require(long j, SnsrSession snsrSession, String str, String str2);

    public static final native long SnsrSession_reset(long j, SnsrSession snsrSession);

    public static final native long SnsrSession_run(long j, SnsrSession snsrSession);

    public static final native long SnsrSession_save__SWIG_0(long j, SnsrSession snsrSession, int i, long j2, SnsrStream snsrStream);

    public static final native long SnsrSession_save__SWIG_1(long j, SnsrSession snsrSession, int i, String str);

    public static final native long SnsrSession_setDouble(long j, SnsrSession snsrSession, String str, double d);

    public static final native long SnsrSession_setHandler(long j, SnsrSession snsrSession, String str, Object obj);

    public static final native long SnsrSession_setInt(long j, SnsrSession snsrSession, String str, int i);

    public static final native long SnsrSession_setStream(long j, SnsrSession snsrSession, String str, long j2, SnsrStream snsrStream);

    public static final native long SnsrSession_setString(long j, SnsrSession snsrSession, String str, String str2);

    public static final native long SnsrSession_set__SWIG_0(long j, SnsrSession snsrSession, String str);

    public static final native long SnsrSession_set__SWIG_1(long j, SnsrSession snsrSession, String str, double d);

    public static final native long SnsrSession_set__SWIG_2(long j, SnsrSession snsrSession, String str, int i);

    public static final native long SnsrSession_set__SWIG_3(long j, SnsrSession snsrSession, String str, String str2);

    public static final native long SnsrSession_set__SWIG_4(long j, SnsrSession snsrSession, String str, long j2, SnsrStream snsrStream);

    public static final native void SnsrStream_alloc(long j, SnsrStream snsrStream, Object obj, int i, int i2);

    public static final native int SnsrStream_atEnd(long j, SnsrStream snsrStream);

    public static final native int SnsrStream_close(long j, SnsrStream snsrStream);

    public static final native long SnsrStream_concat__SWIG_0(long j, SnsrStream snsrStream, long j2, SnsrStream snsrStream2);

    public static final native long SnsrStream_concat__SWIG_1(long j, SnsrStream snsrStream, String str);

    public static final native long SnsrStream_copy__SWIG_0(long j, SnsrStream snsrStream, long j2, SnsrStream snsrStream2, long j3);

    public static final native long SnsrStream_copy__SWIG_1(long j, SnsrStream snsrStream, long j2, SnsrStream snsrStream2);

    public static final native String SnsrStream_errorDetail(long j, SnsrStream snsrStream);

    public static final native long SnsrStream_fromAsset(String str);

    public static final native long SnsrStream_fromAudioFile(String str, String str2);

    public static final native long SnsrStream_fromAudioStream(long j, SnsrStream snsrStream, int i);

    public static final native long SnsrStream_fromBuffer(long j, long j2);

    public static final native long SnsrStream_fromFileName(String str, String str2);

    public static final native long SnsrStream_fromMemory(byte[] bArr, int i);

    public static final native long SnsrStream_fromOpenStream(long j, SnsrStream snsrStream, long j2);

    public static final native long SnsrStream_fromStreams(long j, SnsrStream snsrStream, long j2, SnsrStream snsrStream2);

    public static final native long SnsrStream_fromString(String str);

    public static final native long SnsrStream_getDelim(long j, SnsrStream snsrStream, byte[] bArr, int i);

    public static final native long SnsrStream_getMeta(long j, SnsrStream snsrStream, int i);

    public static final native long SnsrStream_nativeStreamHandle(long j, SnsrStream snsrStream);

    public static final native int SnsrStream_open(long j, SnsrStream snsrStream);

    public static final native int SnsrStream_rC(long j, SnsrStream snsrStream);

    public static final native long SnsrStream_raise(Object obj);

    public static final native long SnsrStream_read__SWIG_0(long j, SnsrStream snsrStream, byte[] bArr, long j2, long j3);

    public static final native long SnsrStream_read__SWIG_1(long j, SnsrStream snsrStream, byte[] bArr);

    public static final native int SnsrStream_read__SWIG_2(long j, SnsrStream snsrStream);

    public static final native void SnsrStream_setDetail(long j, SnsrStream snsrStream, String str);

    public static final native void SnsrStream_setRC(long j, SnsrStream snsrStream, int i);

    public static final native long SnsrStream_skip__SWIG_0(long j, SnsrStream snsrStream, long j2, long j3);

    public static final native long SnsrStream_skip__SWIG_1(long j, SnsrStream snsrStream, long j2);

    public static final native long SnsrStream_write__SWIG_0(long j, SnsrStream snsrStream, byte[] bArr, long j2, long j3);

    public static final native long SnsrStream_write__SWIG_1(long j, SnsrStream snsrStream, byte[] bArr);

    public static final native long SnsrStream_write__SWIG_2(long j, SnsrStream snsrStream, int i);

    public static final native int configSecurityChip(long j);

    public static final native void delete_SnsrSession(long j);

    public static final native void delete_SnsrStream(long j);

    public static final native long new_SnsrSession();

    public static final native long new_SnsrStream();

    public static final native void setAssetManager(AssetManager assetManager);

    public static final native long snsrCallback(long j, long j2, long j3);

    public static final native void snsrClearRC(long j);

    public static final native void snsrDescribeError(long j, String str);

    public static final native int snsrDup(long j, long j2);

    public static final native String snsrErrorDetail(long j);

    public static final native int snsrForEach(long j, String str, long j2);

    public static final native int snsrGetDouble(long j, String str, long j2);

    public static final native int snsrGetInt(long j, String str, long j2);

    public static final native int snsrGetStream(long j, String str, long j2);

    public static final native int snsrGetString(long j, String str, long j2);

    public static final native int snsrLoad(long j, long j2);

    public static final native int snsrNewValidateVersion(long j, String str);

    public static final native int snsrRC(long j);

    public static final native String snsrRCMessage(int i);

    public static final native void snsrRelease(long j);

    public static final native int snsrRequire(long j, String str, String str2);

    public static final native int snsrReset(long j);

    public static final native void snsrRetain(long j);

    public static final native int snsrRun(long j);

    public static final native int snsrSave(long j, int i, long j2);

    public static final native int snsrSet(long j, String str);

    public static final native int snsrSetDouble(long j, String str, double d);

    public static final native int snsrSetHandler(long j, String str, long j2);

    public static final native int snsrSetInt(long j, String str, int i);

    public static final native int snsrSetStream(long j, String str, long j2);

    public static final native int snsrSetString(long j, String str, String str2);

    public static final native int snsrStreamAtEnd(long j);

    public static final native int snsrStreamClose(long j);

    public static final native long snsrStreamCopy(long j, long j2, long j3);

    public static final native String snsrStreamErrorDetail(long j);

    public static final native long snsrStreamFromAudioDevice(int i);

    public static final native long snsrStreamFromAudioStream(long j, int i);

    public static final native long snsrStreamFromBuffer(long j, long j2);

    public static final native long snsrStreamFromCode(long j);

    public static final native long snsrStreamFromFILE(long j, int i);

    public static final native long snsrStreamFromFileName(String str, String str2);

    public static final native long snsrStreamFromMemory(byte[] bArr, int i);

    public static final native long snsrStreamFromOpenStream(long j, long j2);

    public static final native long snsrStreamFromStreams(long j, long j2);

    public static final native long snsrStreamFromString(String str);

    public static final native long snsrStreamGetDelim(long j, byte[] bArr, int i);

    public static final native long snsrStreamGetMeta(long j, int i);

    public static final native int snsrStreamOpen(long j);

    public static final native long snsrStreamPrint(long j, String str);

    public static final native int snsrStreamRC(long j);

    public static final native long snsrStreamRaise(long j, long j2, long j3);

    public static final native long snsrStreamRead(long j, long j2, long j3, long j4);

    public static final native long snsrStreamSkip(long j, long j2, long j3);

    public static final native long snsrStreamWrite(long j, long j2, long j3, long j4);

    public static final native long snsrStream_alloc(long j, long j2, int i, int i2);

    public static final native long snsrStream_getData(long j);

    public static final native long snsrStream_getVmt(long j);

    public static final native void snsrStream_setDetail(long j, String str);

    public static final native void snsrStream_setRC(long j, int i);

    public static final native int snsrTearDown();
}
