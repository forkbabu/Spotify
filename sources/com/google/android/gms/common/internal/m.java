package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;

public final class m {

    public static final class a {
        private final List<String> a;
        private final Object b;

        a(Object obj, k1 k1Var) {
            if (obj != null) {
                this.b = obj;
                this.a = new ArrayList();
                return;
            }
            throw new NullPointerException("null reference");
        }

        @RecentlyNonNull
        public final a a(@RecentlyNonNull String str, Object obj) {
            List<String> list = this.a;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 1);
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @RecentlyNonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull Object obj) {
        return new a(obj, null);
    }
}
