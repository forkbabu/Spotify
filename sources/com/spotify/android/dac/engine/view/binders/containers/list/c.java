package com.spotify.android.dac.engine.view.binders.containers.list;

import androidx.recyclerview.widget.m;
import com.google.protobuf.Any;
import kotlin.jvm.internal.h;

public final class c {
    private static final m.d<Any> a = new a();

    public static final class a extends m.d<Any> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean a(Any any, Any any2) {
            h.e(any, "oldItem");
            h.e(any2, "newItem");
            return false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean b(Any any, Any any2) {
            h.e(any, "oldItem");
            h.e(any2, "newItem");
            return false;
        }
    }

    public static final m.d<Any> a() {
        return a;
    }
}
