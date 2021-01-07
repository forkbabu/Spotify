package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class e0 extends b0 implements g0 {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.android.play.core.internal.i0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.g0
    public final void J2(String str, Bundle bundle, Bundle bundle2, i0 i0Var) {
        Parcel T = T();
        T.writeString(str);
        d0.b(T, bundle);
        d0.b(T, bundle2);
        T.writeStrongBinder(i0Var);
        a0(6, T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.android.play.core.internal.i0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.g0
    public final void R0(String str, Bundle bundle, Bundle bundle2, i0 i0Var) {
        Parcel T = T();
        T.writeString(str);
        d0.b(T, bundle);
        d0.b(T, bundle2);
        T.writeStrongBinder(i0Var);
        a0(7, T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.android.play.core.internal.i0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.g0
    public final void j1(String str, Bundle bundle, Bundle bundle2, i0 i0Var) {
        Parcel T = T();
        T.writeString(str);
        d0.b(T, bundle);
        d0.b(T, bundle2);
        T.writeStrongBinder(i0Var);
        a0(9, T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.play.core.internal.i0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.g0
    public final void n1(String str, Bundle bundle, i0 i0Var) {
        Parcel T = T();
        T.writeString(str);
        d0.b(T, bundle);
        T.writeStrongBinder(i0Var);
        a0(10, T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.android.play.core.internal.i0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.g0
    public final void o3(String str, List<Bundle> list, Bundle bundle, i0 i0Var) {
        Parcel T = T();
        T.writeString(str);
        T.writeTypedList(list);
        d0.b(T, bundle);
        T.writeStrongBinder(i0Var);
        a0(14, T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.android.play.core.internal.i0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.g0
    public final void y1(String str, Bundle bundle, Bundle bundle2, i0 i0Var) {
        Parcel T = T();
        T.writeString(str);
        d0.b(T, bundle);
        d0.b(T, bundle2);
        T.writeStrongBinder(i0Var);
        a0(11, T);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.play.core.internal.i0 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.g0
    public final void z2(String str, Bundle bundle, i0 i0Var) {
        Parcel T = T();
        T.writeString(str);
        d0.b(T, bundle);
        T.writeStrongBinder(i0Var);
        a0(5, T);
    }
}
