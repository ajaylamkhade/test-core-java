package javarunner.core.checkenum;

public class TestEnum {



    public static void main(String[] args) {
        String originatorMemberRegionCode = getOriginatorMemberRegionCode(MasterCardConstants.BUSINESS_SERVICE_ARRANGEMENT_TYPE_CODE_FOR_ONUS, MasterCardConstants.BUSINESS_SERVICE_ID_CODE_FOR_ONUS);
        System.out.println(originatorMemberRegionCode);

    }


    private static String determineRegionCode(String billingAndClearingCode) {

        BillingClearingCode[] billingClearingCodes = BillingClearingCode
                .values();
        String regionCode = null;
        for (int i = 0; i < billingClearingCodes.length; i++) {
            if (billingClearingCodes[i].getBillingClearingCode()
                    .equalsIgnoreCase(billingAndClearingCode)) {

                regionCode = billingClearingCodes[i].getRegionCode();
                break;
            }

        }
        return regionCode;
    }

    public static String getOriginatorMemberRegionCode(
            String businessServiceArrangementTypeCode,
            String businessServiceIDCode) {
        String originatorMemberRegionCode = null;
        String billingAndClearingCode = null;
        //Config config = null;
        if (businessServiceArrangementTypeCode != null) {

            /**
             * provide regionCode for, if businessServiceArrangementTypeCode
             * values 1 [Interregional] or 2 [Intraregional]
             */
            if (MasterCardConstants.BUSINESS_SERVICE_ARRANGEMENT_TYPE_CODE_INTERREGIONAL
                    .equals(businessServiceArrangementTypeCode)
                    || MasterCardConstants.BUSINESS_SERVICE_ARRANGEMENT_TYPE_CODE_INTRAREGIONAL
                    .equals(businessServiceArrangementTypeCode)) {
                System.out.println("i m here !");
                if (businessServiceIDCode != null
                        && businessServiceIDCode.length() == 6) {
                    System.out.println("i m here 2!");
                    billingAndClearingCode = businessServiceIDCode.substring(0,
                            2);

                    originatorMemberRegionCode = determineRegionCode(billingAndClearingCode);



                }

            }
            /**
             * else provide default region code value configured in IC&S
             */
         /*   else if (MasterCardConstants.BUSINESS_SERVICE_ARRANGEMENT_TYPE_CODE_OTHERS_LIST
                    .contains(businessServiceArrangementTypeCode)) {

                config = Configs.getInstance().getConfig(Config.class);

                originatorMemberRegionCode = config.getDefaultRegionCode();

            }
*/
        }

        return originatorMemberRegionCode;
    }

}
