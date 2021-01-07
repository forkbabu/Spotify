package com.spotify.android.flags;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.Assertion;

@Deprecated
public final class d {
    public static void a(Fragment fragment, c cVar) {
        cVar.getClass();
        Bundle D2 = fragment.D2();
        if (D2 == null) {
            D2 = je.D(fragment);
        }
        D2.putParcelable("FlagsArgumentHelper.Flags", cVar);
    }

    public static c b(Activity activity) {
        Assertion.e(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            Assertion.p("The activity must have an Intent");
        }
        if (intent == null) {
            Assertion.p("The Intent must not be null");
        }
        c cVar = (c) intent.getParcelableExtra("FlagsArgumentHelper.Flags");
        String str = "The Intent must have a Flags argument. Actual intent: " + intent;
        if (cVar == null) {
            Assertion.p(str);
        }
        return cVar;
    }

    public static c c(Fragment fragment) {
        Assertion.e(fragment);
        Bundle D2 = fragment.D2();
        if (D2 == null) {
            Assertion.p("The Fragment must have an argument Bundle");
        }
        Assertion.e(D2);
        Assertion.j("The Bundle must have a Flags argument", D2.containsKey("FlagsArgumentHelper.Flags"));
        c cVar = (c) D2.getParcelable("FlagsArgumentHelper.Flags");
        if (cVar == null) {
            Assertion.p("The Fragment must have a Flags argument");
        }
        cVar.getClass();
        return cVar;
    }
}
