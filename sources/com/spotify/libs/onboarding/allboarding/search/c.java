package com.spotify.libs.onboarding.allboarding.search;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d;
import com.spotify.libs.onboarding.allboarding.room.AllboardingSearch;
import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class c implements d {
    private final AllboardingSearch a;
    private final String b;

    public c(AllboardingSearch allboardingSearch, String str) {
        h.e(allboardingSearch, "searchConfig");
        h.e(str, "sessionId");
        this.a = allboardingSearch;
        this.b = str;
    }

    public static final c fromBundle(Bundle bundle) {
        h.e(bundle, "bundle");
        bundle.setClassLoader(c.class.getClassLoader());
        if (!bundle.containsKey("searchConfig")) {
            throw new IllegalArgumentException("Required argument \"searchConfig\" is missing and does not have an android:defaultValue");
        } else if (Parcelable.class.isAssignableFrom(AllboardingSearch.class) || Serializable.class.isAssignableFrom(AllboardingSearch.class)) {
            AllboardingSearch allboardingSearch = (AllboardingSearch) bundle.get("searchConfig");
            if (allboardingSearch == null) {
                throw new IllegalArgumentException("Argument \"searchConfig\" is marked as non-null but was passed a null value.");
            } else if (bundle.containsKey("sessionId")) {
                String string = bundle.getString("sessionId");
                if (string != null) {
                    return new c(allboardingSearch, string);
                }
                throw new IllegalArgumentException("Argument \"sessionId\" is marked as non-null but was passed a null value.");
            } else {
                throw new IllegalArgumentException("Required argument \"sessionId\" is missing and does not have an android:defaultValue");
            }
        } else {
            throw new UnsupportedOperationException(je.l0(AllboardingSearch.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
        }
    }

    public final AllboardingSearch a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
    }

    public int hashCode() {
        AllboardingSearch allboardingSearch = this.a;
        int i = 0;
        int hashCode = (allboardingSearch != null ? allboardingSearch.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchFragmentArgs(searchConfig=");
        V0.append(this.a);
        V0.append(", sessionId=");
        return je.I0(V0, this.b, ")");
    }
}
