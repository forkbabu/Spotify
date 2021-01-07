package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import androidx.navigation.n;
import com.spotify.music.C0707R;

final class o implements n {
    private final boolean a;

    public o(boolean z) {
        this.a = z;
    }

    @Override // androidx.navigation.n
    public int a() {
        return C0707R.id.action_pickerFragment_to_pickerSkipDialogFragment;
    }

    @Override // androidx.navigation.n
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSkippable", this.a);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof o) && this.a == ((o) obj).a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return je.P0(je.V0("ActionPickerFragmentToPickerSkipDialogFragment(isSkippable="), this.a, ")");
    }
}
