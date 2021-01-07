package com.spotify.encore.mobile.snackbar;

import android.view.View;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;

final class AutoValue_SnackbarConfiguration extends SnackbarConfiguration {
    private final String actionText;
    private final Optional<Integer> actionTextRes;
    private final String infoText;
    private final Optional<Integer> infoTextRes;
    private final View.OnClickListener onClickListener;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SnackbarConfiguration.Builder {
        private String actionText;
        private Optional<Integer> actionTextRes = Optional.absent();
        private String infoText;
        private Optional<Integer> infoTextRes = Optional.absent();
        private View.OnClickListener onClickListener;

        Builder() {
        }

        @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration.Builder
        public SnackbarConfiguration.Builder actionText(String str) {
            this.actionText = str;
            return this;
        }

        @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration.Builder
        public SnackbarConfiguration.Builder actionTextRes(int i) {
            this.actionTextRes = Optional.of(Integer.valueOf(i));
            return this;
        }

        @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration.Builder
        public SnackbarConfiguration build() {
            String str = this.infoText == null ? " infoText" : "";
            if (str.isEmpty()) {
                return new AutoValue_SnackbarConfiguration(this.infoText, this.infoTextRes, this.actionText, this.actionTextRes, this.onClickListener);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration.Builder
        public SnackbarConfiguration.Builder infoText(String str) {
            if (str != null) {
                this.infoText = str;
                return this;
            }
            throw new NullPointerException("Null infoText");
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration.Builder
        public SnackbarConfiguration.Builder infoTextRes(int i) {
            this.infoTextRes = Optional.of(Integer.valueOf(i));
            return this;
        }

        @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration.Builder
        public SnackbarConfiguration.Builder onClickListener(View.OnClickListener onClickListener2) {
            this.onClickListener = onClickListener2;
            return this;
        }
    }

    @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration
    public String actionText() {
        return this.actionText;
    }

    @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration
    public Optional<Integer> actionTextRes() {
        return this.actionTextRes;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SnackbarConfiguration)) {
            return false;
        }
        SnackbarConfiguration snackbarConfiguration = (SnackbarConfiguration) obj;
        if (this.infoText.equals(snackbarConfiguration.infoText()) && this.infoTextRes.equals(snackbarConfiguration.infoTextRes()) && ((str = this.actionText) != null ? str.equals(snackbarConfiguration.actionText()) : snackbarConfiguration.actionText() == null) && this.actionTextRes.equals(snackbarConfiguration.actionTextRes())) {
            View.OnClickListener onClickListener2 = this.onClickListener;
            if (onClickListener2 == null) {
                if (snackbarConfiguration.onClickListener() == null) {
                    return true;
                }
            } else if (onClickListener2.equals(snackbarConfiguration.onClickListener())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.infoText.hashCode() ^ 1000003) * 1000003) ^ this.infoTextRes.hashCode()) * 1000003;
        String str = this.actionText;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.actionTextRes.hashCode()) * 1000003;
        View.OnClickListener onClickListener2 = this.onClickListener;
        if (onClickListener2 != null) {
            i = onClickListener2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration
    public String infoText() {
        return this.infoText;
    }

    @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration
    public Optional<Integer> infoTextRes() {
        return this.infoTextRes;
    }

    @Override // com.spotify.encore.mobile.snackbar.SnackbarConfiguration
    public View.OnClickListener onClickListener() {
        return this.onClickListener;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SnackbarConfiguration{infoText=");
        V0.append(this.infoText);
        V0.append(", infoTextRes=");
        V0.append(this.infoTextRes);
        V0.append(", actionText=");
        V0.append(this.actionText);
        V0.append(", actionTextRes=");
        V0.append(this.actionTextRes);
        V0.append(", onClickListener=");
        V0.append(this.onClickListener);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_SnackbarConfiguration(String str, Optional<Integer> optional, String str2, Optional<Integer> optional2, View.OnClickListener onClickListener2) {
        this.infoText = str;
        this.infoTextRes = optional;
        this.actionText = str2;
        this.actionTextRes = optional2;
        this.onClickListener = onClickListener2;
    }
}
