package io.branch.referral;

public enum Defines$PreinstallKey {
    campaign("preinstall_campaign"),
    partner("preinstall_partner");
    
    private String key = "";

    private Defines$PreinstallKey(String str) {
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
