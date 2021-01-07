package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.f;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.p;
import java.util.Collections;
import java.util.List;

@Keep
public class TransportRegistrar implements h {
    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        d.b a = d.a(f.class);
        a.b(p.f(Context.class));
        a.f(a.b());
        return Collections.singletonList(a.d());
    }
}
