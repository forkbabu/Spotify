package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.service.media.error.EISError;
import com.spotify.voiceassistant.player.models.metadata.ErrorMetadata;

/* renamed from: qw8  reason: default package */
public final /* synthetic */ class qw8 implements Function {
    public static final /* synthetic */ qw8 a = new qw8();

    private /* synthetic */ qw8() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        if (ErrorMetadata.ERROR_EXPLICIT_CONTENT.equals((String) obj)) {
            return EISError.ERROR_EXPLICIT_CONTENT;
        }
        return EISError.SEARCH_FAILED;
    }
}
