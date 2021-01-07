package com.spotify.player.internal;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.LoggingParams;
import kotlin.jvm.internal.h;

public final class a {
    private final cqe a;

    /* renamed from: com.spotify.player.internal.a$a  reason: collision with other inner class name */
    static final class C0367a<F, T> implements Function<LoggingParams, LoggingParams> {
        final /* synthetic */ a a;

        C0367a(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Function
        public LoggingParams apply(LoggingParams loggingParams) {
            LoggingParams loggingParams2 = loggingParams;
            if (loggingParams2 != null) {
                return this.a.b(loggingParams2);
            }
            return null;
        }
    }

    public a(cqe cqe) {
        h.e(cqe, "clock");
        this.a = cqe;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final LoggingParams b(LoggingParams loggingParams) {
        return loggingParams.toBuilder().commandInitiatedTime(Long.valueOf(this.a.d())).build();
    }

    public final LoggingParams c(Optional<LoggingParams> optional) {
        h.e(optional, "loggingParams");
        Optional<V> transform = optional.transform(new C0367a(this));
        LoggingParams loggingParams = LoggingParams.EMPTY;
        h.d(loggingParams, "LoggingParams.EMPTY");
        return transform.or((Optional<V>) b(loggingParams));
    }
}
