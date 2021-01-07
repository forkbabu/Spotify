package com.spotify.mobile.android.service.media.browser.loaders.browse;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.image.provider.MediaUriUtil;

public abstract class MediaBrowserItem {
    protected Bundle a = Bundle.EMPTY;

    public enum ActionType {
        PLAYABLE,
        BROWSABLE,
        NONE
    }

    public enum CompletionState {
        NOT_PLAYED,
        PARTIALLY_PLAYED,
        FULLY_PLAYED,
        NONE
    }

    public abstract ActionType a();

    public abstract CompletionState b();

    public abstract Uri c();

    public Bundle d() {
        return this.a;
    }

    public abstract String e();

    public abstract Uri f();

    public abstract Uri g();

    public abstract Uri h();

    public abstract String i();

    public abstract Uri j();

    public abstract Uri k();

    public abstract String l();

    public abstract MediaUriUtil.Transformation m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();
}
