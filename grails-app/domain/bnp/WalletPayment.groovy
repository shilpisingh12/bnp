package bnp

import com.bbarters.services.IPaymentInfo
import org.grails.web.json.JSONObject

class WalletPayment extends Payment implements IPaymentInfo{

    static mapping = {
        discriminator "Wallet"
    }

    public void savePaymentInfo(int amt, JSONObject pinfo){
        this.amount = amt * 0.75;
        this.payment_info = pinfo;
    }
}
