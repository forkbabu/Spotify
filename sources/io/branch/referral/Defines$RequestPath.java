package io.branch.referral;

public enum Defines$RequestPath {
    RedeemRewards("v1/redeem"),
    GetURL("v1/url"),
    GetApp("v1/app-link-settings"),
    RegisterInstall("v1/install"),
    RegisterClose("v1/close"),
    RegisterOpen("v1/open"),
    GetCredits("v1/credits/"),
    GetCreditHistory("v1/credithistory"),
    CompletedAction("v1/event"),
    IdentifyUser("v1/profile"),
    Logout("v1/logout"),
    ContentEvent("v1/content-events"),
    TrackStandardEvent("v2/event/standard"),
    TrackCustomEvent("v2/event/custom"),
    GetCPID("v1/cpid"),
    GetLATD("v1/cpid/latd");
    
    private String key = "";

    private Defines$RequestPath(String str) {
        this.key = str;
    }

    public String d() {
        return this.key;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.key;
    }
}
