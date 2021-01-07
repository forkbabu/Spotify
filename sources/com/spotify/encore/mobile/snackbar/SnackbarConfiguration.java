package com.spotify.encore.mobile.snackbar;

import android.view.View;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.AutoValue_SnackbarConfiguration;

public abstract class SnackbarConfiguration {

    public static abstract class Builder {
        public abstract Builder actionText(String str);

        public abstract Builder actionTextRes(int i);

        public abstract SnackbarConfiguration build();

        /* access modifiers changed from: package-private */
        public abstract Builder infoText(String str);

        /* access modifiers changed from: package-private */
        public abstract Builder infoTextRes(int i);

        public abstract Builder onClickListener(View.OnClickListener onClickListener);
    }

    public static Builder builder(String str) {
        return new AutoValue_SnackbarConfiguration.Builder().infoText(str);
    }

    public abstract String actionText();

    public abstract Optional<Integer> actionTextRes();

    public abstract String infoText();

    public abstract Optional<Integer> infoTextRes();

    public abstract View.OnClickListener onClickListener();

    public static Builder builder(int i) {
        return new AutoValue_SnackbarConfiguration.Builder().infoTextRes(i).infoText("");
    }
}
