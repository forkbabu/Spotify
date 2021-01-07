package defpackage;

import com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: i0e  reason: default package */
public final class i0e implements p0e {
    public static final a b = new a(null);
    private final Map<String, AssignedPropertyValue> a;

    /* renamed from: i0e$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    public i0e(Map map, f fVar) {
        this.a = map;
    }

    private final AssignedPropertyValue d(String str, String str2, AssignedPropertyValue.ValueType valueType) {
        Map<String, AssignedPropertyValue> map = this.a;
        AssignedPropertyValue assignedPropertyValue = map.get(str + '.' + str2);
        if (assignedPropertyValue == null || valueType != assignedPropertyValue.h()) {
            return null;
        }
        return assignedPropertyValue;
    }

    @Override // defpackage.p0e
    public boolean a(String str, String str2, boolean z) {
        Boolean b2;
        h.f(str, "componentId");
        h.f(str2, "name");
        AssignedPropertyValue d = d(str, str2, AssignedPropertyValue.ValueType.BOOL_VALUE);
        return (d == null || (b2 = d.b()) == null) ? z : b2.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [T extends java.lang.Enum<T> & m0e, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Enum[]] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // defpackage.p0e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends java.lang.Enum<T> & defpackage.m0e> T b(java.lang.String r6, java.lang.String r7, T r8) {
        /*
            r5 = this;
            java.lang.String r0 = "componentId"
            kotlin.jvm.internal.h.f(r6, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.h.f(r7, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.h.f(r8, r0)
            com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue$ValueType r0 = com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue.ValueType.ENUM_VALUE
            com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue r6 = r5.d(r6, r7, r0)
            r7 = 0
            if (r6 == 0) goto L_0x001d
            java.lang.String r6 = r6.d()
            goto L_0x001e
        L_0x001d:
            r6 = r7
        L_0x001e:
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.String r1 = "defaultValue.declaringClass"
            kotlin.jvm.internal.h.b(r0, r1)
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            if (r6 == 0) goto L_0x004d
            if (r0 != 0) goto L_0x0032
            goto L_0x004d
        L_0x0032:
            int r1 = r0.length
            r2 = 0
        L_0x0034:
            if (r2 >= r1) goto L_0x004a
            r3 = r0[r2]
            r4 = r3
            m0e r4 = (defpackage.m0e) r4
            java.lang.String r4 = r4.value()
            boolean r4 = kotlin.jvm.internal.h.a(r4, r6)
            if (r4 == 0) goto L_0x0047
            r7 = r3
            goto L_0x004a
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x004a:
            if (r7 == 0) goto L_0x004d
            r8 = r7
        L_0x004d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0e.b(java.lang.String, java.lang.String, java.lang.Enum):java.lang.Enum");
    }

    @Override // defpackage.p0e
    public int c(String str, String str2, int i, int i2, int i3) {
        Integer f;
        int intValue;
        h.f(str, "componentId");
        h.f(str2, "name");
        AssignedPropertyValue d = d(str, str2, AssignedPropertyValue.ValueType.INT_VALUE);
        return (d == null || (f = d.f()) == null || i > (intValue = f.intValue()) || i2 < intValue) ? i3 : intValue;
    }
}
