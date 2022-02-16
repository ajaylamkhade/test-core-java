package javarunner.core.checkenum;

public enum BillingClearingCode {


    UNITED_STATES("01", "1"), CANADA("02", "A"), LATIN_AMERICA_AND_THE_CARIBBEAN(
            "03", "B"), ASIA_PACIFIC("04", "C"), EUROPE("05", "D"), SOUTH_ASIA_MIDDLE_EAST_AFRICA(
            "06", "E");

    private String billingClearingCode;
    private String regionCode;


    private BillingClearingCode(String billingClearingCode,
                                String regionCode) {
        this.billingClearingCode = billingClearingCode;
        this.regionCode = regionCode;
    }

    public String getBillingClearingCode() {
        return billingClearingCode;
    }

    //Correction of WLPIBOREF-1726
		/*public void setBillingClearingCode(String billingClearingCode) {
			this.billingClearingCode = billingClearingCode;
		}*/

    public String getRegionCode() {
        return regionCode;
    }

    //Correction of WLPIBOREF-1726
		/*public void setRegionCode(String regionCode) {
			this.regionCode = regionCode;
		}*/


}
