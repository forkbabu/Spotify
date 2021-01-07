package com.spotify.pageloader;

import android.content.res.Resources;
import android.os.Build;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import com.spotify.pageloader.l0;

/* access modifiers changed from: package-private */
public class u0 {
    private final Resources a;

    public u0(Resources resources) {
        this.a = resources;
    }

    public Optional a(l0.d dVar) {
        int ordinal = dVar.j().ordinal();
        if (ordinal == 0) {
            return Optional.of(this.a.getString(C0707R.string.pageloader_network_error_forced_offline_button));
        }
        if (ordinal != 1 && ordinal != 2) {
            return Optional.of(this.a.getString(C0707R.string.pageloader_network_error_button));
        }
        return Optional.fromNullable(Build.VERSION.SDK_INT >= 29 ? this.a.getString(C0707R.string.pageloader_network_error_connected_button) : null);
    }

    public Optional b(l0.f fVar) {
        return Optional.of(this.a.getString(C0707R.string.pageloader_something_went_wrong_button));
    }

    public Optional c(l0.d dVar) {
        u3 u3Var;
        int ordinal = dVar.j().ordinal();
        if (ordinal == 0) {
            u3Var = new u3(this.a.getString(C0707R.string.pageloader_network_error_forced_offline_title), this.a.getString(C0707R.string.pageloader_network_error_forced_offline_description));
        } else if (ordinal == 1) {
            u3Var = new u3(this.a.getString(C0707R.string.pageloader_network_error_airplane_mode_title), this.a.getString(C0707R.string.pageloader_network_error_airplane_mode_description));
        } else if (ordinal != 2) {
            u3Var = new u3(this.a.getString(C0707R.string.pageloader_network_error_unknown_title), this.a.getString(C0707R.string.pageloader_network_error_unknown_description));
        } else {
            u3Var = new u3(this.a.getString(C0707R.string.pageloader_network_error_no_network_connection_title), this.a.getString(C0707R.string.pageloader_network_error_no_network_connection_description));
        }
        return Optional.of(u3Var);
    }

    public Optional d(l0.f fVar) {
        return Optional.of(new u3(this.a.getString(C0707R.string.pageloader_something_went_wrong_title), this.a.getString(C0707R.string.pageloader_something_went_wrong_description)));
    }
}
