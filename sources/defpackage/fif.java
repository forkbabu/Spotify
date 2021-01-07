package defpackage;

import com.spotify.messages.WakeWordProviderError;
import com.spotify.messages.WakeWordProviderRunning;
import com.spotify.messages.WakeWordProviderStatus;

/* renamed from: fif  reason: default package */
public interface fif {
    void a(WakeWordProviderRunning wakeWordProviderRunning);

    void b(WakeWordProviderError wakeWordProviderError);

    void c(WakeWordProviderStatus wakeWordProviderStatus);
}
