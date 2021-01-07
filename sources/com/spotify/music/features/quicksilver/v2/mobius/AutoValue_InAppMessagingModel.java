package com.spotify.music.features.quicksilver.v2.mobius;

import com.google.common.collect.ImmutableMap;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class AutoValue_InAppMessagingModel extends InAppMessagingModel {
    private static final long serialVersionUID = 123459875;
    private final boolean adIsPlaying;
    private final ImmutableMap<TriggerType, String> appContextState;
    private final boolean appInBackground;
    private final boolean carModeEnabled;
    private final i presentationState;

    /* access modifiers changed from: package-private */
    public static final class b implements InAppMessagingModel.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private i d;
        private ImmutableMap<TriggerType, String> e;

        b() {
        }

        public InAppMessagingModel.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public InAppMessagingModel.a b(Map<TriggerType, String> map) {
            this.e = ImmutableMap.copyOf(map);
            return this;
        }

        public InAppMessagingModel.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public InAppMessagingModel d() {
            String str = this.a == null ? " carModeEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " adIsPlaying");
            }
            if (this.c == null) {
                str = je.x0(str, " appInBackground");
            }
            if (this.d == null) {
                str = je.x0(str, " presentationState");
            }
            if (this.e == null) {
                str = je.x0(str, " appContextState");
            }
            if (str.isEmpty()) {
                return new AutoValue_InAppMessagingModel(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public InAppMessagingModel.a e(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public InAppMessagingModel.a f(i iVar) {
            if (iVar != null) {
                this.d = iVar;
                return this;
            }
            throw new NullPointerException("Null presentationState");
        }

        b(InAppMessagingModel inAppMessagingModel, a aVar) {
            this.a = Boolean.valueOf(inAppMessagingModel.d());
            this.b = Boolean.valueOf(inAppMessagingModel.a());
            this.c = Boolean.valueOf(inAppMessagingModel.c());
            this.d = inAppMessagingModel.e();
            this.e = inAppMessagingModel.b();
        }
    }

    AutoValue_InAppMessagingModel(boolean z, boolean z2, boolean z3, i iVar, ImmutableMap immutableMap, a aVar) {
        this.carModeEnabled = z;
        this.adIsPlaying = z2;
        this.appInBackground = z3;
        this.presentationState = iVar;
        this.appContextState = immutableMap;
    }

    @Override // com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel
    public boolean a() {
        return this.adIsPlaying;
    }

    @Override // com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel
    public ImmutableMap<TriggerType, String> b() {
        return this.appContextState;
    }

    @Override // com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel
    public boolean c() {
        return this.appInBackground;
    }

    @Override // com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel
    public boolean d() {
        return this.carModeEnabled;
    }

    @Override // com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel
    public i e() {
        return this.presentationState;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InAppMessagingModel)) {
            return false;
        }
        InAppMessagingModel inAppMessagingModel = (InAppMessagingModel) obj;
        if (this.carModeEnabled == inAppMessagingModel.d() && this.adIsPlaying == inAppMessagingModel.a() && this.appInBackground == inAppMessagingModel.c() && this.presentationState.equals(inAppMessagingModel.e()) && this.appContextState.equals(inAppMessagingModel.b())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel
    public InAppMessagingModel.a g() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.carModeEnabled ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.adIsPlaying ? 1231 : 1237)) * 1000003;
        if (!this.appInBackground) {
            i = 1237;
        }
        return ((((i2 ^ i) * 1000003) ^ this.presentationState.hashCode()) * 1000003) ^ this.appContextState.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("InAppMessagingModel{carModeEnabled=");
        V0.append(this.carModeEnabled);
        V0.append(", adIsPlaying=");
        V0.append(this.adIsPlaying);
        V0.append(", appInBackground=");
        V0.append(this.appInBackground);
        V0.append(", presentationState=");
        V0.append(this.presentationState);
        V0.append(", appContextState=");
        V0.append(this.appContextState);
        V0.append("}");
        return V0.toString();
    }
}
