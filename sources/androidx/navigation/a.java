package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.navigation.v;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@v.b("activity")
public class a extends v<C0040a> {
    private Context a;
    private Activity b;

    /* renamed from: androidx.navigation.a$a  reason: collision with other inner class name */
    public static class C0040a extends m {
        private Intent r;
        private String s;

        public C0040a(v<? extends C0040a> vVar) {
            super(vVar);
        }

        public final Intent A() {
            return this.r;
        }

        @Override // androidx.navigation.m
        public void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, x.a);
            String string = obtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.r == null) {
                this.r = new Intent();
            }
            this.r.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.r == null) {
                    this.r = new Intent();
                }
                this.r.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.r == null) {
                this.r = new Intent();
            }
            this.r.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.r == null) {
                    this.r = new Intent();
                }
                this.r.setData(parse);
            }
            this.s = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.m
        public String toString() {
            ComponentName componentName;
            Intent intent = this.r;
            String str = null;
            if (intent == null) {
                componentName = null;
            } else {
                componentName = intent.getComponent();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentName != null) {
                sb.append(" class=");
                sb.append(componentName.getClassName());
            } else {
                Intent intent2 = this.r;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.navigation.m
        public boolean y() {
            return false;
        }

        public final String z() {
            return this.s;
        }
    }

    public static final class b implements v.a {
    }

    public a(Context context) {
        this.a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    /* Return type fixed from 'androidx.navigation.m' to match base method */
    @Override // androidx.navigation.v
    public C0040a a() {
        return new C0040a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.navigation.m, android.os.Bundle, androidx.navigation.s, androidx.navigation.v$a] */
    @Override // androidx.navigation.v
    public m b(C0040a aVar, Bundle bundle, s sVar, v.a aVar2) {
        Intent intent;
        int intExtra;
        C0040a aVar3 = aVar;
        if (aVar3.A() != null) {
            Intent intent2 = new Intent(aVar3.A());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String z = aVar3.z();
                if (!TextUtils.isEmpty(z)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(z);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + z);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z2 = aVar2 instanceof b;
            int i = 0;
            if (z2) {
                ((b) aVar2).getClass();
                intent2.addFlags(0);
            }
            if (!(this.a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (sVar != null && sVar.g()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.b;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar3.k());
            if (sVar != null) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", sVar.c());
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", sVar.d());
            }
            if (z2) {
                ((b) aVar2).getClass();
                this.a.startActivity(intent2);
            } else {
                this.a.startActivity(intent2);
            }
            if (sVar == null || this.b == null) {
                return null;
            }
            int a2 = sVar.a();
            int b2 = sVar.b();
            if (a2 == -1 && b2 == -1) {
                return null;
            }
            if (a2 == -1) {
                a2 = 0;
            }
            if (b2 != -1) {
                i = b2;
            }
            this.b.overridePendingTransition(a2, i);
            return null;
        }
        StringBuilder V0 = je.V0("Destination ");
        V0.append(aVar3.k());
        V0.append(" does not have an Intent set.");
        throw new IllegalStateException(V0.toString());
    }

    @Override // androidx.navigation.v
    public boolean e() {
        Activity activity = this.b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
