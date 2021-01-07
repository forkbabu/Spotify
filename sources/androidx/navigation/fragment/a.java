package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.o;
import androidx.navigation.m;
import androidx.navigation.v;
import java.util.ArrayDeque;
import java.util.Iterator;

@v.b("fragment")
public class a extends v<C0041a> {
    private final Context a;
    private final o b;
    private final int c;
    private ArrayDeque<Integer> d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a  reason: collision with other inner class name */
    public static class C0041a extends m {
        private String r;

        public C0041a(v<? extends C0041a> vVar) {
            super(vVar);
        }

        @Override // androidx.navigation.m
        public void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b.b);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.r = string;
            }
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.m
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.r;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }

        public final String z() {
            String str = this.r;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }
    }

    public static final class b implements v.a {
    }

    public a(Context context, o oVar, int i) {
        this.a = context;
        this.b = oVar;
        this.c = i;
    }

    private String f(int i, int i2) {
        return i + "-" + i2;
    }

    /* Return type fixed from 'androidx.navigation.m' to match base method */
    @Override // androidx.navigation.v
    public C0041a a() {
        return new C0041a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.navigation.m, android.os.Bundle, androidx.navigation.s, androidx.navigation.v$a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0130  */
    @Override // androidx.navigation.v
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.m b(androidx.navigation.fragment.a.C0041a r9, android.os.Bundle r10, androidx.navigation.s r11, androidx.navigation.v.a r12) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.a.b(androidx.navigation.m, android.os.Bundle, androidx.navigation.s, androidx.navigation.v$a):androidx.navigation.m");
    }

    @Override // androidx.navigation.v
    public void c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            this.d.clear();
            for (int i : intArray) {
                this.d.add(Integer.valueOf(i));
            }
        }
    }

    @Override // androidx.navigation.v
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.d.size()];
        Iterator<Integer> it = this.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.v
    public boolean e() {
        if (this.d.isEmpty() || this.b.o0()) {
            return false;
        }
        this.b.w0(f(this.d.size(), this.d.peekLast().intValue()), 1);
        this.d.removeLast();
        return true;
    }
}
