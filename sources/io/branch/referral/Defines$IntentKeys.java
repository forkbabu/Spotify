package io.branch.referral;

public enum Defines$IntentKeys {
    BranchData("branch_data"),
    AndroidPushNotificationKey("branch"),
    ForceNewBranchSession("branch_force_new_session"),
    BranchLinkUsed("branch_used"),
    BranchURI("branch");
    
    private String key = "";

    private Defines$IntentKeys(String str) {
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
