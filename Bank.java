class Banking{

        public void creatAccount(){

        System.out.println("creat user account");
        }
        public void withdraw(){

        System.out.println("withdraw money");
        }


    class BankOpertion{
        public void KYC(){

           System.out.println("check KYC");
        }
        public void investmentInfo(){

           System.out.println("give investment information");
        }
 
    }
}


class Bank{

    public static void main(String[] args){

    Banking cr=new Banking();
    cr.creatAccount();

    Banking wi=new Banking();
    wi.withdraw();

    Banking b=new Banking();
    Banking.BankOpertion bo=b.new BankOpertion();
    bo.KYC();
    bo.investmentInfo();

     }


}