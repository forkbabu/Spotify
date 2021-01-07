package com.spotify.libs.onboarding.allboarding.flow;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d;
import com.spotify.libs.onboarding.allboarding.EntryPoint;
import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class c implements d {
    private final EntryPoint a;

    public c(EntryPoint entryPoint) {
        h.e(entryPoint, "entryPoint");
        this.a = entryPoint;
    }

    public static final c fromBundle(Bundle bundle) {
        h.e(bundle, "bundle");
        bundle.setClassLoader(c.class.getClassLoader());
        if (!bundle.containsKey("entryPoint")) {
            throw new IllegalArgumentException("Required argument \"entryPoint\" is missing and does not have an android:defaultValue");
        } else if (Parcelable.class.isAssignableFrom(EntryPoint.class) || Serializable.class.isAssignableFrom(EntryPoint.class)) {
            EntryPoint entryPoint = (EntryPoint) bundle.get("entryPoint");
            if (entryPoint != null) {
                return new c(entryPoint);
            }
            throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
        } else {
            throw new UnsupportedOperationException(je.l0(EntryPoint.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
        }
    }

    public final EntryPoint a() {
        return this.a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(EntryPoint.class)) {
            EntryPoint entryPoint = this.a;
            if (entryPoint != null) {
                bundle.putParcelable("entryPoint", (Parcelable) entryPoint);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
            }
        } else if (Serializable.class.isAssignableFrom(EntryPoint.class)) {
            EntryPoint entryPoint2 = this.a;
            if (entryPoint2 != null) {
                bundle.putSerializable("entryPoint", entryPoint2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.io.Serializable");
            }
        } else {
            throw new UnsupportedOperationException(je.l0(EntryPoint.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && h.a(this.a, ((c) obj).a);
        }
        return true;
    }

    public int hashCode() {
        EntryPoint entryPoint = this.a;
        if (entryPoint != null) {
            return entryPoint.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("InitialLoadingFragmentArgs(entryPoint=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
