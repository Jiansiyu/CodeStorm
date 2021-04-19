public class akuna_account_number_validation {

    static Integer getSum(Integer inNum){
       int sum = 0;
       while (inNum >0){
           sum += inNum %10;
           inNum = inNum/10;

       }
       return sum;
    }
    static String validationAccountNumber(String accountNumber){
        if (accountNumber.length() != 8 ) return "INVALID";

        String targSumStr = accountNumber.substring(0,2);
        try {
            int targSum = Integer.parseInt(targSumStr, 16);
            int validateNumber = Integer.parseInt(accountNumber.substring(2), 16);

            if (getSum(validateNumber) == targSum){
                return  "VALID";
            }else {
                return "INVALID";
            }

        }catch (Exception e){
            return "INVALID";
        }
    }


}
