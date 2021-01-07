package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidMusicLibsVoiceAssistantFlagsProperties;

final class bi extends AndroidMusicLibsVoiceAssistantFlagsProperties {
    private final AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResults a;
    private final AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResultsShowIntent b;
    private final AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyUtteranceBanner c;
    private final boolean d;

    static final class b extends AndroidMusicLibsVoiceAssistantFlagsProperties.a {
        private AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResults a;
        private AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResultsShowIntent b;
        private AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyUtteranceBanner c;
        private Boolean d;

        b() {
        }

        public AndroidMusicLibsVoiceAssistantFlagsProperties a() {
            String str = this.a == null ? " thirdPartyAlternativeResults" : "";
            if (this.b == null) {
                str = je.x0(str, " thirdPartyAlternativeResultsShowIntent");
            }
            if (this.c == null) {
                str = je.x0(str, " thirdPartyUtteranceBanner");
            }
            if (this.d == null) {
                str = je.x0(str, " voiceAssistantsSettingsEnabled");
            }
            if (str.isEmpty()) {
                return new bi(this.a, this.b, this.c, this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidMusicLibsVoiceAssistantFlagsProperties.a b(AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResults thirdPartyAlternativeResults) {
            if (thirdPartyAlternativeResults != null) {
                this.a = thirdPartyAlternativeResults;
                return this;
            }
            throw new NullPointerException("Null thirdPartyAlternativeResults");
        }

        public AndroidMusicLibsVoiceAssistantFlagsProperties.a c(AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResultsShowIntent thirdPartyAlternativeResultsShowIntent) {
            if (thirdPartyAlternativeResultsShowIntent != null) {
                this.b = thirdPartyAlternativeResultsShowIntent;
                return this;
            }
            throw new NullPointerException("Null thirdPartyAlternativeResultsShowIntent");
        }

        public AndroidMusicLibsVoiceAssistantFlagsProperties.a d(AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyUtteranceBanner thirdPartyUtteranceBanner) {
            if (thirdPartyUtteranceBanner != null) {
                this.c = thirdPartyUtteranceBanner;
                return this;
            }
            throw new NullPointerException("Null thirdPartyUtteranceBanner");
        }

        public AndroidMusicLibsVoiceAssistantFlagsProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    bi(AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResults thirdPartyAlternativeResults, AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResultsShowIntent thirdPartyAlternativeResultsShowIntent, AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyUtteranceBanner thirdPartyUtteranceBanner, boolean z, a aVar) {
        this.a = thirdPartyAlternativeResults;
        this.b = thirdPartyAlternativeResultsShowIntent;
        this.c = thirdPartyUtteranceBanner;
        this.d = z;
    }

    @Override // com.spotify.remoteconfig.AndroidMusicLibsVoiceAssistantFlagsProperties
    public AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResults a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidMusicLibsVoiceAssistantFlagsProperties
    public AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResultsShowIntent b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidMusicLibsVoiceAssistantFlagsProperties
    public AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyUtteranceBanner c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidMusicLibsVoiceAssistantFlagsProperties
    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidMusicLibsVoiceAssistantFlagsProperties)) {
            return false;
        }
        AndroidMusicLibsVoiceAssistantFlagsProperties androidMusicLibsVoiceAssistantFlagsProperties = (AndroidMusicLibsVoiceAssistantFlagsProperties) obj;
        if (!this.a.equals(androidMusicLibsVoiceAssistantFlagsProperties.a()) || !this.b.equals(androidMusicLibsVoiceAssistantFlagsProperties.b()) || !this.c.equals(androidMusicLibsVoiceAssistantFlagsProperties.c()) || this.d != androidMusicLibsVoiceAssistantFlagsProperties.d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidMusicLibsVoiceAssistantFlagsProperties{thirdPartyAlternativeResults=");
        V0.append(this.a);
        V0.append(", thirdPartyAlternativeResultsShowIntent=");
        V0.append(this.b);
        V0.append(", thirdPartyUtteranceBanner=");
        V0.append(this.c);
        V0.append(", voiceAssistantsSettingsEnabled=");
        return je.P0(V0, this.d, "}");
    }
}
