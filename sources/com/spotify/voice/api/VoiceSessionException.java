package com.spotify.voice.api;

import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import java.util.Arrays;

public class VoiceSessionException extends RuntimeException {
    private static final long serialVersionUID = 4088378030146328887L;
    private final ErrorDomain mDomain;
    private final String mErrorType;

    public VoiceSessionException(ErrorDomain errorDomain, i iVar, Throwable th) {
        super(th);
        this.mDomain = errorDomain;
        this.mErrorType = iVar.b();
    }

    public ErrorDomain a() {
        return this.mDomain;
    }

    public i b() {
        return i.a(this.mErrorType);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceSessionException)) {
            return false;
        }
        VoiceSessionException voiceSessionException = (VoiceSessionException) obj;
        if (!rw.equal(this.mErrorType, voiceSessionException.mErrorType) || this.mDomain != voiceSessionException.mDomain) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder V0 = je.V0("Domain: ");
        V0.append(this.mDomain);
        V0.append(", Type: ");
        return je.J0(V0, this.mErrorType, ", Cause: ", message);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mErrorType, this.mDomain});
    }
}
