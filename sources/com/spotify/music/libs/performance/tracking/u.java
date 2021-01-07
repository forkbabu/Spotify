package com.spotify.music.libs.performance.tracking;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.libs.instrumentation.performance.j;
import com.spotify.messages.ViewLoadSequence;
import java.util.regex.Pattern;

final class u extends j {
    u(ColdStartTracker coldStartTracker) {
        super(coldStartTracker);
    }

    @Override // com.spotify.libs.instrumentation.performance.j
    public boolean c(ViewLoadSequence viewLoadSequence) {
        for (String str : l.a) {
            if (Pattern.matches(str, viewLoadSequence.w())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.libs.instrumentation.performance.j
    public boolean d(ViewLoadSequence viewLoadSequence) {
        return j0.a.contains(viewLoadSequence.w());
    }
}
